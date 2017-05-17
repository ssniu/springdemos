package com.maven.springmvc.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.maven.springmvc.dao.Porject;
import com.maven.springmvc.service.PorjectService;


@Controller
public class BooksController {
	//service
	private PorjectService porjectService;
	
	

	//@RequestMapping("/")
	//Adding data to the session
	/*public String showHome(HttpSession session){
		
		session.setAttribute("id", 10);
		return "home";
		
	}*/
	
	//Using ModelAndView class to mapping data
	/*
	@RequestMapping("/")
	public ModelAndView showHome(){
		
	
	ModelAndView mv = new ModelAndView("home");
	Map<String, Object> model = mv.getModel();
	
	model.put("id",102);
	
	return mv;
	}*/
	@Autowired
	public void setPorjectService(PorjectService porjectService) {
		this.porjectService = porjectService;
	}



	//Using model 
	@RequestMapping("/")
	public String showHome(Model model){
		
		List<Porject> porjects = porjectService.getCurrent();
		
	  model.addAttribute("porject", porjects);

	  return "home";
	}
}
