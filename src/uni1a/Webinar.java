package uni1a;
import data.CSVConvertible;
public class Webinar extends ContenidoAudiovisual implements CSVConvertible {

    private String tema;
    private String ponente;
    private String fecha;
    private Actor presentador; 

    public Webinar(String titulo, int duracionEnMinutos, String genero, String tema, String ponente, String fecha) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.ponente = ponente;
        this.fecha = fecha;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getPonente() {
        return ponente;
    }

    public void setPonente(String ponente) {
        this.ponente = ponente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Actor getPresentador() {
        return presentador;
    }

    public void setPresentador(Actor presentador) {
        this.presentador = presentador;
    }

    public void mostrarDetalles() {
        System.out.println("Detalles del Webinar:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + tema);
        System.out.println("Ponente: " + ponente);
        System.out.println("Fecha: " + fecha);

        if (presentador != null) {
            System.out.print("Presentador invitado: ");
            presentador.mostrarInformacion();
        }
        System.out.println();
    }
    public String toCSV() {
        return getTitulo() + ";" +
               getDuracionEnMinutos() + ";" +
               getGenero() + ";" +
               this.tema + ";" +
               this.ponente + ";" +
               this.fecha;
    }

    public static Webinar fromCSV(String linea) {
        String[] p = linea.split(";");
        return new Webinar(
            p[0],               // titulo
            Integer.parseInt(p[1]),
            p[2],               // genero
            p[3],               // tema
            p[4],               // ponente
            p[5]                // fecha
        );
    }
}

