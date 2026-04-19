package restaurant.b1_simplefactory;

public abstract class Supa {
    protected String denumire;
    protected float pret;

    public Supa(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public abstract void afisare();
}
