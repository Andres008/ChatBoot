package com.chat.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chat.models.SolicitudCedula;
import com.chat.models.Vdeuda;
import com.chat.services.ChatService;

@RestController
@RequestMapping("/cedula")
public class SuministrosCedula {

	private static final Logger logger = LoggerFactory.getLogger(DeudaControlador.class);
	private ChatService chatService;

	public SuministrosCedula(ChatService chatService) {
		super();
		this.chatService = chatService;
	}

	@PostMapping(produces = "application/json")
	public List<Vdeuda> obtenerSuministrosByCedula(@RequestBody @Validated SolicitudCedula solicitudCedula) {
		return chatService.obtenerSuministroByCedula(solicitudCedula);
	}

}
