package com.opensystem.teste.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Client{
	private int id;
	private String name;
	private String adress;
	private String cpf;
	private String phone;

	public Client(String name, String adress, String cpf, String phone) {
		this.name = name;
		this.adress = adress;
		this.cpf = cpf;
		this.phone = phone;
	}
	
	public Client(int id, String name, String adress, String cpf, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.cpf = cpf;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}
