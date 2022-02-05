package template;

public abstract class HandBag {
	String name;
	public void setName(String name) {
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return this.name;
	}
	public void pack() {
		System.out.println("Preparing " + this.toString());
		gatherMaterials();
		weaving();
		sewing();
		inspection();
		
		System.out.println();
		
	}
	public abstract void gatherMaterials();
	public abstract void cutting();
	public abstract void weaving();
	public abstract void sewing();
	public abstract void inspection();
}
