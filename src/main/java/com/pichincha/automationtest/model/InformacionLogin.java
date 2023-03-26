package com.pichincha.automationtest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InformacionLogin {
    private static Login login = new Login();

    public static Login conDatos(String usuario, String clave){
        login.setUsuario(usuario);
        login.setClave(clave);
     return  login;
    }
    public static Login mensajeIngreso(String mensaje){
      login.setMensaje(mensaje);
        return  login;

    }

}