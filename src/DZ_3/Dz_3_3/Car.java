package DZ_3.Dz_3_3;

public class Car extends Vehicle {
    public String model;

    public Car(int coordinates, int prices, int speed, int ears, String model) {
        super(coordinates, prices, speed, ears);
        this.model = model;
    }
}
