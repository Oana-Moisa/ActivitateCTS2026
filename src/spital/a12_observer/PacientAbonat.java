package spital.a12_observer;
public class PacientAbonat implements Observer {
    private String nume;
    public PacientAbonat(String nume) { this.nume = nume; }
    public void primesteNotificare(String mesaj) {
        System.out.println("Pacientul " + nume + " a primit notificarea: " + mesaj);
    }
}
