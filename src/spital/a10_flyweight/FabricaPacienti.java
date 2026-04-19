package spital.a10_flyweight;

import java.util.HashMap;

public class FabricaPacienti {
    private HashMap<String, IPacient> pacienti;

    public FabricaPacienti() {
        pacienti = new HashMap<String, IPacient>();
    }

    public IPacient getPacient(String nume, String telefon, String adresa) {
        if (!pacienti.containsKey(nume)) {
            pacienti.put(nume, new Pacient(nume, telefon, adresa));
        }
        return pacienti.get(nume);
    }
}
