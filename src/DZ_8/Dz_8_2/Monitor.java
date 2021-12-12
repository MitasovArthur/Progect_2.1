package DZ_8.Dz_8_2;

public class Monitor extends Device {
    int resolutionX;
    int resolutionY;

    public Monitor(String manufactured, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufactured, price, serialNumber);
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
        return String.format("manufacturer = %s, prise = %s, serialNumer = %s, x=%s,", manufactured, price, serialNumber, resolutionX, resolutionY);
    }

}



