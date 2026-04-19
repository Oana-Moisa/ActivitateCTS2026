package restaurant.b3_abstractfactory;

public class FabricaDesert implements FabricaAbstracta {

    @Override
    public FelMancare creareFel(String tip) {
        if ("papanasi".equalsIgnoreCase(tip)) {
            return new Papanasi();
        }
        if ("clatite".equalsIgnoreCase(tip)) {
            return new Clatite();
        }
        if ("cheesecake".equalsIgnoreCase(tip)) {
            return new CheeseCake();
        }
        return null;
    }
}
