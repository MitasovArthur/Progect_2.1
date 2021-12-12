package DZ_8.Dz_8_2;

public class EthernetAdapter extends Device {
    int speed;
    String mac;

    public EthernetAdapter(String manufactured, float price, String serialNumber, int speed, String mac) {
        super(manufactured, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }
}
