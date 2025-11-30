package gestores;
import data.ArchivoManager;
import data.CSVConvertible;
import java.util.ArrayList;
import java.util.List;
public abstract class GestorBase<T extends CSVConvertible> {
    protected String ruta;
    public GestorBase(String ruta) {
        this.ruta = ruta;
    }
    public void guardar(List<T> lista) {

        ArchivoManager.escribirArchivo(ruta, "", false); 
        for (T elemento : lista) {
            ArchivoManager.escribirArchivo(ruta, elemento.toCSV(), true);
        }
    }
    public List<T> cargar() {
        List<String> lineas = ArchivoManager.leerLineas(ruta);
        List<T> lista = new ArrayList<>();

        for (String linea : lineas) {
            if (linea.trim().isEmpty()) continue;
            lista.add(desdeCSV(linea));
        }
        return lista;
    }
    protected abstract T desdeCSV(String linea);
}