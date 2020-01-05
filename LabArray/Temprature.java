/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labarray;
import java.util.Scanner;
/**
 *
 * @author cuong
 */
public class Temprature {
    public static void main(String[] args) {
        int numDays;
        int sum = 0;
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Nhap so ngay: ");
        numDays = inp.nextInt();
        int[] temp = new int[numDays];
        //Tinh Trung Binh
        for (int i=0;i<numDays;i++) {
            System.out.println("Temprature ngay thu "+(i+1)+": ");
            temp[i] = inp.nextInt();
            sum = sum + temp[i];
        }
        double TB= (double) sum / numDays;
        //So Sanh
        int above = 0;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]>TB){
                above++;
            }
        }
        System.out.println("");
        System.out.println("Temp TB: " +TB);
        System.out.println(above+" Cao hon Temp TB");
        
    }
}
