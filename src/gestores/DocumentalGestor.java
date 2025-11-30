package gestores;
import uni1a.Documental;
public class DocumentalGestor extends GestorBase<Documental> {

    public DocumentalGestor(String ruta) {
        super(ruta);
    }

    @Override
    protected Documental desdeCSV(String linea) {
        return Documental.fromCSV(linea);
    }
}

