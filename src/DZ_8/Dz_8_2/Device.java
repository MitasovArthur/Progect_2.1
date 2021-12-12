package DZ_8.Dz_8_2;

public class Device {
    String manufactured;
    float price;
    String serialNumber;

    public Device(String manufactured, float price, String serialNumber) {
        this.manufactured = manufactured;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufactured() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    @Override
    public String toString() {
        return String.format("manufacturer = %s, prise = %s, serialNumer = %s, x=%s,", manufactured, price, serialNumber);
    }
}
