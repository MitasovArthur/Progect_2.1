package DZ_8;

import java.util.Objects;

public class EthernetAdapter extends Device {
    int speed;
    String mac;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed && Objects.equals(mac, that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mac);
    }

    public EthernetAdapter(String manufactured, float price, String serialNumber, int speed, String mac) {
        super(manufactured, price, serialNumber);
        this.speed = speed;
        this.mac = mac;

    }
}
