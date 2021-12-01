package Dz_2.Dz_2_3;

public class Car_main {
    public static void main(String[] args) {
        New_Car car1 = new New_Car(54);
        New_Car car2 = new New_Car(65, 20);
        New_Car car3 = new New_Car(72, 80, 120);
        New_Car car4 = new New_Car(80, 90, 130, "Green");
        System.out.println(car1.year);
        System.out.println(car2.year + car2.speed);
        System.out.println(car3.year + car3.speed + car3.weight);
        System.out.println(car4.year + car4.year + car4.weight + car4.color);
    }
}
