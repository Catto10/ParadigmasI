package Graphicalinterfaces.MouseTrackerFrame;

// Fig.12.28: MouseTrackerFrame.java
// mouse event handling
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTrackerFrame extends JFrame {
    private final JPanel panelRaton;
    private final JLabel barraEstado;

    public MouseTrackerFrame() {
        super("Demonstration of mouse events");

        panelRaton = new JPanel();
        panelRaton.setBackground(Color.WHITE);
        add(panelRaton, BorderLayout.CENTER);

        barraEstado = new JLabel("Mouse out of JPanel");
        add(barraEstado, BorderLayout.SOUTH);

        ManejadorRaton manejador = new ManejadorRaton() {
            @Override
            public void mousePressed(MouseEvent e) {

            }
        };
        panelRaton.addMouseListener(manejador);
        panelRaton.addMouseMotionListener(manejador);
    }

    private abstract class ManejadorRaton implements MouseListener,
            MouseMotionListener
    {
        @Override
        public void mouseClicked(MouseEvent evento) {
            barraEstado.setText(String.format("Clicked on [%d, %d]", evento.getX(), evento.getY()));
        }

        @Override
        public void mouseReleased(MouseEvent evento) {
            barraEstado.setText(String.format("Clicked on [%d, %d]", evento.getX(), evento.getY()));
        }

        @Override
        public void mouseEntered(MouseEvent evento) {
            barraEstado.setText(String.format("mouse entered[%d, %d]", evento.getX(), evento.getY()));
            panelRaton.setBackground(Color.GREEN);
        }

        @Override
        public void mouseExited(MouseEvent evento) {
            barraEstado.setText("Mouse out of JPanel");
            panelRaton.setBackground(Color.WHITE);
        }

        @Override
        public void mouseDragged(MouseEvent evento) {
            barraEstado.setText(String.format("crawled in [%d, %d]", evento.getX(), evento.getY()));
        }

        @Override
        public void mouseMoved(MouseEvent evento) {
            barraEstado.setText(String.format("moved in [%d, %d]", evento.getX(), evento.getY()));
        }
    }
}
