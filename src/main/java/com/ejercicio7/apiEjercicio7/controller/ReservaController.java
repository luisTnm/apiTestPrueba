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

import com.ejercicio7.apiEjercicio7.entities.Reserva;
import com.ejercicio7.apiEjercicio7.repos.ReservaRepository;

@RestController
public class ReservaController {
	
	@Autowired
	ReservaRepository repository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ReservaController.class);


	
	@GetMapping(value="/reserva/")
	public List<Reserva> getReservas(){
		
		return repository.findAll();
	}
	
	
	@GetMapping(value="/reserva/{id}")
	public Reserva getReserva(@PathVariable("id") int id) {
		LOGGER.info("finding reserva by id: "+id);
		return repository.findById(id).get();
	}
	
	
	@PostMapping(value="/reserva/")
	public Reserva createReserva(@RequestBody Reserva reserva) {
		return repository.save(reserva);
	}
	
	@PutMapping(value="/reserva/")
	public Reserva updateReserva(@RequestBody Reserva reserva) {
		return repository.save(reserva);
		
	}
	
	@DeleteMapping(value="/reserva/{id}")
	public void deleteReserva(@PathVariable("id") int id) {
		repository.deleteById(id);
	}
}
