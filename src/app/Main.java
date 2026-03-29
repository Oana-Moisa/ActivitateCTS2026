package app;

public class Main {
    public static void main(String[] args) {

        System.out.println("A1 Builder");
        a1_builder.Pacient pacient1 = new a1_builder.Pacient.PacientBuilder("Popescu Ion")
                .setPatRabatabil(true)
                .setMicDejunInclus(true)
                .build();
        pacient1.afisarePacient();

        System.out.println();
        System.out.println("A2 Simple Factory");
        a2_simplefactory.FabricaPersonal fabricaPersonal = new a2_simplefactory.FabricaPersonal();
        a2_simplefactory.PersonalSpital personal1 =
                fabricaPersonal.crearePersonal(a2_simplefactory.TipPersonal.MEDIC, "Ionescu", "Maria");
        personal1.descriere();

        System.out.println();
        System.out.println("A3 Abstract Factory");
        a3_abstractfactory.FabricaAbstracta fabricaMedicala = new a3_abstractfactory.FabricaPersonalMedical();
        a3_abstractfactory.PersonalSpital medic =
                fabricaMedicala.crearePersonal("medic", "Georgescu", "Ana");
        medic.descriere();
        a3_abstractfactory.FabricaAbstracta fabricaNonMedicala = new a3_abstractfactory.FabricaPersonalNonMedical();
        a3_abstractfactory.PersonalSpital registrator =
                fabricaNonMedicala.crearePersonal("registrator", "Marin", "Ioana");
        registrator.descriere();

        System.out.println();
        System.out.println("A4 Prototype");
        a4_prototype.RetetaMedicament reteta1 =
                new a4_prototype.RetetaMedicament("Paracetamol", 10, 5);
        a4_prototype.RetetaMedicament reteta2 =
                (a4_prototype.RetetaMedicament) reteta1.copiaza();
        reteta2.afisare();

        System.out.println();
        System.out.println("A5 Adapter");
        a5_adapter.MedicamentFarmacie medicamentFarmacie =
                new a5_adapter.AdapterMedicament(new a5_adapter.MedicamentSpital("Nurofen"));
        medicamentFarmacie.cumparaMedicament();

        System.out.println();
        System.out.println("A6 Facade");
        a6_facade.FacadeInternare facadeInternare = new a6_facade.FacadeInternare();
        boolean rezultatInternare = facadeInternare.verificaInternare(
                new a6_facade.Pacient("Vasilescu Ion", 7),
                new a6_facade.Medic(),
                new a6_facade.Salon(2));
        if (rezultatInternare) {
            System.out.println("Pacientul poate fi internat");
        } else {
            System.out.println("Pacientul nu poate fi internat");
        }

        System.out.println();
        System.out.println("A7 Decorator");
        a7_decorator.IRezultat rezultat = new a7_decorator.RezultatPrintat();
        rezultat.afiseazaRezultat();
        a7_decorator.IRezultat rezultatOnline = new a7_decorator.RezultatOnline(rezultat);
        rezultatOnline.afiseazaRezultat();

        System.out.println();
        System.out.println("A8 Composite");
        a8_composite.Departament spital = new a8_composite.Departament("Spital");
        a8_composite.Departament chirurgie = new a8_composite.Departament("Chirurgie");
        chirurgie.adaugaNod(new a8_composite.Sectie("Ortopedie"));
        chirurgie.adaugaNod(new a8_composite.Sectie("Cardiologie"));
        spital.adaugaNod(chirurgie);
        spital.adaugaNod(new a8_composite.Sectie("Urgente"));
        spital.afiseazaStructura();

        System.out.println();
        System.out.println("A9 Proxy");
        a9_proxy.IInternare proxy = new a9_proxy.ProxyInternare(new a9_proxy.Internare());
        proxy.interneaza(new a9_proxy.Pacient("Andrei", true));
        proxy.interneaza(new a9_proxy.Pacient("Elena", false));

        System.out.println();
        System.out.println("A10 Flyweight");
        a10_flyweight.FabricaPacienti fabricaPacienti = new a10_flyweight.FabricaPacienti();
        a10_flyweight.IPacient pacientFly1 =
                fabricaPacienti.getPacient("Ion Popescu", "0711111111", "Bucuresti");
        a10_flyweight.IPacient pacientFly2 =
                fabricaPacienti.getPacient("Ion Popescu", "0711111111", "Bucuresti");
        pacientFly1.afiseazaInternare(new a10_flyweight.Internare(101, 1, 5));
        pacientFly2.afiseazaInternare(new a10_flyweight.Internare(203, 2, 3));
    }
}
