package mvc.controller;

import gestores.*;
import mvc.view.VistaConsola;

public class ControladorAudioVisual {

    private VistaConsola vista;
    private PeliculaGestor peliculaGestor;
    private ActorGestor actorGestor;

    public ControladorAudioVisual(VistaConsola vista) {
        this.vista = vista;
        this.peliculaGestor = new PeliculaGestor("data/peliculas.csv");
        this.actorGestor = new ActorGestor("data/actores.csv");
    }

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    vista.mostrarMensaje("Películas registradas:");
                    peliculaGestor.cargar().forEach(p -> vista.mostrarMensaje(p.toCSV()));
                    break;

                case 2:
                    vista.mostrarMensaje("Actores registrados:");
                    actorGestor.cargar().forEach(a -> vista.mostrarMensaje(a.toCSV()));
                    break;

                case 3:
                    continuar = false;
                    break;
            }
        }
    }
}
