/**
 */
package org.yazgel.jpql.xtext.jPQL.impl;

import org.eclipse.emf.ecore.EClass;

import org.yazgel.jpql.xtext.jPQL.JPQLPackage;
import org.yazgel.jpql.xtext.jPQL.MaxAggregate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MaxAggregateImpl extends SelectAggregateExpressionImpl implements MaxAggregate
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MaxAggregateImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JPQLPackage.Literals.MAX_AGGREGATE;
  }

} //MaxAggregateImpl
