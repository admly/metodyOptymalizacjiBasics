package com.company;

import static java.lang.Math.sin;

public class Bisekcja {
    public static void main(String[] args ) {
        new Bisekcja(0.000001).obliczX(1, 2);

    }
    private double dokladnosc;
   public Bisekcja(double dokladnosc) {
     this.dokladnosc = dokladnosc;
    }

   private void obliczX(double lewyKraniec, double prawyKraniec) {
        double x = bisekcjaPrzedzial(lewyKraniec,prawyKraniec);
        double step = Math.abs(lewyKraniec - x);

        if (step < dokladnosc) {
            System.out.println("Result: "+x);
            return;
        }
        if(funkcja(x)* funkcja(lewyKraniec) < 0) {
            obliczX(lewyKraniec, x);
        } else {
            obliczX(x, prawyKraniec);
        }

    }
    private double bisekcjaPrzedzial(double x1, double x2) {
        return (x1+x2)/2;
    }


    private double funkcja(double x) {
        return Math.pow(x,3)*(x+sin(Math.pow(x, 2)-1)-1)-1;

    }


}
