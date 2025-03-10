package teme;

public class Sportiv {
    public String sport;
    public String numeIntreg;
    public boolean soloAthlete;
    public String pozitie;
    public String echipa;
    public char grupa;
    public int puncte;

    public Sportiv(String sport, String numeIntreg, boolean soloAthlete, String pozitie, String echipa, char grupa, int puncte) {
        this.sport = sport;
        this.numeIntreg = numeIntreg;
        this.soloAthlete = soloAthlete;
        this.pozitie = pozitie;
        this.echipa = echipa;
        this.grupa = grupa;
        this.puncte = puncte;
    }

    public void rezumat(){
        System.out.println("Sportul sportivului este: " + sport);
        System.out.println("Numele sportivului este: " + numeIntreg);
        System.out.println("Este atlet solo sportivul? " + soloAthlete);
        System.out.println("Pozitita sportivului este: " + pozitie);
        System.out.println("Echipa in care se joaca sportivul este: " + echipa);
        System.out.println("Grupa echipei sportivului este: " + grupa);
        System.out.println("Numarul de puncte al sportivului este: " + puncte);
    }
}
