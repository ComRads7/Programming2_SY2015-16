package JFrameSection1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HardCodedJFrame
{
    public static void main(String[] args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame aFrame = new JFrame("Login");
        aFrame.setSize(450,250);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        aFrame.setLayout(new FlowLayout());
        
        JPanel myPanel = new JPanel();
        myPanel.setBackground(Color.green);
        
        aFrame.add(myPanel);
        myPanel.setLayout(new GridLayout(2,2));
        JLabel greeting = new JLabel("Welcome to Programming "
                + "GUI Building");
        myPanel.add(greeting);
        
        JLabel greeting2 = new JLabel("Ang Mo-antos Ma Santos!");
        myPanel.add(greeting2);
        
        Font myFontStyle = new Font("Arial", Font.BOLD, 16);
        greeting.setFont(myFontStyle);
        greeting.setForeground(Color.blue);
        
        greeting2.setFont(myFontStyle);
        JTextField tf = new JTextField(25);
        myPanel.add(tf);
        JButton b = new JButton("Login");
        myPanel.add(b);
        tf.setToolTipText("Enter your password here");
    }
}