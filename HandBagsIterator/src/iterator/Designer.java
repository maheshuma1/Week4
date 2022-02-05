package iterator;

import template.*;

public class Designer {
	 WorkShop workShop;

	public Designer(WorkShop workShop) {
		this.workShop = workShop;
	}
	
	public boolean createBags() {
		Iterator it = workShop.createIterator();
		return createBags(it);
	}
	private boolean createBags(Iterator it) {
		while(it.hasNext()) {
			
			HandBag handBag = it.next();
			handBag.pack();
			return true;
		}
		return false;
	}
	
}
