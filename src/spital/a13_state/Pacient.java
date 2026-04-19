package spital.a13_state;
public class Pacient {
    private String nume;
    private StarePacient stare;
    public Pacient(String nume) { this.nume = nume; }
    public void setStare(StarePacient stare) {
        this.stare = stare;
        System.out.print("Pacientul " + nume + ": ");
        this.stare.afiseazaStare();
    }
}
