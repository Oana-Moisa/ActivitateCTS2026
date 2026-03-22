import java.util.HashMap;

public class FabricaPacienti {

    private HashMap<String, PacientFlyweight> pacienti = new HashMap<String, PacientFlyweight>();

    public PacientFlyweight getPacient(String nume, String telefon, String adresa) {
        if (!pacienti.containsKey(nume)) {
            pacienti.put(nume, new PacientFlyweight(nume, telefon, adresa));
        }
        return pacienti.get(nume);
    }
}
