package com.techelevator;

import org.junit.*;

public class CigarPartyTest {

	// @Before
	// public void setup() {
	// CigarParty party = new CigarParty();
	// party.haveParty(41, true);
	// }

	@Test
	public void testHaveParty_success() {
		CigarParty party = new CigarParty();
		Assert.assertTrue(party.haveParty(41, true));

	}

	@Test
	public void testHaveParty_fail() {
		CigarParty failedParty = new CigarParty();
		Assert.assertFalse(failedParty.haveParty(61, false));
	}

	//
	// @Test
	// public void pick_5_successful() {
	// // Arrange
	// // Act
	// boolean result = fruitTree.pickFruit(5);
	// // Assert
	// Assert.assertTrue(result);
	// Assert.assertEquals(5, fruitTree.getPiecesOfFruitLeft());
	// }
}
