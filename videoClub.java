public class videoClub {
    private Pelicula [] peliculas;

    public videoClub(Pelicula[] peliculas){ 
        this.peliculas = peliculas;
    }

    public Pelicula [] getPeliculas(){
        return peliculas;
    }

    public Pelicula buscarPelicula(String titulo) {
        Pelicula peliculaEncontrada = null;
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].getTitulo().equalsIgnoreCase(titulo)) {
                peliculaEncontrada = peliculas[i];
                break;
            }
        }
        return peliculaEncontrada;
    }

    public Pelicula peliculaCMActores(){
        Pelicula peliculaCMActores = peliculas[0];
        for (int i = 1; i < peliculas.length; i++){
            if (peliculas[i].getCantidadActores() > peliculaCMActores.getCantidadActores()){
                peliculaCMActores = peliculas[1];
            }
        }
        return peliculaCMActores;
    }

}

