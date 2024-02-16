package com.example.proyectoDSC.Modal;

import jakarta.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String image;
    private String seccion;

    private String descripcion;

    private String marca;

    private Long valor;

    private String color;

    private Long stock;

    public Producto(Long id, String image, String seccion, String descripcion, String marca, Long valor, String color, Long stock) {
        this.id = id;
        this.image = image;
        this.seccion = seccion;
        this.descripcion = descripcion;
        this.marca = marca;
        this.valor = valor;
        this.color = color;
        this.stock = stock;
    }

    public Producto() {
    }

    public Long getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getSeccion() {
        return seccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public Long getValor() {
        return valor;
    }

    public String getColor() {
        return color;
    }

    public Long getStock() {
        return stock;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }
}

<<<<<<< HEAD



=======
>>>>>>> bf0df0926057c82c7bd04506811fa069e28c8d46
