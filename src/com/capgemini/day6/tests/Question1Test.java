package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Laptop;

class Question1Test {

	@Test
	void testLaptopProducts() {
		ArrayList<Laptop> laptops = new ArrayList<>();
		
		assertEquals(true, laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5")));
		laptops.add(new Laptop("HP", "HP234", "Windows 10", "i3"));
		laptops.add(new Laptop("HP", "HP677", "Windows 10", "i7"));
		
		assertEquals(3, laptops.size());
	}

}
