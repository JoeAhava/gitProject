
public class Triangle {
	private double base;
	private double height;
	private double area;
	
	public Triangle() {
		this.base = 0.0;
		this.height = 0.0;
		this.height = 0.0;
		
	}
	
	public double area(double base, double height) {
		this.base = base;
		this.height = height;
		this.area = (1/2)*(this.base)*(this.height);
		
		return this.area;
	}
	
}
