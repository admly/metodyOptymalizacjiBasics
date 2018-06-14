package com.company;

public class Lagrange {
   public static void main(String[] args) {
        Lagrange interpolacja = new Lagrange();
    }

    Lagrange(){
        double xArray[] = new double[100];
        double yArray[] = new double[100];

        for (int i = 0; i <100 ; i++) {
            xArray[i] = 1.0+ i*0.1;
            yArray[i] = Math.cos(xArray[i]);
        }
        System.out.println(Math.cos(1.05));
        System.out.println(wynik(xArray, yArray, 1.05, 3));

    }

    private double wynik(double[] xs, double ys[], double x_val, int factor) {
        double wynik = 0.0;
        for (int c = 0 ; c < factor ; c ++) {
            double fragmentWyniku = 1.0;
            for (int x = 0 ; x < factor ; x ++) {
                if(x != c) {
                    fragmentWyniku = fragmentWyniku * (x_val - xs[x]) / (xs[c] - xs[x]);
                }
            }

            fragmentWyniku = fragmentWyniku * ys[c];
            wynik += fragmentWyniku;
        }
        return wynik;
    }
}
