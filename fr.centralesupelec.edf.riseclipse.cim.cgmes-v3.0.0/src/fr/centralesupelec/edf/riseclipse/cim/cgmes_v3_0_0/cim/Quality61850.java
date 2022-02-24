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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality61850</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Quality flags in this class are as defined in IEC 61850, except for estimatorReplaced, which has been included in this class for convenience.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getValidity <em>Validity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getSuspect <em>Suspect</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOscillatory <em>Oscillatory</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOperatorBlocked <em>Operator Blocked</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOldData <em>Old Data</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getSource <em>Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getFailure <em>Failure</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getBadReference <em>Bad Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getTest <em>Test</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOutOfRange <em>Out Of Range</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOverFlow <em>Over Flow</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getEstimatorReplaced <em>Estimator Replaced</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getQuality61850()
 * @model
 * @generated
 */
public interface Quality61850 extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Validity</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Validity}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Validity of the measurement value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Validity</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Validity
     * @see #isSetValidity()
     * @see #unsetValidity()
     * @see #setValidity(Validity)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getQuality61850_Validity()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Quality61850.validity' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Validity getValidity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getValidity <em>Validity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Validity</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Validity
     * @see #isSetValidity()
     * @see #unsetValidity()
     * @see #getValidity()
     * @generated
     */
    void setValidity( Validity value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getValidity <em>Validity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValidity()
     * @see #getValidity()
     * @see #setValidity(Validity)
     * @generated
     */
    void unsetValidity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getValidity <em>Validity</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Validity</em>' attribute is set.
     * @see #unsetValidity()
     * @see #getValidity()
     * @see #setValidity(Validity)
     * @generated
     */
    boolean isSetValidity();

    /**
     * Returns the value of the '<em><b>Suspect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A correlation function has detected that the value is not consistent with other values. Typically set by a network State Estimator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Suspect</em>' attribute.
     * @see #isSetSuspect()
     * @see #unsetSuspect()
     * @see #setSuspect(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getQuality61850_Suspect()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Quality61850.suspect' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getSuspect();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getSuspect <em>Suspect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Suspect</em>' attribute.
     * @see #isSetSuspect()
     * @see #unsetSuspect()
     * @see #getSuspect()
     * @generated
     */
    void setSuspect( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getSuspect <em>Suspect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSuspect()
     * @see #getSuspect()
     * @see #setSuspect(Boolean)
     * @generated
     */
    void unsetSuspect();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getSuspect <em>Suspect</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Suspect</em>' attribute is set.
     * @see #unsetSuspect()
     * @see #getSuspect()
     * @see #setSuspect(Boolean)
     * @generated
     */
    boolean isSetSuspect();

    /**
     * Returns the value of the '<em><b>Oscillatory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * To prevent some overload of the communication it is sensible to detect and suppress oscillating (fast changing) binary inputs. If a signal changes in a defined time twice in the same direction (from 0 to 1 or from 1 to 0) then oscillation is detected and the detail quality identifier "oscillatory" is set. If it is detected a configured numbers of transient changes could be passed by. In this time the validity status "questionable" is set. If after this defined numbers of changes the signal is still in the oscillating state the value shall be set either to the opposite state of the previous stable value or to a defined default value. In this case the validity status "questionable" is reset and "invalid" is set as long as the signal is oscillating. If it is configured such that no transient changes should be passed by then the validity status "invalid" is set immediately in addition to the detail quality identifier "oscillatory" (used for status information only).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Oscillatory</em>' attribute.
     * @see #isSetOscillatory()
     * @see #unsetOscillatory()
     * @see #setOscillatory(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getQuality61850_Oscillatory()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Quality61850.oscillatory' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getOscillatory();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOscillatory <em>Oscillatory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Oscillatory</em>' attribute.
     * @see #isSetOscillatory()
     * @see #unsetOscillatory()
     * @see #getOscillatory()
     * @generated
     */
    void setOscillatory( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOscillatory <em>Oscillatory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOscillatory()
     * @see #getOscillatory()
     * @see #setOscillatory(Boolean)
     * @generated
     */
    void unsetOscillatory();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOscillatory <em>Oscillatory</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Oscillatory</em>' attribute is set.
     * @see #unsetOscillatory()
     * @see #getOscillatory()
     * @see #setOscillatory(Boolean)
     * @generated
     */
    boolean isSetOscillatory();

    /**
     * Returns the value of the '<em><b>Operator Blocked</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Measurement value is blocked and hence unavailable for transmission.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Operator Blocked</em>' attribute.
     * @see #isSetOperatorBlocked()
     * @see #unsetOperatorBlocked()
     * @see #setOperatorBlocked(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getQuality61850_OperatorBlocked()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Quality61850.operatorBlocked' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getOperatorBlocked();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOperatorBlocked <em>Operator Blocked</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator Blocked</em>' attribute.
     * @see #isSetOperatorBlocked()
     * @see #unsetOperatorBlocked()
     * @see #getOperatorBlocked()
     * @generated
     */
    void setOperatorBlocked( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOperatorBlocked <em>Operator Blocked</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperatorBlocked()
     * @see #getOperatorBlocked()
     * @see #setOperatorBlocked(Boolean)
     * @generated
     */
    void unsetOperatorBlocked();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOperatorBlocked <em>Operator Blocked</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operator Blocked</em>' attribute is set.
     * @see #unsetOperatorBlocked()
     * @see #getOperatorBlocked()
     * @see #setOperatorBlocked(Boolean)
     * @generated
     */
    boolean isSetOperatorBlocked();

    /**
     * Returns the value of the '<em><b>Old Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Measurement value is old and possibly invalid, as it has not been successfully updated during a specified time interval.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Old Data</em>' attribute.
     * @see #isSetOldData()
     * @see #unsetOldData()
     * @see #setOldData(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getQuality61850_OldData()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Quality61850.oldData' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getOldData();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOldData <em>Old Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Old Data</em>' attribute.
     * @see #isSetOldData()
     * @see #unsetOldData()
     * @see #getOldData()
     * @generated
     */
    void setOldData( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOldData <em>Old Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOldData()
     * @see #getOldData()
     * @see #setOldData(Boolean)
     * @generated
     */
    void unsetOldData();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOldData <em>Old Data</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Old Data</em>' attribute is set.
     * @see #unsetOldData()
     * @see #getOldData()
     * @see #setOldData(Boolean)
     * @generated
     */
    boolean isSetOldData();

    /**
     * Returns the value of the '<em><b>Source</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Source}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Source gives information related to the origin of a value. The value may be acquired from the process, defaulted or substituted.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Source
     * @see #isSetSource()
     * @see #unsetSource()
     * @see #setSource(Source)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getQuality61850_Source()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Quality61850.source' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Source getSource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getSource <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Source
     * @see #isSetSource()
     * @see #unsetSource()
     * @see #getSource()
     * @generated
     */
    void setSource( Source value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getSource <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSource()
     * @see #getSource()
     * @see #setSource(Source)
     * @generated
     */
    void unsetSource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getSource <em>Source</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Source</em>' attribute is set.
     * @see #unsetSource()
     * @see #getSource()
     * @see #setSource(Source)
     * @generated
     */
    boolean isSetSource();

    /**
     * Returns the value of the '<em><b>Failure</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This identifier indicates that a supervision function has detected an internal or external failure, e.g. communication failure.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Failure</em>' attribute.
     * @see #isSetFailure()
     * @see #unsetFailure()
     * @see #setFailure(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getQuality61850_Failure()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Quality61850.failure' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getFailure();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getFailure <em>Failure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Failure</em>' attribute.
     * @see #isSetFailure()
     * @see #unsetFailure()
     * @see #getFailure()
     * @generated
     */
    void setFailure( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getFailure <em>Failure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFailure()
     * @see #getFailure()
     * @see #setFailure(Boolean)
     * @generated
     */
    void unsetFailure();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getFailure <em>Failure</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Failure</em>' attribute is set.
     * @see #unsetFailure()
     * @see #getFailure()
     * @see #setFailure(Boolean)
     * @generated
     */
    boolean isSetFailure();

    /**
     * Returns the value of the '<em><b>Bad Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Measurement value may be incorrect due to a reference being out of calibration.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bad Reference</em>' attribute.
     * @see #isSetBadReference()
     * @see #unsetBadReference()
     * @see #setBadReference(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getQuality61850_BadReference()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Quality61850.badReference' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getBadReference();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getBadReference <em>Bad Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bad Reference</em>' attribute.
     * @see #isSetBadReference()
     * @see #unsetBadReference()
     * @see #getBadReference()
     * @generated
     */
    void setBadReference( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getBadReference <em>Bad Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBadReference()
     * @see #getBadReference()
     * @see #setBadReference(Boolean)
     * @generated
     */
    void unsetBadReference();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getBadReference <em>Bad Reference</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bad Reference</em>' attribute is set.
     * @see #unsetBadReference()
     * @see #getBadReference()
     * @see #setBadReference(Boolean)
     * @generated
     */
    boolean isSetBadReference();

    /**
     * Returns the value of the '<em><b>Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Measurement value is transmitted for test purposes.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Test</em>' attribute.
     * @see #isSetTest()
     * @see #unsetTest()
     * @see #setTest(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getQuality61850_Test()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Quality61850.test' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getTest();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getTest <em>Test</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test</em>' attribute.
     * @see #isSetTest()
     * @see #unsetTest()
     * @see #getTest()
     * @generated
     */
    void setTest( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getTest <em>Test</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTest()
     * @see #getTest()
     * @see #setTest(Boolean)
     * @generated
     */
    void unsetTest();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getTest <em>Test</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test</em>' attribute is set.
     * @see #unsetTest()
     * @see #getTest()
     * @see #setTest(Boolean)
     * @generated
     */
    boolean isSetTest();

    /**
     * Returns the value of the '<em><b>Out Of Range</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Measurement value is beyond a predefined range of value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Out Of Range</em>' attribute.
     * @see #isSetOutOfRange()
     * @see #unsetOutOfRange()
     * @see #setOutOfRange(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getQuality61850_OutOfRange()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Quality61850.outOfRange' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getOutOfRange();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOutOfRange <em>Out Of Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Out Of Range</em>' attribute.
     * @see #isSetOutOfRange()
     * @see #unsetOutOfRange()
     * @see #getOutOfRange()
     * @generated
     */
    void setOutOfRange( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOutOfRange <em>Out Of Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutOfRange()
     * @see #getOutOfRange()
     * @see #setOutOfRange(Boolean)
     * @generated
     */
    void unsetOutOfRange();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOutOfRange <em>Out Of Range</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Out Of Range</em>' attribute is set.
     * @see #unsetOutOfRange()
     * @see #getOutOfRange()
     * @see #setOutOfRange(Boolean)
     * @generated
     */
    boolean isSetOutOfRange();

    /**
     * Returns the value of the '<em><b>Over Flow</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Measurement value is beyond the capability of being  represented properly. For example, a counter value overflows from maximum count back to a value of zero.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Over Flow</em>' attribute.
     * @see #isSetOverFlow()
     * @see #unsetOverFlow()
     * @see #setOverFlow(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getQuality61850_OverFlow()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Quality61850.overFlow' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getOverFlow();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOverFlow <em>Over Flow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Over Flow</em>' attribute.
     * @see #isSetOverFlow()
     * @see #unsetOverFlow()
     * @see #getOverFlow()
     * @generated
     */
    void setOverFlow( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOverFlow <em>Over Flow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOverFlow()
     * @see #getOverFlow()
     * @see #setOverFlow(Boolean)
     * @generated
     */
    void unsetOverFlow();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getOverFlow <em>Over Flow</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Over Flow</em>' attribute is set.
     * @see #unsetOverFlow()
     * @see #getOverFlow()
     * @see #setOverFlow(Boolean)
     * @generated
     */
    boolean isSetOverFlow();

    /**
     * Returns the value of the '<em><b>Estimator Replaced</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Value has been replaced by State Estimator. estimatorReplaced is not an IEC61850 quality bit but has been put in this class for convenience.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Estimator Replaced</em>' attribute.
     * @see #isSetEstimatorReplaced()
     * @see #unsetEstimatorReplaced()
     * @see #setEstimatorReplaced(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getQuality61850_EstimatorReplaced()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Quality61850.estimatorReplaced' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getEstimatorReplaced();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getEstimatorReplaced <em>Estimator Replaced</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Estimator Replaced</em>' attribute.
     * @see #isSetEstimatorReplaced()
     * @see #unsetEstimatorReplaced()
     * @see #getEstimatorReplaced()
     * @generated
     */
    void setEstimatorReplaced( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getEstimatorReplaced <em>Estimator Replaced</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEstimatorReplaced()
     * @see #getEstimatorReplaced()
     * @see #setEstimatorReplaced(Boolean)
     * @generated
     */
    void unsetEstimatorReplaced();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Quality61850#getEstimatorReplaced <em>Estimator Replaced</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Estimator Replaced</em>' attribute is set.
     * @see #unsetEstimatorReplaced()
     * @see #getEstimatorReplaced()
     * @see #setEstimatorReplaced(Boolean)
     * @generated
     */
    boolean isSetEstimatorReplaced();

} // Quality61850
