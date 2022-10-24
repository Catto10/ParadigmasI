package Graphicalinterfaces.MultipleSelectionFrame;

//Fig.12.25 MultipleSelectionFramework.java
// JList framework allowing multiple selections

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFramework extends JFrame {
    private final JList<String> listJListColors; // List to store the names of the colors
    private final JList<String> listJListCopy; // list in which the names of the colors are to be copied the names of the colors

    private JButton buttonJButtonCopy; // button to copy the selected names
    private static final String[] namesColors = {"Black", "Blue", "Cyan",
            "Dark gray", "Gray", "Green", "Light grey",
            "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};

    // MultipleSelectionFramework Builder
    public MultipleSelectionFramework ()
    {
        super("Multiple Choice Lists");
        setLayout(new FlowLayout());
        listJListColors = new JList<String>(namesColors); // list of names of colors
        listJListColors.setVisibleRowCount(5); //shows five rows
        listJListColors.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(listJListColors));  // add list with scrolling panel scroll

        buttonJButtonCopy = new JButton("Copy >>>");
        buttonJButtonCopy.addActionListener(
                new ActionListener() // anonymous inner class
                {
                    // handles button event
                    @Override
                    public void actionPerformed(ActionEvent evento)
                    {
                        listJListCopy.setListData(listJListColors.getSelectedValuesList().toArray(new String[0]));
                    }
                }
        );
        add(buttonJButtonCopy); // add copy button to JFrame
        listJListCopy = new JList<String>(); // list to store names of copied colors
        listJListCopy.setVisibleRowCount(5); // list to store names of copied colors
        listJListCopy.setFixedCellWidth(100); // sets the width
        listJListCopy.setFixedCellHeight(15); // sets the height
        listJListCopy.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(listJListCopy)); // add list with scrolling panel scroll

    }
} // end of MultipleSelectionFramework class