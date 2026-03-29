package a9_proxy;

public class Internare implements IInternare {

    @Override
    public void interneaza(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost internat");
    }
}
