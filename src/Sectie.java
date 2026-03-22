public class Sectie implements NodSpital {

    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaStructura() {
        System.out.println("Sectie: " + nume);
    }
}
