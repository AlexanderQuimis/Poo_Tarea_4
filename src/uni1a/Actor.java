
package uni1a;
import data.CSVConvertible;

public class Actor implements CSVConvertible {
    private String nombre;
    private int edad;
    private String nacionalidad;

    public Actor(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void mostrarInformacion() {
        System.out.println(nombre + " (" + nacionalidad + "), " + edad + " años");
    }

    public String toCSV() {
        return this.nombre + ";" 
             + this.edad + ";" 
             + this.nacionalidad;
    }

    public static Actor fromCSV(String linea) {
        String[] partes = linea.split(";");
        String nombre = partes[0];
        int edad = Integer.parseInt(partes[1]);
        String nacionalidad = partes[2];

        return new Actor(nombre, edad, nacionalidad);
    }

}
