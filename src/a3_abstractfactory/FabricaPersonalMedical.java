package a3_abstractfactory;

public class FabricaPersonalMedical implements FabricaAbstracta {

    @Override
    public PersonalSpital crearePersonal(String tip, String nume, String prenume) {
        if ("medic".equalsIgnoreCase(tip)) {
            return new Medic(nume, prenume);
        }
        if ("asistent".equalsIgnoreCase(tip)) {
            return new Asistent(nume, prenume);
        }
        return null;
    }
}
