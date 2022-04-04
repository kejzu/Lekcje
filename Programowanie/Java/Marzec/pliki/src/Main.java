import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String plikRW = "nowyPlik.txt";

        SaveFile f = new SaveFile();

        f.saveFile(plikRW,"Umiem zapisywac");
        f.saveFile("drugiPlik","dawdadawdwadadaw");

        System.out.println("Odczyt pliku #1 " + plikRW);
        System.out.println(f.readFile(plikRW));

        System.out.println("odczyt pliku drugi plik ");
        System.out.println(f.readFile("drugiPlik"));

        Archives a = new Archives();
        String plikRO = "drugiPlik";
        String archName = "noweArchiwum";

        a.pack(archName,plikRO);
        a.pack(archName+"Multi",plikRO+","+plikRW);

        a.unpack(archName+"Multi","./unpack2TP",plikRW);
    }
}
