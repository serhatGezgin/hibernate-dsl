/*
* generated by Xtext
*/
package org.yazgel.hibernatedsl.xtext;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class HibernateUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.yazgel.hibernatedsl.xtext.ui.internal.HibernateActivator.getInstance().getInjector("org.yazgel.hibernatedsl.xtext.Hibernate");
	}
	
}
