public class Sort {
    public int[] tab;
    private int[] t;

    Sort(int[] tablica){
        tab=tablica;
        t=new int[tab.length];

        mergesort(0,tab.length-1);
    }

    private void merge(int pocz, int sr, int kon) {
        int i, j, q;
        for(i = pocz; i<= kon; i++) t[i] = tab[i];  //"Skopiowanie" danych do tablicy pomocniczej
        i = pocz; j = sr+1; q = pocz;               //Ustawienie wskaźników tablicy
        while (i <= sr && j <= kon) {
            if(t[i]<t[j]) {
                tab[q++] = t[i++];
            } else {
                tab[q++] = t[j++];
            }
        }

        while (i <= sr) tab[q++] = t[i++];
    }

    public void mergesort(int pocz, int kon) {
        int sr;
        if(pocz < kon) {
            sr = (pocz + kon) / 2;
            mergesort(pocz, sr);           //Dzielenie lewej częsci tablicy
            mergesort(sr+1,kon);      //Dzielenie prawej częsci tablicy
            merge(pocz, sr, kon);           //Łączenie lewej i prawej częsci tablicy
        }
    }
}
