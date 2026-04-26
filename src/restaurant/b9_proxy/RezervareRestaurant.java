package restaurant.b9_proxy;

public class RezervareRestaurant implements IRezervare {
    @Override
    public void realizeazaRezervare(Rezervare rezervare) {
        System.out.println("Rezervarea pentru " + rezervare.getNumeClient() +
                " a fost realizata pentru " + rezervare.getNumarPersoane() + " persoane");
    }
}
