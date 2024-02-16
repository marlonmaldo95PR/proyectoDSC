package com.example.proyectoDSC.Modal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

@Getter
@Setter
@Entity
@Table(name = "roles")
public class Rol implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rol")
    @Enumerated(EnumType.STRING)
    private UsuarioRol usuarioRol;
    @Override
    public String getAuthority() {
        return null;
    }
}
