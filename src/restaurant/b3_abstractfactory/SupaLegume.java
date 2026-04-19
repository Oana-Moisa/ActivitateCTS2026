package restaurant.b3_abstractfactory;

public class SupaLegume extends FelMancare {

    public SupaLegume() {
        super("Supa de legume");
    }

    @Override
    public void afisare() {
        System.out.println("Preparat: " + denumire);
    }
}
