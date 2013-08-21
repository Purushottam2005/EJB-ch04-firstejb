package pl.pepuch.bean;

import javax.ejb.Local;
import javax.ejb.Stateless;

import pl.pepuch.ejb.i.CalculatorRemoteBusiness;

@Stateless
@Local(CalculatorRemoteBusiness.class)
public class SimpleCalculatorBean extends CalculatorBeanBase {
	/**
	 * Implementation supplied by common base class
	 */
}
