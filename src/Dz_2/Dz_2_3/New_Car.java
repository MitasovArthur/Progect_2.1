package Dz_2.Dz_2_3;

public class New_Car {
    public int year;
    public double speed;
    public int weight;
    public String color;

    public New_Car(int year) {
        this.year = year;
    }

    public New_Car(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    public New_Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    public New_Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }
}
