/**
 */
package org.yazgel.jpql.xtext.jPQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Left Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.jpql.xtext.jPQL.LeftJoin#isIsOuter <em>Is Outer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getLeftJoin()
 * @model
 * @generated
 */
public interface LeftJoin extends FromJoin
{
  /**
   * Returns the value of the '<em><b>Is Outer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Outer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Outer</em>' attribute.
   * @see #setIsOuter(boolean)
   * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getLeftJoin_IsOuter()
   * @model
   * @generated
   */
  boolean isIsOuter();

  /**
   * Sets the value of the '{@link org.yazgel.jpql.xtext.jPQL.LeftJoin#isIsOuter <em>Is Outer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Outer</em>' attribute.
   * @see #isIsOuter()
   * @generated
   */
  void setIsOuter(boolean value);

} // LeftJoin
