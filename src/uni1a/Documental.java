package uni1a;
import data.CSVConvertible;

public class Documental extends ContenidoAudiovisual implements CSVConvertible {

    private String tema;
    private Investigador investigadorPrincipal;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Investigador getInvestigadorPrincipal() {
        return investigadorPrincipal;
    }

    public void setInvestigadorPrincipal(Investigador investigadorPrincipal) {
        this.investigadorPrincipal = investigadorPrincipal;
    }

    public void mostrarInvestigador() {
        if (investigadorPrincipal != null) {
            investigadorPrincipal.mostrarInformacion();
        } else {
            System.out.println("No hay investigador asignado.");
        }
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println();
    }

    public String toCSV() {
        return getTitulo() + ";" 
             + getDuracionEnMinutos() + ";" 
             + getGenero() + ";" 
             + this.tema;
    }

    public static Documental fromCSV(String linea) {
        String[] partes = linea.split(";");
        String titulo = partes[0];
        int duracion = Integer.parseInt(partes[1]);
        String genero = partes[2];
        String tema = partes[3];

        return new Documental(titulo, duracion, genero, tema);
    }
}