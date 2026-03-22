public class PacientAsigurat {
    private String nume;
    private boolean areAsigurare;

    public PacientAsigurat(String nume, boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }
}
