package spital.a15_command;
public class ComandaTratare implements Comanda {
    private Medic medic;
    public ComandaTratare(Medic medic) { this.medic = medic; }
    public void executa() { medic.trateazaPacient(); }
}
