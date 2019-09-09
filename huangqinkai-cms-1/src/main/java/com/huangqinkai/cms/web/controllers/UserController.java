/**
 * 
 */
package com.huangqinkai.cms.web.controllers;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huangqinkai.cms.core.Page;
import com.huangqinkai.cms.domain.Article;
import com.huangqinkai.cms.domain.Category;
import com.huangqinkai.cms.domain.Channel;
import com.huangqinkai.cms.domain.User;
import com.huangqinkai.cms.service.ArticleService;
import com.huangqinkai.cms.service.UserService;
import com.huangqinkai.cms.utils.FileUploadUtil;
import com.huangqinkai.cms.utils.PageHelpUtil;
import com.huangqinkai.cms.web.Constant;

/**
 * 说明:
 * 
 * @author howsun ->[howsun.zhang@gmail.com]
 * @version 1.0
 *
 * 2018年1月10日 下午2:40:38
 */
@Controller
@RequestMapping("/my")
public class UserController {

	@Autowired
	ArticleService articleService;
	
	@Autowired
	UserService userService;
	
	@RequestMapping({"/", "/index", "/home"})
	public String home(){
		return "user-space/home";
	}
	
	@RequestMapping({"/profile"})
	public String profile(){
		return "user-space/profile";
	}
	
	
	@RequestMapping("/blogs")
	public String blogs(String keyword,@RequestParam(value="status",defaultValue="1")Integer status,Model model,HttpServletRequest requst,
			@RequestParam(value="page",defaultValue="1") Integer page){
		
		Article article = new Article();
		User user = (User) requst.getSession().getAttribute(Constant.LOGIN_USER);
		article.setAuthor(user);
		
		if(keyword != null && keyword != ""){
			
			article.setKeywords(keyword);
		}
		
		
		
		if(status != 1){
			if(status == 2){
				article.setHot(true);
			}
			if(status == 3){
				article.setStatus(1);
			}
			if(status == 4){
				article.setDeleted(true);
			}
		}
		
		
		
		PageHelper.startPage(page, 3);
		List<Article> articleList =  articleService.queryAll(article);
		PageInfo<Article> pageInfo = new PageInfo<Article>(articleList,3);
		String pageList = PageHelpUtil.page("/my/blogs", pageInfo, String.valueOf(status));
		
		model.addAttribute("blogs", articleList);
		model.addAttribute("pageList", pageList);
		model.addAttribute("status", status);
		return "user-space/blog_list";
	}	
	
	
	
	@RequestMapping("/blog/edit")
	public String blogEdit(Integer id,Model model){
		if(id!=null){
			Article article = articleService.selectByPrimaryKey(id);
			
			model.addAttribute("blog", article);
			
		}
		return "user-space/blog_edit";
		
	}
	
	@RequestMapping("/blog/save")
	public String blogSave(Article article,MultipartFile file,HttpServletRequest request){
		
		String upload = FileUploadUtil.upload(request, file);
		if(!upload.equals("")){
			article.setPicture(upload);
		}
		
		//有ID是修改文章
		if(article.getId() != null){
			article.setUpdated(new Date());
			articleService.updateByKey(article);
		}else{
			
			article.setHits(0);//文章点击量
			article.setHot(true);//文章是否是热门
			article.setStatus(1);//文章审核通过
			article.setDeleted(false);//文章是否被删除
			article.setCreated(new Date());//文章时间
			article.setUpdated(new Date());//文章跟新时间
			User user = (User) request.getSession().getAttribute(Constant.LOGIN_USER);
			article.setAuthor(user);
			
			articleService.save(article);
			
		}
		return "redirect:/my/blogs";
		
	}
	
	@RequestMapping("/blog/remove")
	@ResponseBody
	public String remove(Integer id){
		articleService.remove(id);
		
		return "redirect:/my/blogs";
		
	}
	
	
	@RequestMapping("/profile/avatar")
	public String avatar(){
		return "user-space/avatar";
		
	}
	
	@RequestMapping("/avatar/save")
	public String avatarSave(HttpServletRequest request,MultipartFile file,Model model){
		
		User user = (User)request.getSession().getAttribute(Constant.LOGIN_USER);
		String upload = FileUploadUtil.upload(request, file);
		if(!upload.equals("")){
			user.setAvatarpath(upload);
		}
		
		userService.updateByid(user);
		request.getServletContext().setAttribute("avatarpath", upload);
		return "redirect:/my/profile/avatar";
		
	}
	
	
	
	
	
	/**保存用户信息**/
	@RequestMapping("/profile/save")
	public String profileprofileSave(User profile){
		userService.updateByid(profile);
		
		return "redirect:/my/profile/Info";
		
	}
	/**用户信息会写**/
	@RequestMapping("/profile/Info")
	public String proInfo(HttpServletRequest request,Model model){
		
		User loginuser = (User)request.getSession().getAttribute(Constant.LOGIN_USER);
		
		User user = userService.selectById(loginuser.getId());
		
		model.addAttribute("profile",user);
		return "user-space/profile";
		
	}
	@ResponseBody
	@RequestMapping("/blog/updateremove")
	public boolean updateremove(Integer id){
		Article article = new Article();
		article.setId(id);
		article.setUpdated(new Date());
		article.setDeleted(true);
		articleService.updateByKey(article);
		return true;
		
	}
	
	@RequestMapping("/picture/edit")
	public String pictureedit(){
		return "/user-space/pic_edit";
		
	}
	
	
	
	
}
