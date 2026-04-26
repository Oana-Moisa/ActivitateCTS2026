package restaurant.b10_flyweight;

import java.util.HashMap;

public class FabricaClienti {
    private HashMap<String, IClient> clienti;

    public FabricaClienti() {
        clienti = new HashMap<String, IClient>();
    }

    public IClient getClient(String nume, String telefon, String email) {
        if (!clienti.containsKey(nume)) {
            clienti.put(nume, new Client(nume, telefon, email));
        }
        return clienti.get(nume);
    }
}
