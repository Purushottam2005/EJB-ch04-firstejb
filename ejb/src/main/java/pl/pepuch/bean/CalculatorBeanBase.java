package pl.pepuch.bean;

import pl.pepuch.ejb.i.CalculatorCommonBusiness;

public class CalculatorBeanBase implements CalculatorCommonBusiness {

	/**
	 * {@link CalculatorCommonBusiness#add(int...)}
	 */
	@Override
	public int add(int... arguments) {
		// initialize
		int result = 0;
		// add all arguments
		for (final int arg : arguments) {
			result += arg;
		}
		
		return result;
	}

}
