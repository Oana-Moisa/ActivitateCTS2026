package a2_simplefactory;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void descriere() {
        System.out.println("Brancardierul " + nume + " " + prenume + " transporta pacienti");
    }
}
