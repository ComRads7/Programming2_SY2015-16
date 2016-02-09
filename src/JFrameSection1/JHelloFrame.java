package JFrameSection1;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JHelloFrame extends JFrame implements ActionListener
{
    JLabel question = new JLabel("What is your name?");
    JTextField answer = new JTextField(10);
    JButton pressMe = new JButton("Press Me");
    JLabel greeting = new JLabel("");
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    
    public JHelloFrame()
    {
       super("Hello Frame");
       setSize(175,225);
       setLayout(new FlowLayout());
       question.setFont(bigFont);
       greeting.setFont(bigFont);
       add(question);
       add(answer);
       add(pressMe);
       add(greeting);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
       pressMe.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String name = answer.getText();
        String greet = "Hello, " + name;
        greeting.setText(greet);
    }
    
   
}