package com.example.proyectoDSC.Repository;

import com.example.proyectoDSC.Modal.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface ProductoRepository extends JpaRepository<Producto, Long> {

}