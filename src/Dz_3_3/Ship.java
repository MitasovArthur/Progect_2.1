package Dz_3_3;

public class Ship extends Vehicle{
    public int passenger;
    public String port;

    public Ship(int coordinates, int prices, int speed, int ears,int passenger, String port) {
        super(coordinates, prices, speed, ears);
        this.passenger = passenger;
        this.port=port;
    }
}
