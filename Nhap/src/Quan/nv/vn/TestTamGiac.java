package Quan.nv.vn;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Created by NguyenVanQuan on 7/21/2017.
 */
public class TestTamGiac {
    public static void main (String[] args){
        int a, b, c;
        String cachStr;
        cachStr = JOptionPane.showInputDialog("Nhap canh a");
        a= Integer.parseInt(cachStr);
        cachStr = JOptionPane.showInputDialog("Nhap canh b");
        b= Integer.parseInt(cachStr);
        cachStr = JOptionPane.showInputDialog("Nhap canh c");
        c= Integer.parseInt(cachStr);
        TamGiac tamGiac = new TamGiac(a, b, c);
        //DecimalFormat dcf = new DecimalFormat("#.##");
        System.out.println((tamGiac));



    }
}
