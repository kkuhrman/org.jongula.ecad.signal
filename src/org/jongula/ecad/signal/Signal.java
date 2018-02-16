/**
 * @package:	org.jongula.ecad.signal
 * @file:		Signal.java
 * @brief:      Base container class for electric signal data.
 * 
 * @copyright:	Copyright (C) 2018 Kuhrman Technology Solutions LLC
 * @license:	GPLv3+: GNU GPL version 3
 * @authors:	Karl Kuhrman
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jongula.ecad.signal;

public class Signal {
	/**
	 * Current in Amps.
	 * @return double
	 */
	public double getCurrent() {
		return 0.00088;
	}
	
	/**
	 * Potential in Volts.
	 * @return double
	 */
	public double getPotential() {
		return 5.00;
	}
}
