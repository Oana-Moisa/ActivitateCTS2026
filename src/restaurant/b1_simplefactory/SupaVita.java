package restaurant.b1_simplefactory;

public class SupaVita extends Supa {

    public SupaVita(float pret) {
        super("Supa de vita", pret);
    }

    @Override
    public void afisare() {
        System.out.println(denumire + " are pretul de " + pret + " lei");
    }
}
