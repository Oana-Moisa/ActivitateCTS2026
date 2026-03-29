package a2_simplefactory;

public abstract class PersonalSpital {
    protected String nume;
    protected String prenume;

    public PersonalSpital(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public abstract void descriere();
}
