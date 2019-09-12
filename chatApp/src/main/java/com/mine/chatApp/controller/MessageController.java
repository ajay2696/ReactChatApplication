package com.mine.chatApp.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.mine.chatApp.model.Message;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MessageController {
	
	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Message message(Message message) throws InterruptedException {
		Thread.sleep(2000);
		log.info("Message {}",message);
		return message;		
	}

}
