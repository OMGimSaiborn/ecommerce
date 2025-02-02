package com.P7_ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.P7_ecommerce.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
