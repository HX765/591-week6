import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FractionTest {

	@Test
	void testAdd() {
		Fraction f1 = new Fraction (3,4);
		Fraction f2 = new Fraction (5,6);
		f1.add(f2);
		assertEquals(f1.getNumerator(), 19);
		assertEquals(f1.getDenominator(), 12);
	}
	
	@Test
	void testAddNegative() {
		Fraction f1 = new Fraction (3,4);
		Fraction f2 = new Fraction (-3,4);
		f1.add(f2);
		assertEquals(f1.getNumerator(), 0);
		assertEquals(f1.getDenominator(), 1);
		
	}

}
