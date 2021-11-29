package DZ_4.Dz_4_2;

public class XMLHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Открытие программы");
    }

    @Override
    void create() {
        System.out.println("Создание программы");
    }

    @Override
    void change() {
        System.out.println("Редактирование");
    }

    @Override
    void save() {
        System.out.println("Сохранение документа XML");
    }
}
