/**
 */
package org.yazgel.jpql.xtext.jPQL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.yazgel.jpql.xtext.jPQL.FromEntry;
import org.yazgel.jpql.xtext.jPQL.JPQLPackage;
import org.yazgel.jpql.xtext.jPQL.UpdateClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.jpql.xtext.jPQL.impl.UpdateClauseImpl#getFromEntries <em>From Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UpdateClauseImpl extends MinimalEObjectImpl.Container implements UpdateClause
{
  /**
   * The cached value of the '{@link #getFromEntries() <em>From Entries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromEntries()
   * @generated
   * @ordered
   */
  protected EList<FromEntry> fromEntries;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UpdateClauseImpl()
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
    return JPQLPackage.Literals.UPDATE_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FromEntry> getFromEntries()
  {
    if (fromEntries == null)
    {
      fromEntries = new EObjectContainmentEList<FromEntry>(FromEntry.class, this, JPQLPackage.UPDATE_CLAUSE__FROM_ENTRIES);
    }
    return fromEntries;
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
      case JPQLPackage.UPDATE_CLAUSE__FROM_ENTRIES:
        return ((InternalEList<?>)getFromEntries()).basicRemove(otherEnd, msgs);
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
      case JPQLPackage.UPDATE_CLAUSE__FROM_ENTRIES:
        return getFromEntries();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JPQLPackage.UPDATE_CLAUSE__FROM_ENTRIES:
        getFromEntries().clear();
        getFromEntries().addAll((Collection<? extends FromEntry>)newValue);
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
      case JPQLPackage.UPDATE_CLAUSE__FROM_ENTRIES:
        getFromEntries().clear();
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
      case JPQLPackage.UPDATE_CLAUSE__FROM_ENTRIES:
        return fromEntries != null && !fromEntries.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UpdateClauseImpl
