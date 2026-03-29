package a2_simplefactory;

public class Medic extends PersonalSpital {

    public Medic(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void descriere() {
        System.out.println("Medicul " + nume + " " + prenume + " consulta pacientii");
    }
}
