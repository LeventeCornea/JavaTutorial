package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void metodaTest(){
        Elev elev1 = new Elev("Geoana", "Aurel", 14, 7);
        elev1.infoElev();
        System.out.println();

        Elev elev2 = new Elev("Petru", "Fetea", 15, 8);
        elev2.infoElev();
        System.out.println();

        Elev elev3 = new Elev("Florentin", "Ionut", 16, 9);
        elev3.infoElev();
    }
}
