package com.test.comparator;

import java.util.Comparator;

public class StudentIdSortor implements Comparator<Student> {
	
	@Override
	public int compare(Student stu1, Student stu2) {
		if(stu1.getStudentId() == stu2.getStudentId()) {
			return 0;
		}else if(stu1.getStudentId() > stu2.getStudentId()) {
			return 1;
		}else {
			return -1;
		}
	}

}
