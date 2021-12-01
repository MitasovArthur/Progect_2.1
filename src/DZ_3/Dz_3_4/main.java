package DZ_3.Dz_3_4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pro_kay = sc.nextInt();
        int exp_kay = sc.nextInt();
        ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
        ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
        if (pro_kay == proDocumentWorker.pro_kay) {
            System.out.println("Активирована pro версия");
            proDocumentWorker = new ProDocumentWorker();
        } else if (exp_kay == expertDocumentWorker.exp_kay) {
            System.out.println("Ативированна exp версия");
            expertDocumentWorker = new ExpertDocumentWorker();
        } else {
            System.out.println("У вас базовая версия");
            DocumentWorker documentWorker = new DocumentWorker();
        }
    }
}
