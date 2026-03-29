package a5_adapter;

public class MedicamentSpital {
    private String denumire;

    public MedicamentSpital(String denumire) {
        this.denumire = denumire;
    }

    public void prezintaReteta() {
        System.out.println("Se verifica reteta pentru " + denumire);
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("S-a achizitionat medicamentul " + denumire + " din aplicatia spitalului");
    }
}
