package restaurant.b6_facade;

public class FacadeMasa {
    public boolean verificaMasa(Masa masa) {
        if (!masa.esteLibera()) return false;
        if (!masa.esteDebarasata()) return false;
        if (!masa.areServeteleNoi()) return false;
        return true;
    }
}
