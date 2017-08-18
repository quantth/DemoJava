public class GCD {
    public static void main(String[] args){
        double num1 , num2;
        String numStr;
        numStr = JOptionPane.showInputDialog("Enter number 1: ");
        num1 = Double.parseDouble(numStr);
        numStr = JOptionPane.showInputDialog("Enter number 2: ");
        num2 = Double.parseDouble(numStr);

        while (true){
            if (num1 < num2){
                num2 = num2-num1;
            }
            else if (num1 > num2) {
                num1 = num1 - num2;
 }
 else if(num1 == num2){
  break;
 }
            }
        System.out.println("Greatest common divisor is " + num2 );
        }
    }