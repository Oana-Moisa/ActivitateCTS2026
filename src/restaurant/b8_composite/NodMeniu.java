package restaurant.b8_composite;

public abstract class NodMeniu {
    protected String denumire;

    public NodMeniu(String denumire) {
        this.denumire = denumire;
    }

    public abstract void adaugaNod(NodMeniu nod);
    public abstract void stergeNod(NodMeniu nod);
    public abstract void afiseaza();
}
