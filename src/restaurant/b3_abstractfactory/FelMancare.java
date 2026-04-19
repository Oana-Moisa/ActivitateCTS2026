package restaurant.b3_abstractfactory;

public abstract class FelMancare {
    protected String denumire;

    public FelMancare(String denumire) {
        this.denumire = denumire;
    }

    public abstract void afisare();
}
