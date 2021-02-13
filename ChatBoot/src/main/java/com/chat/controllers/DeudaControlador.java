package com.chat.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chat.models.SolicitudSumistro;
import com.chat.models.Vdeuda;
import com.chat.services.ChatService;

@RestController
@RequestMapping("/deuda")
public class DeudaControlador {

	private static final Logger logger = LoggerFactory.getLogger(DeudaControlador.class);
	private ChatService chatService;

	public DeudaControlador(ChatService chatService) {
		super();
		this.chatService = chatService;
	}

	@GetMapping(produces = "application/json")
	public List<Vdeuda> obtener() {
		try {
			return chatService.obtenerTodasDeudas();
		} catch (DataIntegrityViolationException e) {
			logger.info("Error en el consumo del servicio obtener personas. " + e.getMessage());
			throw new DataIntegrityViolationException(e.getMessage());
		}

	}
	
	
	@PostMapping(produces = "application/json")
	public Vdeuda obtenerDeudaById( @RequestBody @Validated SolicitudSumistro solicitudSuministro ) {
		Optional<Vdeuda> deuda = chatService.obtenerBySuministro(solicitudSuministro.getSuministro());
		if ( deuda.isPresent() ) {
			return deuda.get();
		}
		else
			return null;
	}
	

	@RequestMapping(path = "/{suministro}", produces = "application/json", method = RequestMethod.GET)
	public Vdeuda obtenerDeuda(@PathVariable(value = "suministro") String suministro) {
		try {
			Optional<Vdeuda> deuda = chatService.obtenerBySuministro(suministro);
			if ( deuda.isPresent() )
				return deuda.get();
			else
				return null;
		} catch (Exception e) {
			logger.info("Error en el consumo del servicio obtener personas. " + e.getMessage());
			return null;
			
		}
	}

}
