package uni1a;
import data.CSVConvertible;

public class SerieDeTV extends ContenidoAudiovisual implements CSVConvertible {

    private int temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        System.out.println();
    }

	public void agregarTemporada(Temporada temporada1) {
		// TODO Auto-generated method stub
		
	}

	public String toCSV() {
	    return getTitulo() + ";" 
	         + getDuracionEnMinutos() + ";" 
	         + getGenero() + ";" 
	         + this.temporadas;
	}

	public static SerieDeTV fromCSV(String linea) {
	    String[] p = linea.split(";");

	    SerieDeTV serie = new SerieDeTV(
	            p[0],                       
	            Integer.parseInt(p[1]),     
	            p[2],                        
	            Integer.parseInt(p[3])       
	    );

	    return serie;
	}
}