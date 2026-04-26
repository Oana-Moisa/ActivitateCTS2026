package restaurant.b8_composite;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu extends NodMeniu {
    private List<NodMeniu> noduri;

    public SectiuneMeniu(String denumire) {
        super(denumire);
        noduri = new ArrayList<NodMeniu>();
    }

    @Override
    public void adaugaNod(NodMeniu nod) {
        noduri.add(nod);
    }

    @Override
    public void stergeNod(NodMeniu nod) {
        noduri.remove(nod);
    }

    @Override
    public void afiseaza() {
        System.out.println("Sectiune: " + denumire);
        for (NodMeniu nod : noduri) {
            nod.afiseaza();
        }
    }
}
