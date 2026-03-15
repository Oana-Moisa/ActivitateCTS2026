
public class PacientBuilder {

    private String nume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    public PacientBuilder(String nume) {
        this.nume = nume;
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.papuciCamera = false;
        this.halatInterior = false;
    }

    public PacientBuilder setPatRabatabil(boolean val) {
        this.patRabatabil = val;
        return this;
    }

    public PacientBuilder setMicDejun(boolean val) {
        this.micDejunInclus = val;
        return this;
    }

    public PacientBuilder setPapuci(boolean val) {
        this.papuciCamera = val;
        return this;
    }

    public PacientBuilder setHalat(boolean val) {
        this.halatInterior = val;
        return this;
    }

    public Pacient build() {
        return new Pacient(nume, patRabatabil, micDejunInclus, papuciCamera, halatInterior);
    }
}
