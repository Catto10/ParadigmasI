package Graphicalinterfaces.TrackerFrameButton;

//Fig.12.26 TestMultipleSelection.java
// Test for MultipleSelectionFramework

import javax.swing.JFrame;

public class TestMultipleSelection {
    public static  void main(String[]args){
        MultipleSelectionFramework multipleSelectionFramework = new MultipleSelectionFramework();
        multipleSelectionFramework.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        multipleSelectionFramework.setSize(350,140);
        multipleSelectionFramework.setVisible(true);
    }
}
