/**
 */
package org.yazgel.jpql.xtext.jPQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.jpql.xtext.jPQL.StringExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getStringExpression()
 * @model
 * @generated
 */
public interface StringExpression extends Value
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getStringExpression_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.yazgel.jpql.xtext.jPQL.StringExpression#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // StringExpression
