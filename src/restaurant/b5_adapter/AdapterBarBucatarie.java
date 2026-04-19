package restaurant.b5_adapter;

public class AdapterBarBucatarie implements SoftBar {
    private SoftPrintareBucatarie softPrintareBucatarie;

    public AdapterBarBucatarie(SoftPrintareBucatarie softPrintareBucatarie) {
        this.softPrintareBucatarie = softPrintareBucatarie;
    }

    @Override
    public void printeaza() {
        softPrintareBucatarie.printareFactura();
    }
}
