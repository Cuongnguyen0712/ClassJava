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
public class Calculator {
    private static Scanner scanner = new Scanner(System.in);
            
    public static void main(String[] args) {
        int[] myIntergers = initArray(5);
       // In ra cac gia tri trong myInterger
        for (int i = 0; i < myIntergers.length; i++) {
            System.out.println("Element "+i+" typed value was "+myIntergers[i]);
        }
        //Goi ham tinh trung binh
        System.out.println("Average is "+ getAverage(myIntergers));
        //Goi ham tinh max
        System.out.println("Max is "+getMax(myIntergers));
        //Goi ham tinh min
        System.out.println("Min is "+getMin(myIntergers));
    }
    /** 
     * Khoi tao mang
     * @param size Kich co cua mang
     * @return Danh sach mang gia tri
     */
    public static int[] initArray(int size) {
        int[] values = new int[size];
        System.out.println("Enter "+size+" interger values.");
        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    /**
     * Tinh gia tri trung binh
     * @param array Mang can tinh gai tri
     * @return Gia tri trung binh
     */
    public static double getAverage(int[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];                  
        }
        return (double)sum/(double)array.length;
    }
    /** 
     * Tinh gia tri max
     * @param array Mang can tinh gia tri
     * @return Gia tri max
     */
    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }     
        }
        return max;
    } 
    /** 
     * Tinh gia tri min
     * @param array Mang can tinh gia tri
     * @return Gia tri min
     */
    public static int getMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }     
        }
        return min;
    } 
}
