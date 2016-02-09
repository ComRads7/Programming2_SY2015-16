package JFrameSection2;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HardCodedExtendsJFrame extends JFrame
{
    public HardCodedExtendsJFrame()
    {
        super("Rado Frame");
        setSize(500, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Adding components
        setLayout(new FlowLayout());
        JLabel firstLabel = new JLabel("Welcome to Programming 2 GUI Building");
        add(firstLabel);
        JLabel secondLabel = new JLabel("Ang Mo-antos Ma Santos!");
        add(secondLabel);
        JTextField tf = new JTextField(25);
        add(tf);
        JButton b = new JButton("Login");
        add(b);
        tf.setToolTipText("Enter your password");
    }
}