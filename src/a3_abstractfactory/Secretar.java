package a3_abstractfactory;

public class Secretar extends PersonalSpital {
    public Secretar(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void descriere() {
        System.out.println("Secretar: " + nume + " " + prenume);
    }
}
