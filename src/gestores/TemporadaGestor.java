package gestores;
import uni1a.Temporada;

public class TemporadaGestor extends GestorBase<Temporada> {

    public TemporadaGestor(String ruta) {
        super(ruta);
    }

    @Override
    protected Temporada desdeCSV(String linea) {
        return Temporada.fromCSV(linea);
    }
}
