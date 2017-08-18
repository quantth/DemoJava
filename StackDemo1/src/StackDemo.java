import javax.swing.*;
import java.util.Stack;
/**
 * Created by NguyenVanQuan on 8/3/2017.
 */
public class StackDemo{
    static void showpush(Stack st, int a){
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("Stack: "+st);
    }
    static void showpop(Stack st){
        System.out.print("pop->");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("Stack: "+st);
    }
    public static void main(String[] args){
        int i, soPhanTu;
        Stack st = new Stack();
        System.out.println("Stack: "+st);
        String soPhanTuStr = JOptionPane.showInputDialog("Enter ");
        soPhanTu = Integer.parseInt(soPhanTuStr);
        for (i = 0 ; i<soPhanTu ; i++){
        String addStr = JOptionPane.showInputDialog("Add number "+(i+1)+":");
        int add = Integer.parseInt(addStr);
        showpush(st,add);
        }
        showpop(st);
        try{
            showpop(st);
        }
        catch (Exception ex){
            System.out.println("Empty stack!");
        }
    }

}


