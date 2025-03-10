package obiectConstruct;

import org.testng.annotations.Test;

public class MasinaTest {

    @Test
    public void testMethod(){
        Masina comanda1 = new Masina("Volvo", "Xc60", "diesel", 5, 2016, 10000);
        comanda1.rezumat();

        System.out.println();

        Masina comanda2 = new Masina("Tesla", "Y", "electrica", 5, 2018, 40000);
        comanda2.rezumat();

        System.out.println();

        Masina comanda3 = new Masina("BMW", "i8", "electrica", 5, 2012,
                30000);
        comanda3.rezumat();
    }
}
