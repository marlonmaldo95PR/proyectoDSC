package com.example.proyectoDSC.Modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@Table(name = "Usuarios")
@Getter
@Setter
@Entity


public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private String  email;
    private String password;
    private String rol;

    //@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)

    public Usuario() {

    }
}



