package com.test.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorSortingtest {
	public static void main(String[] args) {
		Student stu1 = new Student(89, "Kavi");
		Student stu2 = new Student(111, "Vibhi");
		Student stu3 = new Student(345, "Vetri");
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(stu2);
		stuList.add(stu3);
		stuList.add(stu1);
		Collections.sort(stuList,new StudentIdSortor());
		stuList.forEach(e -> System.out.println(e.getStudentId()));
	}
}
