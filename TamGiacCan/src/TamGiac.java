/**
 * Created by NguyenVanQuan on 7/19/2017.
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class TamGiac {
    public static void main(String[] args) {
        double num;
        String numStr;
        numStr = JOptionPane.showInputDialog("Nhap so hang:");
        num=Double.parseDouble(numStr);
        for (int hang = 1; hang <= num; hang++) {
            for (int cot = 1; cot <= num - hang; cot++) {
                System.out.print("  ");
            }
            for (int c = 1; c <= 2 * hang - 1; c++) {
                System.out.print(" " + c);
            }
            System.out.println();
        }
    }
}
