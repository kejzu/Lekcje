import java.util.Scanner;

public class Stringus {

    private String napis;

    Stringus(){
        System.out.println("Podaj Stringa: ");
        napis=getString();

        System.out.println("Liczba znakow: "+policzZnaki());
        System.out.println(" ");
        System.out.println("Liczba bialych znakow: "+policzBialeZnaki());
        System.out.println(" ");
        System.out.println("Liczba znakow bez znakow bialych: "+policzZnakiBez());
        System.out.println(" ");
        pokazLiczby();
        policzLitery();

        zamienNaDuzeZnaki();
        System.out.println(" Duze litery: "+napis);
        zamienNaMaleZnaki();
        System.out.println(" Male litery: "+napis);
    }

    private void zamienNaDuzeZnaki(){
        napis=napis.toUpperCase();
    }

    private void zamienNaMaleZnaki(){
        napis=napis.toLowerCase();
    }

    private int policzZnaki(){
        return napis.length();
    }

    private int policzZnakiBez(){
        int temp = 0;
        for (int i=0;i<napis.length();i++){
            if(napis.charAt(i)!=32 && napis.charAt(i)!=13){
                temp++;
            }
        }
        return temp;
    }

    private void pokazLiczby(){
        System.out.println("Liczby, ktore wystapily w zdaniu:");
        boolean czy = false;
        for (int i=0;i<napis.length();i++){
            if(napis.charAt(i)>=48 && napis.charAt(i)<=57){
                czy=true;
                System.out.print(napis.charAt(i)+" ");
            }
        }

        if (!czy){
            System.out.println("Zadna liczba nie wystapila");
        }
        System.out.println(" ");
    }

    private int policzBialeZnaki(){
        int temp = 0;
        for (int i=0;i<napis.length();i++){
            if(napis.charAt(i)==32 || napis.charAt(i)==13){
                temp++;
            }
        }
        return temp;
    }

    private void policzLitery(){
        int[] wystapienia = new int[26];
        int poczatkowaMale=65;
        int poczatkowaDuze=97;

        int[] jakaLiczba= new int[]{65,97};

        for(int i=0;i<napis.length();i++){
            for (int j=0;j<26;j++){
                if (napis.charAt(i) == jakaLiczba[0] || napis.charAt(i) == jakaLiczba[1]){
                    wystapienia[jakaLiczba[0]-poczatkowaMale]++;
                }
                jakaLiczba[0]++;
                jakaLiczba[1]++;
            }
            jakaLiczba[0]=poczatkowaMale;
            jakaLiczba[1]=poczatkowaDuze;
        }

        char[] litery = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for(int i=0;i<26;i++){
            if(wystapienia[i]!=0) {
                System.out.println("Litera " + litery[i] + " wystapila: " + wystapienia[i] + " razy");
            }
        }
    }


    private String getString(){
        return new Scanner(System.in).nextLine();
    }
}
