package com.company;

public class Calki {
    //dla n=1
    public static void main(String[] args){
        //metoda trapezów
            Calki calki = new Calki();
//            System.out.println(calki.calkaPrzyblizenieTrapezowe(0, Math.PI/2));
//            System.out.println(calki.metodaSimpsona(0,Math.PI/2));
//            System.out.println(calki.metodaBezNazwy(0, Math.PI/2));
//        System.out.println(calki.przyblizenieFunkcjiLamanej(0,Math.PI/2));


    }
    public double wartoscWPunkcie(double a){
        return Math.cos(a);
    }

    public double calkaPrzyblizenieTrapezowe(double a, double b){
        return 0.5*(b-a)*wartoscWPunkcie(a) + wartoscWPunkcie(b);
    }
    public double metodaSimpsona(double a, double b){
        double alfa1 =1/3d;
        double alfa2 = 4/3d;
        double alfa3 = 1/3d;

        return ((b-a)/2)*(alfa1*Math.cos(a)+alfa2*Math.cos((b+a)/2)+alfa3*Math.cos(b));
    }
    public double metodaBezNazwy(double a, double b){
        double[] tab = new double[]{19/288d, 75/288d, 50/288d, 50/288d, 75/288d, 19/288d};
        double[] punkty = new double[6];
        for(int i = 0; i<6; i++){
            double step = (b-a)/5d;
            punkty[i] = a + step*i;
        }
        double wynik=0d;
        for(int i=0; i<punkty.length;i++){
            wynik += wartoscWPunkcie(punkty[i])*tab[i];
        }
        return (b-a)*wynik;
    }

    public double przyblizenieFunkcjiLamanej(double a, double b){
        double[] punkty = new double[300];

        for(int i = 0; i<punkty.length; i++){
            double step = (b-a)/300d;
            punkty[i] = a + step*i;
        }
        double wynik=0d;
        for(int i=0; i<punkty.length-1;i++){
            System.out.println(wynik);
            wynik += metodaSimpsona(punkty[i], punkty[i+1]);
        }
        return wynik;
    }
//    public double przyblizenieFLamanejDlaSimpsona(double a, double b){
//        double[] punkty = new double[300];
//        double step = (b-a)/300d;
//        for(int i = 0; i<punkty.length; i++){
//            punkty[i] = a + step*i;
//        }
//        double wynik=0d;
//        for(int i=0; i<punkty.length-1;i++){
//
//        }
//        return wynik;
//    }

}
