package restaurant.b7_decorator;

public abstract class DecoratorNota implements INotaDePlata {
    protected INotaDePlata notaDePlata;

    public DecoratorNota(INotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeaza() {
        notaDePlata.printeaza();
    }
}
