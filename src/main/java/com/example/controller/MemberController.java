package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@RequestMapping
	public String index() {

		System.out.println("ポケモン");
		System.err.println("勉強しましょう！");
		return "member2";

	}

}
