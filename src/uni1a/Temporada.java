package uni1a;
import data.CSVConvertible;

public class Temporada implements CSVConvertible {

    private int numeroTemporada;
    private int cantidadEpisodios;

    public Temporada(int numeroTemporada, int cantidadEpisodios) {
        this.numeroTemporada = numeroTemporada;
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }
    
    public void mostrarTemporada() {
        System.out.println("Temporada " + numeroTemporada + ": " + cantidadEpisodios + " episodios");
    }


    public String toCSV() {
        return this.numeroTemporada + ";" + this.cantidadEpisodios;
    }

    public static Temporada fromCSV(String linea) {
        String[] partes = linea.split(";");
        int numero = Integer.parseInt(partes[0]);
        int episodios = Integer.parseInt(partes[1]);

        return new Temporada(numero, episodios);
    }
}
