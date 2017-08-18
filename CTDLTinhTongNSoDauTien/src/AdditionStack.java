import javax.swing.*;
import java.io.IOException;

/**
 * Created by NguyenVanQuan on 8/14/2017.
 */
class Stack {
    private int maxSize;
    private int[] data; //mảng
    private int top;
    public Stack(int s){ //khởi tạo Stack
        maxSize = s;
        data = new int[maxSize];
        top = -1;
    }
    public void push(int p){
        data[++top] = p;
    }
    public int pop(){
        return data[top--];
    }
    public int peek(){
        return data[top];
    }
    public boolean isEmpty(){
        return (top ==-1);
    }
}
public class AdditionStack {
    static int num;
    static int ans;
    static Stack theStack;
    public static void main(String[] args)
        throws IOException{
        String numStr = JOptionPane.showInputDialog("Enter number: ");
        num = Integer.parseInt(numStr);
            stackAddtion(); //tạo sự kiện
            System.out.println("Sum = "+ans);

    }
   public static void stackAddtion() {
        theStack = new Stack(10000);
        ans = 0;
        while (num >0){
            theStack.push(num);
            --num;
        }
        while (!theStack.isEmpty()){
            int newN = theStack.pop();
            ans += newN;
        }
    }
}
