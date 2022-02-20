import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> podane = new ArrayList<Integer>();
        int tmp = 1;

        while(tmp!=0){
            System.out.println("Podaj liczbe: ");
            tmp = getInt();

            if(tmp!=0) podane.add(tmp);
        }

        ArrayList<Integer> parzyste = new ArrayList<Integer>();
        ArrayList<Integer> nieparzyste = new ArrayList<Integer>();

        for(int x:podane){
            if(x%2 == 0){
                parzyste.add(x);
            }else{
                nieparzyste.add(x);
            }
        }

        //sortowanie parzyste
        for(int i=0; i<parzyste.size()-1;i++){
            for(int j=0; j<parzyste.size()-1;j++){
                if(parzyste.get(j)>parzyste.get(j+1)){
                    tmp = parzyste.get(j);
                    parzyste.remove(j);
                    parzyste.add(j+1,tmp);
                }
            }
        }
        //sortowanie nieparzyste
        for(int i=0; i<nieparzyste.size()-1;i++){
            for(int j=0; j<nieparzyste.size()-1;j++){
                if(nieparzyste.get(j)>nieparzyste.get(j+1)){
                    tmp = nieparzyste.get(j);
                    nieparzyste.remove(j);
                    nieparzyste.add(j+1,tmp);
                }
            }
        }

        podane.clear();
        for (int i=0;i<parzyste.size();i++){
            podane.add(parzyste.get(i));
        }
        for (int i=0;i<nieparzyste.size();i++){
            podane.add(nieparzyste.get(i));
        }

        System.out.println(podane);
    }
    private static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
