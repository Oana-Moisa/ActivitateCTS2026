package restaurant.b3_abstractfactory;

public class SupaVita extends FelMancare {

    public SupaVita() {
        super("Supa de vita");
    }

    @Override
    public void afisare() {
        System.out.println("Preparat: " + denumire);
    }
}
