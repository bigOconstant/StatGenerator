import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class SystemInformationDlg extends JDialog {
	
	private static final long serialVersionUID = 1390565679421583353L;

	final SystemInformationDlg SysWindow; 
	
	public SystemInformationDlg(String s){
		SysWindow = this;
		SysWindow.InfoDlg(s);
		SysWindow.setModal(true);
	}
	
	
	
	public void InfoDlg(String s){
		//super();
		SysWindow.setSize(500, 300);
		
	
		
		
		SysWindow.getContentPane().setLayout(new FlowLayout());
	    JLabel label = new JLabel(" ");
	    label.setFont(new Font("Serif", Font.PLAIN, 36));
	    SysWindow.getContentPane().add(label);
	    
	    
	    JLabel label2 = new JLabel("Pathfinder Character");
	    label2.setFont(new Font("Serif", Font.PLAIN, 24));
	    SysWindow.getContentPane().add(label2);
	    
	    
	    JLabel label3 = new JLabel("Stat Generator");
	    label3.setFont(new Font("Serif", Font.PLAIN, 24));
	    SysWindow.getContentPane().add(label3);
	    
	    JLabel label4 = new JLabel("Rolls four 6 sided Die and keeps the highest 3");
	    label4.setFont(new Font("Serif",Font.PLAIN, 11));
	    SysWindow.getContentPane().add(label4);
	    
	    SysWindow.setLocationRelativeTo(null);  
	    SysWindow.setVisible(true);
	}
	
}
