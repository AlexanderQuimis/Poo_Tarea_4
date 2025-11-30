package mvc.view;

import java.util.Scanner;

public class VistaConsola {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("===== MENÚ PRINCIPAL =====");
        System.out.println("1. Mostrar películas");
        System.out.println("2. Mostrar actores");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
