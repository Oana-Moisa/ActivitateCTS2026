package restaurant.b6_facade;

public class Masa {
    private int numarMasa;
    private boolean libera;
    private boolean debarasata;
    private boolean serveteleNoi;

    public Masa(int numarMasa, boolean libera, boolean debarasata, boolean serveteleNoi) {
        this.numarMasa = numarMasa;
        this.libera = libera;
        this.debarasata = debarasata;
        this.serveteleNoi = serveteleNoi;
    }

    public boolean esteLibera() { return libera; }
    public boolean esteDebarasata() { return debarasata; }
    public boolean areServeteleNoi() { return serveteleNoi; }
    public int getNumarMasa() { return numarMasa; }
}
