package DZ_6.Dz_6_2;

class Vehicle {
    void print() {
        System.out.println("Vehicle");
    }

    public class Wheel {
        public void print() {
            System.out.println("Wheel");
        }
    }

    public class Door {
        public void print() {
            System.out.println("Door");
        }
    }
}

class main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle.Wheel vehicle1 = new Vehicle().new Wheel();
        Vehicle.Door vehicle2 = new Vehicle().new Door();
        vehicle.print();
        vehicle1.print();
        vehicle2.print();

    }
}

