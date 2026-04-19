package spital.a2_simplefactory;

public class FabricaPersonal {

    public PersonalSpital crearePersonal(TipPersonal tip, String nume, String prenume) {
        switch (tip) {
            case BRANCARDIER:
                return new Brancardier(nume, prenume);
            case ASISTENT:
                return new Asistent(nume, prenume);
            case MEDIC:
                return new Medic(nume, prenume);
            default:
                return null;
        }
    }
}
