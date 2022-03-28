import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String plikRW = "nowyplik.txt";

        SaveFile f = new SaveFile();

        f.saveFile(plikRW,"Umiem zapisywac");
        f.saveFile("drugiplik","dawdadawdwadadaw");

        System.out.println("Odczyt pliku #1 " + plikRW);
        System.out.println(f.readFile(plikRW));

        System.out.println("odczyt pliku drugi plik ");
        System.out.println(f.readFile("drugiplik"));
    }
}
