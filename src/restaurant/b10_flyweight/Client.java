package restaurant.b10_flyweight;

public class Client implements IClient {
    private String nume;
    private String telefon;
    private String email;

    public Client(String nume, String telefon, String email) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
    }

    @Override
    public void afiseazaRezervare(Rezervare rezervare) {
        System.out.println("Client: " + nume +
                ", telefon: " + telefon +
                ", email: " + email +
                ", masa: " + rezervare.getNumarMasa() +
                ", persoane: " + rezervare.getNumarPersoane() +
                ", ora: " + rezervare.getOraRezervare());
    }
}
