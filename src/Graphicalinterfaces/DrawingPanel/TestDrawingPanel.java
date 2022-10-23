package Graphicalinterfaces.DrawingPanel;

// Paiter


import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestDrawingPanel {
    public static void main(String[] args)
    {
        JFrame aplicacion = new JFrame("A simple drawing program");
        DrawingPanel panelDibujo = new DrawingPanel();
        aplicacion.add(panelDibujo, BorderLayout.CENTER);

        aplicacion.add(new JLabel("Drag the mouse to draw"),
                BorderLayout.SOUTH);

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(400, 200);
        aplicacion.setVisible(true);
    }
}