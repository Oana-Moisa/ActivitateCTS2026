
public class FabricaMedical implements FabricaPersonal {

    public PersonalSpital crearePersonal(String tip) {

        if(tip.equals("Medic"))
            return new Medic();

        if(tip.equals("Asistent"))
            return new Asistent();

        return null;
    }
}
