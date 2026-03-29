package a3_abstractfactory;

public class Brancardier extends PersonalSpital {
    public Brancardier(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void descriere() {
        System.out.println("Brancardier: " + nume + " " + prenume);
    }
}
