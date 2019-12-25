import static org.junit.Assert.*;

import org.junit.*;

public class RectangleTest {
	Rectangle rectangle ;
	
	@Before
    public void setUp() {
		 rectangle= new Rectangle();
		 
    }
	
	@Test
	public void testRectangle() {
		assertEquals("Successfull",70.00, rectangle.area(10.00, 7.00),0.00);
		assertEquals("succesful",15,rectangle.area(3,5),0);
        assertEquals("succesful",10,rectangle.area(2,5),0);
	}
	
	@After
    public void tearDown() {
        rectangle=null;
    }
	
}
