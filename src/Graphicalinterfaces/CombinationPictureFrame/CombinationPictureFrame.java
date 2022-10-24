package Graphicalinterfaces.CombinationPictureFrame;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class CombinationPictureFrame extends JFrame {
    private final JComboBox<String> picturesJComboBox; //Contains the names of the icons
    private final JLabel label; //Displays the selected icon

    private static final String names[]={
            "Insect0.gif","Insect2.gif","Insect3.gif","Insect4.gif"};
    private final Icon[] icons = {
            new ImageIcon(getClass().getResource(names[0])),
            new ImageIcon(getClass().getResource(names[1])),
            new ImageIcon(getClass().getResource(names[2])),
            new ImageIcon(getClass().getResource(names[3]))};

    //The FrameCombined Frame constructor adds a JComboBox object to JFrame
    public CombinationPictureFrame (){
        super("JComboBox Test");
        setLayout(new FlowLayout());// sets the framework schema

        picturesJComboBox = new JComboBox<String>(names);// sets JComboBox
        picturesJComboBox.setMaximumRowCount(3);//shows three rows

        picturesJComboBox.addItemListener(
                new ItemListener() {
                    // handles JComboBox event
                    @Override
                    public void itemStateChanged(ItemEvent event) {
                        // determines if the element is selected
                        if(event.getStateChange() == ItemEvent.SELECTED)
                            label.setIcon(icons[
                                    picturesJComboBox.getSelectedIndex()]);
                    }
                } // end of anonymous inner class
        ); // end of the call to addItemListener
        add(picturesJComboBox); //adds combo box to JFrame
        label = new JLabel(icons[0]);// displays the first icon
        add(label);// adds tag to JFrame
    }
}// end of the Frame classCombined Frame
