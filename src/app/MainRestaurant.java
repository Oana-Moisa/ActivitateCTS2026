package app;

public class MainRestaurant {
    public static void main(String[] args) {
        System.out.println("B1 Simple Factory");
        restaurant.b1_simplefactory.FabricaSupe fabricaSupe = new restaurant.b1_simplefactory.FabricaSupe();
        restaurant.b1_simplefactory.Supa supa = fabricaSupe.creareSupa(restaurant.b1_simplefactory.TipSupa.CIUPERCI, 18);
        supa.afisare();

        System.out.println();
        System.out.println("B2 Builder");
        restaurant.b2_builder.Rezervare rezervare = new restaurant.b2_builder.Rezervare.RezervareBuilder("Popescu Ana")
                .setAsezareGeam(true).setDecorareMasa(true).build();
        rezervare.afisareRezervare();

        System.out.println();
        System.out.println("B3 Abstract Factory");
        restaurant.b3_abstractfactory.FabricaAbstracta fabricaFeluri = new restaurant.b3_abstractfactory.FabricaSupe();
        restaurant.b3_abstractfactory.FelMancare fel1 = fabricaFeluri.creareFel("vita");
        fel1.afisare();
        restaurant.b3_abstractfactory.FabricaAbstracta fabricaDesert = new restaurant.b3_abstractfactory.FabricaDesert();
        restaurant.b3_abstractfactory.FelMancare fel2 = fabricaDesert.creareFel("papanasi");
        fel2.afisare();

        System.out.println();
        System.out.println("B4 Prototype");
        restaurant.b4_prototype.ContClient cont1 = new restaurant.b4_prototype.ContClient("Ionescu Mihai", "0711111111", "mihai@gmail.com");
        restaurant.b4_prototype.ContClient cont2 = (restaurant.b4_prototype.ContClient) cont1.copiaza();
        cont2.afisare();

        System.out.println();
        System.out.println("B5 Adapter");
        restaurant.b5_adapter.SoftBar softBar = new restaurant.b5_adapter.AdapterBarBucatarie(
                new restaurant.b5_adapter.SoftPrintareBucatarie("Limonada"));
        softBar.printeaza();

        System.out.println();
        System.out.println("B6 Facade");
        restaurant.b6_facade.Masa masa = new restaurant.b6_facade.Masa(5, true, true, true);
        restaurant.b6_facade.FacadeMasa facadeMasa = new restaurant.b6_facade.FacadeMasa();
        if (facadeMasa.verificaMasa(masa)) {
            System.out.println("Masa " + masa.getNumarMasa() + " poate fi ocupata");
        } else {
            System.out.println("Masa " + masa.getNumarMasa() + " nu poate fi ocupata");
        }

        System.out.println();
        System.out.println("B7 Decorator");
        restaurant.b7_decorator.INotaDePlata nota = new restaurant.b7_decorator.NotaDePlata(120);
        nota.printeaza();
        restaurant.b7_decorator.INotaDePlata notaCuFelicitare =
                new restaurant.b7_decorator.NotaCuFelicitare(nota);
        notaCuFelicitare.printeaza();

        System.out.println();
        System.out.println("B8 Composite");
        restaurant.b8_composite.SectiuneMeniu meniu = new restaurant.b8_composite.SectiuneMeniu("Meniu Restaurant");
        restaurant.b8_composite.SectiuneMeniu bauturi = new restaurant.b8_composite.SectiuneMeniu("Bauturi");
        bauturi.adaugaNod(new restaurant.b8_composite.ItemMeniu("Apa plata", 8));
        bauturi.adaugaNod(new restaurant.b8_composite.ItemMeniu("Cafea", 12));
        restaurant.b8_composite.SectiuneMeniu deserturi = new restaurant.b8_composite.SectiuneMeniu("Deserturi");
        deserturi.adaugaNod(new restaurant.b8_composite.ItemMeniu("Papanasi", 25));
        meniu.adaugaNod(bauturi);
        meniu.adaugaNod(deserturi);
        meniu.afiseaza();

        System.out.println();
        System.out.println("B9 Proxy");
        restaurant.b9_proxy.IRezervare proxyRezervare =
                new restaurant.b9_proxy.ProxyRezervare(new restaurant.b9_proxy.RezervareRestaurant());
        proxyRezervare.realizeazaRezervare(new restaurant.b9_proxy.Rezervare("Marin Ana", 5));
        proxyRezervare.realizeazaRezervare(new restaurant.b9_proxy.Rezervare("Popa Ion", 2));

        System.out.println();
        System.out.println("B10 Flyweight");
        restaurant.b10_flyweight.FabricaClienti fabricaClienti = new restaurant.b10_flyweight.FabricaClienti();
        restaurant.b10_flyweight.IClient client1 =
                fabricaClienti.getClient("Ionescu Mihai", "0711111111", "mihai@gmail.com");
        restaurant.b10_flyweight.IClient client2 =
                fabricaClienti.getClient("Ionescu Mihai", "0711111111", "mihai@gmail.com");
        client1.afiseazaRezervare(new restaurant.b10_flyweight.Rezervare(10, 4, "18:00"));
        client2.afiseazaRezervare(new restaurant.b10_flyweight.Rezervare(15, 6, "20:00"));
    }
}
