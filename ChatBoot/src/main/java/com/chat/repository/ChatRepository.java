package com.chat.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chat.models.Vdeuda;

public interface ChatRepository extends CrudRepository<Vdeuda, String> {
	
	List<Vdeuda> findByCedula(String cedula);
	 
}
