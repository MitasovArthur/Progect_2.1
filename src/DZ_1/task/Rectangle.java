package DZ_1.task;

public class Rectangle {
    private  double side1;
    private double side2;

    public  Rectangle(double side1, double side2){
        this.side1=side1;
        this.side2=side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public static void main(String[] args) {
        Rectangle prob = new Rectangle(51,65);
        System.out.println(perimeterCalculator(prob.side1, prob.side2));
        System.out.println(areaCalculator(prob.side1,prob.side2));




    }
    public  static double perimeterCalculator (double side1, double side2){
        return   (side1 + side2)*2;
    }
    public static double areaCalculator (double side1, double side2){
        return (side1*side2);
    }
}


