package gestores;

import uni1a.Pelicula;

public class PeliculaGestor extends GestorBase<Pelicula> {

    public PeliculaGestor(String ruta) {
        super(ruta);
    }

    @Override
    protected Pelicula desdeCSV(String linea) {
        return Pelicula.fromCSV(linea);
    }
}
