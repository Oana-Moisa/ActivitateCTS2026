package spital.a1_builder;

public class Pacient {
    private String nume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    private Pacient() {
    }

    public void afisarePacient() {
        System.out.println("Pacientul " + nume +
                " are pat rabatabil: " + patRabatabil +
                ", mic dejun inclus: " + micDejunInclus +
                ", papuci de camera: " + papuciCamera +
                ", halat pentru interior: " + halatInterior);
    }

    public static class PacientBuilder {
        private Pacient pacient;

        public PacientBuilder(String nume) {
            pacient = new Pacient();
            pacient.nume = nume;
            pacient.patRabatabil = false;
            pacient.micDejunInclus = false;
            pacient.papuciCamera = false;
            pacient.halatInterior = false;
        }

        public PacientBuilder setPatRabatabil(boolean patRabatabil) {
            pacient.patRabatabil = patRabatabil;
            return this;
        }

        public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
            pacient.micDejunInclus = micDejunInclus;
            return this;
        }

        public PacientBuilder setPapuciCamera(boolean papuciCamera) {
            pacient.papuciCamera = papuciCamera;
            return this;
        }

        public PacientBuilder setHalatInterior(boolean halatInterior) {
            pacient.halatInterior = halatInterior;
            return this;
        }

        public Pacient build() {
            return pacient;
        }
    }
}
