package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import com.capgemini.day6.Student;

class CollectionQ3Test {


	@Test
	void testStudentCollection() {

		ArrayList<Student> stud=new ArrayList<>();
		assertEquals(true, stud.add(new Student("priyanka", 31, "CSE")));
		assertEquals(true, stud.add(new Student("muskaan", 32, "CSE")));
		assertEquals(true, stud.add(new Student("Manju", 1, "ECE")));
		assertEquals(true, stud.add(new Student("Navya", 25, "CSE")));
		assertEquals(true, stud.add(new Student("Navya", 85, "CSE")));
		assertEquals(true, stud.add(new Student("Navya", 85, "CSE")));
		assertEquals(true, stud.add(new Student("Sharad", 85, "CSE")));
		assertEquals(true, stud.add(new Student("Logi", 29, "CSE")));
		
		System.out.println(stud);
		
	}

}
