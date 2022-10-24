package Graphicalinterfaces.DemoKeyFrame;

import javax.swing.JFrame;
public class TestDemoKeys {
    public static void main(String[] args) {
        DemoKeyFrame marcoDemoTeclas = new DemoKeyFrame();
        marcoDemoTeclas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoDemoTeclas.setSize(450, 100);
        marcoDemoTeclas.setVisible(true);
    }
}