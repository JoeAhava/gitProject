import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class TestRunner {
	
	public static void main(String[] args)
    {
        Result result=JUnitCore.runClasses(RectangleTest.class,TriangleTest.class);
     for(Failure f:result.getFailures())
     {
         System.out.println(f.toString());
     }
     System.out.println("succesfull");
    }
}
