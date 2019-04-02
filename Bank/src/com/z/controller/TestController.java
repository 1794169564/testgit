package com.z.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.z.service.Backend_UserService;

@Controller
@RequestMapping("/test")
public class TestController {
	@Resource
	private Backend_UserService busService;
}
