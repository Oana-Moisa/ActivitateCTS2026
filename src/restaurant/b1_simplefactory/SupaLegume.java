package restaurant.b1_simplefactory;

public class SupaLegume extends Supa {

    public SupaLegume(float pret) {
        super("Supa de legume", pret);
    }

    @Override
    public void afisare() {
        System.out.println(denumire + " are pretul de " + pret + " lei");
    }
}
