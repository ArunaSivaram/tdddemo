package com.pg.tdd.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pg.tdd.demo.domain.Message;

@RestController
public class MessageController {
	
	@RequestMapping(path = "/demo/{text}", method= RequestMethod.GET)
	public Message demo(@PathVariable("text") String text) {
		return new Message(text);
	}

}
