package structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //Structuri repetitive = for, while, for each

    @Test
    public void testMethod() {
        //afisamNnumere();
        //afisamNnumere2();
        //afisamNumerePare();
        //calculNumere();
    }

    //Afisam primele 10 numere
    public void afisamNnumere() {
        for (int index = 0; index <= 10; index++) {
            System.out.println(index);
        }
    }

    public void afisamNnumere2() {
        int index=0;
        while (index <= 50) {
            System.out.println(index);
            index++;
        }
    }

    //Afisam numerele pare de la 0 la 50
    public void afisamNumerePare() {
        for (int index=0; index <= 50; index++) {
            if(index%2==0) {
                System.out.println("numarul " + index + " este par");
            }
            else {
                System.out.println("numarul " +index+ " este impar");
            }
        }
    }

    //Calculam cate numere pare si impare avem intr-un interval

    public void calculNumere() {
        int h=0;
        int g=0;
        for (int index=0; index <= 50; index++) {
            if (index%2==0){
                h++;
            }
            else {
                g++;
            }
        }
        System.out.println("numere pare= " +h);
        System.out.println("numere impare= " +g);
    }
}

