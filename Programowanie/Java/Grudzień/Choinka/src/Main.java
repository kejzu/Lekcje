import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Ile segmentow: ");
        int n;
        n=new Scanner(System.in).nextInt();

        int segmenty=1;

        for (int a=0;a<n;a++){
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 60 - i*segmenty; j++)
                    System.out.print(" ");
                for (int k = 0; k < (2 * i + 1)*segmenty; k++)
                    System.out.print("*");
                System.out.println();
            }
            segmenty++;
        }

    }
}
