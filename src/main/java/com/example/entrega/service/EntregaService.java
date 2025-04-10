package com.example.entrega.service;

import com.example.entrega.service.strategy.EntregaStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregaService {
    private final List<EntregaStrategy> strategies;

    public EntregaService(List<EntregaStrategy> strategies) {
        this.strategies = strategies;
    }

    public double calcular(String modalidade, double peso) {
        return strategies.stream()
                .filter(e -> e.modalidade().equalsIgnoreCase(modalidade))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Tipo de Frete inválido"))
                .calcularEntrega(peso);
    }
}
