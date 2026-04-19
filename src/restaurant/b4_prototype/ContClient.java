package restaurant.b4_prototype;

public class ContClient implements IContClient {
    private String nume;
    private String numarTelefon;
    private String email;

    public ContClient(String nume, String numarTelefon, String email) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.email = email;
    }

    @Override
    public IContClient copiaza() {
        return new ContClient(nume, numarTelefon, email);
    }

    public void afisare() {
        System.out.println("Cont client: " + nume + ", telefon: " + numarTelefon + ", email: " + email);
    }
}
