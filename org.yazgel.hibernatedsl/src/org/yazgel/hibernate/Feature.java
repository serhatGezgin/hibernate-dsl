/**
 */
package org.yazgel.hibernate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.hibernate.Feature#isMany <em>Many</em>}</li>
 *   <li>{@link org.yazgel.hibernate.Feature#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.hibernate.HibernatePackage#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many</em>' attribute.
	 * @see #setMany(boolean)
	 * @see org.yazgel.hibernate.HibernatePackage#getFeature_Many()
	 * @model
	 * @generated
	 */
	boolean isMany();

	/**
	 * Sets the value of the '{@link org.yazgel.hibernate.Feature#isMany <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Many</em>' attribute.
	 * @see #isMany()
	 * @generated
	 */
	void setMany(boolean value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute list.
	 * The list contents are of type {@link org.yazgel.hibernate.FetureAnnotation}.
	 * The literals are from the enumeration {@link org.yazgel.hibernate.FetureAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute list.
	 * @see org.yazgel.hibernate.FetureAnnotation
	 * @see org.yazgel.hibernate.HibernatePackage#getFeature_Annotations()
	 * @model
	 * @generated
	 */
	EList<FetureAnnotation> getAnnotations();

} // Feature
