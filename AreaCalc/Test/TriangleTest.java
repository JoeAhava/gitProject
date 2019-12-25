import static org.junit.Assert.*;

import org.junit.*;


public class TriangleTest {
	Triangle triangle;

	@Before
    public void setUp() {
		triangle = new Triangle();
    }
	@Test
	public void testTriangle() {
	 
		assertEquals(49.00, triangle.area(14.00, 7.00),49.00);
		assertEquals("failure",18.48,triangle.area(4.4,8.4),0.00);
        assertEquals("succesful",9.5,triangle.area(3.3,6.2),0.00);
	}
	
	@After
    public void tearDown() {
        triangle = null;
    }
	
}
