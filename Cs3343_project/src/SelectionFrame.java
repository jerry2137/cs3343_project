import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class SelectionFrame extends JFrame implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel option;
    private JRadioButton option1;
    private JRadioButton option2;
    private JRadioButton option3;
    private JRadioButton option4;
    private ButtonGroup optgp;
    private JButton sub;
    
    // constructor, to initialize the components
    // with default values.
    public SelectionFrame()
    {
        setTitle("Login Menu Page");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
 
        c = getContentPane();
        c.setLayout(null);
 
        title = new JLabel("Please select your option: ");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
        
        option = new JLabel("Gender");
        option.setFont(new Font("Arial", Font.PLAIN, 20));
        option.setSize(100, 20);
        option.setLocation(100, 200);
        c.add(option);
 
        option1 = new JRadioButton("Login");
        option1.setFont(new Font("Arial", Font.PLAIN, 15));
        option1.setSelected(true);
        option1.setSize(75, 20);
        option1.setLocation(200, 200);
        c.add(option1);
 
        option2 = new JRadioButton("Register Account");
        option2.setFont(new Font("Arial", Font.PLAIN, 15));
        option2.setSelected(false);
        option2.setSize(80, 20);
        option2.setLocation(200, 230);
        c.add(option2);
 
        option3 = new JRadioButton("Forget Password");
        option3.setFont(new Font("Arial", Font.PLAIN, 15));
        option3.setSelected(false);
        option3.setSize(80, 20);
        option3.setLocation(200, 260);
        c.add(option3);
 
        option4 = new JRadioButton("Exit");
        option4.setFont(new Font("Arial", Font.PLAIN, 15));
        option4.setSelected(false);
        option4.setSize(80, 20);
        option4.setLocation(200, 290);
        c.add(option4);
        
        optgp = new ButtonGroup();
        optgp.add(option1);
        optgp.add(option2);
        optgp.add(option3);
        optgp.add(option4);
 
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);
 
        setVisible(true);
    }
 
    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
    	if (e.getSource() == sub) {
    		if(option1.isSelected()) {
				//pressEnterToContinue();
				//loginServices();
    			System.out.println("1");
    		}
    		else if(option2.isSelected()) {
				//pressEnterToContinue();
				//registerServices();
    			System.out.println("2");
    		}
    		else if(option3.isSelected()) {
				//pressEnterToContinue();
				//forgetPwServices();
    			System.out.println("3");
	    	}
    		else if(option4.isSelected()) {
				//pressEnterToContinue();
				//exitServices();
    			System.out.println("4");
	    	}
    		else {
				System.out.println("Invaild input.");
				//pressEnterToContinue();
			}
           this.dispose();
        }
    }
}