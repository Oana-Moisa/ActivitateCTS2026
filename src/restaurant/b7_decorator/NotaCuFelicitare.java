package restaurant.b7_decorator;

public class NotaCuFelicitare extends DecoratorNota {
    public NotaCuFelicitare(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("La multi ani din partea restaurantului!");
    }
}
