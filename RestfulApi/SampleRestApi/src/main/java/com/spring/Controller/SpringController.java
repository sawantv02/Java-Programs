package com.spring.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.POJO.Message;

@RestController
public class SpringController {

	@RequestMapping("/")
	public String welcome(){
		return "Welcome to RestTemplate";
	}
	
	@RequestMapping("/hello/{player}")
	public Message message(@PathVariable String player){
		Message msg=new Message(player,"Hello "+player);
		return msg;
	}
}
