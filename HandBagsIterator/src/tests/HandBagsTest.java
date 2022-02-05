package tests;
import template.*;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import iterator.*;
public class HandBagsTest {

	@Test
	public void testCreateClutchBags() {
		
		HandBag clutchBag = new ClutchBag();
		HandBagCollection bagCollection = new HandBagCollection();
		
		bagCollection.setHandBag(clutchBag);
		Designer designer = new Designer(bagCollection);
		assertTrue(designer.createBags());
	}
	
	@Test
	public void testCreateDuffleBag() {
		
		HandBag duffleBag = new DuffleBag();
		HandBagCollection bagCollection = new HandBagCollection();
		
		bagCollection.setHandBag(duffleBag);
		Designer designer = new Designer(bagCollection);
		assertTrue(designer.createBags());
	}
}
