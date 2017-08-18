package Quan.model;

import java.util.Stack;

/**
 * Created by NguyenVanQuan on 8/15/2017.
 */
public class StringReverserThroughStack {
    private String input;
    private String output;
    public StringReverserThroughStack(String in){
        input = in;
    }
    public String doRevision(){
        int stackSize = input.length();
        Stack theStack = new Stack();
        for (int i=0 ; i<stackSize ; i++){
            char ch = input.charAt(i);
            theStack.push(ch);
        }
        output = "";
        while (!theStack.isEmpty()){
            char ch = (char) theStack.pop();
            output = output + ch;
        }
        return output;
    }
}