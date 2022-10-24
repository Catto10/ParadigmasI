package Graphicalinterfaces.LabelFrame;

// Fig. 12.7: PruebaLabel.java
// Test for LabelFrame
import javax.swing.JFrame;

public class TestLabel {
    public static void main(String[] args) {
        LabelFrame labelFrame = new LabelFrame();
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelFrame.setSize(750, 650);
        labelFrame.setVisible(true);
    }
}
