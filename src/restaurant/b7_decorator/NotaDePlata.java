package restaurant.b7_decorator;

public class NotaDePlata implements INotaDePlata {
    private float suma;

    public NotaDePlata(float suma) {
        this.suma = suma;
    }

    @Override
    public void printeaza() {
        System.out.println("Nota de plata are valoarea de " + suma + " lei");
    }
}
