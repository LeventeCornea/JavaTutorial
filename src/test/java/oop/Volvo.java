package oop;

import java.util.List;

public class Volvo extends Masina{

    private List<String> dotariInterioare;

    public Volvo (String marca, String model, int anFabricatie, String combustibil, int pret, List<String> dotariInterioare){
        super(marca, model, anFabricatie, combustibil, pret);
        this.dotariInterioare = dotariInterioare;
    }

    public void rezumatVolvo () {
        rezumatComanda();
        System.out.println("Dotarile interioare sunt: " + dotariInterioare);
    }

    //Polimorfism dinamic
    public void pornesteMotor(){
        System.out.println("Masinile Volvo pornesc fara cheie");
    }

    public List<String> getDotariInterioare() {
        return dotariInterioare;
    }

    public void setDotariInterioare(List<String> dotariInterioare) {
        this.dotariInterioare = dotariInterioare;
    }
}
