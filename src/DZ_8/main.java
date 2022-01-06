package DZ_8;

public class main {
    public static void main(String[] args) {
        Worker worker1 = new Worker(""," ",8);
        Worker worker2 = new Worker("Edward W", "director", 2000);
        Worker worker3 = new Worker("Christopher L", "worker", 2002);
        Worker worker4 = new Worker("Clifton W", "worker", 2005);
        Worker worker5 = new Worker("Ashley M", "deputi", 2000);
        Object[] workers = {worker1, worker2, worker3, worker4, worker5};
        // Arrays.sort(workers);
        for (Object temp : workers) {

            System.out.println(temp.toString());
        }
    }
}
