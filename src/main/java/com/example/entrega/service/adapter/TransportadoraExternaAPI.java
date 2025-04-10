package com.example.entrega.service.adapter;

public class TransportadoraExternaAPI {
    public double calcular(double peso) {
        return (peso * 0.25) + 10;
    }

    public String modalidade(){
        return "externa";
    }
}
