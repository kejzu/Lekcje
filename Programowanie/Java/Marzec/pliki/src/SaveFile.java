import java.io.*;
import java.util.Scanner;

public class SaveFile {
    public void saveFile(String name,String content) {
        try{
            File file = new File(name);
            FileWriter fw = new FileWriter(name);
            fw.write(content);
            fw.append("\r\nkoniec");
            fw.close();

            if (file.createNewFile()){
                System.out.println(file.getName()+ "zostal stworzony");
            }else {
                System.out.println(file.getName()+" nie zostal stworzony");
            }
        }catch (IOException ex){
            System.out.println("blad");
            ex.getStackTrace();
        }
    }

    public String readFile(String input){
        String out="";
        try {
            File file = new File(input);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                out+=reader.nextLine();
                out+="\r\n";
            }
            reader.close();
        }catch (FileNotFoundException ex){
            System.out.println("Bład");
            ex.getStackTrace();
        }

        return out;
    }
}