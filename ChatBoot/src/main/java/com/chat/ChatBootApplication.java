package com.chat;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chat.services.ChatService;

@SpringBootApplication
public class ChatBootApplication  {

	@Autowired
	private ChatService chatService;

	public static void main(String[] args) {
		SpringApplication.run(ChatBootApplication.class, args);
	}

}
