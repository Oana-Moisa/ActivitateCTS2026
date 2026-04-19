package spital.a8_composite;

public class Sectie extends NodStructura {

    public Sectie(String denumire) {
        super(denumire);
    }

    @Override
    public void adaugaNod(NodStructura nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(NodStructura nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseazaStructura() {
        System.out.println("Sectie: " + denumire);
    }
}
