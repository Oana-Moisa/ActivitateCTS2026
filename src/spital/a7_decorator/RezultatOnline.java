package spital.a7_decorator;

public class RezultatOnline extends DecoratorRezultat {

    public RezultatOnline(IRezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void afiseazaRezultat() {
        super.afiseazaRezultat();
        System.out.println("Rezultatul este oferit si pe platforma online");
    }
}
