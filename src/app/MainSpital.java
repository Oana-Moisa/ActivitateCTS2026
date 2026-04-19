package app;

public class MainSpital {
    public static void main(String[] args) {

        System.out.println("A1 Builder");
        spital.a1_builder.Pacient pacient1 = new spital.a1_builder.Pacient.PacientBuilder("Popescu Ion")
                .setPatRabatabil(true)
                .setMicDejunInclus(true)
                .build();
        pacient1.afisarePacient();

        System.out.println();
        System.out.println("A2 Simple Factory");
        spital.a2_simplefactory.FabricaPersonal fabricaPersonal = new spital.a2_simplefactory.FabricaPersonal();
        spital.a2_simplefactory.PersonalSpital personal1 =
                fabricaPersonal.crearePersonal(spital.a2_simplefactory.TipPersonal.MEDIC, "Ionescu", "Maria");
        personal1.descriere();

        System.out.println();
        System.out.println("A3 Abstract Factory");
        spital.a3_abstractfactory.FabricaAbstracta fabricaMedicala = new spital.a3_abstractfactory.FabricaPersonalMedical();
        spital.a3_abstractfactory.PersonalSpital medic =
                fabricaMedicala.crearePersonal("medic", "Georgescu", "Ana");
        medic.descriere();
        spital.a3_abstractfactory.FabricaAbstracta fabricaNonMedicala = new spital.a3_abstractfactory.FabricaPersonalNonMedical();
        spital.a3_abstractfactory.PersonalSpital registrator =
                fabricaNonMedicala.crearePersonal("registrator", "Marin", "Ioana");
        registrator.descriere();

        System.out.println();
        System.out.println("A4 Prototype");
        spital.a4_prototype.RetetaMedicament reteta1 = new spital.a4_prototype.RetetaMedicament("Paracetamol", 10, 5);
        spital.a4_prototype.RetetaMedicament reteta2 = (spital.a4_prototype.RetetaMedicament) reteta1.copiaza();
        reteta2.afisare();

        System.out.println();
        System.out.println("A5 Adapter");
        spital.a5_adapter.MedicamentFarmacie medicamentFarmacie =
                new spital.a5_adapter.AdapterMedicament(new spital.a5_adapter.MedicamentSpital("Nurofen"));
        medicamentFarmacie.cumparaMedicament();

        System.out.println();
        System.out.println("A6 Facade");
        spital.a6_facade.FacadeInternare facadeInternare = new spital.a6_facade.FacadeInternare();
        boolean rezultatInternare = facadeInternare.verificaInternare(
                new spital.a6_facade.Pacient("Vasilescu Ion", 7),
                new spital.a6_facade.Medic(),
                new spital.a6_facade.Salon(2));
        if (rezultatInternare) {
            System.out.println("Pacientul poate fi internat");
        } else {
            System.out.println("Pacientul nu poate fi internat");
        }

        System.out.println();
        System.out.println("A7 Decorator");
        spital.a7_decorator.IRezultat rezultat = new spital.a7_decorator.RezultatPrintat();
        rezultat.afiseazaRezultat();
        spital.a7_decorator.IRezultat rezultatOnline = new spital.a7_decorator.RezultatOnline(rezultat);
        rezultatOnline.afiseazaRezultat();

        System.out.println();
        System.out.println("A8 Composite");
        spital.a8_composite.Departament spital = new spital.a8_composite.Departament("Spital");
        spital.a8_composite.Departament chirurgie = new spital.a8_composite.Departament("Chirurgie");
        chirurgie.adaugaNod(new spital.a8_composite.Sectie("Ortopedie"));
        chirurgie.adaugaNod(new spital.a8_composite.Sectie("Cardiologie"));
        spital.adaugaNod(chirurgie);
        spital.adaugaNod(new spital.a8_composite.Sectie("Urgente"));
        spital.afiseazaStructura();

        System.out.println();
        System.out.println("A9 Proxy");
        spital.a9_proxy.IInternare proxy = new spital.a9_proxy.ProxyInternare(new spital.a9_proxy.Internare());
        proxy.interneaza(new spital.a9_proxy.Pacient("Andrei", true));
        proxy.interneaza(new spital.a9_proxy.Pacient("Elena", false));

        System.out.println();
        System.out.println("A10 Flyweight");
        spital.a10_flyweight.FabricaPacienti fabricaPacienti = new spital.a10_flyweight.FabricaPacienti();
        spital.a10_flyweight.IPacient pacientFly1 =
                fabricaPacienti.getPacient("Ion Popescu", "0711111111", "Bucuresti");
        spital.a10_flyweight.IPacient pacientFly2 =
                fabricaPacienti.getPacient("Ion Popescu", "0711111111", "Bucuresti");
        pacientFly1.afiseazaInternare(new spital.a10_flyweight.Internare(101, 1, 5));
        pacientFly2.afiseazaInternare(new spital.a10_flyweight.Internare(203, 2, 3));

        System.out.println();
        System.out.println("A11 Strategy");
        spital.a11_strategy.PacientPlata pacientPlata = new spital.a11_strategy.PacientPlata("Marin Elena");
        pacientPlata.setModPlata(new spital.a11_strategy.PlataCard());
        pacientPlata.platesteNota(250);
        pacientPlata.setModPlata(new spital.a11_strategy.PlataCash());
        pacientPlata.platesteNota(100);

        System.out.println();
        System.out.println("A12 Observer");
        spital.a12_observer.Spital spitalObserver = new spital.a12_observer.Spital();
        spitalObserver.adaugaObserver(new spital.a12_observer.PacientAbonat("Ana"));
        spitalObserver.adaugaObserver(new spital.a12_observer.PacientAbonat("George"));
        spitalObserver.trimiteNotificare("A aparut un virus nou in oras");

        System.out.println();
        System.out.println("A13 State");
        spital.a13_state.Pacient pacientState = new spital.a13_state.Pacient("Ionescu Mihai");
        pacientState.setStare(new spital.a13_state.Internat());
        pacientState.setStare(new spital.a13_state.SubObservatie());
        pacientState.setStare(new spital.a13_state.Externat());

        System.out.println();
        System.out.println("A14 Template");
        spital.a14_template.InternareTemplate procesInternare = new spital.a14_template.ProcesInternare();
        procesInternare.internarePacient();

        System.out.println();
        System.out.println("A15 Command");
        spital.a15_command.Medic medicUrgenta = new spital.a15_command.Medic();
        spital.a15_command.OperatorPrimire operator = new spital.a15_command.OperatorPrimire();
        operator.adaugaComanda(new spital.a15_command.ComandaInternare(medicUrgenta));
        operator.adaugaComanda(new spital.a15_command.ComandaTratare(medicUrgenta));
        operator.trimiteComenzi();
    }
}
