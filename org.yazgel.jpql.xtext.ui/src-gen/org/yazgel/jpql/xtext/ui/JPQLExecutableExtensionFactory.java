/*
 * generated by Xtext
 */
package org.yazgel.jpql.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.yazgel.jpql.xtext.ui.internal.JPQLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class JPQLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return JPQLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return JPQLActivator.getInstance().getInjector(JPQLActivator.ORG_YAZGEL_JPQL_XTEXT_JPQL);
	}
	
}
