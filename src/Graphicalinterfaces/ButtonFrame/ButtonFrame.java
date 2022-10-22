package Graphicalinterfaces.ButtonFrame;

// Fig. 12.15: ButtonFrame.java
// Command buttons and action events

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame{
    private final JButton buttonJButtonSimple; // Button with text only
    private final JButton buttonJButtonElegant; // Button with icons

    //ButtonFrame adds JButton objects to JFrame
    public ButtonFrame (){
        super("Button test");
        setLayout(new FlowLayout());

        buttonJButtonSimple = new JButton("Simple Button"); // button with text
        add(buttonJButtonSimple); // add buttonJButtonSimple a JFrame


        Icon insect1= new ImageIcon(getClass().getResource("insect1.gif"));
        Icon insect2= new ImageIcon(getClass().getResource("insect2.gif"));
        buttonJButtonElegant = new JButton("Elegant button", insect1);//Set the image

        buttonJButtonElegant.setRolloverIcon(insect2);//Set the replacement image
        add(buttonJButtonElegant);//adds buttonJButtonElegant to JFrame

        // create new ButtonHand handler to handle button events
        ButtonHandle Handle = new ButtonHandle();
        buttonJButtonElegant.addActionListener(Handle);
        buttonJButtonSimple.addActionListener(Handle);
    }
    // internal class for handling button events
    private class ButtonHandle implements  ActionListener{
        // handles button event
        @Override
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(ButtonFrame.this,String.format("Your printed: %s", event.getActionCommand()));
        }
    }

}// fin de la clase MarcoBoton