package restaurant.b2_builder;

public class Rezervare {
    private String numeClient;
    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientalaPersonalizata;
    private boolean genMuzica;

    private Rezervare() {
    }

    public void afisareRezervare() {
        System.out.println("Rezervare pentru " + numeClient +
                " | geam=" + asezareGeam +
                " | scaune ergonomice=" + scauneErgonomice +
                " | decor masa=" + decorareMasa +
                " | muzica personalizata=" + muzicaAmbientalaPersonalizata +
                " | gen muzica=" + genMuzica);
    }

    public static class RezervareBuilder {
        private Rezervare rezervare;

        public RezervareBuilder(String numeClient) {
            rezervare = new Rezervare();
            rezervare.numeClient = numeClient;
            rezervare.asezareGeam = false;
            rezervare.scauneErgonomice = false;
            rezervare.decorareMasa = false;
            rezervare.muzicaAmbientalaPersonalizata = false;
            rezervare.genMuzica = false;
        }

        public RezervareBuilder setAsezareGeam(boolean asezareGeam) {
            rezervare.asezareGeam = asezareGeam;
            return this;
        }

        public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
            rezervare.scauneErgonomice = scauneErgonomice;
            return this;
        }

        public RezervareBuilder setDecorareMasa(boolean decorareMasa) {
            rezervare.decorareMasa = decorareMasa;
            return this;
        }

        public RezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
            rezervare.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
            return this;
        }

        public RezervareBuilder setGenMuzica(boolean genMuzica) {
            rezervare.genMuzica = genMuzica;
            return this;
        }

        public Rezervare build() {
            return rezervare;
        }
    }
}
