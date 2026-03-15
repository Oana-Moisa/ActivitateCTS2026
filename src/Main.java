
public class Main {

    public static void main(String[] args) {

        System.out.println("A1.Builder");
        Pacient pacient = new PacientBuilder("Ion Popescu")
                .setPatRabatabil(true)
                .setMicDejun(true)
                .build();
        pacient.afisare();

        System.out.println("\nA2.Simple Factory");
        PersonalSpital p = PersonalFactory.crearePersonal(TipPersonal.MEDIC);
        
        p.descriere();

        System.out.println("\nA3.Abstract Factory");
        FabricaPersonal fabricaMedical = new FabricaMedical();
        PersonalSpital medic = fabricaMedical.crearePersonal("Medic");
        medic.descriere();

        FabricaPersonal fabricaNonMedical = new FabricaNonMedical();
        PersonalSpital registrator = fabricaNonMedical.crearePersonal("Registrator");
        registrator.descriere();

        System.out.println("\nA4.Prototype");
        Reteta r1 = new Reteta("Paracetamol", 10);
        Reteta r2 = (Reteta) r1.clone();
        r2.afisare();

        System.out.println("\nA5.Adapter");
        MedicamentSpital medSpital = new MedicamentSpital();
        MedicamentFarmacie adapter = new MedicamentAdapter(medSpital);
        adapter.cumparaMedicament();
    }
}
