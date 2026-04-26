package restaurant.b9_proxy;

public class ProxyRezervare implements IRezervare {
    private IRezervare rezervareRestaurant;

    public ProxyRezervare(IRezervare rezervareRestaurant) {
        this.rezervareRestaurant = rezervareRestaurant;
    }

    @Override
    public void realizeazaRezervare(Rezervare rezervare) {
        if (rezervare.getNumarPersoane() >= 4) {
            rezervareRestaurant.realizeazaRezervare(rezervare);
        } else {
            System.out.println("Rezervarea nu este realizata. Clientii sunt rugati sa vina direct la restaurant");
        }
    }
}
