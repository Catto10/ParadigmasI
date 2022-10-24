package Graphicalinterfaces.LabelFrame;

// Fig. 12.6: LabelFrame.java
// Jlabel components with text and icons.
import java.awt.FlowLayout; // specifies how the components are to be ordered
import javax.swing.JFrame; // provides the basic characteristics of a window
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // load images

public class LabelFrame extends JFrame {
    private JLabel label1;//JLabel text only
    private JLabel label2;//JLabel built with tecto and an icon
    private JLabel label3; //JLabel with addictive text and icon

    // The LabelFrame constructor adds JLabel objects to JFrame
    public LabelFrame() {
        super("TestLabel");
        setLayout(new FlowLayout()); // establishes the framework outline
        //JLabel constructor with String argument
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1);// add label1 to JFrame

        //Jlabel constructor with string, icon, and alignment arguments
        Icon Insect = new ImageIcon(getClass().getResource("Insect.jpg"));
        label2 = new JLabel("Label with text and icon", Insect, SwingConstants.LEFT);
        label2.setToolTipText("This is the label2");
        add(label2);// add label2 to JFrame

        label3 = new JLabel(); // JLabel constructor without arguments
        label3.setText("Label with icon and text at the bottom");
        label3.setIcon(Insect); // add icon to JLabel
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3); // add label3 to JFrame

    }

} // end of LabelFrame class.