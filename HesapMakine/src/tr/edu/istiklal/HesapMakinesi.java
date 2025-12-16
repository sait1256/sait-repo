package tr.edu.istiklal;

public class HesapMakinesi {

    private double sayi1;
    private double sayi2;

    public HesapMakinesi(double sayi1,double sayi2){
        this.sayi1=sayi1;
        this.sayi2=sayi2;
    }

    public double getSayi1() {
        return sayi1;
    }

    public double getSayi2() {
        return sayi2;
    }

    public double getTopla(){
        return sayi1+sayi2;
    }
    public double getCikar(){
        return sayi1-sayi2;
    }
    public double getCarp(){
        return sayi1*sayi2;
    }
    public double getBol(){
        return sayi1/sayi2;
    }









}
