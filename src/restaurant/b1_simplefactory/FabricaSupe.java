package restaurant.b1_simplefactory;

public class FabricaSupe {

    public Supa creareSupa(TipSupa tip, float pret) {
        switch (tip) {
            case LEGUME:
                return new SupaLegume(pret);
            case CIUPERCI:
                return new SupaCiuperci(pret);
            case VITA:
                return new SupaVita(pret);
            default:
                return null;
        }
    }
}
