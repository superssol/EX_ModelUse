package com.exerciese.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "view & model";
	}
	
	@RequestMapping("/test1")
	public String test1(Model model) {
		model.addAttribute("name", "홍길동");
		return "test1";
	}
	

	@RequestMapping("/mv")
	public ModelAndView test2() {
		ModelAndView mv = new ModelAndView();		
		List<String> list = new ArrayList<>();
		
		list.add("test1");
		list.add("test2");
		list.add("test3");

		mv.addObject("list", list);
		mv.addObject("ObjectTest", "테스트입니다.");
		mv.addObject("name", "홍길동");
		mv.setViewName("view/myView");
		
		return mv;
		
	}
}
