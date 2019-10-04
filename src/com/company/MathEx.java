package com.company;

public class MathEx {
    public static void main(String[] args) {
        swap(123);
        timeleft(1,34,8,20);
    }
    public static int swap(int x) {
        int y = x%10;
        int z = (x/10)%10;
        int a = x/100;
        int b = ((a*100)+(y*10)+(z));
        //System.out.print(a);
        //System.out.print(y);
        //System.out.print(z);
        //System.out.print(b);
        return b ;
    }
    public static int timeleft(int curHour, int curMin, int depHour, int depMin) {
         int leftHour = depHour - curHour;
         int leftMin = depMin - curMin;
         //System.out.print(leftHour);
         //System.out.print(leftMin);
         System.out.print(leftHour + " Hours and " + leftMin + " Minutes");
         return leftMin;

    }
    }
