package Graphicalinterfaces.FrameTextField;

//Fig. 12.9: FrameTextMarco.java
// JTextField and JPasswordField components

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class FrameTextField extends JFrame {
    public static FrameTextField FrameTextField;
    private final JTextField TextField1; // text field with fixed size
    private final JTextField TextField2; // text field with text
    private final JTextField TextField3; // text field with text and size
    private final JPasswordField ContraseniaField; // password field with text

    // TextFieldFrame constructor adds JTextField objects to JFrame
    public FrameTextField () {
        super("JTextField and JPasswordField test");
        setLayout(new FlowLayout());

        //Construct text field with 10 columns
        TextField1 = new JTextField(10);
        add(TextField1); // add TextField1 a JFrame

        //construct text field cob default text
        TextField2 = new JTextField("Type the text here");
        add(TextField2); // add TextField2 a JFrame

        //construct texo field with default text and 21 columns
        TextField3 = new JTextField("Non-editable text field", 21);
        TextField3.setEditable(false);
        add(TextField3); // add TextField3 a JFrame

        //construct password field with default text
        ContraseniaField = new JPasswordField("Hidden text");
        add(ContraseniaField); // add ContraseniaField to JFrame

        //registers event handlers
        TextFieldHandler Handler = new TextFieldHandler();
        TextField1.addActionListener(Handler);
        TextField2.addActionListener(Handler);
        TextField3.addActionListener(Handler);
        ContraseniaField.addActionListener(Handler);
    }
    // private internal class for event management
    private class TextFieldHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String chain = "";
            //the user pressed enter on the JTextField object fieldText1
            if (event.getSource() == TextField1)
                chain = String.format("TextField1: %s",
                        event.getActionCommand());

                // the user pressed enter on the JTextField object text2 field
            else if (event.getSource() == TextField2)
                chain = String.format("TextField2: %s",
                        event.getActionCommand());

                // the user pressed enter on the jtextfield objecttext3 field
            else if (event.getSource() == TextField3)
                chain = String.format("TextField3: %s",
                        event.getActionCommand());

                // the user pressed enter on the jtextfield objectconsensine field
            else if (event.getSource() == ContraseniaField)
                chain = String.format("fieldCondress: %s",
                        event.getActionCommand());
            //displays the contents of the jtextfield object
            JOptionPane.showMessageDialog(null, chain);

        }
    } // end of the private inner class TextFieldHandler
} // end of class FrameTextField