package spital.a6_facade;

public class FacadeInternare {

    public boolean verificaInternare(Pacient pacient, Medic medic, Salon salon) {
        if (!pacient.verificaStareGravitate()) {
            return false;
        }
        if (!medic.confirmaInternare(pacient)) {
            return false;
        }
        if (!salon.verificaPatLiber()) {
            return false;
        }
        return true;
    }
}
