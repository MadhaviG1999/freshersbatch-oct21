import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class CircleTest {
	Circle cc=new Circle(15);
	@Test
	void test_getRadius() {
		assertEquals(15,cc.getRadius(),0.0001);
	}
	@Test
	void test_getArea() {
		assertEquals(Math.PI*(15*15),cc.getArea(),0.0015);
	}
	void test_getCircumference() {
		assertEquals(Math.PI*(2*15),cc.getCircumference(),0.0015);
	}
	void test() {
		fail("Not yet implemented");
	}
	}


