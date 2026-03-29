package a5_adapter;

public class AdapterMedicament implements MedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public AdapterMedicament(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
