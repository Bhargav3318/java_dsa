package com.company;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        System.out.println("Enter the year : ");
        Scanner in = new Scanner(System.in);
        int year =in.nextInt();
        /*

        if year%4=0 {
            if year %100 == 0 and year %  400 !=0
                 not a leap year
              else
                leap year
            }
        else
            not a leap year
         */
        if(year%4==0){
            if (year%100 == 0 && year % 400 != 0){
                System.out.println("not a leap year");
            }
            else
                System.out.println("Leap year");
        }
        else
            System.out.println("not a leap year");
    }
}
