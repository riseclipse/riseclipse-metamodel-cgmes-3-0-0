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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantIEC;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantQcontrolModeKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Plant Reactive Control IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getKiwpx <em>Kiwpx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getWindPlantQcontrolModesType <em>Wind Plant Qcontrol Modes Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getKwpqu <em>Kwpqu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getTwpqfiltq <em>Twpqfiltq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getTuqfilt <em>Tuqfilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getDxrefmin <em>Dxrefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getKpwpx <em>Kpwpx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getXrefmax <em>Xrefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getWindPlantIEC <em>Wind Plant IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getTwppfiltq <em>Twppfiltq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getXrefmin <em>Xrefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getTxfv <em>Txfv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getTxft <em>Txft</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getDxrefmax <em>Dxrefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getUwpqdip <em>Uwpqdip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getKwpqref <em>Kwpqref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getKiwpxmax <em>Kiwpxmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getTwpufiltq <em>Twpufiltq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindPlantReactiveControlIECImpl#getKiwpxmin <em>Kiwpxmin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindPlantReactiveControlIECImpl extends IdentifiedObjectImpl implements WindPlantReactiveControlIEC {
    /**
     * The cached value of the '{@link #getWindDynamicsLookupTable() <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindDynamicsLookupTable()
     * @generated
     * @ordered
     */
    protected EList< WindDynamicsLookupTable > windDynamicsLookupTable;

    /**
     * The default value of the '{@link #getKiwpx() <em>Kiwpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiwpx()
     * @generated
     * @ordered
     */
    protected static final Double KIWPX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKiwpx() <em>Kiwpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiwpx()
     * @generated
     * @ordered
     */
    protected Double kiwpx = KIWPX_EDEFAULT;

    /**
     * This is true if the Kiwpx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiwpxESet;

    /**
     * The default value of the '{@link #getWindPlantQcontrolModesType() <em>Wind Plant Qcontrol Modes Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindPlantQcontrolModesType()
     * @generated
     * @ordered
     */
    protected static final WindPlantQcontrolModeKind WIND_PLANT_QCONTROL_MODES_TYPE_EDEFAULT = WindPlantQcontrolModeKind.REACTIVE_POWER;

    /**
     * The cached value of the '{@link #getWindPlantQcontrolModesType() <em>Wind Plant Qcontrol Modes Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindPlantQcontrolModesType()
     * @generated
     * @ordered
     */
    protected WindPlantQcontrolModeKind windPlantQcontrolModesType = WIND_PLANT_QCONTROL_MODES_TYPE_EDEFAULT;

    /**
     * This is true if the Wind Plant Qcontrol Modes Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windPlantQcontrolModesTypeESet;

    /**
     * The default value of the '{@link #getKwpqu() <em>Kwpqu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKwpqu()
     * @generated
     * @ordered
     */
    protected static final Double KWPQU_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKwpqu() <em>Kwpqu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKwpqu()
     * @generated
     * @ordered
     */
    protected Double kwpqu = KWPQU_EDEFAULT;

    /**
     * This is true if the Kwpqu attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kwpquESet;

    /**
     * The default value of the '{@link #getTwpqfiltq() <em>Twpqfiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwpqfiltq()
     * @generated
     * @ordered
     */
    protected static final Double TWPQFILTQ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTwpqfiltq() <em>Twpqfiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwpqfiltq()
     * @generated
     * @ordered
     */
    protected Double twpqfiltq = TWPQFILTQ_EDEFAULT;

    /**
     * This is true if the Twpqfiltq attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean twpqfiltqESet;

    /**
     * The default value of the '{@link #getTuqfilt() <em>Tuqfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTuqfilt()
     * @generated
     * @ordered
     */
    protected static final Double TUQFILT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTuqfilt() <em>Tuqfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTuqfilt()
     * @generated
     * @ordered
     */
    protected Double tuqfilt = TUQFILT_EDEFAULT;

    /**
     * This is true if the Tuqfilt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tuqfiltESet;

    /**
     * The default value of the '{@link #getDxrefmin() <em>Dxrefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDxrefmin()
     * @generated
     * @ordered
     */
    protected static final Double DXREFMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDxrefmin() <em>Dxrefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDxrefmin()
     * @generated
     * @ordered
     */
    protected Double dxrefmin = DXREFMIN_EDEFAULT;

    /**
     * This is true if the Dxrefmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dxrefminESet;

    /**
     * The default value of the '{@link #getKpwpx() <em>Kpwpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpwpx()
     * @generated
     * @ordered
     */
    protected static final Double KPWPX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpwpx() <em>Kpwpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpwpx()
     * @generated
     * @ordered
     */
    protected Double kpwpx = KPWPX_EDEFAULT;

    /**
     * This is true if the Kpwpx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpwpxESet;

    /**
     * The default value of the '{@link #getXrefmax() <em>Xrefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXrefmax()
     * @generated
     * @ordered
     */
    protected static final Double XREFMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXrefmax() <em>Xrefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXrefmax()
     * @generated
     * @ordered
     */
    protected Double xrefmax = XREFMAX_EDEFAULT;

    /**
     * This is true if the Xrefmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xrefmaxESet;

    /**
     * The cached value of the '{@link #getWindPlantIEC() <em>Wind Plant IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindPlantIEC()
     * @generated
     * @ordered
     */
    protected WindPlantIEC windPlantIEC;

    /**
     * This is true if the Wind Plant IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windPlantIECESet;

    /**
     * The default value of the '{@link #getTwppfiltq() <em>Twppfiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwppfiltq()
     * @generated
     * @ordered
     */
    protected static final Double TWPPFILTQ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTwppfiltq() <em>Twppfiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwppfiltq()
     * @generated
     * @ordered
     */
    protected Double twppfiltq = TWPPFILTQ_EDEFAULT;

    /**
     * This is true if the Twppfiltq attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean twppfiltqESet;

    /**
     * The default value of the '{@link #getXrefmin() <em>Xrefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXrefmin()
     * @generated
     * @ordered
     */
    protected static final Double XREFMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXrefmin() <em>Xrefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXrefmin()
     * @generated
     * @ordered
     */
    protected Double xrefmin = XREFMIN_EDEFAULT;

    /**
     * This is true if the Xrefmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xrefminESet;

    /**
     * The default value of the '{@link #getTxfv() <em>Txfv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTxfv()
     * @generated
     * @ordered
     */
    protected static final Double TXFV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTxfv() <em>Txfv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTxfv()
     * @generated
     * @ordered
     */
    protected Double txfv = TXFV_EDEFAULT;

    /**
     * This is true if the Txfv attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean txfvESet;

    /**
     * The default value of the '{@link #getTxft() <em>Txft</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTxft()
     * @generated
     * @ordered
     */
    protected static final Double TXFT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTxft() <em>Txft</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTxft()
     * @generated
     * @ordered
     */
    protected Double txft = TXFT_EDEFAULT;

    /**
     * This is true if the Txft attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean txftESet;

    /**
     * The default value of the '{@link #getDxrefmax() <em>Dxrefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDxrefmax()
     * @generated
     * @ordered
     */
    protected static final Double DXREFMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDxrefmax() <em>Dxrefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDxrefmax()
     * @generated
     * @ordered
     */
    protected Double dxrefmax = DXREFMAX_EDEFAULT;

    /**
     * This is true if the Dxrefmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dxrefmaxESet;

    /**
     * The default value of the '{@link #getUwpqdip() <em>Uwpqdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUwpqdip()
     * @generated
     * @ordered
     */
    protected static final Double UWPQDIP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUwpqdip() <em>Uwpqdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUwpqdip()
     * @generated
     * @ordered
     */
    protected Double uwpqdip = UWPQDIP_EDEFAULT;

    /**
     * This is true if the Uwpqdip attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uwpqdipESet;

    /**
     * The default value of the '{@link #getKwpqref() <em>Kwpqref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKwpqref()
     * @generated
     * @ordered
     */
    protected static final Double KWPQREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKwpqref() <em>Kwpqref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKwpqref()
     * @generated
     * @ordered
     */
    protected Double kwpqref = KWPQREF_EDEFAULT;

    /**
     * This is true if the Kwpqref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kwpqrefESet;

    /**
     * The default value of the '{@link #getKiwpxmax() <em>Kiwpxmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiwpxmax()
     * @generated
     * @ordered
     */
    protected static final Double KIWPXMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKiwpxmax() <em>Kiwpxmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiwpxmax()
     * @generated
     * @ordered
     */
    protected Double kiwpxmax = KIWPXMAX_EDEFAULT;

    /**
     * This is true if the Kiwpxmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiwpxmaxESet;

    /**
     * The default value of the '{@link #getTwpufiltq() <em>Twpufiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwpufiltq()
     * @generated
     * @ordered
     */
    protected static final Double TWPUFILTQ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTwpufiltq() <em>Twpufiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwpufiltq()
     * @generated
     * @ordered
     */
    protected Double twpufiltq = TWPUFILTQ_EDEFAULT;

    /**
     * This is true if the Twpufiltq attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean twpufiltqESet;

    /**
     * The default value of the '{@link #getKiwpxmin() <em>Kiwpxmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiwpxmin()
     * @generated
     * @ordered
     */
    protected static final Double KIWPXMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKiwpxmin() <em>Kiwpxmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiwpxmin()
     * @generated
     * @ordered
     */
    protected Double kiwpxmin = KIWPXMIN_EDEFAULT;

    /**
     * This is true if the Kiwpxmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiwpxminESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindPlantReactiveControlIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindPlantReactiveControlIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WindDynamicsLookupTable > getWindDynamicsLookupTable() {
        if( windDynamicsLookupTable == null ) {
            windDynamicsLookupTable = new EObjectWithInverseResolvingEList.Unsettable< >(
                    WindDynamicsLookupTable.class, this,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_REACTIVE_CONTROL_IEC );
        }
        return windDynamicsLookupTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWindDynamicsLookupTable() {
        if( windDynamicsLookupTable != null ) ( ( InternalEList.Unsettable< ? > ) windDynamicsLookupTable ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindDynamicsLookupTable() {
        return windDynamicsLookupTable != null && ( ( InternalEList.Unsettable< ? > ) windDynamicsLookupTable ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKiwpx() {
        return kiwpx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKiwpx( Double newKiwpx ) {
        Double oldKiwpx = kiwpx;
        kiwpx = newKiwpx;
        boolean oldKiwpxESet = kiwpxESet;
        kiwpxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPX,
                    oldKiwpx, kiwpx, !oldKiwpxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKiwpx() {
        Double oldKiwpx = kiwpx;
        boolean oldKiwpxESet = kiwpxESet;
        kiwpx = KIWPX_EDEFAULT;
        kiwpxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPX,
                    oldKiwpx, KIWPX_EDEFAULT, oldKiwpxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKiwpx() {
        return kiwpxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantQcontrolModeKind getWindPlantQcontrolModesType() {
        return windPlantQcontrolModesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWindPlantQcontrolModesType( WindPlantQcontrolModeKind newWindPlantQcontrolModesType ) {
        WindPlantQcontrolModeKind oldWindPlantQcontrolModesType = windPlantQcontrolModesType;
        windPlantQcontrolModesType = newWindPlantQcontrolModesType == null ? WIND_PLANT_QCONTROL_MODES_TYPE_EDEFAULT
                : newWindPlantQcontrolModesType;
        boolean oldWindPlantQcontrolModesTypeESet = windPlantQcontrolModesTypeESet;
        windPlantQcontrolModesTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_QCONTROL_MODES_TYPE,
                    oldWindPlantQcontrolModesType, windPlantQcontrolModesType, !oldWindPlantQcontrolModesTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWindPlantQcontrolModesType() {
        WindPlantQcontrolModeKind oldWindPlantQcontrolModesType = windPlantQcontrolModesType;
        boolean oldWindPlantQcontrolModesTypeESet = windPlantQcontrolModesTypeESet;
        windPlantQcontrolModesType = WIND_PLANT_QCONTROL_MODES_TYPE_EDEFAULT;
        windPlantQcontrolModesTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_QCONTROL_MODES_TYPE,
                    oldWindPlantQcontrolModesType, WIND_PLANT_QCONTROL_MODES_TYPE_EDEFAULT,
                    oldWindPlantQcontrolModesTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindPlantQcontrolModesType() {
        return windPlantQcontrolModesTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKwpqu() {
        return kwpqu;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKwpqu( Double newKwpqu ) {
        Double oldKwpqu = kwpqu;
        kwpqu = newKwpqu;
        boolean oldKwpquESet = kwpquESet;
        kwpquESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQU,
                    oldKwpqu, kwpqu, !oldKwpquESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKwpqu() {
        Double oldKwpqu = kwpqu;
        boolean oldKwpquESet = kwpquESet;
        kwpqu = KWPQU_EDEFAULT;
        kwpquESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQU,
                    oldKwpqu, KWPQU_EDEFAULT, oldKwpquESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKwpqu() {
        return kwpquESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTwpqfiltq() {
        return twpqfiltq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTwpqfiltq( Double newTwpqfiltq ) {
        Double oldTwpqfiltq = twpqfiltq;
        twpqfiltq = newTwpqfiltq;
        boolean oldTwpqfiltqESet = twpqfiltqESet;
        twpqfiltqESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPQFILTQ, oldTwpqfiltq, twpqfiltq,
                    !oldTwpqfiltqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTwpqfiltq() {
        Double oldTwpqfiltq = twpqfiltq;
        boolean oldTwpqfiltqESet = twpqfiltqESet;
        twpqfiltq = TWPQFILTQ_EDEFAULT;
        twpqfiltqESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPQFILTQ, oldTwpqfiltq, TWPQFILTQ_EDEFAULT,
                    oldTwpqfiltqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTwpqfiltq() {
        return twpqfiltqESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTuqfilt() {
        return tuqfilt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTuqfilt( Double newTuqfilt ) {
        Double oldTuqfilt = tuqfilt;
        tuqfilt = newTuqfilt;
        boolean oldTuqfiltESet = tuqfiltESet;
        tuqfiltESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TUQFILT,
                    oldTuqfilt, tuqfilt, !oldTuqfiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTuqfilt() {
        Double oldTuqfilt = tuqfilt;
        boolean oldTuqfiltESet = tuqfiltESet;
        tuqfilt = TUQFILT_EDEFAULT;
        tuqfiltESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TUQFILT, oldTuqfilt, TUQFILT_EDEFAULT,
                    oldTuqfiltESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTuqfilt() {
        return tuqfiltESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDxrefmin() {
        return dxrefmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDxrefmin( Double newDxrefmin ) {
        Double oldDxrefmin = dxrefmin;
        dxrefmin = newDxrefmin;
        boolean oldDxrefminESet = dxrefminESet;
        dxrefminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__DXREFMIN, oldDxrefmin, dxrefmin, !oldDxrefminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDxrefmin() {
        Double oldDxrefmin = dxrefmin;
        boolean oldDxrefminESet = dxrefminESet;
        dxrefmin = DXREFMIN_EDEFAULT;
        dxrefminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__DXREFMIN, oldDxrefmin, DXREFMIN_EDEFAULT,
                    oldDxrefminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDxrefmin() {
        return dxrefminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKpwpx() {
        return kpwpx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpwpx( Double newKpwpx ) {
        Double oldKpwpx = kpwpx;
        kpwpx = newKpwpx;
        boolean oldKpwpxESet = kpwpxESet;
        kpwpxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KPWPX,
                    oldKpwpx, kpwpx, !oldKpwpxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpwpx() {
        Double oldKpwpx = kpwpx;
        boolean oldKpwpxESet = kpwpxESet;
        kpwpx = KPWPX_EDEFAULT;
        kpwpxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KPWPX,
                    oldKpwpx, KPWPX_EDEFAULT, oldKpwpxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpwpx() {
        return kpwpxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXrefmax() {
        return xrefmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXrefmax( Double newXrefmax ) {
        Double oldXrefmax = xrefmax;
        xrefmax = newXrefmax;
        boolean oldXrefmaxESet = xrefmaxESet;
        xrefmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMAX,
                    oldXrefmax, xrefmax, !oldXrefmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXrefmax() {
        Double oldXrefmax = xrefmax;
        boolean oldXrefmaxESet = xrefmaxESet;
        xrefmax = XREFMAX_EDEFAULT;
        xrefmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMAX, oldXrefmax, XREFMAX_EDEFAULT,
                    oldXrefmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXrefmax() {
        return xrefmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantIEC getWindPlantIEC() {
        if( windPlantIEC != null && windPlantIEC.eIsProxy() ) {
            InternalEObject oldWindPlantIEC = ( InternalEObject ) windPlantIEC;
            windPlantIEC = ( WindPlantIEC ) eResolveProxy( oldWindPlantIEC );
            if( windPlantIEC != oldWindPlantIEC ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC, oldWindPlantIEC,
                            windPlantIEC ) );
            }
        }
        return windPlantIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindPlantIEC basicGetWindPlantIEC() {
        return windPlantIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindPlantIEC( WindPlantIEC newWindPlantIEC, NotificationChain msgs ) {
        WindPlantIEC oldWindPlantIEC = windPlantIEC;
        windPlantIEC = newWindPlantIEC;
        boolean oldWindPlantIECESet = windPlantIECESet;
        windPlantIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC, oldWindPlantIEC, newWindPlantIEC,
                    !oldWindPlantIECESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWindPlantIEC( WindPlantIEC newWindPlantIEC ) {
        if( newWindPlantIEC != windPlantIEC ) {
            NotificationChain msgs = null;
            if( windPlantIEC != null )
                msgs = ( ( InternalEObject ) windPlantIEC ).eInverseRemove( this,
                        CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC, WindPlantIEC.class, msgs );
            if( newWindPlantIEC != null )
                msgs = ( ( InternalEObject ) newWindPlantIEC ).eInverseAdd( this,
                        CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC, WindPlantIEC.class, msgs );
            msgs = basicSetWindPlantIEC( newWindPlantIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantIECESet = windPlantIECESet;
            windPlantIECESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC, newWindPlantIEC, newWindPlantIEC,
                        !oldWindPlantIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindPlantIEC( NotificationChain msgs ) {
        WindPlantIEC oldWindPlantIEC = windPlantIEC;
        windPlantIEC = null;
        boolean oldWindPlantIECESet = windPlantIECESet;
        windPlantIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC, oldWindPlantIEC, null,
                    oldWindPlantIECESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWindPlantIEC() {
        if( windPlantIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windPlantIEC ).eInverseRemove( this,
                    CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC, WindPlantIEC.class, msgs );
            msgs = basicUnsetWindPlantIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantIECESet = windPlantIECESet;
            windPlantIECESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC, null, null, oldWindPlantIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindPlantIEC() {
        return windPlantIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTwppfiltq() {
        return twppfiltq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTwppfiltq( Double newTwppfiltq ) {
        Double oldTwppfiltq = twppfiltq;
        twppfiltq = newTwppfiltq;
        boolean oldTwppfiltqESet = twppfiltqESet;
        twppfiltqESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPPFILTQ, oldTwppfiltq, twppfiltq,
                    !oldTwppfiltqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTwppfiltq() {
        Double oldTwppfiltq = twppfiltq;
        boolean oldTwppfiltqESet = twppfiltqESet;
        twppfiltq = TWPPFILTQ_EDEFAULT;
        twppfiltqESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPPFILTQ, oldTwppfiltq, TWPPFILTQ_EDEFAULT,
                    oldTwppfiltqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTwppfiltq() {
        return twppfiltqESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXrefmin() {
        return xrefmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXrefmin( Double newXrefmin ) {
        Double oldXrefmin = xrefmin;
        xrefmin = newXrefmin;
        boolean oldXrefminESet = xrefminESet;
        xrefminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMIN,
                    oldXrefmin, xrefmin, !oldXrefminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXrefmin() {
        Double oldXrefmin = xrefmin;
        boolean oldXrefminESet = xrefminESet;
        xrefmin = XREFMIN_EDEFAULT;
        xrefminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMIN, oldXrefmin, XREFMIN_EDEFAULT,
                    oldXrefminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXrefmin() {
        return xrefminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTxfv() {
        return txfv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTxfv( Double newTxfv ) {
        Double oldTxfv = txfv;
        txfv = newTxfv;
        boolean oldTxfvESet = txfvESet;
        txfvESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFV,
                    oldTxfv, txfv, !oldTxfvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTxfv() {
        Double oldTxfv = txfv;
        boolean oldTxfvESet = txfvESet;
        txfv = TXFV_EDEFAULT;
        txfvESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFV,
                    oldTxfv, TXFV_EDEFAULT, oldTxfvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTxfv() {
        return txfvESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTxft() {
        return txft;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTxft( Double newTxft ) {
        Double oldTxft = txft;
        txft = newTxft;
        boolean oldTxftESet = txftESet;
        txftESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFT,
                    oldTxft, txft, !oldTxftESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTxft() {
        Double oldTxft = txft;
        boolean oldTxftESet = txftESet;
        txft = TXFT_EDEFAULT;
        txftESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFT,
                    oldTxft, TXFT_EDEFAULT, oldTxftESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTxft() {
        return txftESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDxrefmax() {
        return dxrefmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDxrefmax( Double newDxrefmax ) {
        Double oldDxrefmax = dxrefmax;
        dxrefmax = newDxrefmax;
        boolean oldDxrefmaxESet = dxrefmaxESet;
        dxrefmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__DXREFMAX, oldDxrefmax, dxrefmax, !oldDxrefmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDxrefmax() {
        Double oldDxrefmax = dxrefmax;
        boolean oldDxrefmaxESet = dxrefmaxESet;
        dxrefmax = DXREFMAX_EDEFAULT;
        dxrefmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__DXREFMAX, oldDxrefmax, DXREFMAX_EDEFAULT,
                    oldDxrefmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDxrefmax() {
        return dxrefmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getUwpqdip() {
        return uwpqdip;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUwpqdip( Double newUwpqdip ) {
        Double oldUwpqdip = uwpqdip;
        uwpqdip = newUwpqdip;
        boolean oldUwpqdipESet = uwpqdipESet;
        uwpqdipESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__UWPQDIP,
                    oldUwpqdip, uwpqdip, !oldUwpqdipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUwpqdip() {
        Double oldUwpqdip = uwpqdip;
        boolean oldUwpqdipESet = uwpqdipESet;
        uwpqdip = UWPQDIP_EDEFAULT;
        uwpqdipESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__UWPQDIP, oldUwpqdip, UWPQDIP_EDEFAULT,
                    oldUwpqdipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUwpqdip() {
        return uwpqdipESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKwpqref() {
        return kwpqref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKwpqref( Double newKwpqref ) {
        Double oldKwpqref = kwpqref;
        kwpqref = newKwpqref;
        boolean oldKwpqrefESet = kwpqrefESet;
        kwpqrefESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQREF,
                    oldKwpqref, kwpqref, !oldKwpqrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKwpqref() {
        Double oldKwpqref = kwpqref;
        boolean oldKwpqrefESet = kwpqrefESet;
        kwpqref = KWPQREF_EDEFAULT;
        kwpqrefESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQREF, oldKwpqref, KWPQREF_EDEFAULT,
                    oldKwpqrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKwpqref() {
        return kwpqrefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKiwpxmax() {
        return kiwpxmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKiwpxmax( Double newKiwpxmax ) {
        Double oldKiwpxmax = kiwpxmax;
        kiwpxmax = newKiwpxmax;
        boolean oldKiwpxmaxESet = kiwpxmaxESet;
        kiwpxmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPXMAX, oldKiwpxmax, kiwpxmax, !oldKiwpxmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKiwpxmax() {
        Double oldKiwpxmax = kiwpxmax;
        boolean oldKiwpxmaxESet = kiwpxmaxESet;
        kiwpxmax = KIWPXMAX_EDEFAULT;
        kiwpxmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPXMAX, oldKiwpxmax, KIWPXMAX_EDEFAULT,
                    oldKiwpxmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKiwpxmax() {
        return kiwpxmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTwpufiltq() {
        return twpufiltq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTwpufiltq( Double newTwpufiltq ) {
        Double oldTwpufiltq = twpufiltq;
        twpufiltq = newTwpufiltq;
        boolean oldTwpufiltqESet = twpufiltqESet;
        twpufiltqESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPUFILTQ, oldTwpufiltq, twpufiltq,
                    !oldTwpufiltqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTwpufiltq() {
        Double oldTwpufiltq = twpufiltq;
        boolean oldTwpufiltqESet = twpufiltqESet;
        twpufiltq = TWPUFILTQ_EDEFAULT;
        twpufiltqESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPUFILTQ, oldTwpufiltq, TWPUFILTQ_EDEFAULT,
                    oldTwpufiltqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTwpufiltq() {
        return twpufiltqESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKiwpxmin() {
        return kiwpxmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKiwpxmin( Double newKiwpxmin ) {
        Double oldKiwpxmin = kiwpxmin;
        kiwpxmin = newKiwpxmin;
        boolean oldKiwpxminESet = kiwpxminESet;
        kiwpxminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPXMIN, oldKiwpxmin, kiwpxmin, !oldKiwpxminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKiwpxmin() {
        Double oldKiwpxmin = kiwpxmin;
        boolean oldKiwpxminESet = kiwpxminESet;
        kiwpxmin = KIWPXMIN_EDEFAULT;
        kiwpxminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPXMIN, oldKiwpxmin, KIWPXMIN_EDEFAULT,
                    oldKiwpxminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKiwpxmin() {
        return kiwpxminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWindDynamicsLookupTable() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC:
            if( windPlantIEC != null )
                msgs = ( ( InternalEObject ) windPlantIEC ).eInverseRemove( this,
                        CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC, WindPlantIEC.class, msgs );
            return basicSetWindPlantIEC( ( WindPlantIEC ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return ( ( InternalEList< ? > ) getWindDynamicsLookupTable() ).basicRemove( otherEnd, msgs );
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC:
            return basicUnsetWindPlantIEC( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return getWindDynamicsLookupTable();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPX:
            return getKiwpx();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_QCONTROL_MODES_TYPE:
            return getWindPlantQcontrolModesType();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQU:
            return getKwpqu();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPQFILTQ:
            return getTwpqfiltq();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TUQFILT:
            return getTuqfilt();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__DXREFMIN:
            return getDxrefmin();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KPWPX:
            return getKpwpx();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMAX:
            return getXrefmax();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC:
            if( resolve ) return getWindPlantIEC();
            return basicGetWindPlantIEC();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPPFILTQ:
            return getTwppfiltq();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMIN:
            return getXrefmin();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFV:
            return getTxfv();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFT:
            return getTxft();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__DXREFMAX:
            return getDxrefmax();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__UWPQDIP:
            return getUwpqdip();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQREF:
            return getKwpqref();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPXMAX:
            return getKiwpxmax();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPUFILTQ:
            return getTwpufiltq();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPXMIN:
            return getKiwpxmin();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            getWindDynamicsLookupTable().clear();
            getWindDynamicsLookupTable().addAll( ( Collection< ? extends WindDynamicsLookupTable > ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPX:
            setKiwpx( ( Double ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_QCONTROL_MODES_TYPE:
            setWindPlantQcontrolModesType( ( WindPlantQcontrolModeKind ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQU:
            setKwpqu( ( Double ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPQFILTQ:
            setTwpqfiltq( ( Double ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TUQFILT:
            setTuqfilt( ( Double ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__DXREFMIN:
            setDxrefmin( ( Double ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KPWPX:
            setKpwpx( ( Double ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMAX:
            setXrefmax( ( Double ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC:
            setWindPlantIEC( ( WindPlantIEC ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPPFILTQ:
            setTwppfiltq( ( Double ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMIN:
            setXrefmin( ( Double ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFV:
            setTxfv( ( Double ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFT:
            setTxft( ( Double ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__DXREFMAX:
            setDxrefmax( ( Double ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__UWPQDIP:
            setUwpqdip( ( Double ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQREF:
            setKwpqref( ( Double ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPXMAX:
            setKiwpxmax( ( Double ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPUFILTQ:
            setTwpufiltq( ( Double ) newValue );
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPXMIN:
            setKiwpxmin( ( Double ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            unsetWindDynamicsLookupTable();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPX:
            unsetKiwpx();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_QCONTROL_MODES_TYPE:
            unsetWindPlantQcontrolModesType();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQU:
            unsetKwpqu();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPQFILTQ:
            unsetTwpqfiltq();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TUQFILT:
            unsetTuqfilt();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__DXREFMIN:
            unsetDxrefmin();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KPWPX:
            unsetKpwpx();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMAX:
            unsetXrefmax();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC:
            unsetWindPlantIEC();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPPFILTQ:
            unsetTwppfiltq();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMIN:
            unsetXrefmin();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFV:
            unsetTxfv();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFT:
            unsetTxft();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__DXREFMAX:
            unsetDxrefmax();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__UWPQDIP:
            unsetUwpqdip();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQREF:
            unsetKwpqref();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPXMAX:
            unsetKiwpxmax();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPUFILTQ:
            unsetTwpufiltq();
            return;
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPXMIN:
            unsetKiwpxmin();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return isSetWindDynamicsLookupTable();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPX:
            return isSetKiwpx();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_QCONTROL_MODES_TYPE:
            return isSetWindPlantQcontrolModesType();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQU:
            return isSetKwpqu();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPQFILTQ:
            return isSetTwpqfiltq();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TUQFILT:
            return isSetTuqfilt();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__DXREFMIN:
            return isSetDxrefmin();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KPWPX:
            return isSetKpwpx();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMAX:
            return isSetXrefmax();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC:
            return isSetWindPlantIEC();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPPFILTQ:
            return isSetTwppfiltq();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__XREFMIN:
            return isSetXrefmin();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFV:
            return isSetTxfv();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TXFT:
            return isSetTxft();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__DXREFMAX:
            return isSetDxrefmax();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__UWPQDIP:
            return isSetUwpqdip();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KWPQREF:
            return isSetKwpqref();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPXMAX:
            return isSetKiwpxmax();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__TWPUFILTQ:
            return isSetTwpufiltq();
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__KIWPXMIN:
            return isSetKiwpxmin();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (kiwpx: " );
        if( kiwpxESet )
            result.append( kiwpx );
        else
            result.append( "<unset>" );
        result.append( ", windPlantQcontrolModesType: " );
        if( windPlantQcontrolModesTypeESet )
            result.append( windPlantQcontrolModesType );
        else
            result.append( "<unset>" );
        result.append( ", kwpqu: " );
        if( kwpquESet )
            result.append( kwpqu );
        else
            result.append( "<unset>" );
        result.append( ", twpqfiltq: " );
        if( twpqfiltqESet )
            result.append( twpqfiltq );
        else
            result.append( "<unset>" );
        result.append( ", tuqfilt: " );
        if( tuqfiltESet )
            result.append( tuqfilt );
        else
            result.append( "<unset>" );
        result.append( ", dxrefmin: " );
        if( dxrefminESet )
            result.append( dxrefmin );
        else
            result.append( "<unset>" );
        result.append( ", kpwpx: " );
        if( kpwpxESet )
            result.append( kpwpx );
        else
            result.append( "<unset>" );
        result.append( ", xrefmax: " );
        if( xrefmaxESet )
            result.append( xrefmax );
        else
            result.append( "<unset>" );
        result.append( ", twppfiltq: " );
        if( twppfiltqESet )
            result.append( twppfiltq );
        else
            result.append( "<unset>" );
        result.append( ", xrefmin: " );
        if( xrefminESet )
            result.append( xrefmin );
        else
            result.append( "<unset>" );
        result.append( ", txfv: " );
        if( txfvESet )
            result.append( txfv );
        else
            result.append( "<unset>" );
        result.append( ", txft: " );
        if( txftESet )
            result.append( txft );
        else
            result.append( "<unset>" );
        result.append( ", dxrefmax: " );
        if( dxrefmaxESet )
            result.append( dxrefmax );
        else
            result.append( "<unset>" );
        result.append( ", uwpqdip: " );
        if( uwpqdipESet )
            result.append( uwpqdip );
        else
            result.append( "<unset>" );
        result.append( ", kwpqref: " );
        if( kwpqrefESet )
            result.append( kwpqref );
        else
            result.append( "<unset>" );
        result.append( ", kiwpxmax: " );
        if( kiwpxmaxESet )
            result.append( kiwpxmax );
        else
            result.append( "<unset>" );
        result.append( ", twpufiltq: " );
        if( twpufiltqESet )
            result.append( twpufiltq );
        else
            result.append( "<unset>" );
        result.append( ", kiwpxmin: " );
        if( kiwpxminESet )
            result.append( kiwpxmin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindPlantReactiveControlIECImpl
