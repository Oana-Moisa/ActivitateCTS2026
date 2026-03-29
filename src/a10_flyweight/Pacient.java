package a10_flyweight;

public class Pacient implements IPacient {
    private String nume;
    private String telefon;
    private String adresa;

    public Pacient(String nume, String telefon, String adresa) {
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    @Override
    public void afiseazaInternare(Internare internare) {
        System.out.println("Pacient: " + nume +
                ", telefon: " + telefon +
                ", adresa: " + adresa +
                ", salon: " + internare.getNumarSalon() +
                ", pat: " + internare.getNumarPat() +
                ", zile: " + internare.getNumarZileSpitalizare());
    }
}
