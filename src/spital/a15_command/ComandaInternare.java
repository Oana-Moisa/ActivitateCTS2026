package spital.a15_command;
public class ComandaInternare implements Comanda {
    private Medic medic;
    public ComandaInternare(Medic medic) { this.medic = medic; }
    public void executa() { medic.interneazaPacient(); }
}
