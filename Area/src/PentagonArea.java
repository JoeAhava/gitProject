import java.lang.Math;
public class PentagonArea {
	public double area(double a) {
		double result = (1/4)*(Math.sqrt((5*(5+2*(Math.sqrt(5))))))*a;
		return result;
	}
}
