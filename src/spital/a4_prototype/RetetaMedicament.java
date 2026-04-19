package spital.a4_prototype;

public class RetetaMedicament implements IReteta {
    private String denumire;
    private float cantitateSolutie1;
    private float cantitateSolutie2;

    public RetetaMedicament(String denumire, float cantitateSolutie1, float cantitateSolutie2) {
        this.denumire = denumire;
        this.cantitateSolutie1 = cantitateSolutie1;
        this.cantitateSolutie2 = cantitateSolutie2;
    }

    @Override
    public IReteta copiaza() {
        return new RetetaMedicament(denumire, cantitateSolutie1, cantitateSolutie2);
    }

    public void afisare() {
        System.out.println("Reteta " + denumire + " cu cantitati: " +
                cantitateSolutie1 + " si " + cantitateSolutie2);
    }
}
