package com.JosiasOberholster;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener
{
	public static void main(String[] args)
	{
		new Calculator().GUI();
	}
	
	private JFrame frame;
	private JPanel panel, panelSpace, background;
	private JLabel label;
	private JTextArea display = null;
	private JButton button1, button2,button3,button4,button5,button6,button7,button8,
				   button9, button10, button11, button12, button13, button14, button15, button16;
	
	public void GUI()
	{	
		frame = new JFrame("Calculator");
		panel = new JPanel();
		label = new JLabel("Created by Josias Oberholster");
		BorderLayout layout = new BorderLayout();
		background = new JPanel(layout);
		background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		Box buttonBox = new Box(BoxLayout.Y_AXIS);
	
		button1 = new JButton("1");
		//button1.addactionListener(new Button1);
		buttonBox.add(button1);
		
		button2 = new JButton("2");
		//button1.addactionListener(new Button1);
		buttonBox.add(button1);
				
		button3 = new JButton("3");
		//button1.addactionListener(new Button1);
		buttonBox.add(button1);
		
		button4 = new JButton("4");
		//button1.addactionListener(new Button1);
		buttonBox.add(button1);
		
		button5 = new JButton("5");
		//button1.addactionListener(new Button1);
		buttonBox.add(button1);
		
		button6 = new JButton("6");
		//button1.addactionListener(new Button1);
		buttonBox.add(button1);
		
		button7 = new JButton("7");
		//button1.addactionListener(new Button1);
		buttonBox.add(button1);
		
		button8 = new JButton("8");
		//button1.addactionListener(new Button1);
		buttonBox.add(button1);
		
		button9 = new JButton("9");
		//button1.addactionListener(new Button1);
		buttonBox.add(button1);
		
		button10 = new JButton("0");
		//button1.addactionListener(new Button1);
		buttonBox.add(button1);
		
		button11 = new JButton("+");
		//button1.addactionListener(new Button1);
		buttonBox.add(button1);
		
		button12 = new JButton("-");
		//button1.addactionListener(new Button1);
		buttonBox.add(button1);
		
		button13 = new JButton("*");
		//button1.addactionListener(new Button1);
		buttonBox.add(button1);
		
		button14 = new JButton("/");
		//button1.addactionListener(new Button1);
		buttonBox.add(button1);
		
		button15 = new JButton("CL");
		//button1.addactionListener(new Button1);
		buttonBox.add(button1);
		
		button16 = new JButton("=");
		//button1.addactionListener(new Button1);
		buttonBox.add(button1);
		
		Font bigFont = new Font("sanserif", Font.BOLD, 24);
		display = new JTextArea(3, 13);
		display.setFont(bigFont);
	    display.setLineWrap(true);
	    display.setWrapStyleWord(true);
	    display.setEditable(false);
	    JScrollPane qScroller = new JScrollPane(display); 
        panel.add(qScroller);
        
		frame.getContentPane().add(BorderLayout.NORTH, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, label);
		frame.setSize(300, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ev)
	{
		//Keep Empty
	}
}
