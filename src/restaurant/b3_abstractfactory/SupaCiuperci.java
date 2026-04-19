package restaurant.b3_abstractfactory;

public class SupaCiuperci extends FelMancare {

    public SupaCiuperci() {
        super("Supa de ciuperci");
    }

    @Override
    public void afisare() {
        System.out.println("Preparat: " + denumire);
    }
}
