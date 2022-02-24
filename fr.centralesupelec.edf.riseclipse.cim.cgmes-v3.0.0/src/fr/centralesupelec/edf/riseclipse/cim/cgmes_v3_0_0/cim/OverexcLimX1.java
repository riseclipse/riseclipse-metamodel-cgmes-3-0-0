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
 * A representation of the model object '<em><b>Overexc Lim X1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Field voltage over excitation limiter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfd2 <em>Efd2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfd3 <em>Efd3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfd1 <em>Efd1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getVlow <em>Vlow</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getKmx <em>Kmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfdrated <em>Efdrated</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfddes <em>Efddes</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX1()
 * @model
 * @generated
 */
public interface OverexcLimX1 extends OverexcitationLimiterDynamics {
    /**
     * Returns the value of the '<em><b>T3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time to trip the exciter at the high voltage point on the inverse time characteristic (<i>TIME</i><i><sub>3</sub></i>) (&gt;= 0).  Typical value = 15.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T3</em>' attribute.
     * @see #isSetT3()
     * @see #unsetT3()
     * @see #setT3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX1_T3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX1.t3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T3</em>' attribute.
     * @see #isSetT3()
     * @see #unsetT3()
     * @see #getT3()
     * @generated
     */
    void setT3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT3()
     * @see #getT3()
     * @see #setT3(Double)
     * @generated
     */
    void unsetT3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getT3 <em>T3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T3</em>' attribute is set.
     * @see #unsetT3()
     * @see #getT3()
     * @see #setT3(Double)
     * @generated
     */
    boolean isSetT3();

    /**
     * Returns the value of the '<em><b>T1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time to trip the exciter at the low voltage point on the inverse time characteristic (<i>TIME</i><i><sub>1</sub></i>) (&gt;= 0).  Typical value = 120.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #setT1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX1_T1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX1.t1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #getT1()
     * @generated
     */
    void setT1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1()
     * @see #getT1()
     * @see #setT1(Double)
     * @generated
     */
    void unsetT1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getT1 <em>T1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T1</em>' attribute is set.
     * @see #unsetT1()
     * @see #getT1()
     * @see #setT1(Double)
     * @generated
     */
    boolean isSetT1();

    /**
     * Returns the value of the '<em><b>T2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time to trip the exciter at the mid voltage point on the inverse time characteristic (<i>TIME</i><i><sub>2</sub></i>) (&gt;= 0).  Typical value = 40.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #setT2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX1_T2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX1.t2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #getT2()
     * @generated
     */
    void setT2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT2()
     * @see #getT2()
     * @see #setT2(Double)
     * @generated
     */
    void unsetT2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getT2 <em>T2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T2</em>' attribute is set.
     * @see #unsetT2()
     * @see #getT2()
     * @see #setT2(Double)
     * @generated
     */
    boolean isSetT2();

    /**
     * Returns the value of the '<em><b>Efd2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mid voltage point on the inverse time characteristic (<i>EFD</i><i><sub>2</sub></i>).  Typical value = 1,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efd2</em>' attribute.
     * @see #isSetEfd2()
     * @see #unsetEfd2()
     * @see #setEfd2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX1_Efd2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX1.efd2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfd2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfd2 <em>Efd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efd2</em>' attribute.
     * @see #isSetEfd2()
     * @see #unsetEfd2()
     * @see #getEfd2()
     * @generated
     */
    void setEfd2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfd2 <em>Efd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfd2()
     * @see #getEfd2()
     * @see #setEfd2(Double)
     * @generated
     */
    void unsetEfd2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfd2 <em>Efd2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efd2</em>' attribute is set.
     * @see #unsetEfd2()
     * @see #getEfd2()
     * @see #setEfd2(Double)
     * @generated
     */
    boolean isSetEfd2();

    /**
     * Returns the value of the '<em><b>Efd3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High voltage point on the inverse time characteristic (<i>EFD</i><i><sub>3</sub></i>).  Typical value = 1,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efd3</em>' attribute.
     * @see #isSetEfd3()
     * @see #unsetEfd3()
     * @see #setEfd3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX1_Efd3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX1.efd3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfd3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfd3 <em>Efd3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efd3</em>' attribute.
     * @see #isSetEfd3()
     * @see #unsetEfd3()
     * @see #getEfd3()
     * @generated
     */
    void setEfd3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfd3 <em>Efd3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfd3()
     * @see #getEfd3()
     * @see #setEfd3(Double)
     * @generated
     */
    void unsetEfd3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfd3 <em>Efd3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efd3</em>' attribute is set.
     * @see #unsetEfd3()
     * @see #getEfd3()
     * @see #setEfd3(Double)
     * @generated
     */
    boolean isSetEfd3();

    /**
     * Returns the value of the '<em><b>Efd1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low voltage point on the inverse time characteristic (<i>EFD</i><i><sub>1</sub></i>).  Typical value = 1,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efd1</em>' attribute.
     * @see #isSetEfd1()
     * @see #unsetEfd1()
     * @see #setEfd1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX1_Efd1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX1.efd1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfd1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfd1 <em>Efd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efd1</em>' attribute.
     * @see #isSetEfd1()
     * @see #unsetEfd1()
     * @see #getEfd1()
     * @generated
     */
    void setEfd1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfd1 <em>Efd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfd1()
     * @see #getEfd1()
     * @see #setEfd1(Double)
     * @generated
     */
    void unsetEfd1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfd1 <em>Efd1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efd1</em>' attribute is set.
     * @see #unsetEfd1()
     * @see #getEfd1()
     * @see #setEfd1(Double)
     * @generated
     */
    boolean isSetEfd1();

    /**
     * Returns the value of the '<em><b>Vlow</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low voltage limit (<i>V</i><i><sub>LOW</sub></i>) (&gt; 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vlow</em>' attribute.
     * @see #isSetVlow()
     * @see #unsetVlow()
     * @see #setVlow(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX1_Vlow()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX1.vlow' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVlow();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getVlow <em>Vlow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vlow</em>' attribute.
     * @see #isSetVlow()
     * @see #unsetVlow()
     * @see #getVlow()
     * @generated
     */
    void setVlow( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getVlow <em>Vlow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVlow()
     * @see #getVlow()
     * @see #setVlow(Double)
     * @generated
     */
    void unsetVlow();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getVlow <em>Vlow</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vlow</em>' attribute is set.
     * @see #unsetVlow()
     * @see #getVlow()
     * @see #setVlow(Double)
     * @generated
     */
    boolean isSetVlow();

    /**
     * Returns the value of the '<em><b>Kmx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>K</i><i><sub>MX</sub></i>).  Typical value = 0,01.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kmx</em>' attribute.
     * @see #isSetKmx()
     * @see #unsetKmx()
     * @see #setKmx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX1_Kmx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX1.kmx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getKmx <em>Kmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kmx</em>' attribute.
     * @see #isSetKmx()
     * @see #unsetKmx()
     * @see #getKmx()
     * @generated
     */
    void setKmx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getKmx <em>Kmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKmx()
     * @see #getKmx()
     * @see #setKmx(Double)
     * @generated
     */
    void unsetKmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getKmx <em>Kmx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kmx</em>' attribute is set.
     * @see #unsetKmx()
     * @see #getKmx()
     * @see #setKmx(Double)
     * @generated
     */
    boolean isSetKmx();

    /**
     * Returns the value of the '<em><b>Efdrated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rated field voltage (<i>EFD</i><i><sub>RATED</sub></i>).  Typical value = 1,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efdrated</em>' attribute.
     * @see #isSetEfdrated()
     * @see #unsetEfdrated()
     * @see #setEfdrated(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX1_Efdrated()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX1.efdrated' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfdrated();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfdrated <em>Efdrated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efdrated</em>' attribute.
     * @see #isSetEfdrated()
     * @see #unsetEfdrated()
     * @see #getEfdrated()
     * @generated
     */
    void setEfdrated( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfdrated <em>Efdrated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfdrated()
     * @see #getEfdrated()
     * @see #setEfdrated(Double)
     * @generated
     */
    void unsetEfdrated();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfdrated <em>Efdrated</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efdrated</em>' attribute is set.
     * @see #unsetEfdrated()
     * @see #getEfdrated()
     * @see #setEfdrated(Double)
     * @generated
     */
    boolean isSetEfdrated();

    /**
     * Returns the value of the '<em><b>Efddes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Desired field voltage (<i>EFD</i><i><sub>DES</sub></i>).  Typical value = 0,9.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efddes</em>' attribute.
     * @see #isSetEfddes()
     * @see #unsetEfddes()
     * @see #setEfddes(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX1_Efddes()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX1.efddes' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfddes();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfddes <em>Efddes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efddes</em>' attribute.
     * @see #isSetEfddes()
     * @see #unsetEfddes()
     * @see #getEfddes()
     * @generated
     */
    void setEfddes( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfddes <em>Efddes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfddes()
     * @see #getEfddes()
     * @see #setEfddes(Double)
     * @generated
     */
    void unsetEfddes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX1#getEfddes <em>Efddes</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efddes</em>' attribute is set.
     * @see #unsetEfddes()
     * @see #getEfddes()
     * @see #setEfddes(Double)
     * @generated
     */
    boolean isSetEfddes();

} // OverexcLimX1
