
package requirements;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Requirementerstellen extends JFrame implements ActionListener{

	JButton requirements = new JButton("Test");
	JTextField anforderungen = new JTextField(20);
JButton speichern = new JButton("Speichern");
    public Requirementerstellen ()
   
    { super("Require4Testing");
    	setLayout(new BorderLayout());
        JPanel p=new JPanel();
 p.add(requirements);
 requirements.addActionListener(this);
 add(p,BorderLayout.CENTER);
        setVisible(true);
        setSize(200,200);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
dispose();
NeuesFenster klein = new NeuesFenster();
klein.setVisible(true);

anforderungen.selectAll();
anforderungen.setBounds(50, 50, 200, 30);
anforderungen.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String eingabe = anforderungen.getText();
	}
});
	}



  

    public static void main(String arg[]) {
    new Requirementerstellen();
    }
    class NeuesFenster extends JFrame {
        public NeuesFenster() {
            setTitle("Neues Fenster");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            JPanel j = new JPanel();
			getContentPane().add(j);
			j.add(anforderungen);
        }  
}
}

