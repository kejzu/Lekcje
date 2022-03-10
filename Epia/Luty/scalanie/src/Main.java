import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj długość tablicy: ");
        int n=getInt();
        int[] tab = new int[n];


        int np=0, nnp=0;
        for(int i=0;i<n;i++){
            System.out.println("Podaj "+(i+1)+" element: ");
            tab[i]=getInt();

            if(tab[i]%2==0) np++;
            else nnp++;
        }

        int[] par = new int[np];
        int[] npar = new int[nnp];

        np=0;
        nnp=0;
        for(int i=0; i<tab.length;i++){
            if(tab[i]%2==0){
                par[np]=tab[i];
                np++;
            }else {
                npar[nnp]=tab[i];
                nnp++;
            }
        }


        Sort parzyste = new Sort(par);
        Sort nparzyste = new Sort(npar);

        System.out.println("Posortowana tablica parzysta: ");
        for(int i = 0; i < parzyste.tab.length; i++)
            System.out.print(parzyste.tab[i] + " ");

        System.out.println("\nPosortowana tablica nieparzysta: ");
        for(int i = 0; i < nparzyste.tab.length; i++)
            System.out.print(nparzyste.tab[i] + " ");
    }

    private static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}

