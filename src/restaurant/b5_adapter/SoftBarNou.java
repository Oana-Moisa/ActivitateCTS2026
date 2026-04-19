package restaurant.b5_adapter;

public class SoftBarNou implements SoftBar {
    private String produs;

    public SoftBarNou(String produs) {
        this.produs = produs;
    }

    @Override
    public void printeaza() {
        System.out.println("Produsul de la bar " + produs + " a fost trimis spre procesare");
    }
}
