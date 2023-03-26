package com.pichincha.automationtest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Login {

    private String usuario;
    private String clave;

    private String mensaje;

    public Login() {
    }

    public Login(String usuario, String clave) {
        this.usuario= usuario;
        this.clave= clave;
    }
}