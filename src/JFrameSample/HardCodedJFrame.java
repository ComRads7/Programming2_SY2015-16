package JFrameSample;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HardCodedJFrame
{
    public static void main(String[] args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame aFrame = new JFrame("My First Frame");
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel greeting = new JLabel("Hello People");
        JLabel greeting2 = new JLabel("Welcome to Programming "
                + "GUI Building");
        aFrame.setLayout(new FlowLayout());
        aFrame.add(greeting);
        aFrame.add(greeting2);
        Font greetingFontStyle = new Font("Arial", 
                Font.BOLD, 36);
        greeting.setFont(greetingFontStyle);
        greeting2.setFont(greetingFontStyle);
        aFrame.setSize(500,250);
        aFrame.setVisible(true);
    }
}