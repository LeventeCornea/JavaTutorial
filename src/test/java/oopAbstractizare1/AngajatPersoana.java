package oopAbstractizare1;

public class AngajatPersoana extends Persoana implements Angajat{
    private String domeniu;
    private String aniExperienta;
    private String firma;

    public AngajatPersoana(String nume, String prenume, int varsta, String domeniu, String aniExperienta, String firma) {
        super(nume, prenume, varsta);
        this.domeniu = domeniu;
        this.aniExperienta = aniExperienta;
        this.firma = firma;
    }

    public void rezumatAngajat(){
        infoPersoana();
        System.out.println("Domeniul de aplicabilitate este " + domeniu);
        System.out.println("Numarul de ani experienta este " + aniExperienta);
        System.out.println("Firma este " + firma);
    }

    @Override
    public void munceste() {

    }

    @Override
    public void tipProgram() {

    }

    @Override
    public void saPrimestiSalar() {

    }
}
