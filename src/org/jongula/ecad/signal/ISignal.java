package org.jongula.ecad.signal;

public interface ISignal {

	/**
	 * Current in Amps.
	 * @return double
	 */
	double getCurrent();

	/**
	 * Potential in Volts.
	 * @return double
	 */
	double getPotential();

}