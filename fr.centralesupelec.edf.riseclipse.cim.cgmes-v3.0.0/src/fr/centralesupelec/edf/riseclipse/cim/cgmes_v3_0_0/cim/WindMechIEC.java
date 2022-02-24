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
 * A representation of the model object '<em><b>Wind Mech IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Two mass model.
 * Reference: IEC 61400-27-1:2015, 5.6.2.1.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getCdrt <em>Cdrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getKdrt <em>Kdrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getHwtr <em>Hwtr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getHgen <em>Hgen</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindMechIEC()
 * @model
 * @generated
 */
public interface WindMechIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Wind Turbine Type3 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3IEC#getWindMechIEC <em>Wind Mech IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 3 model with which this wind mechanical model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type3 IEC</em>' reference.
     * @see #isSetWindTurbineType3IEC()
     * @see #unsetWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindMechIEC_WindTurbineType3IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3IEC#getWindMechIEC
     * @model opposite="WindMechIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindMechIEC.WindTurbineType3IEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType3IEC getWindTurbineType3IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type3 IEC</em>' reference.
     * @see #isSetWindTurbineType3IEC()
     * @see #unsetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @generated
     */
    void setWindTurbineType3IEC( WindTurbineType3IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @generated
     */
    void unsetWindTurbineType3IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type3 IEC</em>' reference is set.
     * @see #unsetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @generated
     */
    boolean isSetWindTurbineType3IEC();

    /**
     * Returns the value of the '<em><b>Cdrt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Drive train damping (<i>c</i><i><sub>drt</sub></i><i>)</i>. It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cdrt</em>' attribute.
     * @see #isSetCdrt()
     * @see #unsetCdrt()
     * @see #setCdrt(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindMechIEC_Cdrt()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindMechIEC.cdrt' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getCdrt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getCdrt <em>Cdrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cdrt</em>' attribute.
     * @see #isSetCdrt()
     * @see #unsetCdrt()
     * @see #getCdrt()
     * @generated
     */
    void setCdrt( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getCdrt <em>Cdrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCdrt()
     * @see #getCdrt()
     * @see #setCdrt(Double)
     * @generated
     */
    void unsetCdrt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getCdrt <em>Cdrt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cdrt</em>' attribute is set.
     * @see #unsetCdrt()
     * @see #getCdrt()
     * @see #setCdrt(Double)
     * @generated
     */
    boolean isSetCdrt();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type1or2 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2IEC#getWindMechIEC <em>Wind Mech IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind generator type 1 or type 2 model with which this wind mechanical model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type1or2 IEC</em>' reference.
     * @see #isSetWindTurbineType1or2IEC()
     * @see #unsetWindTurbineType1or2IEC()
     * @see #setWindTurbineType1or2IEC(WindTurbineType1or2IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindMechIEC_WindTurbineType1or2IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2IEC#getWindMechIEC
     * @model opposite="WindMechIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindMechIEC.WindTurbineType1or2IEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType1or2IEC getWindTurbineType1or2IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type1or2 IEC</em>' reference.
     * @see #isSetWindTurbineType1or2IEC()
     * @see #unsetWindTurbineType1or2IEC()
     * @see #getWindTurbineType1or2IEC()
     * @generated
     */
    void setWindTurbineType1or2IEC( WindTurbineType1or2IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType1or2IEC()
     * @see #getWindTurbineType1or2IEC()
     * @see #setWindTurbineType1or2IEC(WindTurbineType1or2IEC)
     * @generated
     */
    void unsetWindTurbineType1or2IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type1or2 IEC</em>' reference is set.
     * @see #unsetWindTurbineType1or2IEC()
     * @see #getWindTurbineType1or2IEC()
     * @see #setWindTurbineType1or2IEC(WindTurbineType1or2IEC)
     * @generated
     */
    boolean isSetWindTurbineType1or2IEC();

    /**
     * Returns the value of the '<em><b>Kdrt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Drive train stiffness (<i>k</i><i><sub>drt</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kdrt</em>' attribute.
     * @see #isSetKdrt()
     * @see #unsetKdrt()
     * @see #setKdrt(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindMechIEC_Kdrt()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindMechIEC.kdrt' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKdrt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getKdrt <em>Kdrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kdrt</em>' attribute.
     * @see #isSetKdrt()
     * @see #unsetKdrt()
     * @see #getKdrt()
     * @generated
     */
    void setKdrt( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getKdrt <em>Kdrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKdrt()
     * @see #getKdrt()
     * @see #setKdrt(Double)
     * @generated
     */
    void unsetKdrt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getKdrt <em>Kdrt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kdrt</em>' attribute is set.
     * @see #unsetKdrt()
     * @see #getKdrt()
     * @see #setKdrt(Double)
     * @generated
     */
    boolean isSetKdrt();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type4b IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindMechIEC <em>Wind Mech IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 4B model with which this wind mechanical model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type4b IEC</em>' reference.
     * @see #isSetWindTurbineType4bIEC()
     * @see #unsetWindTurbineType4bIEC()
     * @see #setWindTurbineType4bIEC(WindTurbineType4bIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindMechIEC_WindTurbineType4bIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC#getWindMechIEC
     * @model opposite="WindMechIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindMechIEC.WindTurbineType4bIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType4bIEC getWindTurbineType4bIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type4b IEC</em>' reference.
     * @see #isSetWindTurbineType4bIEC()
     * @see #unsetWindTurbineType4bIEC()
     * @see #getWindTurbineType4bIEC()
     * @generated
     */
    void setWindTurbineType4bIEC( WindTurbineType4bIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType4bIEC()
     * @see #getWindTurbineType4bIEC()
     * @see #setWindTurbineType4bIEC(WindTurbineType4bIEC)
     * @generated
     */
    void unsetWindTurbineType4bIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type4b IEC</em>' reference is set.
     * @see #unsetWindTurbineType4bIEC()
     * @see #getWindTurbineType4bIEC()
     * @see #setWindTurbineType4bIEC(WindTurbineType4bIEC)
     * @generated
     */
    boolean isSetWindTurbineType4bIEC();

    /**
     * Returns the value of the '<em><b>Hwtr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Inertia constant of wind turbine rotor (<i>H</i><i><sub>WTR</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Hwtr</em>' attribute.
     * @see #isSetHwtr()
     * @see #unsetHwtr()
     * @see #setHwtr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindMechIEC_Hwtr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindMechIEC.hwtr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getHwtr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getHwtr <em>Hwtr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hwtr</em>' attribute.
     * @see #isSetHwtr()
     * @see #unsetHwtr()
     * @see #getHwtr()
     * @generated
     */
    void setHwtr( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getHwtr <em>Hwtr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHwtr()
     * @see #getHwtr()
     * @see #setHwtr(Double)
     * @generated
     */
    void unsetHwtr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getHwtr <em>Hwtr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hwtr</em>' attribute is set.
     * @see #unsetHwtr()
     * @see #getHwtr()
     * @see #setHwtr(Double)
     * @generated
     */
    boolean isSetHwtr();

    /**
     * Returns the value of the '<em><b>Hgen</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Inertia constant of generator (<i>H</i><i><sub>gen</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Hgen</em>' attribute.
     * @see #isSetHgen()
     * @see #unsetHgen()
     * @see #setHgen(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindMechIEC_Hgen()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindMechIEC.hgen' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getHgen();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getHgen <em>Hgen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hgen</em>' attribute.
     * @see #isSetHgen()
     * @see #unsetHgen()
     * @see #getHgen()
     * @generated
     */
    void setHgen( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getHgen <em>Hgen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHgen()
     * @see #getHgen()
     * @see #setHgen(Double)
     * @generated
     */
    void unsetHgen();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC#getHgen <em>Hgen</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hgen</em>' attribute is set.
     * @see #unsetHgen()
     * @see #getHgen()
     * @see #setHgen(Double)
     * @generated
     */
    boolean isSetHgen();

} // WindMechIEC
