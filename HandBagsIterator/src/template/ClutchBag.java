package template;

public class ClutchBag extends HandBag{
	
	@Override
	public void gatherMaterials() {
		// TODO Auto-generated method stub
		System.out.println("Choose beautiful fabric for clutch");
	}

	@Override
	public void cutting() {
		// TODO Auto-generated method stub
		System.out.println("Cut the fabric and  lay it out");
	}

	@Override
	public void weaving() {
		// TODO Auto-generated method stub
		System.out.println("Fold the long edges, Iron along the folds and top stitch them down");
	}

	@Override
	public void sewing() {
		// TODO Auto-generated method stub
		System.out.println("Sew the sides of the placemat using a sewing machine and a straight stitch.");
	}

	@Override
	public void inspection() {
		// TODO Auto-generated method stub
		System.out.println("Inspect the " + this.toString());
	}
	public String toString() {
		return "ClutchBag";
	}

}
