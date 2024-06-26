public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpec Spec;

    public Guitar(String serialNumber,double price,GuitarSpec Spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.Spec =Spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GuitarSpec getSpec() {
        return Spec;
    }

    public void setSpec(GuitarSpec spec) {
        this.Spec = spec;
    }
}
