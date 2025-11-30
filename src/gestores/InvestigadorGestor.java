package gestores;
import uni1a.Investigador;
public class InvestigadorGestor extends GestorBase<Investigador> {

    public InvestigadorGestor(String ruta) {
        super(ruta);
    }

    @Override
    protected Investigador desdeCSV(String linea) {
        return Investigador.fromCSV(linea);
    }
}
