package org.example.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<RecursoBibliografico> recursos = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarRecurso(RecursoBibliografico recurso) {
        recursos.add(recurso);
    }

    //Antiguo
    public RecursoBibliografico obtenerMasAntiguo() {
        return recursos.stream()
                .min((r1, r2) -> Integer.compare(r1.getAnioPublicacion(), r2.getAnioPublicacion()))
                .orElse(null);
    }

    public void imprimir() {
        System.out.println("Biblioteca: " + nombre);

        recursos.forEach(r -> System.out.println(r.obtenerResumen()));

        RecursoBibliografico antiguo = obtenerMasAntiguo();

        if (antiguo != null) {
            System.out.println("\nMás antiguo:");
            System.out.println(antiguo.obtenerResumen());
        }
    }
}