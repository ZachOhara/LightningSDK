/* Copyright (C) 2015-2016 Thunderbots Robotics
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

package io.github.thunderbots.lightning.opmode;

import io.github.thunderbots.lightning.robot.Robot;

/**
 * A {@code SimpleOpMode} is an op mode that is designed to make the op mode programming
 * process very easy. Many common functionalities are implemented in this class, so all
 * subclasses have easy access to that functionality.
 *
 * @author Zach Ohara
 */
public abstract class SimpleOpMode extends LightningOpMode {

	/**
	 * The robot that this OpMode is designed for.
	 */
	private Robot robot;

	/**
	 * Get a reference to this op mode's robot.
	 *
	 * @return this op mode's robot
	 */
	protected Robot getRobot() {
		return this.robot;
	}

	/**
	 * Sets the robot to use for this op mode.
	 *
	 * @param robot the robot to use for this op mode.
	 */
	protected void setRobot(Robot robot) {
		this.robot = robot;
	}

}
