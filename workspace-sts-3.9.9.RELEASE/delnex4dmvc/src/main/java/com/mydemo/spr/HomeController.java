package com.mydemo.spr;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {


	@RequestMapping(value = "/")
	public String home(Model model) {

		Date date=new Date();
		model.addAttribute("myvar",date);
		return "home";
	}

	@RequestMapping(value = "hello")
	public String hello(Model model,@RequestParam()Map<String, String> test) {

		String name = test.get("uname");
		String password = test.get("pass");
		String address = test.get("addr");
		
		
		model.addAttribute("uname", name);
		model.addAttribute("pass", password);
		model.addAttribute("addr", address);
		
		return "myfile";
	}

}