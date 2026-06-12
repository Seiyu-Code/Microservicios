package org.example.ejercicioVehiculos;

public class Main {

    public static void main(String[] args) {

        Flota flota = new Flota();

        flota.agregarVehiculo(
                new AutoElectrico("BYD", 200, 0.2, 750)
        );

        flota.agregarVehiculo(
                new VehiculoGasolina("Mazda", 200, 0.02, 15500)
        );

        flota.imprimir();
    }
}