/**
 */
package org.yazgel.hibernate.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.yazgel.hibernate.Entity;
import org.yazgel.hibernate.EntityAnnotation;
import org.yazgel.hibernate.Feature;
import org.yazgel.hibernate.HibernatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.hibernate.impl.EntityImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.yazgel.hibernate.impl.EntityImpl#getSuperEntity <em>Super Entity</em>}</li>
 *   <li>{@link org.yazgel.hibernate.impl.EntityImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends NamedElementImpl implements Entity {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getSuperEntity() <em>Super Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity superEntity;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityAnnotation> annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HibernatePackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, HibernatePackage.ENTITY__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSuperEntity() {
		if (superEntity != null && superEntity.eIsProxy()) {
			InternalEObject oldSuperEntity = (InternalEObject)superEntity;
			superEntity = (Entity)eResolveProxy(oldSuperEntity);
			if (superEntity != oldSuperEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HibernatePackage.ENTITY__SUPER_ENTITY, oldSuperEntity, superEntity));
			}
		}
		return superEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSuperEntity() {
		return superEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperEntity(Entity newSuperEntity) {
		Entity oldSuperEntity = superEntity;
		superEntity = newSuperEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HibernatePackage.ENTITY__SUPER_ENTITY, oldSuperEntity, superEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EDataTypeUniqueEList<EntityAnnotation>(EntityAnnotation.class, this, HibernatePackage.ENTITY__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HibernatePackage.ENTITY__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HibernatePackage.ENTITY__FEATURES:
				return getFeatures();
			case HibernatePackage.ENTITY__SUPER_ENTITY:
				if (resolve) return getSuperEntity();
				return basicGetSuperEntity();
			case HibernatePackage.ENTITY__ANNOTATIONS:
				return getAnnotations();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HibernatePackage.ENTITY__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case HibernatePackage.ENTITY__SUPER_ENTITY:
				setSuperEntity((Entity)newValue);
				return;
			case HibernatePackage.ENTITY__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends EntityAnnotation>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case HibernatePackage.ENTITY__FEATURES:
				getFeatures().clear();
				return;
			case HibernatePackage.ENTITY__SUPER_ENTITY:
				setSuperEntity((Entity)null);
				return;
			case HibernatePackage.ENTITY__ANNOTATIONS:
				getAnnotations().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HibernatePackage.ENTITY__FEATURES:
				return features != null && !features.isEmpty();
			case HibernatePackage.ENTITY__SUPER_ENTITY:
				return superEntity != null;
			case HibernatePackage.ENTITY__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (annotations: ");
		result.append(annotations);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
