package a15_command;
import java.util.ArrayList; import java.util.List;
public class OperatorPrimire {
    private List<Comanda> comenzi = new ArrayList<Comanda>();
    public void adaugaComanda(Comanda comanda) { comenzi.add(comanda); }
    public void trimiteComenzi() { for (Comanda comanda : comenzi) { comanda.executa(); } }
}
