package DZ_8;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0 && Objects.equals(manufactured, device.manufactured) && Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufactured, price, serialNumber);
    }
}
