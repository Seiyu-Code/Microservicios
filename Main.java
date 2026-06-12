package org.example.ejercicio4;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Mi Biblioteca");

        biblioteca.agregarRecurso(
                new LibroElectronico("Clean Code", "Robert Martin", 2008, "PDF", 5.2, 450, true)
        );

        biblioteca.agregarRecurso(
                new LibroElectronico("Java Basics", "Autor X", 2001, "EPUB", 3.1, 300, false)
        );

        biblioteca.agregarRecurso(
                new LibroElectronico("Microservicios", "Autor Y", 2015, "PDF", 6.5, 500, true)
        );

        biblioteca.imprimir();
    }
}