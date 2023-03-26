package com.pichincha.automationtest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class Credito {

    private String valorSolicitar;
    private String valorVivienda;
    private String plazoPrestamo;
    private String tipoAmortizacion;
    private String cuaotaMensual;
    private String tasaInteres;

    public Credito() {

    }

    public Credito(String valorSolicitar, String valorVivienda, String plazoPrestamo, String tipoAmortizacion, String cuaotaMensual, String tasaInteres) {
        this.valorSolicitar = valorSolicitar;
        this.valorVivienda = valorVivienda;
        this.plazoPrestamo = plazoPrestamo;
        this.tipoAmortizacion = tipoAmortizacion;
        this.cuaotaMensual = cuaotaMensual;
        this.tasaInteres = tasaInteres;
    }
}