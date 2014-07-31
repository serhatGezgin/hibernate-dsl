/**
 */
package org.yazgel.jpql.xtext.jPQL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.jpql.xtext.jPQL.FromClass#getType <em>Type</em>}</li>
 *   <li>{@link org.yazgel.jpql.xtext.jPQL.FromClass#getJoins <em>Joins</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getFromClass()
 * @model
 * @generated
 */
public interface FromClass extends FromEntry
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(JvmType)
   * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getFromClass_Type()
   * @model
   * @generated
   */
  JvmType getType();

  /**
   * Sets the value of the '{@link org.yazgel.jpql.xtext.jPQL.FromClass#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmType value);

  /**
   * Returns the value of the '<em><b>Joins</b></em>' containment reference list.
   * The list contents are of type {@link org.yazgel.jpql.xtext.jPQL.FromJoin}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Joins</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Joins</em>' containment reference list.
   * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getFromClass_Joins()
   * @model containment="true"
   * @generated
   */
  EList<FromJoin> getJoins();

} // FromClass
