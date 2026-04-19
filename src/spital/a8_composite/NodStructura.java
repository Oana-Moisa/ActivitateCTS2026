package spital.a8_composite;

public abstract class NodStructura {
    protected String denumire;

    public NodStructura(String denumire) {
        this.denumire = denumire;
    }

    public abstract void adaugaNod(NodStructura nod);
    public abstract void stergeNod(NodStructura nod);
    public abstract void afiseazaStructura();
}
