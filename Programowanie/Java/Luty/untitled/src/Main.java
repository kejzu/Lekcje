public class Main {
    public static void main(String[] args){

        int[] tablica = new int[10];
        for(int i = 0 ; i < 10; i++) tablica[i] = i+1;

        for(int x : tablica)
        {
            if (x%2==0 && x>=0 && x<=40 )
            {
                System.out.print(x + " ");
            }
        }
    }
}
