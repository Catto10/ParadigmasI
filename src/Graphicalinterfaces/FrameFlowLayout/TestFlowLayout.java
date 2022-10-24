package Graphicalinterfaces.FrameFlowLayout;

import javax.swing.JFrame;

public class TestFlowLayout {
    public static void main(String[] args) {
        FrameFlowLayout frameFlowLayout = new FrameFlowLayout();
        frameFlowLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameFlowLayout.setSize(300, 75);
        frameFlowLayout.setVisible(true);
    }
}