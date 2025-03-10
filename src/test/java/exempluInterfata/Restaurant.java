package exempluInterfata;

public class Restaurant {
    private String nume;
    private String locatie;
    private String meniu;
    private int capacitatePersoane;

    public Restaurant(String nume, String locatie, String meniu, int capacitatePersoane) {
        this.nume = nume;
        this.locatie = locatie;
        this.meniu = meniu;
        this.capacitatePersoane = capacitatePersoane;
    }
    public void infoRestaurant(){
        System.out.println("Numele restaurantului este " + nume);
        System.out.println("Locatia restaurantului este " +locatie);
        System.out.println("Meniul restaurantului este " + meniu);
        System.out.println("Capacitatea care restaurantul poate sa serveasca este " + capacitatePersoane);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public String getMeniu() {
        return meniu;
    }

    public void setMeniu(String meniu) {
        this.meniu = meniu;
    }

    public int getCapacitatePersoane() {
        return capacitatePersoane;
    }

    public void setCapacitatePersoane(int capacitatePersoane) {
        this.capacitatePersoane = capacitatePersoane;
    }
}
