package com.example.entrega.service.strategy;

import org.springframework.stereotype.Service;

    @Service("economica")
public class EntregaEconomica implements EntregaStrategy {
    @Override
    public double calcularEntrega(double peso) {
        return (peso * 0.25) + 5;
    }
    @Override
    public String modalidade() {
        return "economica";
    }
}
