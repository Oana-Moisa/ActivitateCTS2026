package a3_abstractfactory;

public class Medic extends PersonalSpital {
    public Medic(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void descriere() {
        System.out.println("Medic: " + nume + " " + prenume);
    }
}
