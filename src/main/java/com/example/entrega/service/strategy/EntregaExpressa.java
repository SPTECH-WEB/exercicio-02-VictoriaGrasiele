package com.example.entrega.service.strategy;

import org.springframework.stereotype.Service;

@Service("expressa")
public class EntregaExpressa implements EntregaStrategy {
    @Override
    public double calcularEntrega(double peso) {
        return (peso * 0.30) + 10;
    }
    @Override
    public String modalidade() {
        return "expressa";
    }
}