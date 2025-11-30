package gestores;

import uni1a.Actor;

public class ActorGestor extends GestorBase<Actor> {

    public ActorGestor(String ruta) {
        super(ruta);
    }

    @Override
    protected Actor desdeCSV(String linea) {
        return Actor.fromCSV(linea);
    }
}
