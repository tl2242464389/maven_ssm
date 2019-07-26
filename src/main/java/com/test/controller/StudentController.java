package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.dubbo.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentServiceImpl;
	
	@RequestMapping("/show")
	public String selAll(Model model){
		model.addAttribute("list", studentServiceImpl.selAll());
		return "/index.jsp";
	}
}
