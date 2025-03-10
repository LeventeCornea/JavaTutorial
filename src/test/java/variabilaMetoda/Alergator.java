package variabilaMetoda;

import org.testng.annotations.Test;

public class Alergator {
    public String nume;
    public String prenume;
    public int varsta;
    public float greutate;
    public char sex;

    @Test
    public void prezentareAlergator() {
        nume = "Petrus";
        prenume = "Laurentiu";
        varsta = 25;
        greutate = 81.5f;
        sex = 'M';

        System.out.println("Numele si prenumele alergatorului sunt: " + nume + ' ' + prenume);
        System.out.println("Varsta alergatorului este " + varsta + " de ani");
        System.out.println("Greutatea alergatorului este " + greutate + " Kg");
        System.out.println("Sexul alergatorului este "+ sex);

        calculMediaAlergator(3000, 4000, 5000);
        calculMediaAlergator2(2000, 4000, 6000, 8000);
        calculMediaAlergator3(1500, 2000);
    }
    public void calculMediaAlergator(double distanta1, double distanta2, double distanta3) {
        double media = (distanta1 + distanta2 + distanta3) / 3;
        System.out.println("Media alergatorului este " + media + " de metri");
    }
    public void calculMediaAlergator2(double distanta1, double distanta2, double distanta3, double distanta4) {
        double media = (distanta1 + distanta2 + distanta3 + distanta4) / 4;
        System.out.println("Media alergatorului este " + media + " de metri");
    }
    public void calculMediaAlergator3(double distanta1, double distanta2) {
        double media = (distanta1 + distanta2) / 2;
        System.out.println("Media alergatorului este " + media + " de metri");
    }
}
