package com.anbr.restapi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldService {

	@RequestMapping
	public String helloMethod1(@RequestParam(value = "name", defaultValue = "World") String name, HttpSession session) {
		if (session.getAttribute("name")== null) {
			System.out.println("세션이 없음☆☆☆☆");
			session.setAttribute("name", name);
		} else {
			System.out.println("세션이 있음★★★★");
			session.getAttribute("name");
		}
			
		return "Hello  " + name;
	}

	@RequestMapping(value = "/{firstName}/{lastName}", method = RequestMethod.GET)
	public String helloMethod2(@PathVariable String firstName, @PathVariable String lastName) {
		return "Hello " + firstName + " " + lastName;
	}

}