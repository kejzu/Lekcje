import java.util.Scanner;

public class Dom {
    int powierzchnia;
    String adres;

    Dom(){
        System.out.println("Podaj powierzchnie (m^2): ");
        powierzchnia=getInt();
        System.out.println("Podaj adres: ");
        adres=getString();
    }

    private String getString(){
        return new Scanner(System.in).nextLine();
    }

    private int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
