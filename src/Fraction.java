

public class Fraction {
	private int numerator;
	private int denominator;
	
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	
	public Fraction (int n, int d) {
		numerator = n;
		denominator = d;
	}

	
	/**	
	 * this method is adding otherFraction
	 * to our current (this) fraction
	 * @param otherFraction
	 */
	
	public void add(Fraction otherFraction) {
		//Consider our fractions to be  a/b and c/d
		//(ad + bc) / bd
		
		int a = numerator;
		int b = denominator;
		int c = otherFraction.getNumerator();
		int d = otherFraction.getDenominator();
		
		numerator = a * d + b * c;
		denominator = b * d;
		
		int min = denominator;
		
		if(numerator < denominator) {
			min = numerator;
		}
		
		int commonDiv = 1;
		
		for(int i = 2; i < b * d; i ++) {
			if(numerator % i == 0 && denominator % i == 0) {
				commonDiv = i;
			}
		}
		
		numerator = numerator / commonDiv;
		
		denominator = denominator / commonDiv;
		
		if(numerator == 0) denominator = 1;
	}

}
