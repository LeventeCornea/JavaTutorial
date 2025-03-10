package oop;

import java.util.List;

public class Dacia extends Masina{

    private List<String> dotariExterioare;

    public Dacia (String marca, String model, int anFabricatie, String combustibil, int pret, List<String> dotariExterioare){
        super(marca, model, anFabricatie, combustibil, pret);
        this.dotariExterioare = dotariExterioare;
    }

    public void rezumatDacia () {
        rezumatComanda();
        System.out.println("Dotarile exterioare sunt: " + dotariExterioare);
    }

    //Polimorfism dinamic
    public void pornesteMotor(){
        System.out.println("Masinile Dacia pornesc din buton");
    }

    //Polimorfism static
    public void aplicareDiscount(){
        System.out.println("Dacia nu ofera discount in aceasta perioada");
    }

    public void aplicareDiscount(int procent){
        System.out.println("Dacia ofera discount de " + procent + "% in aceasta perioada");
    }

    public void aplicareDiscount(String cupon){
        System.out.println("Dacia aplica cuponul urmator" + cupon);
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }
}