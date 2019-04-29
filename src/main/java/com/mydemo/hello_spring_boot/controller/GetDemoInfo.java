package com.mydemo.hello_spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class GetDemoInfo {
	@RequestMapping("/jenkins")
    @ResponseBody
	public String get(){
		System.out.println("11111111111");
		return "SUCCESS";
	}
}
