package com.company;
public class Styczne {
//metoda Newtona Raphsona
    public static void main(String... args) {
        new Styczne().wynikZZadanaLiczbaIteracji(1.75,  1000);
        }

        private int iteracja = 1;

        private double funkcja(double x) {
            return Math.pow(x, 3)+4*Math.pow(x, 2) - 10;
        }

        private double pochodna(double x) {
            return 3*Math.pow(x, 2)+8*x;
        }

        private void wynikZZadanaLiczbaIteracji(double x, int steps) {
            double obecnyWynik = x;
            for (int i = 0; i < steps; i++) {
                System.out.println("Iteracja"+i);
                obecnyWynik = obecnyWynik - (funkcja(obecnyWynik)/ pochodna(obecnyWynik));
                System.out.println("X  "+obecnyWynik);
            }
        }

        private void wynikZDokladnoscia(double x, double dokladnosc, int iteracja) {
            double obecnyWynik = x - (funkcja(x) / pochodna(x));
            System.out.println("Iteracja " + iteracja);
            System.out.println((obecnyWynik));
            double obecnaDokladnosc = Math.abs(x - obecnyWynik);
            if (dokladnosc < obecnaDokladnosc) {

                wynikZDokladnoscia(obecnyWynik, dokladnosc, ++iteracja);

            }
        }
    }
