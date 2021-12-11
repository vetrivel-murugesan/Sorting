package com.test.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSortingtest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Kavi");
		Employee emp2 = new Employee(2, "Vibhi");
		Employee emp3 = new Employee(3, "Vetri");
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp1);
		Collections.sort(empList);
		empList.forEach(e -> System.out.println(e.getEmpId()));
	}

}
