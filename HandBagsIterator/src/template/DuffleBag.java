package template;

public class DuffleBag extends HandBag{

	@Override
	public void gatherMaterials() {
		// TODO Auto-generated method stub
		System.out.println("Find tough fabric");
	}

	@Override
	public void cutting() {
		// TODO Auto-generated method stub
		System.out.println("Cut 4 squares about 3x3 out of extra fabric, laid out so the warp and weft run diagonally");
	}

	@Override
	public void weaving() {
		// TODO Auto-generated method stub
		System.out.println("Construct the top and bottom");
	}

	@Override
	public void sewing() {
		// TODO Auto-generated method stub
		System.out.println("Wrap one around each end of the zipper, tucking the ends in, and sew it down");
	}

	@Override
	public void inspection() {
		// TODO Auto-generated method stub
		System.out.println("Inspect if all pieces are sown correctly " + this.toString());
	}
	public String toString() {
		return "Duffle Bag";
	}
}
