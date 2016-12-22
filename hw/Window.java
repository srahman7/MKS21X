import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import java.lang.*;

public class Window extends JFrame implements ActionListener{
    private Container pane;
    private JTextField j;
    private JLabel a;
    private JLabel c;
    private JTextField t;

    public Window() {
	this.setTitle("Temperature Conversions");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());
	JButton b = new JButton("Make F");
	b.addActionListener(this);
	b.setActionCommand("CtoF");
	JButton b2 = new JButton("Make C");
	b2.addActionListener(this);
	b2.setActionCommand("FtoC");
	t = new JTextField(10);
	j = new JTextField(10);
	a= new JLabel("Farenheit");
	c= new JLabel("Celsius");
	pane.add(a);
	pane.add(t);
	pane.add(b);
	pane.add(b2);
	pane.add(c);
	pane.add(j);
    }
    public static double FtoC(double t){
	return 5.0/9*(t-32);
    }
    
    public static double CtoF(double t){
	return 32 + 9.0/5*t;
    }
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("FtoC")){
	    String s = t.getText();
	    double num = Double.parseDouble(s);
	    //System.out.println(FtoC(s));
	    String ans="";
	    ans+=FtoC(num);
	    j.setText(ans);
	}
	if(event.equals("CtoF")){
	    String s = j.getText();
	    double num = Double.parseDouble(s);
	    String ans="";
	    ans+=CtoF(num);
	    t.setText(ans);
 
	}
    }
    public static void main(String[] args) {
        Window g = new Window();
        g.setVisible(true);
    }
}
