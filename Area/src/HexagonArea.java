import java.lang.Math;
public class HexagonArea {
	public double area(double a) {
		double result= (3/2)*Math.sqrt(a)*Math.pow(a, a);
		return result;
	}
}
