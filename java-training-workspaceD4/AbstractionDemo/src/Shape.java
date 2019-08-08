
public abstract class Shape {
	protected float area;
	
	public abstract void computeArea();
	
	public final void display() {
		System.out.println("Area : " + area);
	};
}
