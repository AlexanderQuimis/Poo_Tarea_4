package test.java.uni1a;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uni1a.Actor;

public class ActorTest {

    @Test
    public void testToCSV() {
        Actor actor = new Actor("Leo", 40, "USA");
        String esperado = "Leo;40;USA";
        assertEquals(esperado, actor.toCSV());
    }

    @Test
    public void testFromCSV() {
        String linea = "Ana;30;ECUADOR";
        Actor actor = Actor.fromCSV(linea);

        assertEquals("Ana", actor.getNombre());
        assertEquals(30, actor.getEdad());
        assertEquals("ECUADOR", actor.getNacionalidad());
    }
}
