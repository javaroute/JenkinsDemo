package com.mydemo.hello_spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/get")
public class GetDemoInfo {
	@RequestMapping("/getone")
	public String get(){
		System.out.println("11111111111");
		return "SUCCESS";
	}
}
