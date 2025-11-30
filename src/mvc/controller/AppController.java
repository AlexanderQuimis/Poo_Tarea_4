package mvc.controller;
import mvc.view.MenuPrincipal;
import gestores.PeliculaGestor;
import uni1a.Pelicula;
import java.util.List;
public class AppController {

    private MenuPrincipal vista;
    private PeliculaGestor peliculaGestor;

    public AppController(MenuPrincipal vista, PeliculaGestor peliculaGestor) {
        this.vista = vista;
        this.peliculaGestor = peliculaGestor;
    }

    public void iniciar() {

        int opcion;
        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1:
                    mostrarPeliculas();
                    break;

                case 0:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;

                default:
                    vista.mostrarMensaje("Opción inválida.");
            }

        } while (opcion != 0);
    }

    private void mostrarPeliculas() {
        List<Pelicula> lista = peliculaGestor.cargar();

        vista.mostrarMensaje("===== LISTA DE PELÍCULAS =====");
        for (Pelicula p : lista) {
            vista.mostrarMensaje(" - " + p.toCSV());
        }
    }
}
