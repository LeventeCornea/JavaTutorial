package oopAbstractizare1;

public class Persoana {

    //Abstractizarea = conceptul prin care se poate defini cu exactitate comportamentul unei clase
    //Abstractizarea se poate realiza in 2 feluri: 1. interfete 2. clasa abstracta
    //Intelegem printr-o interfata ca fiind o structura care contine doar metode abstracte
    //Pe langa faptul ca toate metodele sunt abstracte mai sunt si publice
    //O interfata se recunoasta prin cuvantul "interface"
    //O interfata poate sa fie implementata de una sau mai multe clase
    //Clasa care implementeaza interfata trebuie sa implementeze toate metodele din interfata
    //O clasa poate sa implementeze mai multe interfete
    //O interfata poate sa fie implementata de o clasa abstracta
    //O interfata nu poate sa contina un constructor => nu putem face un obiect

    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este " + nume);
        System.out.println("Prenumele persoanei este " + prenume);
        System.out.println("Varsta persoanei este " + varsta);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}