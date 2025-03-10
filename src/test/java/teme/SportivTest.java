package teme;

import org.testng.annotations.Test;

public class SportivTest {

    @Test
    public void testMethod(){
        Sportiv jucator1 = new Sportiv("baschet", "Dacian Iliescu", false, "atacant", "CSM Oradea", 'A', 500);
        jucator1.rezumat();

        System.out.println();

        Sportiv jucator2 = new Sportiv("baschet", "Radu Ciuca", false, "fundas", "CFR Cluj", 'B', 350);
        jucator2.rezumat();

        System.out.println();

        Sportiv jucator3 = new Sportiv("polo", "Darius Zele", false, "portar", "Dinamo Bucuresti", 'B', 100);
        jucator3.rezumat();
    }
}
