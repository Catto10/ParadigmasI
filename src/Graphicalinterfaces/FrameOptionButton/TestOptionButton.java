package Graphicalinterfaces.FrameOptionButton;

//Fig.12.20: TestOptionButton.java
// Test of FrameOptionButton
import javax.swing.JFrame;

public class TestOptionButton {
    public static void main(String[] args) {
        FrameOptionButton frameOptionButton = new FrameOptionButton();
        frameOptionButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameOptionButton.setSize(700,100);
        frameOptionButton.setVisible(true);
    }
}