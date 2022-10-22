package Graphicalinterfaces.InputAndOutput;

//Fig. 12.2 Sum.java
//  Sum program using JOptionPane for input and output
import javax.swing.*;

public class Sum {
    public static void main(String[] args) {
        //Gets user input from JOptionPane input dialogs
        String FirstNumber= JOptionPane.showInputDialog("Enter the first integer");

        String SecondNumber=JOptionPane.showInputDialog("Enter the second value");

        //Converts String entries to int values for use in calculation
        int Number1 =Integer.parseInt(FirstNumber);
        int Number2 =Integer.parseInt(SecondNumber);

        int suma =Number1+ Number2;
        //Displays the results in the JOptionPane message dialog
        JOptionPane.showMessageDialog(null, "The sum is: "+ suma, "Sum of two integers"
                , JOptionPane.PLAIN_MESSAGE);
    }
}//end of the Sum