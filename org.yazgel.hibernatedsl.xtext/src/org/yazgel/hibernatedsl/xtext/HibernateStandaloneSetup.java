/*
* generated by Xtext
*/
package org.yazgel.hibernatedsl.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class HibernateStandaloneSetup extends HibernateStandaloneSetupGenerated{

	public static void doSetup() {
		new HibernateStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
