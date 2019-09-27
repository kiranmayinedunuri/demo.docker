package com.docker.sample.demo.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/docker/hello")
public class DockerController {
	@GetMapping
	public String HelloWorld() {
		return "Docker Hello";
		
	}

}
