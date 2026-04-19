package spital.a6_facade;

public class Pacient {
    private String nume;
    private int gravitate;

    public Pacient(String nume, int gravitate) {
        this.nume = nume;
        this.gravitate = gravitate;
    }

    public boolean verificaStareGravitate() {
        return gravitate >= 5;
    }

    public String getNume() {
        return nume;
    }
}
