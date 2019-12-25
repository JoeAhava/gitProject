
public class Rectangle {
	private double length;
	private double width;
	private double area;
	
	public Rectangle() {
		this.length = 0.0;
		this.width = 0.0;
		this.area = 0.0;
	}
	
	public double area(double length,double width) {
		this.length = length;
		this.width = width;
		this.area = this.length * this.width;
		
		return this.area;
	}
}
