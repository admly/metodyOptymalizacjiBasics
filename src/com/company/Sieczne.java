package com.company;

public class Sieczne {
    private double acc;
    private double x;
    private double y;
    private double diff;

    public Sieczne(double acc, double x, double y) {
        this.acc = acc;
        this.x = x;
        this.y = y;
    }

    private void findResult(){
        int i = 0;
        if (funkcja(x)* funkcja(y)>0) {
            System.out.println("Bad start points, exit");
            System.exit(1);
        } else {
            System.out.println("For x1 val: "+ funkcja(x)+" for x2 val: "+ funkcja(y));
        }
        do {
            System.out.println("Iteration no "+i);
            System.out.println("x1 = "+x+ " x2 = "+y);
            double next = y - ((funkcja(y) * (y-x)) / (funkcja(y) - funkcja(x)));
            diff = Math.abs(funkcja(next));
            this.x = y;
            this.y = next;
            i++;
        } while(diff > acc);
        System.out.println("Found at x =" + y + " - val is "+ funkcja(y));
    }

    private double funkcja(double x) {
        return Math.pow(x, 3)+4*Math.pow(x, 2) - 10;
    }

    public static void main (String... args) {
        new Sieczne(0.001,-1d, 3d).findResult();
    }
}
