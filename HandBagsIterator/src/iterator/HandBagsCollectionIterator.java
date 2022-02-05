package iterator;

import template.HandBag;
import java.util.ArrayList;
import java.util.List;

public class HandBagsCollectionIterator implements Iterator{
	List<HandBag> handBags;
	int count = 0;
	public HandBagsCollectionIterator(List<HandBag> handBags) {
		this.handBags = handBags;
	}

	@Override
	public HandBag next() {
		// TODO Auto-generated method stub
		return handBags.get(count++);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return handBags.size() > count;
	}
	
}
