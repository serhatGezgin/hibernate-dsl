/**
 */
package org.yazgel.jpql.xtext.jPQL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yazgel.jpql.xtext.jPQL.BetweenExpression;
import org.yazgel.jpql.xtext.jPQL.JPQLPackage;
import org.yazgel.jpql.xtext.jPQL.Value;
import org.yazgel.jpql.xtext.jPQL.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Between Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.jpql.xtext.jPQL.impl.BetweenExpressionImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.yazgel.jpql.xtext.jPQL.impl.BetweenExpressionImpl#isIsNot <em>Is Not</em>}</li>
 *   <li>{@link org.yazgel.jpql.xtext.jPQL.impl.BetweenExpressionImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.yazgel.jpql.xtext.jPQL.impl.BetweenExpressionImpl#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BetweenExpressionImpl extends ExpressionImpl implements BetweenExpression
{
  /**
   * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhs()
   * @generated
   * @ordered
   */
  protected Variable lhs;

  /**
   * The default value of the '{@link #isIsNot() <em>Is Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNot()
   * @generated
   * @ordered
   */
  protected static final boolean IS_NOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsNot() <em>Is Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNot()
   * @generated
   * @ordered
   */
  protected boolean isNot = IS_NOT_EDEFAULT;

  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected Value min;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected Value max;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BetweenExpressionImpl()
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
    return JPQLPackage.Literals.BETWEEN_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getLhs()
  {
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLhs(Variable newLhs, NotificationChain msgs)
  {
    Variable oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.BETWEEN_EXPRESSION__LHS, oldLhs, newLhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLhs(Variable newLhs)
  {
    if (newLhs != lhs)
    {
      NotificationChain msgs = null;
      if (lhs != null)
        msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.BETWEEN_EXPRESSION__LHS, null, msgs);
      if (newLhs != null)
        msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.BETWEEN_EXPRESSION__LHS, null, msgs);
      msgs = basicSetLhs(newLhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.BETWEEN_EXPRESSION__LHS, newLhs, newLhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsNot()
  {
    return isNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsNot(boolean newIsNot)
  {
    boolean oldIsNot = isNot;
    isNot = newIsNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.BETWEEN_EXPRESSION__IS_NOT, oldIsNot, isNot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMin(Value newMin, NotificationChain msgs)
  {
    Value oldMin = min;
    min = newMin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.BETWEEN_EXPRESSION__MIN, oldMin, newMin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin(Value newMin)
  {
    if (newMin != min)
    {
      NotificationChain msgs = null;
      if (min != null)
        msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.BETWEEN_EXPRESSION__MIN, null, msgs);
      if (newMin != null)
        msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.BETWEEN_EXPRESSION__MIN, null, msgs);
      msgs = basicSetMin(newMin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.BETWEEN_EXPRESSION__MIN, newMin, newMin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMax(Value newMax, NotificationChain msgs)
  {
    Value oldMax = max;
    max = newMax;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.BETWEEN_EXPRESSION__MAX, oldMax, newMax);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(Value newMax)
  {
    if (newMax != max)
    {
      NotificationChain msgs = null;
      if (max != null)
        msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.BETWEEN_EXPRESSION__MAX, null, msgs);
      if (newMax != null)
        msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.BETWEEN_EXPRESSION__MAX, null, msgs);
      msgs = basicSetMax(newMax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.BETWEEN_EXPRESSION__MAX, newMax, newMax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JPQLPackage.BETWEEN_EXPRESSION__LHS:
        return basicSetLhs(null, msgs);
      case JPQLPackage.BETWEEN_EXPRESSION__MIN:
        return basicSetMin(null, msgs);
      case JPQLPackage.BETWEEN_EXPRESSION__MAX:
        return basicSetMax(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JPQLPackage.BETWEEN_EXPRESSION__LHS:
        return getLhs();
      case JPQLPackage.BETWEEN_EXPRESSION__IS_NOT:
        return isIsNot();
      case JPQLPackage.BETWEEN_EXPRESSION__MIN:
        return getMin();
      case JPQLPackage.BETWEEN_EXPRESSION__MAX:
        return getMax();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JPQLPackage.BETWEEN_EXPRESSION__LHS:
        setLhs((Variable)newValue);
        return;
      case JPQLPackage.BETWEEN_EXPRESSION__IS_NOT:
        setIsNot((Boolean)newValue);
        return;
      case JPQLPackage.BETWEEN_EXPRESSION__MIN:
        setMin((Value)newValue);
        return;
      case JPQLPackage.BETWEEN_EXPRESSION__MAX:
        setMax((Value)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JPQLPackage.BETWEEN_EXPRESSION__LHS:
        setLhs((Variable)null);
        return;
      case JPQLPackage.BETWEEN_EXPRESSION__IS_NOT:
        setIsNot(IS_NOT_EDEFAULT);
        return;
      case JPQLPackage.BETWEEN_EXPRESSION__MIN:
        setMin((Value)null);
        return;
      case JPQLPackage.BETWEEN_EXPRESSION__MAX:
        setMax((Value)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JPQLPackage.BETWEEN_EXPRESSION__LHS:
        return lhs != null;
      case JPQLPackage.BETWEEN_EXPRESSION__IS_NOT:
        return isNot != IS_NOT_EDEFAULT;
      case JPQLPackage.BETWEEN_EXPRESSION__MIN:
        return min != null;
      case JPQLPackage.BETWEEN_EXPRESSION__MAX:
        return max != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (isNot: ");
    result.append(isNot);
    result.append(')');
    return result.toString();
  }

} //BetweenExpressionImpl
