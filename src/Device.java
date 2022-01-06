public class Device {
    String manufacture;
    String seriaNumber;
    float price;

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getSeriaNumber() {
        return seriaNumber;
    }

    public void setSeriaNumber(String seriaNumber) {
        this.seriaNumber = seriaNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Device(String manufacture, String seriaNumber, float price) {
        this.manufacture = manufacture;
        this.seriaNumber = seriaNumber;
        this.price = price;

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Device{" +
                "manufacture='" + manufacture + '\'' +
                ", seriaNumber='" + seriaNumber + '\'' +
                ", price=" + price +
                '}';
    }
}

class monitor extends Device {
    int resolutionX;
    int resolutionY;

    public monitor(String manufacture, String seriaNumber, float price, int resolutionX, int resolutionY) {
        super(manufacture, seriaNumber, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "monitor:" +
                "manufacture='" + manufacture + '\'' +
                ", seriaNumber='" + seriaNumber + '\'' +
                ", price=" + price +
                ", resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class EthernetAdapter extends Device {
    int speed;
    String mac;

    public EthernetAdapter(String manufacture, String seriaNumber, float price, int speed, String mac) {
        super(manufacture, seriaNumber, price);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}

class main {
    public static void main(String[] args) {
        monitor monitor = new monitor("manufacture", "seriaNumber", 25.5F, 545, 454);
        System.out.println(monitor.toString());
        System.out.println(monitor.hashCode());
        Device device = new Device("manufactureQ", "seriaNumber", 45.5F);
        System.out.println(device.toString());
        System.out.println(device.hashCode());
        System.out.println(monitor.equals(device));
    }
}