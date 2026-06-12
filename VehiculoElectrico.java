package org.example.ejercicioVehiculos;

public abstract class VehiculoElectrico extends Vehiculo {
    protected double consumoKwh;

    public VehiculoElectrico(String marca, double distancia, double consumoKwh) {
        super(marca, distancia);
        this.consumoKwh = consumoKwh;
    }
}