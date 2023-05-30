package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/{first}/{second}")
	public Integer sum(@PathVariable int first, @PathVariable int second)
	{
		return first+second;
	}

}
