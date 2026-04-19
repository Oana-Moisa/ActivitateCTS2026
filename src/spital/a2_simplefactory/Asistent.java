package spital.a2_simplefactory;

public class Asistent extends PersonalSpital {

    public Asistent(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void descriere() {
        System.out.println("Asistentul " + nume + " " + prenume + " ofera asistenta medicala");
    }
}
