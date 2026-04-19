package restaurant.b1_simplefactory;

public class SupaCiuperci extends Supa {

    public SupaCiuperci(float pret) {
        super("Supa de ciuperci", pret);
    }

    @Override
    public void afisare() {
        System.out.println(denumire + " are pretul de " + pret + " lei");
    }
}
