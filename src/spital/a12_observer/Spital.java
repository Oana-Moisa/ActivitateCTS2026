package spital.a12_observer;
import java.util.ArrayList; import java.util.List;
public class Spital {
    private List<Observer> observatori = new ArrayList<Observer>();
    public void adaugaObserver(Observer observer) { observatori.add(observer); }
    public void stergeObserver(Observer observer) { observatori.remove(observer); }
    public void trimiteNotificare(String mesaj) {
        for (Observer observer : observatori) { observer.primesteNotificare(mesaj); }
    }
}
