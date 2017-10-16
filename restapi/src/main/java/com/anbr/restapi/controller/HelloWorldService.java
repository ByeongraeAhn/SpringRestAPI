package com.anbr.restapi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldService {

	@RequestMapping
	public String helloMethod1(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Hello  " + name;
	}

	@RequestMapping(value = "/{firstName}/{lastName}", method = RequestMethod.GET)
	public String helloMethod2(@PathVariable String firstName, @PathVariable String lastName) {
		return "Hello " + firstName + " " + lastName;
	}

}