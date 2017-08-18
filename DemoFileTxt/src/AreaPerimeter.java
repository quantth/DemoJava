/**
 * Created by NguyenVanQuan on 7/19/2017.
 */
//import javax.swing.JOptionPane;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args)

   throws FileNotFoundException

    {
        Formatter AreaAndPerimeter = new Formatter(new File("AreaAndPerimeter.txt"));
        String receptionsStr, widthStr;
        double receptions, width, area, perimeter;

        receptionsStr = JOptionPane.showInputDialog("Enter the receptions of the rectangle:");
        receptions = Double.parseDouble(receptionsStr);

        widthStr = JOptionPane.showInputDialog("Enter the width of the rectangle:");
        width = Double.parseDouble(widthStr);

        area = receptions * width;
        perimeter = 2 * (receptions + width);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

        AreaAndPerimeter.format("Area = %s \n", area);
        AreaAndPerimeter.format("Perimeter = %s", perimeter);

        AreaAndPerimeter.close();
        System.out.println("Done =))");



    }
}
