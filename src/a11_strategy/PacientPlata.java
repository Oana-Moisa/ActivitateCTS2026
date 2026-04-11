package a11_strategy;
public class PacientPlata {
    private String nume;
    private ModPlata modPlata;
    public PacientPlata(String nume) { this.nume = nume; }
    public void setModPlata(ModPlata modPlata) { this.modPlata = modPlata; }
    public void platesteNota(float suma) {
        if (modPlata != null) {
            System.out.print(nume + ": ");
            modPlata.plateste(suma);
        }
    }
}
