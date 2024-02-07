package com.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.operations.Emp;
import com.operations.Implementions;

public class EmployeeDelete  extends JFrame{
	
	JLabel jLabel;
	JTextField field;
	JButton button1,button2;
	
	public <Implementations> EmployeeDelete() {
		setLayout(null);
		jLabel = new JLabel("Employee Id:");
		field = new JTextField(10);
		button1 = new JButton("Delete");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Emp emp = new Emp();
				emp.setId(Integer.parseInt(field.getText()));
				
				Implementions implementions = new Implementions();
				implementions.deleteEmp(emp);;
				System.out.println("Delete Employee");
				
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
		 
		jLabel.setBounds(50,50,100,30);
		field.setBounds(140,50,100,30);
		button1.setBounds(60,100,100,30);
		button2.setBounds(170,100,100,30);
		
		add(jLabel);
		add(field);
		add(button1);
		add(button2);
		setSize(400,400);
		setVisible(true);
		

	}
	public static void main(String[] args) {
		new EmployeeDelete();
	}
	

}
