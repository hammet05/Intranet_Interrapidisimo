package com.interrap.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PruebaController {
	
	@GetMapping(value="/prueba")
	public String getPrueba() {
		return "logins";
	}

}
