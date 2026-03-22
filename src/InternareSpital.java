public class InternareSpital implements Internare {

    @Override
    public void interneaza(PacientAsigurat pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost internat");
    }
}
