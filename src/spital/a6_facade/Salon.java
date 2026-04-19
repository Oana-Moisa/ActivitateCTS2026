package spital.a6_facade;

public class Salon {
    private int paturiLibere;

    public Salon(int paturiLibere) {
        this.paturiLibere = paturiLibere;
    }

    public boolean verificaPatLiber() {
        return paturiLibere > 0;
    }
}
