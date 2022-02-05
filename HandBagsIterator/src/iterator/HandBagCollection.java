package iterator;

import java.util.ArrayList;
import java.util.List;

import template.*;

public class HandBagCollection implements WorkShop{
	List<HandBag> handBags;
	public HandBagCollection() {
		
		handBags = new ArrayList<HandBag>();
		
	}
	public void setHandBag(HandBag handBag) {
		
		handBags.add(handBag);
	
	}
	public List<HandBag> get(){
		
		return handBags;
		}
	public Iterator createIterator() {
		
		return new HandBagsCollectionIterator(handBags);
	}

}
