package com.test.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8SortingTest {
	
	public static void main(String[] args) {
		Student stu1 = new Student(89, "Kavi");
		Student stu2 = new Student(111, "Vibhi");
		Student stu3 = new Student(345, "Vetri");
		List<Student> stuList = new ArrayList<Student>();
		stuList.forEach(e -> System.out.println(e.getStudentId()));
		stuList.add(stu2);
		stuList.add(stu3);
		stuList.add(stu1);
		
		stuList.forEach(e -> System.out.println(e.getStudentId()));
		
		//stuList.sort(new StudentIdSortor());
		
		stuList = stuList.stream().sorted(( obj1, obj2) -> obj1.getStudentId().compareTo(obj2.getStudentId())).collect(Collectors.toList());
		
		stuList.forEach(e -> System.out.println(e.getStudentId()));
	}

}
