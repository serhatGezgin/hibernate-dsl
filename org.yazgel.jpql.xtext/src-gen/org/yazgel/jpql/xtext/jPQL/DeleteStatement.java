/**
 */
package org.yazgel.jpql.xtext.jPQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.jpql.xtext.jPQL.DeleteStatement#getDeleteClause <em>Delete Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getDeleteStatement()
 * @model
 * @generated
 */
public interface DeleteStatement extends Query
{
  /**
   * Returns the value of the '<em><b>Delete Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delete Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delete Clause</em>' containment reference.
   * @see #setDeleteClause(DeleteClause)
   * @see org.yazgel.jpql.xtext.jPQL.JPQLPackage#getDeleteStatement_DeleteClause()
   * @model containment="true"
   * @generated
   */
  DeleteClause getDeleteClause();

  /**
   * Sets the value of the '{@link org.yazgel.jpql.xtext.jPQL.DeleteStatement#getDeleteClause <em>Delete Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete Clause</em>' containment reference.
   * @see #getDeleteClause()
   * @generated
   */
  void setDeleteClause(DeleteClause value);

} // DeleteStatement
