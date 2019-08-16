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
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huangqinkai.cms.core.Page;
import com.huangqinkai.cms.domain.Article;
import com.huangqinkai.cms.domain.Category;
import com.huangqinkai.cms.domain.Channel;
import com.huangqinkai.cms.domain.User;
import com.huangqinkai.cms.service.ArticleService;
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
	
	@RequestMapping({"/", "/index", "/home"})
	public String home(){
		return "user-space/home";
	}
	
	@RequestMapping({"/profile"})
	public String profile(){
		return "user-space/profile";
	}
	
	
	@RequestMapping("/blogs")
	public String blogs(Model model,HttpServletRequest requst,
			@RequestParam(value="page",defaultValue="1") Integer page){
		
		Article article = new Article();
		User user = (User) requst.getSession().getAttribute(Constant.LOGIN_USER);
		article.setAuthor(user);
		PageHelper.startPage(page, 3);
		List<Article> articleList =  articleService.queryAll(article);
		PageInfo<Article> pageInfo = new PageInfo<Article>(articleList,3);
		String pageList = PageHelpUtil.page("/my/blogs", pageInfo, null);
		
		model.addAttribute("blogs", articleList);
		model.addAttribute("pageList", pageList);
		
		return "user-space/blog_list";
		
	}	
	
	
	
	@RequestMapping("/blog/edit")
	public String blogEdit(){
		return "user-space/blog_edit";
		
	}
	
	
	

}
