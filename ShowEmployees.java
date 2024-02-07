
package com.ui;

import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.operations.Implementions;

public class ShowEmployees extends JFrame {
	JTable t1;
	JScrollPane sp;

	public ShowEmployees() {
		setLayout(new FlowLayout());

		Implementions implemations = new Implementions();
		List<String[]> e_data = implemations.showEmp();

		String[][] data = new String[e_data.size()][];

		for (int i = 0; i < data.length; i++) {
			data[i] = e_data.get(i);

		}

		String[] heading = { "Id", "Name", "Salary"};

		t1 = new JTable(data, heading);

		sp = new JScrollPane(t1);
		add(sp);

		setTitle("Show Employees");
		setSize(500, 500);
		setVisible(true);

	}
 
}