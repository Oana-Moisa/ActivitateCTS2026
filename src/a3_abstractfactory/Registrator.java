package a3_abstractfactory;

public class Registrator extends PersonalSpital {
    public Registrator(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void descriere() {
        System.out.println("Registrator: " + nume + " " + prenume);
    }
}
