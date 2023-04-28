public class Pelicula {
    private String titulo;
    private String productora;
    private int anio;
    private Actor [] actores;

    public Pelicula(String titulo, String productora, int anio, Actor[] actores) {
        this.titulo = titulo;
        this.productora = productora;
        this.anio = anio;
        this.actores = actores;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getProductora() {
        return productora;
    }

    public int getAnio() {
        return anio;
    }

    public Actor[] getActores() {
        return actores;
    }

    public void setActores(Actor[] actores) {
        this.actores = actores;
    }

    public int getCantidadActores() {
        return actores.length;
    }

    @Override
    public String toString() {
        return titulo + " (" + anio + ") - " + productora;
    }
}
