package com.test.comparable;

public class Employee implements Comparable<Employee> {
	
	private int empId;
	private String empName;
	
	

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	/*@Override
	public int compareTo(Employee obj) {
		
		return this.getEmpName().compareTo(obj.getEmpName());
	}*/
	
	@Override 
	public int compareTo(Employee obj) {
		if(obj.getEmpId() == this.getEmpId()) {
			return 0;
		}else if(obj.getEmpId() < this.getEmpId()) {
			return 1;
		}else {
			return -1;
		}
	}

}
