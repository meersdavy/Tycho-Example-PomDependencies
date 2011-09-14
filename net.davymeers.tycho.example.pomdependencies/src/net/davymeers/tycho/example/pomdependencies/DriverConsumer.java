package net.davymeers.tycho.example.pomdependencies;

import org.postgresql.Driver;

/**
 * This class consumes the org.postgresaql.Driver class to be sure the dependency exists
 * 
 * @author Meers Davy
 *
 */
public class DriverConsumer {

	public DriverConsumer() {
		super();
		new Driver();
	}

}
