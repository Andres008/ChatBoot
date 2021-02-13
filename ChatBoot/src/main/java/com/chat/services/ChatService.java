package com.chat.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.controllers.SuministrosCedula;
import com.chat.models.SolicitudCedula;
import com.chat.models.Vdeuda;
import com.chat.repository.ChatRepository;

@Service
public class ChatService {

	private ChatRepository chatRepositorio;
	
	@Autowired
	public ChatService(ChatRepository chatRepositorio) {
		super();
		this.chatRepositorio = chatRepositorio;
	}
	
	public Optional<Vdeuda> obtenerBySuministro(String suministro){
		return chatRepositorio.findById(suministro);
	}


	public List<Vdeuda> obtenerTodasDeudas(){
		return (List<Vdeuda>) chatRepositorio.findAll();
	}
	
	public List<Vdeuda> obtenerSuministroByCedula(SolicitudCedula cedula){
		return (List<Vdeuda>) chatRepositorio.findByCedula(cedula.getCedula());
	}
	
	
}
