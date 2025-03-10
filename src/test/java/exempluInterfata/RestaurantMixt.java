package exempluInterfata;

public class RestaurantMixt extends Restaurant implements Vegan, NonVegan{
    public RestaurantMixt(String nume, String locatie, String meniu, int capacitatePersoane) {
        super(nume, locatie, meniu, capacitatePersoane);
    }

    @Override
    public void preparate() {

    }

    @Override
    public void alimenteProaspete() {

    }

    @Override
    public void angajati() {

    }

    @Override
    public void service() {

    }

    @Override
    public void tipCarne() {

    }

    @Override
    public void preparareCarne() {

    }

    @Override
    public void timpDePreparare() {

    }
}
