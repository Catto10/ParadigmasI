package Graphicalinterfaces.CheckboxFrame;

// Fig.12.18 TestCheckBox.java
// Test for CheckboxFrame
import  javax.swing.JFrame;
public class TestCheckBox {
    public static void main(String[] args) {
        CheckboxFrame checkboxFrame = new CheckboxFrame();
        checkboxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkboxFrame.setSize(600,100);
        checkboxFrame.setVisible(true);
    }
}