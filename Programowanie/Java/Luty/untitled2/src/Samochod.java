public class Samochod {
    private String marka, model;
    private int iloscDrzwi, pojemnoscSilnika;
    private double srednieSpalanie;

    private static int iloscSamochodow=0;

    Samochod(){
        marka="nieznana";
        model = "nieznany";
        iloscDrzwi=0;
        pojemnoscSilnika=0;
        srednieSpalanie=0.0;

        iloscSamochodow++;
    }
    Samochod(String marka, String model, int iloscDrzwi, int pojemnoscSilnika, double srednieSpalanie){
        this.marka=marka;
        this.model=model;
        this.iloscDrzwi=iloscDrzwi;
        this.pojemnoscSilnika=pojemnoscSilnika;
        this.srednieSpalanie=srednieSpalanie;

        iloscSamochodow++;
    }

    private double obliczSpalanie(double dlugoscTrasy){
        return ((srednieSpalanie*dlugoscTrasy)/100.0);
    }

    public double ObliczKosztPrzejazdu(double dlugoscTrasy, double cenaPaliwa){
        return (obliczSpalanie(dlugoscTrasy)*cenaPaliwa);
    }

    public void WypiszInfo(){
        System.out.println("Marka: "+marka);
        System.out.println("Model: "+model);
        System.out.println("Ilosc drzwi: "+iloscDrzwi);
        System.out.println("Pojemnosc silnika: "+pojemnoscSilnika);
        System.out.println("Srednie spalanie: "+srednieSpalanie);
    }

    public void wypisziloscSamochodow(){
        System.out.println("Ilosc samochodow: "+iloscSamochodow);
    }
}
