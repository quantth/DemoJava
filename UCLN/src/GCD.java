import javax.swing.*;

/**
 * Created by NguyenVanQuan on 7/19/2017.
 */
public class GCD {
    public static void main(String[] args){
        double num1 , num2;
        String numStr;
        numStr = JOptionPane.showInputDialog("Enter number 1: ");
        num1 = Double.parseDouble(numStr);
        numStr = JOptionPane.showInputDialog("Enter number 2: ");
        num2 = Double.parseDouble(numStr);

        while (num1 != num2){
            if (num1 < num2){
                num2 = num2-num1;
            }
            else {
                num1 = num1 - num2;}
            }
                    System.out.println("Greatest common divisor is " + num2 );
        }
    }
}
