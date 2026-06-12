package org.example.ejercicio4;

public class LibroElectronico extends RecursoDigital {

    private int numeroPaginas;
    private boolean tieneDRM;

    public LibroElectronico(String titulo, String autor, int anio,
                            String formato, double tamanioMB,
                            int paginas, boolean drm) {

        super(titulo, autor, anio, formato, tamanioMB);
        this.numeroPaginas = paginas;
        this.tieneDRM = drm;
    }

    @Override
    public String obtenerResumen() {
        return "Libro: " + titulo +
                " | Autor: " + autor +
                " | Año: " + anioPublicacion +
                " | Formato: " + formato +
                " | Tamaño: " + tamanioMB + "MB" +
                " | Páginas: " + numeroPaginas +
                " | DRM: " + (tieneDRM ? "Sí" : "No");
    }
}