package DZ_7.Dz_7_2;

public enum Animals {
    CAT(5);
    int ears;


    Animals(int ears) {
        this.ears = ears;
    }

    @Override
    public String toString() {
        return super.toString() + " " + ears;
    }
}

class main {
    public static void main(String[] args) {
        Animals animals = Animals.CAT;
        System.out.println(animals);
    }
}
