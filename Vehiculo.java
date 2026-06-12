package org.example.ejercicioVehiculos;

public abstract class Vehiculo {
    protected String marca;
    protected double distancia;

    public Vehiculo(String marca, double distancia) {
        this.marca = marca;
        this.distancia = distancia;
    }

    //
    public abstract double calcularCostoViaje();

    public String resumen() {
        return "Marca: " + marca + " - Costo: $ " + calcularCostoViaje() + " PesosColombianos";
    }
}