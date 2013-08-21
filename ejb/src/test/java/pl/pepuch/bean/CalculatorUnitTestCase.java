package pl.pepuch.bean;

import static junit.framework.TestCase.*;
import org.junit.Test;
import pl.pepuch.ejb.i.CalculatorCommonBusiness;


public class CalculatorUnitTestCase {
	
	/**
	 * Ensures that the Calculator adds as expected
	 */
	@Test
	public void testAddition() {
		// initialize
		final CalculatorCommonBusiness calc = new SimpleCalculatorBean();
		final int expectedSum = 2+3+5;
		
		// add
		final int actualSum = calc.add(2, 3, 5);
		
		// test
		assertEquals("Addition dod not return the expected result", expectedSum, actualSum);
	}
	
}
