package gestores;
import uni1a.SerieDeTV;
public class SerieGestor extends GestorBase<SerieDeTV> {

    public SerieGestor(String ruta) {
        super(ruta);
    }

    @Override
    protected SerieDeTV desdeCSV(String linea) {
        return SerieDeTV.fromCSV(linea);
    }
}
