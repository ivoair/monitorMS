package com.ivoair.ms.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome() {
		log.info("Goodbye World!");
		return "Goodbye World!";
	}
}
