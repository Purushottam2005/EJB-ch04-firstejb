package pl.pepuch.ejb.i;

public interface CalculatorCommonBusiness {
	
	/**
	 * Adds all arguments
	 * @param integers to sum
	 * @return The sum of all arguments
	 */
	int add(int... arguments);

}
