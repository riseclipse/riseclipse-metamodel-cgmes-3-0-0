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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType2IEC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Cont Rotor RIEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContRotorRIECImpl#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContRotorRIECImpl#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContRotorRIECImpl#getTpfiltrr <em>Tpfiltrr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContRotorRIECImpl#getRmax <em>Rmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContRotorRIECImpl#getRmin <em>Rmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContRotorRIECImpl#getKpfilt <em>Kpfilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContRotorRIECImpl#getKirr <em>Kirr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContRotorRIECImpl#getKprr <em>Kprr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContRotorRIECImpl#getKomegafilt <em>Komegafilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContRotorRIECImpl#getTomegafiltrr <em>Tomegafiltrr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindContRotorRIECImpl extends IdentifiedObjectImpl implements WindContRotorRIEC {
    /**
     * The cached value of the '{@link #getWindGenTurbineType2IEC() <em>Wind Gen Turbine Type2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindGenTurbineType2IEC()
     * @generated
     * @ordered
     */
    protected WindGenTurbineType2IEC windGenTurbineType2IEC;

    /**
     * This is true if the Wind Gen Turbine Type2 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windGenTurbineType2IECESet;

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
     * The default value of the '{@link #getTpfiltrr() <em>Tpfiltrr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpfiltrr()
     * @generated
     * @ordered
     */
    protected static final Double TPFILTRR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpfiltrr() <em>Tpfiltrr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpfiltrr()
     * @generated
     * @ordered
     */
    protected Double tpfiltrr = TPFILTRR_EDEFAULT;

    /**
     * This is true if the Tpfiltrr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpfiltrrESet;

    /**
     * The default value of the '{@link #getRmax() <em>Rmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRmax()
     * @generated
     * @ordered
     */
    protected static final Double RMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRmax() <em>Rmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRmax()
     * @generated
     * @ordered
     */
    protected Double rmax = RMAX_EDEFAULT;

    /**
     * This is true if the Rmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rmaxESet;

    /**
     * The default value of the '{@link #getRmin() <em>Rmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRmin()
     * @generated
     * @ordered
     */
    protected static final Double RMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRmin() <em>Rmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRmin()
     * @generated
     * @ordered
     */
    protected Double rmin = RMIN_EDEFAULT;

    /**
     * This is true if the Rmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rminESet;

    /**
     * The default value of the '{@link #getKpfilt() <em>Kpfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpfilt()
     * @generated
     * @ordered
     */
    protected static final Double KPFILT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpfilt() <em>Kpfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpfilt()
     * @generated
     * @ordered
     */
    protected Double kpfilt = KPFILT_EDEFAULT;

    /**
     * This is true if the Kpfilt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpfiltESet;

    /**
     * The default value of the '{@link #getKirr() <em>Kirr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKirr()
     * @generated
     * @ordered
     */
    protected static final Double KIRR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKirr() <em>Kirr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKirr()
     * @generated
     * @ordered
     */
    protected Double kirr = KIRR_EDEFAULT;

    /**
     * This is true if the Kirr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kirrESet;

    /**
     * The default value of the '{@link #getKprr() <em>Kprr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKprr()
     * @generated
     * @ordered
     */
    protected static final Double KPRR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKprr() <em>Kprr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKprr()
     * @generated
     * @ordered
     */
    protected Double kprr = KPRR_EDEFAULT;

    /**
     * This is true if the Kprr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kprrESet;

    /**
     * The default value of the '{@link #getKomegafilt() <em>Komegafilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKomegafilt()
     * @generated
     * @ordered
     */
    protected static final Double KOMEGAFILT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKomegafilt() <em>Komegafilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKomegafilt()
     * @generated
     * @ordered
     */
    protected Double komegafilt = KOMEGAFILT_EDEFAULT;

    /**
     * This is true if the Komegafilt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean komegafiltESet;

    /**
     * The default value of the '{@link #getTomegafiltrr() <em>Tomegafiltrr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTomegafiltrr()
     * @generated
     * @ordered
     */
    protected static final Double TOMEGAFILTRR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTomegafiltrr() <em>Tomegafiltrr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTomegafiltrr()
     * @generated
     * @ordered
     */
    protected Double tomegafiltrr = TOMEGAFILTRR_EDEFAULT;

    /**
     * This is true if the Tomegafiltrr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tomegafiltrrESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindContRotorRIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindContRotorRIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenTurbineType2IEC getWindGenTurbineType2IEC() {
        if( windGenTurbineType2IEC != null && windGenTurbineType2IEC.eIsProxy() ) {
            InternalEObject oldWindGenTurbineType2IEC = ( InternalEObject ) windGenTurbineType2IEC;
            windGenTurbineType2IEC = ( WindGenTurbineType2IEC ) eResolveProxy( oldWindGenTurbineType2IEC );
            if( windGenTurbineType2IEC != oldWindGenTurbineType2IEC ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC, oldWindGenTurbineType2IEC,
                            windGenTurbineType2IEC ) );
                }
            }
        }
        return windGenTurbineType2IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindGenTurbineType2IEC basicGetWindGenTurbineType2IEC() {
        return windGenTurbineType2IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindGenTurbineType2IEC( WindGenTurbineType2IEC newWindGenTurbineType2IEC,
            NotificationChain msgs ) {
        WindGenTurbineType2IEC oldWindGenTurbineType2IEC = windGenTurbineType2IEC;
        windGenTurbineType2IEC = newWindGenTurbineType2IEC;
        boolean oldWindGenTurbineType2IECESet = windGenTurbineType2IECESet;
        windGenTurbineType2IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC, oldWindGenTurbineType2IEC,
                    newWindGenTurbineType2IEC, !oldWindGenTurbineType2IECESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWindGenTurbineType2IEC( WindGenTurbineType2IEC newWindGenTurbineType2IEC ) {
        if( newWindGenTurbineType2IEC != windGenTurbineType2IEC ) {
            NotificationChain msgs = null;
            if( windGenTurbineType2IEC != null ) {
                msgs = ( ( InternalEObject ) windGenTurbineType2IEC ).eInverseRemove( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC, WindGenTurbineType2IEC.class,
                        msgs );
            }
            if( newWindGenTurbineType2IEC != null ) {
                msgs = ( ( InternalEObject ) newWindGenTurbineType2IEC ).eInverseAdd( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC, WindGenTurbineType2IEC.class,
                        msgs );
            }
            msgs = basicSetWindGenTurbineType2IEC( newWindGenTurbineType2IEC, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldWindGenTurbineType2IECESet = windGenTurbineType2IECESet;
            windGenTurbineType2IECESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC, newWindGenTurbineType2IEC,
                        newWindGenTurbineType2IEC, !oldWindGenTurbineType2IECESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindGenTurbineType2IEC( NotificationChain msgs ) {
        WindGenTurbineType2IEC oldWindGenTurbineType2IEC = windGenTurbineType2IEC;
        windGenTurbineType2IEC = null;
        boolean oldWindGenTurbineType2IECESet = windGenTurbineType2IECESet;
        windGenTurbineType2IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC, oldWindGenTurbineType2IEC, null,
                    oldWindGenTurbineType2IECESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWindGenTurbineType2IEC() {
        if( windGenTurbineType2IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windGenTurbineType2IEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC, WindGenTurbineType2IEC.class, msgs );
            msgs = basicUnsetWindGenTurbineType2IEC( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldWindGenTurbineType2IECESet = windGenTurbineType2IECESet;
            windGenTurbineType2IECESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC, null, null,
                        oldWindGenTurbineType2IECESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindGenTurbineType2IEC() {
        return windGenTurbineType2IECESet;
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
                    WindDynamicsLookupTable.class, this, CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_ROTOR_RIEC );
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
        if( windDynamicsLookupTable != null ) {
            ( ( InternalEList.Unsettable< ? > ) windDynamicsLookupTable ).unset();
        }
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
    public Double getTpfiltrr() {
        return tpfiltrr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpfiltrr( Double newTpfiltrr ) {
        Double oldTpfiltrr = tpfiltrr;
        tpfiltrr = newTpfiltrr;
        boolean oldTpfiltrrESet = tpfiltrrESet;
        tpfiltrrESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_ROTOR_RIEC__TPFILTRR,
                    oldTpfiltrr, tpfiltrr, !oldTpfiltrrESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpfiltrr() {
        Double oldTpfiltrr = tpfiltrr;
        boolean oldTpfiltrrESet = tpfiltrrESet;
        tpfiltrr = TPFILTRR_EDEFAULT;
        tpfiltrrESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_ROTOR_RIEC__TPFILTRR,
                    oldTpfiltrr, TPFILTRR_EDEFAULT, oldTpfiltrrESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpfiltrr() {
        return tpfiltrrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRmax() {
        return rmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRmax( Double newRmax ) {
        Double oldRmax = rmax;
        rmax = newRmax;
        boolean oldRmaxESet = rmaxESet;
        rmaxESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_ROTOR_RIEC__RMAX, oldRmax,
                    rmax, !oldRmaxESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRmax() {
        Double oldRmax = rmax;
        boolean oldRmaxESet = rmaxESet;
        rmax = RMAX_EDEFAULT;
        rmaxESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_ROTOR_RIEC__RMAX, oldRmax,
                    RMAX_EDEFAULT, oldRmaxESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRmax() {
        return rmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRmin() {
        return rmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRmin( Double newRmin ) {
        Double oldRmin = rmin;
        rmin = newRmin;
        boolean oldRminESet = rminESet;
        rminESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_ROTOR_RIEC__RMIN, oldRmin,
                    rmin, !oldRminESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRmin() {
        Double oldRmin = rmin;
        boolean oldRminESet = rminESet;
        rmin = RMIN_EDEFAULT;
        rminESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_ROTOR_RIEC__RMIN, oldRmin,
                    RMIN_EDEFAULT, oldRminESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRmin() {
        return rminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKpfilt() {
        return kpfilt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpfilt( Double newKpfilt ) {
        Double oldKpfilt = kpfilt;
        kpfilt = newKpfilt;
        boolean oldKpfiltESet = kpfiltESet;
        kpfiltESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_ROTOR_RIEC__KPFILT, oldKpfilt,
                    kpfilt, !oldKpfiltESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpfilt() {
        Double oldKpfilt = kpfilt;
        boolean oldKpfiltESet = kpfiltESet;
        kpfilt = KPFILT_EDEFAULT;
        kpfiltESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_ROTOR_RIEC__KPFILT,
                    oldKpfilt, KPFILT_EDEFAULT, oldKpfiltESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpfilt() {
        return kpfiltESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKirr() {
        return kirr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKirr( Double newKirr ) {
        Double oldKirr = kirr;
        kirr = newKirr;
        boolean oldKirrESet = kirrESet;
        kirrESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_ROTOR_RIEC__KIRR, oldKirr,
                    kirr, !oldKirrESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKirr() {
        Double oldKirr = kirr;
        boolean oldKirrESet = kirrESet;
        kirr = KIRR_EDEFAULT;
        kirrESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_ROTOR_RIEC__KIRR, oldKirr,
                    KIRR_EDEFAULT, oldKirrESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKirr() {
        return kirrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKprr() {
        return kprr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKprr( Double newKprr ) {
        Double oldKprr = kprr;
        kprr = newKprr;
        boolean oldKprrESet = kprrESet;
        kprrESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_ROTOR_RIEC__KPRR, oldKprr,
                    kprr, !oldKprrESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKprr() {
        Double oldKprr = kprr;
        boolean oldKprrESet = kprrESet;
        kprr = KPRR_EDEFAULT;
        kprrESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_ROTOR_RIEC__KPRR, oldKprr,
                    KPRR_EDEFAULT, oldKprrESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKprr() {
        return kprrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKomegafilt() {
        return komegafilt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKomegafilt( Double newKomegafilt ) {
        Double oldKomegafilt = komegafilt;
        komegafilt = newKomegafilt;
        boolean oldKomegafiltESet = komegafiltESet;
        komegafiltESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_ROTOR_RIEC__KOMEGAFILT,
                    oldKomegafilt, komegafilt, !oldKomegafiltESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKomegafilt() {
        Double oldKomegafilt = komegafilt;
        boolean oldKomegafiltESet = komegafiltESet;
        komegafilt = KOMEGAFILT_EDEFAULT;
        komegafiltESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_ROTOR_RIEC__KOMEGAFILT,
                    oldKomegafilt, KOMEGAFILT_EDEFAULT, oldKomegafiltESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKomegafilt() {
        return komegafiltESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTomegafiltrr() {
        return tomegafiltrr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTomegafiltrr( Double newTomegafiltrr ) {
        Double oldTomegafiltrr = tomegafiltrr;
        tomegafiltrr = newTomegafiltrr;
        boolean oldTomegafiltrrESet = tomegafiltrrESet;
        tomegafiltrrESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_ROTOR_RIEC__TOMEGAFILTRR,
                    oldTomegafiltrr, tomegafiltrr, !oldTomegafiltrrESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTomegafiltrr() {
        Double oldTomegafiltrr = tomegafiltrr;
        boolean oldTomegafiltrrESet = tomegafiltrrESet;
        tomegafiltrr = TOMEGAFILTRR_EDEFAULT;
        tomegafiltrrESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_ROTOR_RIEC__TOMEGAFILTRR,
                    oldTomegafiltrr, TOMEGAFILTRR_EDEFAULT, oldTomegafiltrrESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTomegafiltrr() {
        return tomegafiltrrESet;
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
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC:
            if( windGenTurbineType2IEC != null ) {
                msgs = ( ( InternalEObject ) windGenTurbineType2IEC ).eInverseRemove( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE2_IEC__WIND_CONT_ROTOR_RIEC, WindGenTurbineType2IEC.class,
                        msgs );
            }
            return basicSetWindGenTurbineType2IEC( ( WindGenTurbineType2IEC ) otherEnd, msgs );
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWindDynamicsLookupTable() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC:
            return basicUnsetWindGenTurbineType2IEC( msgs );
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return ( ( InternalEList< ? > ) getWindDynamicsLookupTable() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC:
            if( resolve ) {
                return getWindGenTurbineType2IEC();
            }
            return basicGetWindGenTurbineType2IEC();
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return getWindDynamicsLookupTable();
        case CimPackage.WIND_CONT_ROTOR_RIEC__TPFILTRR:
            return getTpfiltrr();
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMAX:
            return getRmax();
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMIN:
            return getRmin();
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPFILT:
            return getKpfilt();
        case CimPackage.WIND_CONT_ROTOR_RIEC__KIRR:
            return getKirr();
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPRR:
            return getKprr();
        case CimPackage.WIND_CONT_ROTOR_RIEC__KOMEGAFILT:
            return getKomegafilt();
        case CimPackage.WIND_CONT_ROTOR_RIEC__TOMEGAFILTRR:
            return getTomegafiltrr();
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
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC:
            setWindGenTurbineType2IEC( ( WindGenTurbineType2IEC ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE:
            getWindDynamicsLookupTable().clear();
            getWindDynamicsLookupTable().addAll( ( Collection< ? extends WindDynamicsLookupTable > ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__TPFILTRR:
            setTpfiltrr( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMAX:
            setRmax( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMIN:
            setRmin( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPFILT:
            setKpfilt( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__KIRR:
            setKirr( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPRR:
            setKprr( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__KOMEGAFILT:
            setKomegafilt( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__TOMEGAFILTRR:
            setTomegafiltrr( ( Double ) newValue );
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
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC:
            unsetWindGenTurbineType2IEC();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE:
            unsetWindDynamicsLookupTable();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__TPFILTRR:
            unsetTpfiltrr();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMAX:
            unsetRmax();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMIN:
            unsetRmin();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPFILT:
            unsetKpfilt();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__KIRR:
            unsetKirr();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPRR:
            unsetKprr();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__KOMEGAFILT:
            unsetKomegafilt();
            return;
        case CimPackage.WIND_CONT_ROTOR_RIEC__TOMEGAFILTRR:
            unsetTomegafiltrr();
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
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_GEN_TURBINE_TYPE2_IEC:
            return isSetWindGenTurbineType2IEC();
        case CimPackage.WIND_CONT_ROTOR_RIEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return isSetWindDynamicsLookupTable();
        case CimPackage.WIND_CONT_ROTOR_RIEC__TPFILTRR:
            return isSetTpfiltrr();
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMAX:
            return isSetRmax();
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMIN:
            return isSetRmin();
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPFILT:
            return isSetKpfilt();
        case CimPackage.WIND_CONT_ROTOR_RIEC__KIRR:
            return isSetKirr();
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPRR:
            return isSetKprr();
        case CimPackage.WIND_CONT_ROTOR_RIEC__KOMEGAFILT:
            return isSetKomegafilt();
        case CimPackage.WIND_CONT_ROTOR_RIEC__TOMEGAFILTRR:
            return isSetTomegafiltrr();
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
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (tpfiltrr: " );
        if( tpfiltrrESet ) {
            result.append( tpfiltrr );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", rmax: " );
        if( rmaxESet ) {
            result.append( rmax );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", rmin: " );
        if( rminESet ) {
            result.append( rmin );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", kpfilt: " );
        if( kpfiltESet ) {
            result.append( kpfilt );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", kirr: " );
        if( kirrESet ) {
            result.append( kirr );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", kprr: " );
        if( kprrESet ) {
            result.append( kprr );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", komegafilt: " );
        if( komegafiltESet ) {
            result.append( komegafilt );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", tomegafiltrr: " );
        if( tomegafiltrrESet ) {
            result.append( tomegafiltrr );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //WindContRotorRIECImpl
