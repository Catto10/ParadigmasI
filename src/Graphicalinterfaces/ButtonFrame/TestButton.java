package Graphicalinterfaces.ButtonFrame;

import javax.swing.JFrame;
public class TestButton {
    public static void main(String[] args) {
        ButtonFrame buttonFrame = new ButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(600,400);
        buttonFrame.setVisible(true);
    }
}