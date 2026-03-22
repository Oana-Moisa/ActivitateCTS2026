public class FacadeInternare {

    public boolean verificaInternare(PacientInternare pacient, MedicInternare medic, Salon salon) {
        if (!pacient.isStareGrava()) {
            return false;
        }
        if (!medic.confirmaInternare(pacient)) {
            return false;
        }
        if (!salon.arePatLiber()) {
            return false;
        }
        return true;
    }
}
