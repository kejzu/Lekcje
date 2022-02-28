import java.util.Scanner;

public class Wlasciciel {

    String imie;
    String nazwisko;

    Samochod auto;
    Dom domek;

    Wlasciciel(){
        System.out.println("Podaj imie: ");
        imie=getString();
        System.out.println("Podaj nazwisko: ");
        nazwisko=getString();
        auto = new Samochod();
        domek = new Dom();
    }

    public void wyswietl(){
        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Marka samochodu: "+auto.marka);
        System.out.println("Model samochodu: "+auto.model);
        System.out.println("Powierzchnia domu: "+domek.powierzchnia+" m2");
        System.out.println("Adres: "+domek.adres);
    }

    private String getString(){
        return new Scanner(System.in).nextLine();
    }
}
