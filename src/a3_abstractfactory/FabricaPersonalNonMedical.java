package a3_abstractfactory;

public class FabricaPersonalNonMedical implements FabricaAbstracta {

    @Override
    public PersonalSpital crearePersonal(String tip, String nume, String prenume) {
        if ("brancardier".equalsIgnoreCase(tip)) {
            return new Brancardier(nume, prenume);
        }
        if ("secretar".equalsIgnoreCase(tip)) {
            return new Secretar(nume, prenume);
        }
        if ("registrator".equalsIgnoreCase(tip)) {
            return new Registrator(nume, prenume);
        }
        return null;
    }
}
