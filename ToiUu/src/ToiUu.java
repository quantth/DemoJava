import javax.swing.*;
import java.lang.String;

/**
 * Created by NguyenVanQuan on 7/20/2017.
 */
public class ToiUu {
    public static void main(String[] args) {
//        int SoKhachHang;
//        String sokhachhangStr;
//        sokhachhangStr = JOptionPane.showInputDialog("Nhap so khac hang:");
//        SoKhachHang = Integer.parseInt(sokhachhangStr);
//        String []s= new String[SoKhachHang];
//        for (int i=0; i<SoKhachHang; i++){
//        s[i] = JOptionPane.showInputDialog("Nhap ten khach hang thu "+ (i+1) +":" );
//        System.out.println(s);
//        s[i] = s[i].trim();
//        String []arr = s[i].split(" ");
//        String sToiUu="";
//        for ( String tu : arr )
//        {
//               if(tu.trim().length() != 0) {
//                   sToiUu += tu +" ";
//               }
//               sToiUu = sToiUu.trim();
//        }
//        System.out.println(sToiUu);

        int SoKhachHang;
        String sokhachhangStr;
        String tenkhachHang;
        sokhachhangStr = JOptionPane.showInputDialog("Nhap so khac hang:");

        SoKhachHang = Integer.parseInt(sokhachhangStr);
        for (int i = 0; i < SoKhachHang; i++) {
            tenkhachHang = JOptionPane.showInputDialog("Nhap ten khach hang thu " + (i + 1) + ":");
            tenkhachHang = tenkhachHang.replace("  "," ");
            System.out.println(tenkhachHang.replaceAll("  "," "));
        }
    }
}

