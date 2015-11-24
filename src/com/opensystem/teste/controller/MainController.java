package com.opensystem.teste.controller;

import java.util.List;


public abstract class MainController<T> {
	public abstract void insert(T object);
	public abstract void delete(T object);
	public abstract List<T> listAll();
	public abstract void update(T object);
}
