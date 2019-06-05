package com.techelevator;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class SameFirstLastTest {
	
	public void sameFirstLastTest() {
		SameFirstLast array = new SameFirstLast();
		assertFalse(array.isItTheSame(new int[] {1, 2, 3}));
		assertTrue(array.isItTheSame(new int[] {1, 2, 3, 1}));
		assertTrue(array.isItTheSame(new int[] {1, 2, 1}));
		assertTrue(array.isItTheSame(new int[] {1}));
		assertFalse(array.isItTheSame(new int[] {}));
	}

}
