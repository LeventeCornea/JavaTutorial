package exempluInterfata;

public class RestaurantVegan extends Restaurant implements Vegan{
    private String bauturiVegane;
    private String desertVegan;

    public RestaurantVegan(String nume, String locatie, String meniu, int capacitatePersoane, String bauturiVegane, String desertVegan) {
        super(nume, locatie, meniu, capacitatePersoane);
        this.bauturiVegane = bauturiVegane;
        this.desertVegan = desertVegan;
    }

    public void rezumatRestaurantVegan(){
        infoRestaurant();
        System.out.println("Bauturile vegane sunt: " + bauturiVegane);
        System.out.println("Deserturile vegane sunt: " + desertVegan);
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
}
