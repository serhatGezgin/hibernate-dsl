/**
 */
package org.yazgel.jpql.xtext.jPQL.impl;

import org.eclipse.emf.ecore.EClass;

import org.yazgel.jpql.xtext.jPQL.JPQLPackage;
import org.yazgel.jpql.xtext.jPQL.MinAggregate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MinAggregateImpl extends SelectAggregateExpressionImpl implements MinAggregate
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MinAggregateImpl()
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
    return JPQLPackage.Literals.MIN_AGGREGATE;
  }

} //MinAggregateImpl
