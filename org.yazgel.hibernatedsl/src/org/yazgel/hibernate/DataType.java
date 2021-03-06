/**
 */
package org.yazgel.hibernate;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.hibernate.DataType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.hibernate.HibernatePackage#getDataType()
 * @model annotation="gmf.node label='name' figure='rounded' label.icon='true' border.color='0,0,0'"
 * @generated
 */
public interface DataType extends Feature {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.yazgel.hibernate.DataTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.yazgel.hibernate.DataTypes
	 * @see #setType(DataTypes)
	 * @see org.yazgel.hibernate.HibernatePackage#getDataType_Type()
	 * @model required="true"
	 * @generated
	 */
	DataTypes getType();

	/**
	 * Sets the value of the '{@link org.yazgel.hibernate.DataType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.yazgel.hibernate.DataTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(DataTypes value);

} // DataType
