package com.techelevator;

import org.junit.*;

public class TriangleClassifierTest {

	private TriangleClassifier classifier;

	@Before
	public void setup() {
		classifier = new TriangleClassifier();

	}

	@Test
	public void identifies_equilateral_triangle() {
		String type = classifier.classify(4, 4, 4);
		Assert.assertEquals("equilateral", type);
	}

	@Test
	public void identifies_isosceles_triangle() {
		String type = classifier.classify(2, 2, 3);
		Assert.assertEquals("sides 1 and 2 equal", "isosceles", type);

		type = classifier.classify(2, 3, 2);
		Assert.assertEquals("sides 1 and 2 equal", "isosceles", type);

	}

}
