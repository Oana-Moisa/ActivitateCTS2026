package a8_composite;

import java.util.ArrayList;
import java.util.List;

public class Departament extends NodStructura {
    private List<NodStructura> noduri;

    public Departament(String denumire) {
        super(denumire);
        noduri = new ArrayList<NodStructura>();
    }

    @Override
    public void adaugaNod(NodStructura nod) {
        noduri.add(nod);
    }

    @Override
    public void stergeNod(NodStructura nod) {
        noduri.remove(nod);
    }

    @Override
    public void afiseazaStructura() {
        System.out.println("Departament: " + denumire);
        for (NodStructura nod : noduri) {
            nod.afiseazaStructura();
        }
    }
}
