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
 * A representation of the model object '<em><b>Overexc Lim X2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Field voltage or current overexcitation limiter designed to protect the generator field of an AC machine with automatic excitation control from overheating due to prolonged overexcitation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getVlow <em>Vlow</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfdrated <em>Efdrated</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfddes <em>Efddes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getM <em>M</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getKmx <em>Kmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfd2 <em>Efd2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfd1 <em>Efd1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfd3 <em>Efd3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getT3 <em>T3</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX2()
 * @model
 * @generated
 */
public interface OverexcLimX2 extends OverexcitationLimiterDynamics {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX2_Vlow()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX2.vlow' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVlow();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getVlow <em>Vlow</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getVlow <em>Vlow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVlow()
     * @see #getVlow()
     * @see #setVlow(Double)
     * @generated
     */
    void unsetVlow();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getVlow <em>Vlow</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Efdrated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rated field voltage if m = false or rated field current if m = true (<i>EFD</i><i><sub>RATED</sub></i>).  Typical value = 1,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efdrated</em>' attribute.
     * @see #isSetEfdrated()
     * @see #unsetEfdrated()
     * @see #setEfdrated(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX2_Efdrated()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX2.efdrated' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfdrated();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfdrated <em>Efdrated</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfdrated <em>Efdrated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfdrated()
     * @see #getEfdrated()
     * @see #setEfdrated(Double)
     * @generated
     */
    void unsetEfdrated();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfdrated <em>Efdrated</em>}' attribute is set.
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
     * Desired field voltage if <i>m</i> = false or desired field current if <i>m </i>= true (<i>EFD</i><i><sub>DES</sub></i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efddes</em>' attribute.
     * @see #isSetEfddes()
     * @see #unsetEfddes()
     * @see #setEfddes(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX2_Efddes()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX2.efddes' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfddes();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfddes <em>Efddes</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfddes <em>Efddes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfddes()
     * @see #getEfddes()
     * @see #setEfddes(Double)
     * @generated
     */
    void unsetEfddes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfddes <em>Efddes</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efddes</em>' attribute is set.
     * @see #unsetEfddes()
     * @see #getEfddes()
     * @see #setEfddes(Double)
     * @generated
     */
    boolean isSetEfddes();

    /**
     * Returns the value of the '<em><b>M</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * (<i>m</i>).
     * true = IFD limiting
     * false = EFD limiting.
     * <!-- end-model-doc -->
     * @return the value of the '<em>M</em>' attribute.
     * @see #isSetM()
     * @see #unsetM()
     * @see #setM(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX2_M()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX2.m' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getM();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getM <em>M</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>M</em>' attribute.
     * @see #isSetM()
     * @see #unsetM()
     * @see #getM()
     * @generated
     */
    void setM( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getM <em>M</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetM()
     * @see #getM()
     * @see #setM(Boolean)
     * @generated
     */
    void unsetM();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getM <em>M</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>M</em>' attribute is set.
     * @see #unsetM()
     * @see #getM()
     * @see #setM(Boolean)
     * @generated
     */
    boolean isSetM();

    /**
     * Returns the value of the '<em><b>Kmx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>K</i><i><sub>MX</sub></i>).  Typical value = 0,002.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kmx</em>' attribute.
     * @see #isSetKmx()
     * @see #unsetKmx()
     * @see #setKmx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX2_Kmx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX2.kmx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getKmx <em>Kmx</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getKmx <em>Kmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKmx()
     * @see #getKmx()
     * @see #setKmx(Double)
     * @generated
     */
    void unsetKmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getKmx <em>Kmx</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Efd2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mid voltage or current point on the inverse time characteristic (<i>EFD</i><i><sub>2</sub></i>).  Typical value = 1,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efd2</em>' attribute.
     * @see #isSetEfd2()
     * @see #unsetEfd2()
     * @see #setEfd2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX2_Efd2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX2.efd2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfd2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfd2 <em>Efd2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfd2 <em>Efd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfd2()
     * @see #getEfd2()
     * @see #setEfd2(Double)
     * @generated
     */
    void unsetEfd2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfd2 <em>Efd2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Efd1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low voltage or current point on the inverse time characteristic (<i>EFD</i><i><sub>1</sub></i>).  Typical value = 1,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efd1</em>' attribute.
     * @see #isSetEfd1()
     * @see #unsetEfd1()
     * @see #setEfd1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX2_Efd1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX2.efd1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfd1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfd1 <em>Efd1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfd1 <em>Efd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfd1()
     * @see #getEfd1()
     * @see #setEfd1(Double)
     * @generated
     */
    void unsetEfd1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfd1 <em>Efd1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Efd3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High voltage or current point on the inverse time characteristic (<i>EFD</i><i><sub>3</sub></i>).  Typical value = 1,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efd3</em>' attribute.
     * @see #isSetEfd3()
     * @see #unsetEfd3()
     * @see #setEfd3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX2_Efd3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX2.efd3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfd3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfd3 <em>Efd3</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfd3 <em>Efd3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfd3()
     * @see #getEfd3()
     * @see #setEfd3(Double)
     * @generated
     */
    void unsetEfd3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getEfd3 <em>Efd3</em>}' attribute is set.
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
     * Returns the value of the '<em><b>T1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time to trip the exciter at the low voltage or current point on the inverse time characteristic (<i>TIME</i><i><sub>1</sub></i>) (&gt;= 0).  Typical value = 120.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #setT1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX2_T1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX2.t1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getT1 <em>T1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1()
     * @see #getT1()
     * @see #setT1(Double)
     * @generated
     */
    void unsetT1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getT1 <em>T1</em>}' attribute is set.
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
     * Time to trip the exciter at the mid voltage or current point on the inverse time characteristic (<i>TIME</i><i><sub>2</sub></i>) (&gt;= 0).  Typical value = 40.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #setT2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX2_T2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX2.t2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getT2 <em>T2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT2()
     * @see #getT2()
     * @see #setT2(Double)
     * @generated
     */
    void unsetT2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getT2 <em>T2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>T3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time to trip the exciter at the high voltage or current point on the inverse time characteristic (<i>TIME</i><i><sub>3</sub></i>) (&gt;= 0).  Typical value = 15.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T3</em>' attribute.
     * @see #isSetT3()
     * @see #unsetT3()
     * @see #setT3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getOverexcLimX2_T3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='OverexcLimX2.t3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getT3 <em>T3</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT3()
     * @see #getT3()
     * @see #setT3(Double)
     * @generated
     */
    void unsetT3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2#getT3 <em>T3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T3</em>' attribute is set.
     * @see #unsetT3()
     * @see #getT3()
     * @see #setT3(Double)
     * @generated
     */
    boolean isSetT3();

} // OverexcLimX2
