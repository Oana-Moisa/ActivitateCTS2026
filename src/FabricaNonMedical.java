
public class FabricaNonMedical implements FabricaPersonal {

    public PersonalSpital crearePersonal(String tip) {

        if(tip.equals("Brancardier"))
            return new Brancardier();

        if(tip.equals("Secretar"))
            return new Secretar();

        if(tip.equals("Registrator"))
            return new Registrator();

        return null;
    }
}
