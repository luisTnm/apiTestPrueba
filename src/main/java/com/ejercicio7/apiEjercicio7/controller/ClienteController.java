package com.ejercicio7.apiEjercicio7.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio7.apiEjercicio7.entities.Cliente;
import com.ejercicio7.apiEjercicio7.repos.ClienteRepository;

@RestController
public class ClienteController {
	
	@Autowired
	ClienteRepository repository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ClienteController.class);
	
	@GetMapping(value="/cliente/")
	public List<Cliente> getClientes(){
		
		return repository.findAll();
	}
	
	
	@GetMapping(value="/cliente/{id}")
	public Cliente getCliente(@PathVariable("id") int id) {
		LOGGER.info("finding reserva by id: "+id);
		return repository.findById(id).get();
	}
	
	
	@PostMapping(value="/cliente/")
	public Cliente createCliente(@RequestBody Cliente reserva) {
		return repository.save(reserva);
	}
	
	@PutMapping(value="/cliente/")
	public Cliente updateCliente(@RequestBody Cliente reserva) {
		return repository.save(reserva);
		
	}
	
	@DeleteMapping(value="/cliente/{id}")
	public void deleteCliente(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

}
