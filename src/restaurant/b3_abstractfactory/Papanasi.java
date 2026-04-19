package restaurant.b3_abstractfactory;

public class Papanasi extends FelMancare {

    public Papanasi() {
        super("Papanasi");
    }

    @Override
    public void afisare() {
        System.out.println("Preparat: " + denumire);
    }
}
