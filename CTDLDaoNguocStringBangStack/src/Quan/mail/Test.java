package Quan.mail;

import Quan.model.StringReverserThroughStack;

import javax.swing.*;
import java.io.IOException;

/**
 * Created by NguyenVanQuan on 8/15/2017.
 */
public class Test {
    public static void main(String[] args)
        throws IOException {
        String input = JOptionPane.showInputDialog("Enter your String");
        System.out.println(input);
        String output;
        StringReverserThroughStack theReverser = new StringReverserThroughStack(input);
        output = theReverser.doRevision();
        System.out.println("Reverser: " + output);
    }
}
