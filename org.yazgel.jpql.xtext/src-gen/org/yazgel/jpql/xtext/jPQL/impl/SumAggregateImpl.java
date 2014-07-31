/**
 */
package org.yazgel.jpql.xtext.jPQL.impl;

import org.eclipse.emf.ecore.EClass;

import org.yazgel.jpql.xtext.jPQL.JPQLPackage;
import org.yazgel.jpql.xtext.jPQL.SumAggregate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sum Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SumAggregateImpl extends SelectAggregateExpressionImpl implements SumAggregate
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SumAggregateImpl()
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
    return JPQLPackage.Literals.SUM_AGGREGATE;
  }

} //SumAggregateImpl
