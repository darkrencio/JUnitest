import org.junit.*;
import static org.junit.Assert.*;    // importa una classe static

public class TestSegment {
    @Test
    public void testConstructor(){
        Segment s = new Segment();
    }

    @Test
    public void testLongitut() {
        Segment s = new Segment();
        s.longitud(s);
    }

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestSegment");
    }
}
