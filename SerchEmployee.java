
package com.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.operations.Emp;
import com.operations.Implementions;

public class SerchEmployee<Implemations>  extends JFrame{
	
	JLabel jLabel1 , jLabel2;
	JTextField field;
	JButton button1,button2;
	
	public SerchEmployee() {
		setLayout(null);
		jLabel1 = new JLabel("Employee Id:");
		jLabel2 = new JLabel();
		field = new JTextField(10);
		button1 = new JButton("Serch Employee");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Emp emp = new Emp();
				emp.setId(Integer.parseInt(field.getText()));
				Implementions implemations = new Implementions();
				String[] e_data = implemations.searchEmp(emp);
				String new_str = "";
				for (String string : e_data) {
					new_str = new_str + " " + string;
				}
				jLabel2.setText(new_str);
				System.out.println("Serch Employee");
				
			}
		});
	 button2 = new JButton("Back");
	 button2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Back");
			new Home1();
			dispose();
			
		}
	});
		 
		jLabel1.setBounds(50,50,100,30);
		field.setBounds(140,50,100,30);
		button1.setBounds(40,100,130,30);
		button2.setBounds(190,100,100,30);
		jLabel2.setBounds(90,200,150,30);
		
		add(jLabel1);
		add(field);
		add(button1);
		add(button2);
		add(jLabel2);
		setSize(400,400);
		setVisible(true);
		

	}
	public static void main(String[] args) {
		new SerchEmployee();
	}
	

}
