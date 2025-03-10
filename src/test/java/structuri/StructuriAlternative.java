package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {
    //Structuri Alternative = if (conditie) ... else, switch (value) ... case

    @Test
    public void metodaTest() {
//        afisamNrMaiMare(5, 1);
//        afisamNrMaiMare(2, 3);
//        verificareNrPar(-6);
//        verificareNrPar(11);
//        verificareNrPar(0);
        zileSaptamana(10);

    }

    //Verificam care numar este mai mare dintre 2 valori

    public void afisamNrMaiMare(int nr1, int nr2) {
        if (nr1 > nr2) {
            System.out.println("nr1: " + nr1 + " este mai mare decat nr2: " + nr2);
        } else {
            System.out.println("nr2: " + nr2 + " este mai mare decat nr1: " + nr1);
        }
    }

    //Verificam daca un numar este par si pozitiv
    public void verificareNrPar(int nr) {
        if (nr > 0) {
            if (nr % 2 == 0) {
                System.out.println("Nr: " + nr + " este par si pozitiv");
            } else {
                System.out.println("Nr: " + nr + " este impar si pozitiv");
            }
        } else if (nr < 0) {
            if (nr % 2 == 0) {
                System.out.println("Nr: " + nr + " este par si negativ");
            } else {
                System.out.println("Nr: " + nr + " este impar si negativ");
            }
        } else {
            System.out.println("Nr este egal cu 0");
        }
    }

    //Afisam una dintre zilele saptamanii
    public void zileSaptamana(int zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi este luni");
                break;
            case 2:
                System.out.println("Astazi este marti");
                break;
            case 3:
                System.out.println("Astazi este miercuri");
                break;
            case 4:
                System.out.println("Astazi este joi");
                break;
            case 5:
                System.out.println("Astazi este vineri");
                break;
            case 6:
                System.out.println("Astazi este sambata");
                break;
            case 7:
                System.out.println("Astazi este duminica");
                break;
            default:
                System.out.println("Nu mai sunt zile");
        }
    }
}