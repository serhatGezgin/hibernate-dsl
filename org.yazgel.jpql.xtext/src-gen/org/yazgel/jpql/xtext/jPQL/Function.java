/**
 */
package org.yazgel.jpql.xtext.jPQL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.jpql.xtext.jPQL.Function#getName <em>Name</em>}</li>
 *   <li>{@link org.yazgel.jpql.xtext.jPQL.Function#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.yazgel.jpql.xtext.jPQL.Function#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.yazgel.jpql.xtext.jPQL.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getFunction_Params()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getParams();

} // Function
