package InterfazGrafica;

import javax.swing.JFrame;

public class TestFrameText {
    public static  void main(String[]args){
        FrameTextField frameTextField = new FrameTextField();
        frameTextField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameTextField.setSize(400,150);
        frameTextField.setVisible(true);
    }
}
