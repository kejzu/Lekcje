public class Garaz {
    private String adres;
    private int pojemnosc;

    private int liczbaSamochodow=0;

    private Samochod[] samochody;

    public void setPojemnosc(int n){
        pojemnosc=n;
        samochody = new Samochod[n];
    }

    public void setAdres(String a){
        adres=a;
    }

    Garaz(){
        adres="nieznany";
        pojemnosc=0;
        samochody=null;
    }

    Garaz(String adres, int pojemnosc){
        this.adres=adres;
        setPojemnosc(pojemnosc);
    }

    public void wprowadzSamochod(Samochod s){
        if(liczbaSamochodow<pojemnosc){
            samochody[liczbaSamochodow]=s;
            liczbaSamochodow++;
        }else{
            System.out.println("Garaz jest pełen");
        }
    }

    public Samochod wyprowadzSamochod(){
        if (liczbaSamochodow==0){
            System.out.println("Garaz jest pusty");
            return null;
        }
        Samochod temp = samochody[liczbaSamochodow];
        samochody[liczbaSamochodow]=null;
        liczbaSamochodow--;
        return temp;
    }

    public void wypiszInfo(){
        System.out.println("Adres: "+ adres);
        System.out.println("Pojemność: "+pojemnosc);
        System.out.println("");
        for (int i=0;i<liczbaSamochodow;i++){
            samochody[i].WypiszInfo();
            System.out.println("");
        }
    }
}
