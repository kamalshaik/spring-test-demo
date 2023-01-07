package com.skh;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DemoController {
	
	@PostMapping("/store")
	public String saveData(@RequestBody String data) {
		System.out.println(data);
		return data;
		
	}

}
