package com.company;

public class MathEx {
    public static void main(String[] args) {
        swap(123);
        timeleft(1,15,4,36);
    }
    public static int swap(int x) {
        int y = x%10;
        int z = (x/10)%10;
        int a = x/100;
        int b = ((a*100)+(y*10)+(z));
        //System.out.print(a);
        //System.out.print(y);
        //System.out.print(z);
        System.out.print(b);
        return b ;
    }
    public static int timeleft(int curHour, int curMin, int depHour, int depMin) {
         int a = depHour - curHour;
         int b = depMin - curMin;
         
         System.out.print(a);
         System.out.print(b);
         System.out.print(c);
         return c;
    }
    }
