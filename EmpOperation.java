package com.operations;

import java.util.List;

public interface EmpOperation {

	
	void addEmp(Emp emp);
	
	void updateEmp(Emp emp);

	void deleteEmp(Emp emp);

	String[] searchEmp(Emp emp);

	List<String[]> showEmp();
}
