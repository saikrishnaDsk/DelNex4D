package com.myspr.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myspr.demo.bean.Student;


@Controller
public class HomeController {

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sd,false));
	}
	

	@RequestMapping(value = "/")
	public String home() {
		return "home";

	}

	@RequestMapping("saveStudent")
	public String saveStudent(Model model,@ModelAttribute Student student) {

		model.addAttribute("student", student);
		
		return "studdetails";
	}

}