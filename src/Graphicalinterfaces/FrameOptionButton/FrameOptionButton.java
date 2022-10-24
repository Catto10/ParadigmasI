package Graphicalinterfaces.FrameOptionButton;

//Fig.12.19: FrameOptionButton.java
//// Creating radio buttons, using ButtonGroup and JRadioButton
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class FrameOptionButton extends JFrame {
    private final JTextField TextField;//is used to display changes in the font

    private final Font simpleTypeface;//font for simple text
    private final Font boldTypeface;//font for bold text
    private final Font italicTypeface;//font for italic text
    private final Font boldItalicTypeface;//bold and italic italic font

    private final JRadioButton simpleJRadioButton;//select simple text
    private final JRadioButton boldJRadioButton;//select bold text
    private final JRadioButton ItalicJRadioButton;//select italic text
    private final JRadioButton boldItalicJRadioButton; //bold and italics
    private  ButtonGroup groupOptions;//contains the option buttons

    //FrameOptionButton constructor adds JRadioButton objects to JFrame
    public FrameOptionButton(){
        super("RadioButton Test");
        setLayout(new FlowLayout());

        TextField = new JTextField("Notice the change in the style of the type of letter",28);
        add(TextField);//adds Textfield to JFrame

        //create radio buttons
        simpleJRadioButton = new JRadioButton("Simple",true);
        boldJRadioButton = new JRadioButton("Bold",false);
        ItalicJRadioButton = new JRadioButton("Italics",false);
        boldItalicJRadioButton = new JRadioButton("Bold/Italics",false);
        add(simpleJRadioButton);//adds simple button to JFrame
        add(boldJRadioButton);//adds bold button to JFrame
        add(ItalicJRadioButton);//adds italic button to JFrame
        add(boldItalicJRadioButton);//adds bold and italic button

        //creates a logical relationship between the JRadioButton object
        groupOptions = new ButtonGroup();//create ButtonGroup
        groupOptions.add(simpleJRadioButton);//create ButtonGroup
        groupOptions.add(boldJRadioButton);//adds bold to the group
        groupOptions.add(ItalicJRadioButton);//adds italics to the group
        groupOptions.add(boldItalicJRadioButton);//adds bold and italics

        //creates font objects
        simpleTypeface = new Font("Serif",Font.PLAIN,14);
        boldTypeface = new Font("Serif",Font.BOLD,14);
        italicTypeface = new Font("Serif",Font.ITALIC,14);
        boldItalicTypeface = new Font("Serif",Font.BOLD+Font.ITALIC,14);
        TextField.setFont(simpleTypeface);

        //logs events for JRadioButton objects
        simpleJRadioButton.addItemListener(
                new OptionButtonHandle(simpleTypeface));
        boldJRadioButton.addItemListener(
                new OptionButtonHandle(boldTypeface));
        ItalicJRadioButton.addItemListener(
                new OptionButtonHandle(italicTypeface));
        boldItalicJRadioButton.addItemListener(
                new OptionButtonHandle(boldItalicTypeface));
    }
    //private internal class to handle option button events
    private class OptionButtonHandle implements ItemListener{
        private Font typeface;//font associated with this listening component
        public OptionButtonHandle(Font f){
            typeface =f;
        }
        //handles option button events
        @Override
        public void itemStateChanged(ItemEvent event){
            TextField.setFont(typeface);
        }
    }

}
