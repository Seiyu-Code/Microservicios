package org.example.ejercicio4;

public class RecursoDigital extends RecursoBibliografico {

    protected String formato;
    protected double tamanioMB;

    public RecursoDigital(String titulo, String autor, int anio, String formato, double tamanioMB) {
        super(titulo, autor, anio);
        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }

    @Override
    public String obtenerResumen() {
        return "Recurso Digital: " + titulo + " | Autor: " + autor +
                " | Año: " + anioPublicacion +
                " | Formato: " + formato +
                " | Tamaño: " + tamanioMB + "MB";
    }
}