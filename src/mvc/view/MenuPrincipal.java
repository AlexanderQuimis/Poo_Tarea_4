package mvc.view;
import java.util.Scanner;
public class MenuPrincipal {

    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("===== SISTEMA DE CONTENIDO AUDIOVISUAL =====");
        System.out.println("1. Mostrar todas las películas guardadas");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
