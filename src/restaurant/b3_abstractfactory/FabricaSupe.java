package restaurant.b3_abstractfactory;

public class FabricaSupe implements FabricaAbstracta {

    @Override
    public FelMancare creareFel(String tip) {
        if ("legume".equalsIgnoreCase(tip)) {
            return new SupaLegume();
        }
        if ("ciuperci".equalsIgnoreCase(tip)) {
            return new SupaCiuperci();
        }
        if ("vita".equalsIgnoreCase(tip)) {
            return new SupaVita();
        }
        return null;
    }
}
