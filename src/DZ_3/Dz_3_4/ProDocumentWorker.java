package DZ_3.Dz_3_4;

public class ProDocumentWorker extends DocumentWorker {
    final int pro_kay = 4568;

    @Override
    public void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах \n" +
                "доступно в версии Эксперт");
    }
}
