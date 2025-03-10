package oop;

import org.testng.annotations.Test;

import java.util.Arrays;

public class OopTest {

    @Test
    public void methodTest() {
        Volvo comanda1 = new Volvo("Volvo", "Xc60", 2005, "cu diesel", 25000, Arrays.asList("incalzirescaune", "climatizare", "piele"));
        comanda1.rezumatVolvo();
        comanda1.pornesteMotor();

        System.out.println();


        Volvo comanda2 = new Volvo("Volvo", "Xc90", 2010, "hibrida", 30000, Arrays.asList("piele"));
        comanda2.rezumatVolvo();

        Dacia comanda3 = new Dacia("Dacia", "Duster", 2017, "hibrida", 35000, Arrays.asList("camera", "senzori", "incalzireoglinzi"));
        comanda3.rezumatDacia();
        comanda3.pornesteMotor();
        comanda3.aplicareDiscount();
        comanda3.aplicareDiscount(10);
        comanda3.aplicareDiscount("Cupon pensie");


        System.out.println();

        Ford comanda4 = new Ford("Ford", "Mustang", 2016, "cu diesel", 40000, Arrays.asList("incalzirescaune", "climatizare", "piele"), Arrays.asList("camera", "senzori", "incalzireoglinzi"));
        comanda4.rezumatFord();
    }
}
