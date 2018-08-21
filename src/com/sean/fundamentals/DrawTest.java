//package com.sean.fundamentals;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class DrawTest {
    public static void main(String[] args){
        /**
         *         StdDraw.setPenColor(StdDraw.GRAY);
         *         StdDraw.setPenRadius(0.005);
         *         StdDraw.setXscale(-10,10);
         *         StdDraw.setYscale(-10,10);
         *         StdDraw.circle(0,0,2);
         *         StdDraw.square(0,0,2);
         *         StdDraw.circle(0,0,Math.sqrt(8));
         *         StdDraw.line(-10,-10,10,10);
         *         StdDraw.line(-10,10,10,-10);
         *         StdDraw.point(5,6);
         *         StdDraw.show();
         *         StdDraw.clear();
         */


        /**
        //function
        int N=100;
        StdDraw.setXscale(0,N);
        StdDraw.setYscale(0,N*N);
        StdDraw.setPenRadius(0.01);
        for(int i=0;i<=N;i++){
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i,i*Math.log(i));
        }
         */

        /**
        //Random Array
        int N=100;
        double[] a=new double[N];
        for(int i=0;i<N;i++)
            a[i]= StdRandom.random();
        for (int i=0;i<N;i++){
            double x=1.0*i/N;
            double y=a[i]/2.0;
            double rw=0.5/N;
            double rh=a[i]/2.0;
            StdDraw.filledRectangle(x,y,rw,rh);
        }
        */

        //sorted Array
        int N=100;
        double[] a=new double[N];
        for(int i=0;i<N;i++)
            a[i]= StdRandom.random();
        Arrays.sort(a);
        for (int i=0;i<N;i++){
            double x=1.0*i/N;
            double y=a[i]/2.0;
            double rw=0.5/N;
            double rh=a[i]/2.0;
            StdDraw.filledRectangle(x,y,rw,rh);
        }

    }
}
