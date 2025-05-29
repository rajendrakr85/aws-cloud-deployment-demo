package com.cloud.pack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cloud")
public class CloudController {

	@GetMapping("/")
	public String getCloudTest() {
		return "This url test aws cloud develpment ";
	}
	
}
