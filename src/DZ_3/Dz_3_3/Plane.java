package DZ_3.Dz_3_3;

public class Plane extends Vehicle{
    public int height;

    public Plane(int coordinates, int prices, int speed, int ears, int height, int passenger) {
        super(coordinates, prices, speed, ears);
        this.height = height;
        this.passenger = passenger;
    }

    public int passenger;
}
