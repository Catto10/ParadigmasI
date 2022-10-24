package Graphicalinterfaces.FrameBorderLayout;

import javax.swing.JFrame;

public class TestBorderLayout {
    public static void main(String[] args) {
        FrameBorderLayout frameBorderLayout = new FrameBorderLayout();
        frameBorderLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameBorderLayout.setSize(400, 200);
        frameBorderLayout.setVisible(true);
    }
} // end of DemoBorderLayout class