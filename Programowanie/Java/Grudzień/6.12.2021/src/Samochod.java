import java.util.Scanner;

public class Samochod {
    String marka;
    String model;

    Samochod(){
        System.out.println("Podaj marke: ");
        marka=getString();
        System.out.println("Podaj model: ");
        model=getString();
    }

    private String getString(){
        return new Scanner(System.in).nextLine();
    }

}
