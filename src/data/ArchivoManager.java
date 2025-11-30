package data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;

public class ArchivoManager {

    private ArchivoManager() {} // 1

    public static void escribirArchivo(String rutaArchivo, String contenido) { // 2
        escribirArchivo(rutaArchivo, contenido, false);
    }

    public static void escribirArchivo(String rutaArchivo, String contenido, boolean agregar) {
        File archivo = new File(rutaArchivo);

        File carpeta = archivo.getParentFile();  // 3
        if (carpeta != null && !carpeta.exists()) {
            carpeta.mkdirs();                    // 4
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, agregar))) {
            bw.write(contenido);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static List<String> leerLineas(String rutaArchivo) { // 5
        List<String> lineas = new ArrayList<>();
        File archivo = new File(rutaArchivo);

        if (!archivo.exists()) {
            System.out.println("El archivo " + rutaArchivo + " no existe.");
            return lineas;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return lineas;
    }
    
    //Centralización del manejo de archivos para reducir duplicación
    public static <T> void guardarListaCSV(List<T> lista, String ruta) {
        for (T elemento : lista) {
            ArchivoManager.escribirArchivo(ruta, elemento.toString(), true);
        }
    }
}

