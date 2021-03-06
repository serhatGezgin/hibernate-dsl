/**
 */
package org.yazgel.jpql.xtext.jPQL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias Attribute Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.jpql.xtext.jPQL.AliasAttributeExpression#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.yazgel.jpql.xtext.jPQL.AliasAttributeExpression#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getAliasAttributeExpression()
 * @model
 * @generated
 */
public interface AliasAttributeExpression extends SelectExpression, Variable
{
  /**
   * Returns the value of the '<em><b>Alias</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' reference.
   * @see #setAlias(VariableDeclaration)
   * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getAliasAttributeExpression_Alias()
   * @model
   * @generated
   */
  VariableDeclaration getAlias();

  /**
   * Sets the value of the '{@link org.yazgel.jpql.xtext.jPQL.AliasAttributeExpression#getAlias <em>Alias</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' reference.
   * @see #getAlias()
   * @generated
   */
  void setAlias(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' attribute list.
   * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getAliasAttributeExpression_Attributes()
   * @model unique="false"
   * @generated
   */
  EList<String> getAttributes();

} // AliasAttributeExpression
