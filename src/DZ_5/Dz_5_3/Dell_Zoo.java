package DZ_5.Dz_5_3;

import java.util.ArrayList;

public class Dell_Zoo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Медведь");
        arrayList.add("Слон");
        arrayList.add("Енот");
        arrayList.add("Тигр");
        arrayList.add("Крот");
        arrayList.add("Игуана");
        arrayList.add("Рысь");
        arrayList.add("Лев");
        arrayList.remove(3);
        arrayList.remove(5);
        arrayList.remove(7);

        System.out.format("%s %d", arrayList, arrayList.size());
    }
}
