package org.example.ejercicioVehiculos;

import java.util.ArrayList;
import java.util.List;

public class Flota {

    private List<Vehiculo> vehiculos = new ArrayList<>();

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public double calcularCostoTotal() {
        return vehiculos.stream()
                .mapToDouble(Vehiculo::calcularCostoViaje)
                .sum();
    }

    // vehicu mas eco
    public Vehiculo vehiculoMasBarato() {
        return vehiculos.stream()
                .min((v1, v2) -> Double.compare(v1.calcularCostoViaje(), v2.calcularCostoViaje()))
                .orElse(null);
    }

    public void imprimir() {
        vehiculos.forEach(v -> System.out.println(v.resumen()));
        System.out.println("TOTAL: $ " + calcularCostoTotal() + " PesosColombianos");

        Vehiculo mejor = vehiculoMasBarato();
        if (mejor != null) {
            System.out.println("Más económico: " + mejor.resumen());
        }
    }
}