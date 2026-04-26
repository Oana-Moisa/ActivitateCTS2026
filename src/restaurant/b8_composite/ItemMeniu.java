package restaurant.b8_composite;

public class ItemMeniu extends NodMeniu {
    private float pret;

    public ItemMeniu(String denumire, float pret) {
        super(denumire);
        this.pret = pret;
    }

    @Override
    public void adaugaNod(NodMeniu nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(NodMeniu nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseaza() {
        System.out.println("Item: " + denumire + " - " + pret + " lei");
    }
}
