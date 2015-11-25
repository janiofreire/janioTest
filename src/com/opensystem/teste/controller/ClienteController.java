package com.opensystem.teste.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.opensystem.teste.dao.ClienteDAO;
import com.opensystem.teste.dao.DefaultClienteDAO;
import com.opensystem.teste.model.Client;

@Path("/client")
public class ClienteController extends MainController<Client>{
	private ClienteDAO clienteDAO= new DefaultClienteDAO();
	
	@GET
	@Path("/teste")
	@Produces(MediaType.APPLICATION_JSON)
	public Client teste(){
		return new Client("teste", "teste", "teste", "teste");
	}
	
	@POST
	@Path("/new2")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	public void insert2(@FormParam("name")String name, @FormParam("adress")String adress, @FormParam("phone")String phone, @FormParam("cpf")String cpf) {
		clienteDAO.insert(new Client(name, adress, cpf, phone));
	}
	
	@POST
	@Path("/new")
	@Consumes({MediaType.APPLICATION_JSON})
	@Override
	public void insert(Client object) {
		clienteDAO.insert(object);
	}

	@POST
	@Path("/delete")
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public void delete(Client object) {
		clienteDAO.delete(object);
	}

	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public List<Client> listAll() {
		return clienteDAO.listAll();
	}

	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public void update(Client object) {
		clienteDAO.update(object);
	}

}
