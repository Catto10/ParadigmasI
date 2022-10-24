package Graphicalinterfaces.FrameworkList;

//Fig.12.24: TestList.java
// JList object showing a list of colors
import javax. swing. JFrame;

public class TestList {
    public static void main(String[] args) {
        FrameworkList frameworkList = new FrameworkList(); //create ListFrame object
        frameworkList. setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
        frameworkList. setSize(350,150);
        frameworkList. setVisible(true);
    }
}