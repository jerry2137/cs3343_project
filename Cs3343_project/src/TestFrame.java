import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class TestFrame extends JFrame implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JButton start;
 
    // constructor, to initialize the components
    // with default values.
    public TestFrame() {
        setTitle("Welcome Page");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
 
        c = getContentPane();
        c.setLayout(null);
 
        title = new JLabel("Welcome");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
 
        start = new JButton("Start");
        start.setFont(new Font("Arial", Font.PLAIN, 15));
        start.setSize(100, 20);
        start.setLocation(270, 450);
        start.addActionListener(this);
        c.add(start); 
        
        setVisible(true);
    }
 
    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    @Override
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == start) {
    		SelectionFrame f = new SelectionFrame();
            this.dispose();
        }
    }
}
