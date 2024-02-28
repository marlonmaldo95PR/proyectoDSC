package com.example.proyectoDSC.Modal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombre;
    private String genero;
    private String descripcion;
    private String marca;
    private String color;
    private Double precio;
    private String talla;

    @ManyToOne
    @JoinColumn(name = "comprador_id")  // Asegúrate de tener la columna correcta aquí
    private Comprador comprador;


    public Producto(Long id, String nombre, String genero, String descripcion, String marca, String color, Double precio, String talla) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.descripcion = descripcion;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.talla = talla;
    }


}
