package pl.pepuch.bean;

import static junit.framework.Assert.assertEquals;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.BeforeClass;
import org.junit.Test;

import pl.pepuch.ejb.i.CalculatorCommonBusiness;


public class CalculatorIntegrationTestCase {
	
	/**
	 * The JNDI naming context
	 */
	private static Context namingContext;
	
	/**
	 * The EJB3.1 no-interface view of the CalculatorEJB
	 */
	private static SimpleCalculatorBean calc;
	
	/**
	 * JNDI Name of the no-interface view
	 */
	
	private static final String JNDI_NAME_CALC = "java:global/ejb-1.0/SimpleCalculatorBean";
	
	@BeforeClass
	public static void obtainProxyReferences() throws Throwable {
		// create the naming context using jndi.properties on the CP
		namingContext = new InitialContext();
		// obtain ejb3.1 business reference
		calc = (SimpleCalculatorBean) namingContext.lookup(JNDI_NAME_CALC);
	}
	
	private void assertAdditionSucceds(CalculatorCommonBusiness calc) {
		// initialize
		final int[] arguments = {2,3,5};
		final int expectedSum = 10;
		// add
		final int actualSum = calc.add(arguments); // real ejb invocation!
		// test
		assertEquals("Addition did not return the expected result", expectedSum, actualSum);
	}
	
	@Test
	public void testAdditionUsingBusinessReference() throws Throwable {
		this.assertAdditionSucceds(calc);
	}
	
}
