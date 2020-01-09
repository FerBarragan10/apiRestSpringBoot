package com.apiRestWithUdemy.apiSpring.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.apiRestWithUdemy.apiSpring.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente,Long> {
	

}
