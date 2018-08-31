package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Student;

class Q4Test {

	@Test
	
	void testStudentCollection() {

		TreeSet<Student> stud=new TreeSet<>();
		assertEquals(true, stud.add(new Student("Sandeep", 31, "CSE")));
		assertEquals(true, stud.add(new Student("Sudarshan", 32, "CSE")));
		assertEquals(true, stud.add(new Student("Manju", 1, "ECE")));
		assertEquals(true, stud.add(new Student("Navya", 25, "CSE")));
		assertEquals(true, stud.add(new Student("Navya", 85, "CSE")));
		assertEquals(false, stud.add(new Student("Navya", 85, "CSE")));
		assertEquals(true, stud.add(new Student("Sharad", 85, "CSE")));
		assertEquals(true, stud.add(new Student("Logi", 29, "CSE")));
		assertEquals(true, stud.add(new Student("Harini", 62, "ME")));
		
		
		System.out.println(stud);
		
	}

}
