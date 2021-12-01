package DZ_4.Dz_4_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String format = sc.nextLine();
        switch (format) {
            case "XML":
                XMLHandler xmlHandler= new XMLHandler();
                xmlHandler.open();
                xmlHandler.create();
                xmlHandler.change();
                xmlHandler.save();
                break;
            case "TXT":
                TXTHandler txtHandler = new TXTHandler();
                txtHandler.open();
                txtHandler.create();
                txtHandler.change();
                txtHandler.save();
                break;
            case "DOC":
                DOCHandler docHandler = new DOCHandler();
                docHandler.open();
                docHandler.create();
                docHandler.change();
                docHandler.save();
                break;
        }


    }
}