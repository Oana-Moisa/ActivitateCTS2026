package a9_proxy;

public class ProxyInternare implements IInternare {
    private IInternare internare;

    public ProxyInternare(IInternare internare) {
        this.internare = internare;
    }

    @Override
    public void interneaza(Pacient pacient) {
        if (pacient.areAsigurare()) {
            internare.interneaza(pacient);
        } else {
            System.out.println("Pacientul " + pacient.getNume() + " nu poate fi internat deoarece nu are asigurare");
        }
    }
}
