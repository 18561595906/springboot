package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	private final static Logger LOG = LoggerFactory.getLogger(MainController.class);
 
	@RequestMapping("/")
	@ResponseBody
	String home() {
		System.out.println("新的springboot项目启动成功!");
		return "新的springboot项目启动成功!";
	}
}

