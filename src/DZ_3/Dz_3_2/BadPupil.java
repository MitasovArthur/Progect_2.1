package DZ_3.Dz_3_2;

public class BadPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("Bad study");
    }

    @Override
    public void write() {
        System.out.println("Bad write");
    }

    @Override
    public void read() {
        System.out.println("Bad read");
    }

    @Override
    public void relax() {
        System.out.println("Bad relax");
    }
}

