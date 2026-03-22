public abstract class DecoratorRezultat implements Rezultat {

    protected Rezultat rezultat;

    public DecoratorRezultat(Rezultat rezultat) {
        this.rezultat = rezultat;
    }
}
