package DZ_8;

import java.util.Scanner;

public class Worker {
    String surname;
    String position;
    int year_of_joining;

    public Worker(String surname, String position, int year_of_joining) {
        this.surname = surname;
        this.position = position;
        this.year_of_joining = year_of_joining;
    }

    @Override
    public String toString() {
        return "DZ_8.Worker{" +
                "surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", year_of_joining=" + year_of_joining +
                '}';
    }
}
