/**
 */
package org.yazgel.jpql.xtext.jPQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Query Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.jpql.xtext.jPQL.InQueryExpression#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getInQueryExpression()
 * @model
 * @generated
 */
public interface InQueryExpression extends InExpression
{
  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference.
   * @see #setQuery(SelectStatement)
   * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getInQueryExpression_Query()
   * @model containment="true"
   * @generated
   */
  SelectStatement getQuery();

  /**
   * Sets the value of the '{@link org.yazgel.jpql.xtext.jPQL.InQueryExpression#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(SelectStatement value);

} // InQueryExpression
