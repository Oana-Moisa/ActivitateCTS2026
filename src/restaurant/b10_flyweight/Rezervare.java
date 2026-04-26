package restaurant.b10_flyweight;

public class Rezervare {
    private int numarMasa;
    private int numarPersoane;
    private String oraRezervare;

    public Rezervare(int numarMasa, int numarPersoane, String oraRezervare) {
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
        this.oraRezervare = oraRezervare;
    }

    public int getNumarMasa() { return numarMasa; }
    public int getNumarPersoane() { return numarPersoane; }
    public String getOraRezervare() { return oraRezervare; }
}
