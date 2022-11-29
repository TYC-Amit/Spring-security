package com.te.springsecurity.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@PostMapping("/welcome")
	public String welcome() {
		String text = "this is private page  \n";
		text += " this page is not allowed to unauthenticated users";
		return text;
	}

}
