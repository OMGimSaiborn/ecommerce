package com.P7_ecommerce.service;

import java.util.Optional;

import com.P7_ecommerce.model.Producto;

public interface ProductoService {
	public Producto save(Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
	
}
