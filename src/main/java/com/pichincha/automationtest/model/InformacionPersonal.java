package com.pichincha.automationtest.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class InformacionPersonal {

    private String email;
    private String clave;
    private String  nombre;
    private String apellido;


    public InformacionPersonal() {

    }

    public InformacionPersonal(String email) {
        this.email = email;
    }

    public InformacionPersonal( String email,String clave, String nombre, String apellido) {
        this.email = email;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
    }




}
