
public class Reteta implements RetetaPrototype {

    private String denumire;
    private int cantitate;

    public Reteta(String denumire, int cantitate) {
        this.denumire = denumire;
        this.cantitate = cantitate;
    }

    public RetetaPrototype clone() {
        return new Reteta(denumire, cantitate);
    }

    public void afisare() {
        System.out.println("Reteta: " + denumire + " | cantitate=" + cantitate);
    }
}
