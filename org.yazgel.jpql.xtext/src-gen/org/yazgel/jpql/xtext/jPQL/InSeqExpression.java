/**
 */
package org.yazgel.jpql.xtext.jPQL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Seq Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.jpql.xtext.jPQL.InSeqExpression#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getInSeqExpression()
 * @model
 * @generated
 */
public interface InSeqExpression extends InExpression
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link org.yazgel.jpql.xtext.jPQL.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getInSeqExpression_Items()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getItems();

} // InSeqExpression
