package variabilaMetoda;

import org.testng.annotations.Test;

public class Conducator {
    public String nume;
    public String prenume;
    public String brand;
    public int caiputere;
    public boolean esteCategoriaB;

    @Test
    public void prezentareConducator() {
        nume = "Groza";
        prenume = "Cristian";
        brand = "Volkswagen Passat";
        caiputere = 174;
        esteCategoriaB = true;

        System.out.println("Numele si prenumele conducatorului sunt:" + nume + ' ' + prenume);
        System.out.println("Brandul masinii este " + brand);
        System.out.println("Masina are caiputere de " + caiputere + "cp");
        System.out.println("Este masina de categoria B? " + ' ' + esteCategoriaB);

        calculMediaConducator(40, 60, 70, 1, 1, 2);
        calculMediaConducator2(60, 80, 90, 1, 1, 3);
        calculMediaConducator3(70, 90, 120, 1, 3, 3);

    }

    public void calculMediaConducator(double distanta1, double distanta2, double distanta3, double timp1, double timp2, double timp3) {
        double medie =(distanta1 + distanta2 + distanta3) / (timp1 + timp2 + timp3);
        System.out.println("Media conducatorului este:" + medie + "km/h");
    }
    public void calculMediaConducator2(double distanta1, double distanta2, double distanta3, double timp1, double timp2, double timp3) {
        double medie =(distanta1 + distanta2 + distanta3) / (timp1 + timp2 + timp3);
        System.out.println("Media conducatorului este:" + medie + "km/h");
    }
    public void calculMediaConducator3(double distanta1, double distanta2, double distanta3, double timp1, double timp2, double timp3) {
        double medie =(distanta1 + distanta2 + distanta3) / (timp1 + timp2 + timp3);
        System.out.println("Media conducatorului este:" + medie + "km/h");
    }
}
