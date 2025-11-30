package poo;
import mvc.view.VistaConsola;
import mvc.controller.ControladorAudioVisual;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        VistaConsola vista = new VistaConsola();
        ControladorAudioVisual controlador = new ControladorAudioVisual(vista);
        controlador.iniciar();
    }
}