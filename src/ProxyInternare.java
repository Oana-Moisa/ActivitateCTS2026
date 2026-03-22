public class ProxyInternare implements Internare {

    private InternareSpital internare;

    public ProxyInternare() {
        this.internare = new InternareSpital();
    }

    @Override
    public void interneaza(PacientAsigurat pacient) {
        if (pacient.isAreAsigurare()) {
            internare.interneaza(pacient);
        } else {
            System.out.println("Pacientul " + pacient.getNume() + " nu are asigurare");
        }
    }
}
