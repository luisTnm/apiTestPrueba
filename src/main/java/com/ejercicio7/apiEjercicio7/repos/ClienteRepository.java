package com.ejercicio7.apiEjercicio7.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio7.apiEjercicio7.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}