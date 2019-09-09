package com.hqk.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import demoUtil97.StringUtil;

@Controller
public class TestContrpller {

	
	@RequestMapping("/find.do")
	public String find(){
		
		
		return "list";
		
	}
	
	@RequestMapping("/toAdd.do")
	public String toAdd(String test,Model model){
		System.out.println(test);
		String changeText = StringUtil.changeText(test);
		System.out.println(changeText);
		model.addAttribute("test", test);
		model.addAttribute("changeText", changeText);
		return "zs";

	}
	
}
