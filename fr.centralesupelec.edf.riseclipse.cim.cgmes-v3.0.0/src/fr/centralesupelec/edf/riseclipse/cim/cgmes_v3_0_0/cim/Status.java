/**
 *   Copyright (c) 2016-2022 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
 *
 *  This file is part of the RiseClipse tool
 *
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      https://riseclipse.github.io/
 *
 */
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Current status information relevant to an entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status#getReason <em>Reason</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status#getRemark <em>Remark</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStatus()
 * @model
 * @generated
 */
public interface Status extends EObject {
    /**
     * Returns the value of the '<em><b>Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Date and time for which status 'value' applies.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Date Time</em>' attribute.
     * @see #isSetDateTime()
     * @see #unsetDateTime()
     * @see #setDateTime(XMLGregorianCalendar)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStatus_DateTime()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DateTime" transient="true" ordered="false"
     *        extendedMetaData="name='Status.dateTime' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    XMLGregorianCalendar getDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status#getDateTime <em>Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Date Time</em>' attribute.
     * @see #isSetDateTime()
     * @see #unsetDateTime()
     * @see #getDateTime()
     * @generated
     */
    void setDateTime( XMLGregorianCalendar value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status#getDateTime <em>Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDateTime()
     * @see #getDateTime()
     * @see #setDateTime(XMLGregorianCalendar)
     * @generated
     */
    void unsetDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status#getDateTime <em>Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Date Time</em>' attribute is set.
     * @see #unsetDateTime()
     * @see #getDateTime()
     * @see #setDateTime(XMLGregorianCalendar)
     * @generated
     */
    boolean isSetDateTime();

    /**
     * Returns the value of the '<em><b>Reason</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reason code or explanation for why an object went to the current status 'value'.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reason</em>' attribute.
     * @see #isSetReason()
     * @see #unsetReason()
     * @see #setReason(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStatus_Reason()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='Status.reason' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getReason();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status#getReason <em>Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reason</em>' attribute.
     * @see #isSetReason()
     * @see #unsetReason()
     * @see #getReason()
     * @generated
     */
    void setReason( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status#getReason <em>Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReason()
     * @see #getReason()
     * @see #setReason(String)
     * @generated
     */
    void unsetReason();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status#getReason <em>Reason</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reason</em>' attribute is set.
     * @see #unsetReason()
     * @see #getReason()
     * @see #setReason(String)
     * @generated
     */
    boolean isSetReason();

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Status value at 'dateTime'; prior status changes may have been kept in instances of activity records associated with the object to which this status applies.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #setValue(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStatus_Value()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='Status.value' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #getValue()
     * @generated
     */
    void setValue( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue()
     * @see #getValue()
     * @see #setValue(String)
     * @generated
     */
    void unsetValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status#getValue <em>Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value</em>' attribute is set.
     * @see #unsetValue()
     * @see #getValue()
     * @see #setValue(String)
     * @generated
     */
    boolean isSetValue();

    /**
     * Returns the value of the '<em><b>Remark</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pertinent information regarding the current 'value', as free form text.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Remark</em>' attribute.
     * @see #isSetRemark()
     * @see #unsetRemark()
     * @see #setRemark(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getStatus_Remark()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='Status.remark' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getRemark();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status#getRemark <em>Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remark</em>' attribute.
     * @see #isSetRemark()
     * @see #unsetRemark()
     * @see #getRemark()
     * @generated
     */
    void setRemark( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status#getRemark <em>Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemark()
     * @see #getRemark()
     * @see #setRemark(String)
     * @generated
     */
    void unsetRemark();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Status#getRemark <em>Remark</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remark</em>' attribute is set.
     * @see #unsetRemark()
     * @see #getRemark()
     * @see #setRemark(String)
     * @generated
     */
    boolean isSetRemark();

} // Status
