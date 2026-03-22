public class PacientFlyweight {

    private String nume;
    private String telefon;
    private String adresa;

    public PacientFlyweight(String nume, String telefon, String adresa) {
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    public void afiseazaInternare(String salon, int pat, int zile) {
        System.out.println("Pacient: " + nume + ", telefon: " + telefon + ", adresa: " + adresa
                + ", salon: " + salon + ", pat: " + pat + ", zile: " + zile);
    }
}
