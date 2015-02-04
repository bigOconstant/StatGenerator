import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.border.BevelBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class MainFrame extends JFrame{

	public MainFrame(String caption) {
		super(caption);
		initFrame();
		
	}
	static int dice = 0;
	private void initFrame() {
		final JButton Roll = new JButton("Roll");
		
		

		
		ActionListener about = new ActionListener(){
			public void actionPerformed(ActionEvent c){
				SystemInformationDlg help = new SystemInformationDlg("About");
				help.setVisible(true);	
				
			}
			
		};
		ActionListener RollListen = new ActionListener(){
			public void actionPerformed(ActionEvent c){
				
				ArrayList<Integer> Dice = new ArrayList<Integer>();
				//adding.setVisible(true);	
				Random rn = new Random();
				dice = rn.nextInt(6 - 1 + 1) + 1;
				
				
				/*Table creation Section ********************/
				
				ArrayList<Integer> valueList = new ArrayList<Integer>();
				
				ArrayList<Integer> diceList = new ArrayList<Integer>();
				
				for(int i = 0; i <6; ++i){
				diceList.add(rn.nextInt(6 - 1 + 1) + 1);
				diceList.add(rn.nextInt(6 - 1 + 1) + 1);
				diceList.add(rn.nextInt(6 - 1 + 1) + 1);
				diceList.add(rn.nextInt(6 - 1 + 1) + 1);
				
				Collections.sort(diceList);
				//
				diceList.remove(0);
				
				valueList.add( diceList.get(0) + diceList.get(1) + diceList.get(2));
				diceList.clear();
				}
				//System.out.println(diceList);
				
				String[] ColumnNames = {"Stats"};
				Object[][] data = {
						{valueList.get(0)},
						{valueList.get(1)},
						{valueList.get(2)},
						{valueList.get(3)},
						{valueList.get(4)},
						{valueList.get(5)},
				};
				
				JTable table = new JTable(data,ColumnNames);
				
				
				
				/*End Table Creation Section****************/
				
				final JButton roll = new JButton("Roll");
				roll.addActionListener(this);
				JPanel panelblah = new JPanel();
				JPanel TestPanel = new JPanel();

				TestPanel.add(roll);
				TestPanel.setLayout(new FlowLayout());
				panelblah.add(TestPanel);
				
				panelblah.add(new JScrollPane(table));
				
				
				panelblah.setLayout(new GridLayout(1,1,1,1));
				
				getContentPane().removeAll();
				
				////////////////////////////////
				JMenuBar menuBar = new JMenuBar();
				menuBar.setBorder(new BevelBorder(BevelBorder.RAISED));
				getContentPane().add(menuBar);
				//this.setJMenuBar(menuBar);
				JMenu menu = new JMenu("Help");
				JMenuItem displayhelp = new JMenuItem("About");
				displayhelp.addActionListener(about);
				menu.add(displayhelp);
				
				ActionListener about = new ActionListener(){
					public void actionPerformed(ActionEvent c){
						//SystemInformationDlg help = new SystemInformationDlg("About");
						//help.setVisible(true);	
						System.out.println("To Be filled in with a box");
						
					}
					
				};
				
				menuBar.add(menu);
				
				setJMenuBar(menuBar);
				//this.setJMenuBar(menuBar);
				
				menu.getAccessibleContext().setAccessibleDescription(
					      "This menu desplays help info");
				
				//this.getContentPane(  ).add(menuBar, BorderLayout.NORTH);
				
				getContentPane(  ).add(menuBar, BorderLayout.NORTH);
				/////////////////////////////
				
				
				
				getContentPane().add(panelblah);
				
				repaint();
				printAll(getGraphics());
				
				
	
			}
		};
		
		
		this.setSize(300, 300);
		
		/* Beginning of Menu creation ****************************************/
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new BevelBorder(BevelBorder.RAISED));
		this.setJMenuBar(menuBar);
		JMenu menu = new JMenu("Help");
		JMenuItem displayhelp = new JMenuItem("About");
		menu.add(displayhelp);
		
		displayhelp.addActionListener(about);
		
		menuBar.add(menu);
		
		this.setJMenuBar(menuBar);
		
		menu.getAccessibleContext().setAccessibleDescription(
			      "This menu desplays help info");
		
		this.getContentPane(  ).add(menuBar, BorderLayout.NORTH);
		
		
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new FlowLayout());
		
		JPanel tablePanel = new JPanel();
		tablePanel.setLayout(new GridLayout(1,1,1,1));
		
		/*Temporary table creations */
		String[] ColumnNames = {"Stats"};
		Object[][] data = {
				{""},
				{""},
				{""},
				{""},
				{""},
				{""},
		};
		/****************************/
		
		JTable table = new JTable(data,ColumnNames);
		Roll.addActionListener(RollListen);
		buttons.add(Roll);
		tablePanel.add(buttons);
		tablePanel.add(new JScrollPane(table));
		//buttons.add(table);
		
		//buttons.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		this.getContentPane().add(tablePanel);
		
	}

}
