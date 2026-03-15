
public class MedicamentAdapter extends MedicamentFarmacie {

    private MedicamentSpital medicament;

    public MedicamentAdapter(MedicamentSpital medicament) {
        this.medicament = medicament;
    }

    @Override
    public void cumparaMedicament() {
        medicament.achizitioneazaMedicament();
    }
}
