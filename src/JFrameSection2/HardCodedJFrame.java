package JFrameSection2;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HardCodedJFrame
{
    public static void main(String[] args)
    {
        //JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame aFrame = new JFrame("My First Frame");
        aFrame.setSize(300,100);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel greeting = new JLabel("Good Day!");
        JLabel greeting2 = new JLabel("My Friend!");
        JTextField tf = new JTextField(20);
        JButton button = new JButton("Click Me");
        aFrame.add(greeting);
        aFrame.add(greeting2);
        aFrame.add(tf);
        aFrame.add(button);
        Font myFontStyle = new Font("Impact", Font.ITALIC, 18);
        greeting.setFont(myFontStyle);
        
        GridLayout gl = new GridLayout(2,1);
        aFrame.setLayout(gl);
        
        
    }
}