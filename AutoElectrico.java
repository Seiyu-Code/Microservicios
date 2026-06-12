package org.example.ejercicioVehiculos;

public class AutoElectrico extends VehiculoElectrico {

    private double costoKwh;

    public AutoElectrico(String marca, double distancia, double consumoKwh, double costoKwh) {
        super(marca, distancia, consumoKwh);
        this.costoKwh = costoKwh;
    }

    @Override
    public double calcularCostoViaje() {
        return distancia * consumoKwh * costoKwh;
    }
}