package obiectConstruct;

import org.testng.annotations.Test;

public class Masina {
    //Constructor = are ca rol sa-l initializeze variabilele unei clase
    //Exista 2 tipuri de constructor: default(nu are parametri/nu este definit) sau cu parametri
    //Structura constructor: public(de cele mai multe ori, nume clasa, cu sau fara parametri
    //Intr-o clasa putem avea mai multi constructori diferentiati prin numarul sau tipul de parametri
    //Obiect = instanta unei clasa
    //Dintr-o clasa putem sa definim mai multe obiecte pe care sa le diferentiem dupa nume
    //In momentul in care instantiem un obiect se apeleaza constructorul clasei respective
    //Un obiect se instantiaza folosind cuvantul "new"
    //Un obiect instantiat are posibilitatea sa acceseze proprietatile/metodele din clasa respectiva

    public String marca;
    public String model;
    public String motorizare;
    public int numarLocuri;
    public int anulFabricatiei;
    public double pret;

    public Masina(String marca, String model, String motorizare, int numarLocuri, int anulFabricatiei, double pret) {
        this.marca = marca;
        this.model = model;
        this.motorizare = motorizare;
        this.numarLocuri = numarLocuri;
        this.anulFabricatiei = anulFabricatiei;
        this.pret = pret;
    }

    public void rezumat(){
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Motorizarea masinii este: " + motorizare);
        System.out.println("Numarul de locuri al masinii este: " + numarLocuri);
        System.out.println("Anul fabricatiei masinii este: " + anulFabricatiei);

        if(pret != 0){
            System.out.println("Pretul masinii este: " + pret);
        }
    }
}