package multimi;

import org.testng.annotations.Test;

import java.util.*;

public class Multimi {

    //Multime = array, list, map

    @Test
    public void metodaTest() {
        //afisareColegi();
        //afisareColegi2();
        //afisareDeProduse();
        //afisareDeFructe();
        //afisareProduse1();
        //afisareProduse2();
        //cartDeRetete();
    }

    //Afisam numele colegilor de la curs
    public void afisareColegi() {
        String[] colegi = new String[5];
        colegi[0]="Roxana";
        colegi[1]="Razvan";
        colegi[2]="Ana";
        colegi[3]="Levi";
        colegi[4]="Natalia";

        for (int index=0; index < colegi.length; index++) {
            System.out.println("Numele colegului meu este: " + colegi[index]);
        }
    }

    public void afisareColegi2() {
        List<String> colegi = new ArrayList<>();
        colegi.add("Roxana");
        colegi.add("Razvan");
        colegi.add("Ana");
        colegi.add("Levi");
        colegi.add("Natalia");
        for (int index=0; index < colegi.size(); index++) {
            System.out.println("Numele colegului meu este: " + colegi.get(index));
        }
    }

    public void afisareDeProduse() {
        String[] produse = new String[6];
        produse[0]="Colgate";
        produse[1]="Apa Minunilor";
        produse[2]="Nivea";
        produse[3]="HP";
        produse[4]="Pufina";
        produse[5]="Dove";
        for (int index=0; index < produse.length; index++) {
            System.out.println("Produsul din magazin este: " + produse[index]);
        }
    }

    public void afisareDeFructe() {
        List<String> fructe=new ArrayList<>();
        fructe.add("Banane");
        fructe.add("Mere");
        fructe.add("Pere");
        fructe.add("Kiwi");
        fructe.add("Strugure");
        for (int index=0; index < fructe.size(); index++) {
            System.out.println("Fructele din magazin sunt: " + fructe.get(index));
        }
    }

    //Map = key - value

    public void afisareProduse1()
    {
        Map<String, String> raion = new HashMap<>();

        raion.put("Raftul 1","Paine");
        raion.put("Raftul 2","Cereale");
        raion.put("Raftul 3","Ciocolata");

        for (String key: raion.keySet())
        {
            System.out.println("Raftul curent este: " + key);
            System.out.println("Produsul de pe raftul curent este: " + raion.get(key));
        }
    }
    public void afisareProduse2()
    {
        Map<String, List<String>> raion = new HashMap<>();

        List<String> produseRaft1 = new ArrayList<>();
        produseRaft1.add("Lapte");
        produseRaft1.add("Oua");
        produseRaft1.add("Paine");

        List<String> produseRaft2 = new ArrayList<>();
        produseRaft2.add("Pere");
        produseRaft2.add("Kiwi");
        produseRaft2.add("Iaurt");

        List<String> produseRaft3 = new ArrayList<>();
        produseRaft3.add("Suc");
        produseRaft3.add("Branza");

        raion.put("Raion 1", produseRaft1);
        raion.put("Raion 2", produseRaft2);
        raion.put("Raion 3", produseRaft3);

        for (String key: raion.keySet())
        {
            System.out.println("Raionul curent este: " + key);
            System.out.println("Produsele de pe raftul curent este: " + raion.get(key));
        }
    }

    public void cartDeRetete()
    {
        Map<String, List<String>> retete = new LinkedHashMap<>();

        List<String> ingredienteCiorba = new ArrayList<>();
        ingredienteCiorba.add("2 L Apa");
        ingredienteCiorba.add("10 Cartofi");
        ingredienteCiorba.add("0 Ceapa");
        ingredienteCiorba.add("2 Ardei");
        ingredienteCiorba.add("5 Morcovi");

        List<String> ingredienteSarmale = new ArrayList<>();
        ingredienteSarmale.add("0 Varza");
        ingredienteSarmale.add("100 g Orez");
        ingredienteSarmale.add("10 Ciuperci mici");
        ingredienteSarmale.add("0 Ceapa");
        ingredienteSarmale.add("0 Felie de paine");

        List<String> ingredienteClatite = new ArrayList<>();
        ingredienteClatite.add("1 Kg Faina");
        ingredienteClatite.add("1 L Lapte");

        retete.put("Ciorba", ingredienteCiorba);
        retete.put("Sarmale", ingredienteSarmale);
        retete.put("Clatite", ingredienteClatite);

        for(String key: retete.keySet())
        {
            System.out.println("Pentru a face " + key + "avem nevoie de: ");
            System.out.println(retete.get(key));
        }

    }
}