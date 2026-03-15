
public class PersonalFactory {

    public static PersonalSpital crearePersonal(TipPersonal tip) {

        switch (tip) {
            case BRANCARDIER:
                return new Brancardier();
            case ASISTENT:
                return new Asistent();
            case MEDIC:
                return new Medic();
            default:
                return null;
        }
    }
}
