/**
 */
package org.yazgel.jpql.xtext.jPQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.jpql.xtext.jPQL.FromEntry#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getFromEntry()
 * @model
 * @generated
 */
public interface FromEntry extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VariableDeclaration)
   * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getFromEntry_Variable()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariable();

  /**
   * Sets the value of the '{@link org.yazgel.jpql.xtext.jPQL.FromEntry#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDeclaration value);

} // FromEntry
