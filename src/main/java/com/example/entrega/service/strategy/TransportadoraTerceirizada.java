package com.example.entrega.service.strategy;

import org.springframework.stereotype.Service;

@Service("terceirizada")
public class TransportadoraTerceirizada implements EntregaStrategy {

    @Override
    public double calcularEntrega(double peso) {
        return (peso * 0.20) + 5;
    }

    @Override
    public String modalidade() {
        return "terceirizada";
    }
}