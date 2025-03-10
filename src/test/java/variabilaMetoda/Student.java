package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    //Intr-un fisier Java recunoastem o clasa dupa cuvantul "class"
    //Orice clasa trebuie sa aiba un nume
    //Intr-un fisier Java putem avea mai multe clase diferentiate prin numele lor
    //Nu este un best practice sa ai mai multe clase intr-un fisier
    //Tot codul care apartine unei clase se regaseste intre acolade
    //Clasa=sablon care contine variabile si metode despre un anumit exemplu
    //Intr-o clasa putem sa avem n variabile si n metode
    //Proprietate=variabila in Java
    //Variabila=proprietatea unei clase
    //Exista 2 tipuri de variabile: globala si locala
    //Variabila globala= proprietate care este vizibila tot in programul nostru
    //Structure variabila globala: public tip variabila nume variabila;
    //Variabila locala= proprietate care este vizibila doar in locul in care ai declarat-o
    //Structura variabila locala: tip variabila nume variabila;
    //Nu este obligatoriu ca o variabila sa aiba o valoare
    //In Java exista conceptul de primitiva si non-primitiva
    //Primitiva se bazeaza pe initializarea unei valori in functie de tipul de date definit
    //Non-primitiva se bazeaza pe instantierea unei variabile prin referinta
    //Metoda= actiunea unei clase
    //Exista 2 tipuri de metode: void si return
    //Structura metoda void: public void nume metoda () {}
    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public double inaltime;
    public float greutate;
    public char sex;
    public boolean areBursa;

    @Test
    public void prezentareStudent() {
        nume = "Cornea";
        prenume = "Levente";
        varsta = 29;
        adresa = "Calea Aradului";
        inaltime = 1.79;
        greutate = 78.5f;
        sex = 'M';
        areBursa = true;

        System.out.println("Numele si prenumele studentului sunt:" + nume + ' ' + prenume);
        System.out.println("Varsta studentului este:" + varsta);
        System.out.println("Adresa studentului este:" + adresa);
        System.out.println("Inaltimea studentului este:" + inaltime);
        System.out.println("Greutatea studentului este:" + greutate);
        System.out.println("Sexul studentului este:" + sex);
        System.out.println("Are bursa studentul?" + ' ' + areBursa);

        calculMedieStudent(9, 8);
        calculMedieStudent(6, 7);
        calculMedieStudent(10, 10);
        calculMedieStudent3(5, 7, 10);
    }

    //O noua metoda care calculeaza media unui student
    //O metoda poate sau nu sa contina parametri
    public void calculMedieStudent(double nota1, double nota2) {
        double medie = (nota1 + nota2) / 2;
        System.out.println("Media studentului este:" + ' ' + medie);
    }

    public void calculMedieStudent3(double nota1, double nota2, double nota3) {
        double medie = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media studentului este:" + ' ' + medie);
    }
}
