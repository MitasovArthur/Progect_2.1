package DZ_3.Dz_3_2;

public class KlassRoom {
    String study;
    String write;
    String read;
    String relax;

    public KlassRoom(String study, String write) {
        this.study = study;
        this.write = write;
    }

    public KlassRoom(String study, String write, String read) {
        this.study = study;
        this.write = write;
        this.read = read;
    }

    public KlassRoom(String study, String write, String read, String relax) {
        this.study = study;
        this.write = write;
        this.read = read;
        this.relax = relax;
    }

    public static void main(String[] args) {
        KlassRoom pupil1 = new KlassRoom("Good ", "Good");
        KlassRoom pupil3 = new KlassRoom("Bad", "Bad", "Bad", "Good");
        KlassRoom pupil2 = new KlassRoom("Bad", "Excelent", "good");
        System.out.println("pupil1");
        System.out.println(pupil1.study + "\n" + pupil1.write);
        System.out.println("pupil2");
        System.out.println(pupil2.study + "\n" + pupil2.write + "\n"+pupil2.read);
        System.out.println("pupil3");
        System.out.println(pupil3.study + "\n" + pupil3.write+"\n"+pupil3.read+"\n"+pupil3.relax);
    }

}
