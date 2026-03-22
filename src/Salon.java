public class Salon {
    private int nrPaturiLibere;

    public Salon(int nrPaturiLibere) {
        this.nrPaturiLibere = nrPaturiLibere;
    }

    public boolean arePatLiber() {
        return nrPaturiLibere > 0;
    }
}
