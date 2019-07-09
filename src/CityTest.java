import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CityTest {
	
	City c = new City ("test");

	@Test
	void addTempForDate() {
		c.addTempForDate("January", 1, 50);
		assertEquals((double) 50, c.months.get("January")[1]);
		
		c.addTempForDate("January", 31, 100);
		assertEquals((double) 100, c.months.get("January")[31]);
		
		c.addTempForDate("January", 31, -10);
		assertEquals((double) 100, c.months.get("January")[31]);
		
		c.addTempForDate("February", 28, 200);
		assertEquals(32, c.months.get("February").length);
		
	}
}
