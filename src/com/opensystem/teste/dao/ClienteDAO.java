package com.opensystem.teste.dao;

import java.util.List;

import com.opensystem.teste.model.Client;

public interface ClienteDAO {
	public void insert(Client object);
	public void delete(Client object);
	public List<Client> listAll();
	public void update(Client object);
}
