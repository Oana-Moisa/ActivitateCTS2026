package restaurant.b3_abstractfactory;

public class CheeseCake extends FelMancare {

    public CheeseCake() {
        super("CheeseCake");
    }

    @Override
    public void afisare() {
        System.out.println("Preparat: " + denumire);
    }
}
