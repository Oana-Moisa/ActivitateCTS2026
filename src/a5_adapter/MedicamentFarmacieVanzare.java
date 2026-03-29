package a5_adapter;

public class MedicamentFarmacieVanzare implements MedicamentFarmacie {
    private String denumire;

    public MedicamentFarmacieVanzare(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("S-a cumparat medicamentul " + denumire + " fara reteta");
    }
}
