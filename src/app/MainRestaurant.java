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
                .setAsezareGeam(true)
                .setDecorareMasa(true)
                .build();
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
    }
}
