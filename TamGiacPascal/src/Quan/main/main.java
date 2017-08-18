package Quan.main;

import javax.swing.*;

/**
 * Created by NguyenVanQuan on 7/29/2017.
 */
public class main {
    public static void main(String[] args){
        int hang, cot, soHang;
        int a[][] = new int[10][10];
        do{
            String sohangStr = JOptionPane.showInputDialog("Nhap so hang:");
            soHang = Integer.parseInt(sohangStr);
        }
        while (soHang>10);
        System.out.println("==========TamGiacPascal "+soHang+" ==========");
        for (hang=0; hang<soHang; hang++){
            for(cot=0; cot<=hang; cot++){
                if (hang==cot || cot == 0){
                    a[hang][cot] = 1;
                    System.out.print(a[hang][cot]+" ");
                }
                else {
                    a[hang][cot] = a[hang-1][cot-1]+a[hang-1][cot];
                    System.out.print(a[hang][cot]+" ");
                }
            }
            System.out.println("\n");
        }
    }
}
