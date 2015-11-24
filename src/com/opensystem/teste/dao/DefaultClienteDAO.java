package com.opensystem.teste.dao;

import java.util.Arrays;
import java.util.List;

import com.opensystem.teste.model.Client;

public class DefaultClienteDAO implements ClienteDAO{

	@Override
	public void insert(Client object) {
		System.out.println(object.getName());
		System.out.println(object.getAdress());
		System.out.println(object.getPhone());
		System.out.println(object.getCpf());
		System.out.println("Salvou!!!");
	}

	@Override
	public void delete(Client object) {
		System.out.println("Deletou!!!");
	}

	@Override
	public List<Client> listAll() {
		return Arrays.asList(new Client[]{new Client(1,"Maria","","",""),new Client(2,"Joao","","",""),new Client(2,"Jose","","","")});
	}

	@Override
	public void update(Client object) {
		System.out.println("Atualizou!!!");		
	}

}
