package edu.neu.csye6200.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyAppUI implements ActionListener {

	private Logger log = Logger.getLogger(MyAppUI.class.getName());
	private JFrame frame = null;
	private JPanel mainPanel =null;
	private JPanel drawPanel =null;
	private JButton startBtn = null;
	private JButton stopBtn = null;

	
	//constructor
	public MyAppUI() {
		log.info("App STarted");
		initGUI();
	}
	//initialize the GUI
	private void initGUI() {
		//should initialise my gui. firstly build thejava frame
		frame = new JFrame();
		frame.setTitle("MyAppUI");
		frame.setSize(2000,2000);//set the size to a reasnabl value
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//if we press the close button , exit
		
		
		frame.setLayout(new BorderLayout());
		frame.add(getMainPanel(),BorderLayout.NORTH);//buttons on top
		frame.add(getDrawPanel(),BorderLayout.CENTER);//draing in the center
		frame.setVisible(true);			
	}
	
	//create a panel used for drawing
	public JPanel getDrawPanel() {
		 drawPanel = new MyPanel();
		return drawPanel;
	}
	
	
	
	//create a panel where well draw
	private JPanel getMainPanel() {
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());//flo from left to right
		startBtn = new JButton("Start");//create button insnaces
		stopBtn = new JButton("Stop");
		
		startBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Do start operation-anonymous");
				drawPanel.repaint();//ask for a panel redraw - the UI thread will do it!!!!!!!
			}
		});
		startBtn.addActionListener(this);
		stopBtn.addActionListener(this);
		
		mainPanel.add(startBtn);//add them to the panel
		mainPanel.add(stopBtn);
		mainPanel.setBackground(Color.black);
		return mainPanel;		
	}
	
	public static void main(String[] args) {
		MyAppUI myApp = new MyAppUI();
		System.out.println("MyAppUI is exitting");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) { //similar to the observable pattern . there is active listener and event teller
		log.info("We receive an ActionEvent" + arg0);
		//if(arg0.getSource() ==  startBtn)
		//System.out.println("Do start operation ");
		//else
		if(arg0.getSource() ==  stopBtn)
		System.out.println("Stop the operation");
		
	}

}
