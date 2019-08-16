package com.huangqinkai.cms.web.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huangqinkai.cms.domain.Category;
import com.huangqinkai.cms.domain.Channel;
import com.huangqinkai.cms.service.ChannelCategoryService;

@Controller
public class ChannelCategoryController {

	@Resource
	private ChannelCategoryService channelCategoryService;
	
	@RequestMapping("queryAllChannel")
	@ResponseBody
	public List<Channel> queryAllChannel(){
		List<Channel> channels = channelCategoryService.getChannels();
		
		return channels;
		
	}
	
	
	@RequestMapping("queryCategoryByChannelId")
	@ResponseBody
	public List<Category> queryCategoryByChannelId(Integer channel){
		
		
		return channelCategoryService.getCategories(channel);
		
		
	}
	
}
