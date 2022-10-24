package Graphicalinterfaces.CheckboxFrame;

//Fig. 12.17: CheckboxFrame.java
//JcheckBox buttons and element events.

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckboxFrame extends JFrame {
    private JTextField TextField;//Displays text in changing types
    private JCheckBox BoldJCheckBox;//to select/deselect bold
    private JCheckBox ItalicsJCheckBox;//to select/deselect italics

    //MarcoCasillaVerification constructor adds JCheckBox objects to JFrame
    public CheckboxFrame() {
        super("JCheckBox Test");
        setLayout(new FlowLayout());

        //sets JTextField and its font
        TextField = new JTextField("Notice how the type style changes of letter", 25);
        TextField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(TextField);//adds Textfield to JFrame

        BoldJCheckBox = new JCheckBox("Bold");
        ItalicsJCheckBox = new JCheckBox("Italics");
        add(BoldJCheckBox);//adds "bold" checkbox to JFrame
        add(ItalicsJCheckBox);//adds "italics" checkbox to JFrame.

        //registers listener components for JCheckBox objects
        HadlerCheckBox Hadler = new HadlerCheckBox();
        BoldJCheckBox.addItemListener(Hadler);
        ItalicsJCheckBox.addItemListener(Hadler);
    }

    //private internal class for handling ItemListener events
    private class HadlerCheckBox implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent event) {
            Font TypeFace = null; //stores the new Font object
            //determines which CheckBox objects are selected
            //and creates the font object
            if (BoldJCheckBox.isSelected() && ItalicsJCheckBox.isSelected())
                TypeFace = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if (BoldJCheckBox.isSelected())
                TypeFace = new Font("Serif", Font.BOLD, 14);
            else if (ItalicsJCheckBox.isSelected())
                TypeFace = new Font("Serif", Font.ITALIC, 14);
            else
                TypeFace = new Font("Serif", Font.PLAIN, 14);

            TextField.setFont(TypeFace);

        }
    }

}
