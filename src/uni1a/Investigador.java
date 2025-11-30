package uni1a;
import data.CSVConvertible;

public class Investigador implements CSVConvertible {

    private String nombre;
    private String especialidad;

    public Investigador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void mostrarInformacion() {
        System.out.println("Investigador: " + nombre + " - Especialidad: " + especialidad);
    }

    public String toCSV() {
        return this.nombre + ";" + this.especialidad;
    }

    public static Investigador fromCSV(String linea) {
        String[] partes = linea.split(";");
        String nombre = partes[0];
        String especialidad = partes[1];

        return new Investigador(nombre, especialidad);
    }

}