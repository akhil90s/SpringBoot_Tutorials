package com.spring.security.oAuth2InMemory.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value= "/test", method = RequestMethod.GET)
	public String helloWord() {
		return "Hello Word";
	}
}

