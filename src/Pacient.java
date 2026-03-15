
public class Pacient {
    private String nume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    public Pacient(String nume, boolean patRabatabil, boolean micDejunInclus,
                   boolean papuciCamera, boolean halatInterior) {
        this.nume = nume;
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciCamera = papuciCamera;
        this.halatInterior = halatInterior;
    }

    public void afisare() {
        System.out.println("Pacient: " + nume +
                " | patRabatabil=" + patRabatabil +
                " | micDejun=" + micDejunInclus +
                " | papuci=" + papuciCamera +
                " | halat=" + halatInterior);
    }
}
