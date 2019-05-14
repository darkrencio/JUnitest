import org.junit.*;
import static org.junit.Assert.*;    // importa una classe static

public class TestPunt {
    @Test
    public void testPuntConstructor() {
        // comprova que el constructor Punt() pugui ser cridat
        Punt p = new Punt();
    }

    @Test
    public void testPuntBuit() {
        // comprova que el constructor Punt() deixi a 0 els valors
        Punt p = new Punt();
        assertEquals(0, p.getX()); // Afirma que la coordenada x val 0
        assertEquals(0, p.getY());
    }

    @Test
    public void testPunt(){
        Punt p = new Punt();
        p.setX(3);
        p.setY(3);
        assertEquals(3,p.getX());
        assertEquals(3,p.getY());
    }

    @Test
    public void testPuntDefinit() {
        // comprova que el constructor Punt(int,int) deixi els valors correctes
        Punt p = new Punt(3, 4);
        assertEquals(3, p.getX());
        assertEquals(4, p.getY());
    }

    @Test
    public void testSuma(){
        Punt p = new Punt(3, 4);
        p.suma(p);
    }

    //Exercici 4: Quan en un setter estem dividim el numero entrant entre un numero assignat al setter i el numero introduit es 0.

    //Exercici 5: Básicament en el 4.10 explica el fet de d'intentar agafar més d'un error en un test, això no es recomenat ja que si peta el test, no saps per quin error ->
    //-> va ser generat "you begin to fight against JUnit", mentres que si fas un test per error saps a quin test correspon cada error i això poder resoldre'l. "

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestPunt");
    }
}
