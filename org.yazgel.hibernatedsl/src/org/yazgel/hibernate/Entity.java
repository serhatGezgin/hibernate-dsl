/**
 */
package org.yazgel.hibernate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.hibernate.Entity#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.yazgel.hibernate.Entity#getSuperEntity <em>Super Entity</em>}</li>
 *   <li>{@link org.yazgel.hibernate.Entity#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.hibernate.HibernatePackage#getEntity()
 * @model annotation="gmf.node label='name' figure='rounded' label.icon='true' border.color='0,0,0' color='249,250,217'"
 * @generated
 */
public interface Entity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.yazgel.hibernate.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.yazgel.hibernate.HibernatePackage#getEntity_Features()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Super Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Entity</em>' reference.
	 * @see #setSuperEntity(Entity)
	 * @see org.yazgel.hibernate.HibernatePackage#getEntity_SuperEntity()
	 * @model annotation="gmf.link target.decoration='closedarrow' style='solid' width='1' color='0,0,0' tool.small.bundle='org.yazgel.hermes.edit' tool.small.path='icons/full/obj16/Inheritance.gif'"
	 * @generated
	 */
	Entity getSuperEntity();

	/**
	 * Sets the value of the '{@link org.yazgel.hibernate.Entity#getSuperEntity <em>Super Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Entity</em>' reference.
	 * @see #getSuperEntity()
	 * @generated
	 */
	void setSuperEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute list.
	 * The list contents are of type {@link org.yazgel.hibernate.EntityAnnotation}.
	 * The literals are from the enumeration {@link org.yazgel.hibernate.EntityAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute list.
	 * @see org.yazgel.hibernate.EntityAnnotation
	 * @see org.yazgel.hibernate.HibernatePackage#getEntity_Annotations()
	 * @model
	 * @generated
	 */
	EList<EntityAnnotation> getAnnotations();

} // Entity
