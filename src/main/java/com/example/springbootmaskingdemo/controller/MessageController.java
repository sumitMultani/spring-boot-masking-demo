package com.example.springbootmaskingdemo.controller;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootmaskingdemo.model.User;

@RestController
public class MessageController {

	private final Logger log = LoggerFactory.getLogger(MessageController.class);

	@GetMapping("/message")
	public String getMessage() {
		String password = "abc";
		Integer creditCard = 123445555;
		log.info("Inside MessageController getMessage() method password=" + password);
		log.info("this is user password:" + password);
		log.info("this is user creditCard=" + creditCard);
		log.info("card context set for creditCard=" + creditCard);

		User user = new User("abc", "secure", 123456);
		log.info("Request Model : " + user);
		String jsonMessage = getJSONMessage();
		System.out.println("=================START==========");
		log.info("Request ===> : "+jsonMessage);
		System.out.println("=================END==========");
		return "Log masking done. Please verify on console.";
	}

	private String getJSONMessage() {
		String message;
		JSONObject json = new JSONObject();
		json.put("password", "value1");
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("id", 0);
		jsonObj.put("name", "testName");
		json.put("test2", jsonObj);
		message = json.toString();
		message = message.replaceAll(",", " ");
		log.info("Request Model ====> : {}", message); 
		return message;
	}
}
