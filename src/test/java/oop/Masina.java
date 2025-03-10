package oop;

public class Masina {
    //oop = Programare orientata obiect
    //Exista 4 principii = mostenire, incapsularea datelor, polimorfismul si abstractizarea
    //mostenirea = conceptul prin care o clasa(copil) mosteneste o alta clasa(parinte)
    //In Java putem mosteni o singura clasa
    //Ca sa mostenim o clasa folosim cuvantul "extends"
    //In momentul in care clasa copil mosteneste clasa parinte, copilul trebuie sa apeleze constructorul din parinte
    //Copilul apeleaza constructorul din parinte folosind cuvantul "super"
    //In momentul in care clasa copil mosteneste clasa parinte, copilul are acces la variabile/metode din parinte

    //03.03.2025
    //Incapsulare: Conceptul prin care putem defini restrictii la nivel de vizibilitate pentru proprietati/metode
    //Pentru a seta restrictii avem nevoie de access control de tip private/protected
    //Private = access control care restrictioneaza vizibilitatea doar la nivel de clasa

    //Polimorfismul: Conceptul prin care o metoda poate avea implementari diferite la nivel de body sau structura
    //Polimorfismul este de 2 feluri: dinamic (override) si static (overload)
    //Polimorfismul dinamic: Intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //Polimorfismul static: Posibilitatea prin care putem avea mai multe metode cu acelasi nume diferentiate prin numar/tip de parametri


    private String marca;
    private String model;
    private int anFabricatie;
    private String combustibil;
    private int pret;

    public Masina(String marca, String model, int anFabricatie, String combustibil, int pret) {
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.combustibil = combustibil;
        this.pret = pret;
    }

    public void rezumatComanda(){
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Anul de fabricatiei al masinii este " + anFabricatie);
        System.out.println("Tipul de combustibil al masinii este " + combustibil);
        System.out.println("Pretul masinii este: " + pret);

    }

    //Polimorfism dinamic:
    public void pornesteMotor(){
        System.out.println("Masina porneste motorul de la cheie");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(String combustibil) {
        this.combustibil = combustibil;
    }

    public int getPret() {
        return pret;
    }
}
