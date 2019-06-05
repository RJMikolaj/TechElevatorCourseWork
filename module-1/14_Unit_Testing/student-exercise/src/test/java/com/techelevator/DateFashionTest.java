package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {

	@Test
	public void testGetATable_success() {
		DateFashion gotATable = new DateFashion();
		Assert.assertEquals(gotATable.getATable(8, 8),2);
	}

	@Test
	public void testGetATable_fail() {
		DateFashion noTable = new DateFashion();
		Assert.assertEquals(noTable.getATable(0, 0),0);
	}

	@Test
	public void testGetATable_maybe() {
		DateFashion maybeTable = new DateFashion();
		Assert.assertEquals(maybeTable.getATable(3, 4),1);
	}
}
