/*
* generated by Xtext
*/
package org.yazgel.jpql.xtext;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class JPQLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.yazgel.jpql.xtext.ui.internal.JPQLActivator.getInstance().getInjector("org.yazgel.jpql.xtext.JPQL");
	}
	
}
