package restaurant.b9_proxy;

public class Rezervare {
    private String numeClient;
    private int numarPersoane;

    public Rezervare(String numeClient, int numarPersoane) {
        this.numeClient = numeClient;
        this.numarPersoane = numarPersoane;
    }

    public String getNumeClient() { return numeClient; }
    public int getNumarPersoane() { return numarPersoane; }
}
