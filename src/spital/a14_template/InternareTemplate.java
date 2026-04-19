package spital.a14_template;
public abstract class InternareTemplate {
    public final void internarePacient() {
        analizeazaStarea();
        verificaDisponibilitateSalon();
        emiteFisaInternare();
    }
    public abstract void analizeazaStarea();
    public abstract void verificaDisponibilitateSalon();
    public abstract void emiteFisaInternare();
}
