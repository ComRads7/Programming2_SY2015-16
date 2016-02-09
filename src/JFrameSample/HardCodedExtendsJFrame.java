package JFrameSample;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HardCodedExtendsJFrame extends JFrame 
{
    final int WIDTH = 200;
    final int HEIGHT = 120;
    public HardCodedExtendsJFrame()
    {
        super("My Frame");
        setSize(WIDTH,HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JLabel message = new JLabel("This frame has many components.");
        add(message);
        JTextField tf = new JTextField(25);
        add(tf);
        JButton b = new JButton("Click here");
        add(b);
        b.setToolTipText("Left click this button");
    }
}