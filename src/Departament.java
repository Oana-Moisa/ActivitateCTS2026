import java.util.ArrayList;
import java.util.List;

public class Departament implements NodSpital {

    private String nume;
    private List<NodSpital> listaNoduri;

    public Departament(String nume) {
        this.nume = nume;
        this.listaNoduri = new ArrayList<NodSpital>();
    }

    public void adaugaNod(NodSpital nod) {
        listaNoduri.add(nod);
    }

    @Override
    public void afiseazaStructura() {
        System.out.println("Departament: " + nume);
        for (NodSpital nod : listaNoduri) {
            nod.afiseazaStructura();
        }
    }
}
