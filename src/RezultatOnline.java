public class RezultatOnline extends DecoratorRezultat {

    public RezultatOnline(Rezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void afiseazaRezultat() {
        rezultat.afiseazaRezultat();
        System.out.println("Rezultatul este disponibil si online");
    }
}
