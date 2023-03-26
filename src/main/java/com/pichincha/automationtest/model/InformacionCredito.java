package com.pichincha.automationtest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InformacionCredito {
    private static Credito credito = new Credito();

    public static Credito conDatos(String valorSolicitar, String valorVivienda,
                                   String plazoPrestamo, String tipoAmorizacion){
     credito.setValorSolicitar(valorSolicitar);
     credito.setValorVivienda(valorVivienda);
     credito.setPlazoPrestamo(plazoPrestamo);
     credito.setTipoAmortizacion(tipoAmorizacion);
     //credito.setCuaotaMensual(cuotaMansual);
     //credito.setTasaInteres(tasaInteres);
     return  credito;
    }

    public static Credito cuotaMensualInteres(String mensual, String interes){
        credito.setCuaotaMensual(mensual);
        credito.setTasaInteres(interes);
        return  credito;

    }

}