package uni1a;
import java.util.ArrayList;
import java.util.List;
import data.CSVConvertible;

public class Pelicula extends ContenidoAudiovisual implements CSVConvertible {

    private String estudio;
    private List<Actor> actores = new ArrayList<>();

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    public void mostrarActores() {
        if (actores.isEmpty()) {
            System.out.println("No hay actores registrados.");
        } else {
            System.out.println("Actores:");
            for (Actor a : actores) {
            	System.out.println("- " + a.getNombre() + " (" + a.getNacionalidad() + ")");
            }
        }
    }


    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        mostrarActores();
        System.out.println();
    }

    public String toCSV() {
        return getTitulo() + ";" 
             + getDuracionEnMinutos() + ";" 
             + getGenero() + ";" 
             + this.estudio;
    }

    public static Pelicula fromCSV(String linea) {
        String[] partes = linea.split(";");
        String titulo = partes[0];
        int duracion = Integer.parseInt(partes[1]);
        String genero = partes[2];
        String estudio = partes[3];
        return new Pelicula(titulo, duracion, genero, estudio);
    }
}