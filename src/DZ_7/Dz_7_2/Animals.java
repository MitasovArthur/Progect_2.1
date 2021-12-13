package DZ_7.Dz_7_2;

public enum Animals {
    Lion(54),Triton(2),Crocodile(5);
    private int age;
    private String name;

    Animals(int age){//String name) {
        this.age = age;
//        this.name = name;
    }

    public int toSting( ) {
        return age;
    }

    public String toSting(String name) {
        return name;
    }
}
