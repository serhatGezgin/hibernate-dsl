/**
 */
package org.yazgel.hibernate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.hibernate.Module#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.hibernate.HibernatePackage#getModule()
 * @model
 * @generated
 */
public interface Module extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.yazgel.hibernate.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.yazgel.hibernate.HibernatePackage#getModule_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.yazgel.hibernate.Package> getPackages();

} // Module
