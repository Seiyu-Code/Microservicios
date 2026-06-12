package org.example.ejercicioVehiculos;

public class VehiculoGasolina extends Vehiculo {

    private double consumoLitros;
    private double precioLitro;

    public VehiculoGasolina(String marca, double distancia, double consumoLitros, double precioLitro) {
        super(marca, distancia);
        this.consumoLitros = consumoLitros;
        this.precioLitro = precioLitro;
    }

    @Override
    public double calcularCostoViaje() {
        return distancia * consumoLitros * precioLitro;
    }
}