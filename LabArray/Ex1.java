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
public class Ex1 {
    public static void main(String[] args) {
        int soSV;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap so SV: ");
        soSV = input.nextInt();
        int[] diemSV = new int[soSV];
        
        for (int i = 0; i < soSV; i++) {
            System.out.println("Diem SV thu "+(i+1)+": ");
            diemSV[i] = input.nextInt();
        }
        System.out.println("=====================");
        for (int i = 0; i < diemSV.length; i++) {
            if (diemSV[i]<40){
                    System.out.println("Sinh Vien Thu "+(i+1)+": Truot Mon");
                }
            if (diemSV[i]<75 && diemSV[i]>40) {
                    System.out.println("Sinh Vien Thu "+(i+1)+": Kha ");
                }
            if (diemSV[i]>=75) {
                    System.out.println("Sinh Vien Thu "+(i+1)+": Gioi ");
                }
        }
    }
}
