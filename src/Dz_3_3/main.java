package Dz_3_3;

public class main {
    public static void main(String[] args) {
        Car car = new Car(12,2000,60,2002,"model");
        System.out.println(car.coordinates+ car.prices+ car.speed+ car.ears+car.model);
        Plane plane = new Plane(15,5000,700,2000,2000,200);
        System.out.println(plane.coordinates+ plane.prices+ plane.speed+ plane.ears+ plane.height+ plane.passenger);
        Ship ship = new Ship(66,3000,100,2001,60,"port");
        System.out.println(ship.coordinates+ ship.prices+ ship.speed+ ship.ears+ ship.passenger+ship.port);
    }
}
