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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindMechIEC;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2IEC;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3IEC;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType4bIEC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Mech IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindMechIECImpl#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindMechIECImpl#getCdrt <em>Cdrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindMechIECImpl#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindMechIECImpl#getKdrt <em>Kdrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindMechIECImpl#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindMechIECImpl#getHwtr <em>Hwtr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindMechIECImpl#getHgen <em>Hgen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindMechIECImpl extends IdentifiedObjectImpl implements WindMechIEC {
    /**
     * The cached value of the '{@link #getWindTurbineType3IEC() <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType3IEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType3IEC windTurbineType3IEC;

    /**
     * This is true if the Wind Turbine Type3 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType3IECESet;

    /**
     * The default value of the '{@link #getCdrt() <em>Cdrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCdrt()
     * @generated
     * @ordered
     */
    protected static final Double CDRT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCdrt() <em>Cdrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCdrt()
     * @generated
     * @ordered
     */
    protected Double cdrt = CDRT_EDEFAULT;

    /**
     * This is true if the Cdrt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cdrtESet;

    /**
     * The cached value of the '{@link #getWindTurbineType1or2IEC() <em>Wind Turbine Type1or2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType1or2IEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType1or2IEC windTurbineType1or2IEC;

    /**
     * This is true if the Wind Turbine Type1or2 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType1or2IECESet;

    /**
     * The default value of the '{@link #getKdrt() <em>Kdrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdrt()
     * @generated
     * @ordered
     */
    protected static final Double KDRT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKdrt() <em>Kdrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdrt()
     * @generated
     * @ordered
     */
    protected Double kdrt = KDRT_EDEFAULT;

    /**
     * This is true if the Kdrt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdrtESet;

    /**
     * The cached value of the '{@link #getWindTurbineType4bIEC() <em>Wind Turbine Type4b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType4bIEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType4bIEC windTurbineType4bIEC;

    /**
     * This is true if the Wind Turbine Type4b IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType4bIECESet;

    /**
     * The default value of the '{@link #getHwtr() <em>Hwtr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHwtr()
     * @generated
     * @ordered
     */
    protected static final Double HWTR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHwtr() <em>Hwtr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHwtr()
     * @generated
     * @ordered
     */
    protected Double hwtr = HWTR_EDEFAULT;

    /**
     * This is true if the Hwtr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hwtrESet;

    /**
     * The default value of the '{@link #getHgen() <em>Hgen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHgen()
     * @generated
     * @ordered
     */
    protected static final Double HGEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHgen() <em>Hgen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHgen()
     * @generated
     * @ordered
     */
    protected Double hgen = HGEN_EDEFAULT;

    /**
     * This is true if the Hgen attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hgenESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindMechIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindMechIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType3IEC getWindTurbineType3IEC() {
        if( windTurbineType3IEC != null && windTurbineType3IEC.eIsProxy() ) {
            InternalEObject oldWindTurbineType3IEC = ( InternalEObject ) windTurbineType3IEC;
            windTurbineType3IEC = ( WindTurbineType3IEC ) eResolveProxy( oldWindTurbineType3IEC );
            if( windTurbineType3IEC != oldWindTurbineType3IEC ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE3_IEC, oldWindTurbineType3IEC,
                            windTurbineType3IEC ) );
            }
        }
        return windTurbineType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindTurbineType3IEC basicGetWindTurbineType3IEC() {
        return windTurbineType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType3IEC( WindTurbineType3IEC newWindTurbineType3IEC,
            NotificationChain msgs ) {
        WindTurbineType3IEC oldWindTurbineType3IEC = windTurbineType3IEC;
        windTurbineType3IEC = newWindTurbineType3IEC;
        boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
        windTurbineType3IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE3_IEC, oldWindTurbineType3IEC, newWindTurbineType3IEC,
                    !oldWindTurbineType3IECESet );
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
    public void setWindTurbineType3IEC( WindTurbineType3IEC newWindTurbineType3IEC ) {
        if( newWindTurbineType3IEC != windTurbineType3IEC ) {
            NotificationChain msgs = null;
            if( windTurbineType3IEC != null )
                msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_MECH_IEC, WindTurbineType3IEC.class, msgs );
            if( newWindTurbineType3IEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType3IEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_MECH_IEC, WindTurbineType3IEC.class, msgs );
            msgs = basicSetWindTurbineType3IEC( newWindTurbineType3IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
            windTurbineType3IECESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE3_IEC, newWindTurbineType3IEC,
                        newWindTurbineType3IEC, !oldWindTurbineType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType3IEC( NotificationChain msgs ) {
        WindTurbineType3IEC oldWindTurbineType3IEC = windTurbineType3IEC;
        windTurbineType3IEC = null;
        boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
        windTurbineType3IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE3_IEC, oldWindTurbineType3IEC, null,
                    oldWindTurbineType3IECESet );
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
    public void unsetWindTurbineType3IEC() {
        if( windTurbineType3IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_MECH_IEC, WindTurbineType3IEC.class, msgs );
            msgs = basicUnsetWindTurbineType3IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
            windTurbineType3IECESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE3_IEC, null, null, oldWindTurbineType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType3IEC() {
        return windTurbineType3IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getCdrt() {
        return cdrt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCdrt( Double newCdrt ) {
        Double oldCdrt = cdrt;
        cdrt = newCdrt;
        boolean oldCdrtESet = cdrtESet;
        cdrtESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_MECH_IEC__CDRT, oldCdrt, cdrt,
                    !oldCdrtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCdrt() {
        Double oldCdrt = cdrt;
        boolean oldCdrtESet = cdrtESet;
        cdrt = CDRT_EDEFAULT;
        cdrtESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_MECH_IEC__CDRT, oldCdrt,
                    CDRT_EDEFAULT, oldCdrtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCdrt() {
        return cdrtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType1or2IEC getWindTurbineType1or2IEC() {
        if( windTurbineType1or2IEC != null && windTurbineType1or2IEC.eIsProxy() ) {
            InternalEObject oldWindTurbineType1or2IEC = ( InternalEObject ) windTurbineType1or2IEC;
            windTurbineType1or2IEC = ( WindTurbineType1or2IEC ) eResolveProxy( oldWindTurbineType1or2IEC );
            if( windTurbineType1or2IEC != oldWindTurbineType1or2IEC ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE1OR2_IEC, oldWindTurbineType1or2IEC,
                            windTurbineType1or2IEC ) );
            }
        }
        return windTurbineType1or2IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindTurbineType1or2IEC basicGetWindTurbineType1or2IEC() {
        return windTurbineType1or2IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType1or2IEC( WindTurbineType1or2IEC newWindTurbineType1or2IEC,
            NotificationChain msgs ) {
        WindTurbineType1or2IEC oldWindTurbineType1or2IEC = windTurbineType1or2IEC;
        windTurbineType1or2IEC = newWindTurbineType1or2IEC;
        boolean oldWindTurbineType1or2IECESet = windTurbineType1or2IECESet;
        windTurbineType1or2IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE1OR2_IEC, oldWindTurbineType1or2IEC,
                    newWindTurbineType1or2IEC, !oldWindTurbineType1or2IECESet );
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
    public void setWindTurbineType1or2IEC( WindTurbineType1or2IEC newWindTurbineType1or2IEC ) {
        if( newWindTurbineType1or2IEC != windTurbineType1or2IEC ) {
            NotificationChain msgs = null;
            if( windTurbineType1or2IEC != null )
                msgs = ( ( InternalEObject ) windTurbineType1or2IEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_MECH_IEC, WindTurbineType1or2IEC.class, msgs );
            if( newWindTurbineType1or2IEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType1or2IEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_MECH_IEC, WindTurbineType1or2IEC.class, msgs );
            msgs = basicSetWindTurbineType1or2IEC( newWindTurbineType1or2IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType1or2IECESet = windTurbineType1or2IECESet;
            windTurbineType1or2IECESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE1OR2_IEC, newWindTurbineType1or2IEC,
                        newWindTurbineType1or2IEC, !oldWindTurbineType1or2IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType1or2IEC( NotificationChain msgs ) {
        WindTurbineType1or2IEC oldWindTurbineType1or2IEC = windTurbineType1or2IEC;
        windTurbineType1or2IEC = null;
        boolean oldWindTurbineType1or2IECESet = windTurbineType1or2IECESet;
        windTurbineType1or2IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE1OR2_IEC, oldWindTurbineType1or2IEC, null,
                    oldWindTurbineType1or2IECESet );
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
    public void unsetWindTurbineType1or2IEC() {
        if( windTurbineType1or2IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType1or2IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_MECH_IEC, WindTurbineType1or2IEC.class, msgs );
            msgs = basicUnsetWindTurbineType1or2IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType1or2IECESet = windTurbineType1or2IECESet;
            windTurbineType1or2IECESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE1OR2_IEC, null, null,
                        oldWindTurbineType1or2IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType1or2IEC() {
        return windTurbineType1or2IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKdrt() {
        return kdrt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKdrt( Double newKdrt ) {
        Double oldKdrt = kdrt;
        kdrt = newKdrt;
        boolean oldKdrtESet = kdrtESet;
        kdrtESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_MECH_IEC__KDRT, oldKdrt, kdrt,
                    !oldKdrtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKdrt() {
        Double oldKdrt = kdrt;
        boolean oldKdrtESet = kdrtESet;
        kdrt = KDRT_EDEFAULT;
        kdrtESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_MECH_IEC__KDRT, oldKdrt,
                    KDRT_EDEFAULT, oldKdrtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKdrt() {
        return kdrtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType4bIEC getWindTurbineType4bIEC() {
        if( windTurbineType4bIEC != null && windTurbineType4bIEC.eIsProxy() ) {
            InternalEObject oldWindTurbineType4bIEC = ( InternalEObject ) windTurbineType4bIEC;
            windTurbineType4bIEC = ( WindTurbineType4bIEC ) eResolveProxy( oldWindTurbineType4bIEC );
            if( windTurbineType4bIEC != oldWindTurbineType4bIEC ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE4B_IEC, oldWindTurbineType4bIEC,
                            windTurbineType4bIEC ) );
            }
        }
        return windTurbineType4bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindTurbineType4bIEC basicGetWindTurbineType4bIEC() {
        return windTurbineType4bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType4bIEC( WindTurbineType4bIEC newWindTurbineType4bIEC,
            NotificationChain msgs ) {
        WindTurbineType4bIEC oldWindTurbineType4bIEC = windTurbineType4bIEC;
        windTurbineType4bIEC = newWindTurbineType4bIEC;
        boolean oldWindTurbineType4bIECESet = windTurbineType4bIECESet;
        windTurbineType4bIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE4B_IEC, oldWindTurbineType4bIEC, newWindTurbineType4bIEC,
                    !oldWindTurbineType4bIECESet );
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
    public void setWindTurbineType4bIEC( WindTurbineType4bIEC newWindTurbineType4bIEC ) {
        if( newWindTurbineType4bIEC != windTurbineType4bIEC ) {
            NotificationChain msgs = null;
            if( windTurbineType4bIEC != null )
                msgs = ( ( InternalEObject ) windTurbineType4bIEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_MECH_IEC, WindTurbineType4bIEC.class, msgs );
            if( newWindTurbineType4bIEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType4bIEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_MECH_IEC, WindTurbineType4bIEC.class, msgs );
            msgs = basicSetWindTurbineType4bIEC( newWindTurbineType4bIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType4bIECESet = windTurbineType4bIECESet;
            windTurbineType4bIECESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE4B_IEC, newWindTurbineType4bIEC,
                        newWindTurbineType4bIEC, !oldWindTurbineType4bIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType4bIEC( NotificationChain msgs ) {
        WindTurbineType4bIEC oldWindTurbineType4bIEC = windTurbineType4bIEC;
        windTurbineType4bIEC = null;
        boolean oldWindTurbineType4bIECESet = windTurbineType4bIECESet;
        windTurbineType4bIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE4B_IEC, oldWindTurbineType4bIEC, null,
                    oldWindTurbineType4bIECESet );
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
    public void unsetWindTurbineType4bIEC() {
        if( windTurbineType4bIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType4bIEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_MECH_IEC, WindTurbineType4bIEC.class, msgs );
            msgs = basicUnsetWindTurbineType4bIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType4bIECESet = windTurbineType4bIECESet;
            windTurbineType4bIECESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE4B_IEC, null, null, oldWindTurbineType4bIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType4bIEC() {
        return windTurbineType4bIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getHwtr() {
        return hwtr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHwtr( Double newHwtr ) {
        Double oldHwtr = hwtr;
        hwtr = newHwtr;
        boolean oldHwtrESet = hwtrESet;
        hwtrESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_MECH_IEC__HWTR, oldHwtr, hwtr,
                    !oldHwtrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHwtr() {
        Double oldHwtr = hwtr;
        boolean oldHwtrESet = hwtrESet;
        hwtr = HWTR_EDEFAULT;
        hwtrESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_MECH_IEC__HWTR, oldHwtr,
                    HWTR_EDEFAULT, oldHwtrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHwtr() {
        return hwtrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getHgen() {
        return hgen;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHgen( Double newHgen ) {
        Double oldHgen = hgen;
        hgen = newHgen;
        boolean oldHgenESet = hgenESet;
        hgenESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_MECH_IEC__HGEN, oldHgen, hgen,
                    !oldHgenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHgen() {
        Double oldHgen = hgen;
        boolean oldHgenESet = hgenESet;
        hgen = HGEN_EDEFAULT;
        hgenESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_MECH_IEC__HGEN, oldHgen,
                    HGEN_EDEFAULT, oldHgenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHgen() {
        return hgenESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE3_IEC:
            if( windTurbineType3IEC != null )
                msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_MECH_IEC, WindTurbineType3IEC.class, msgs );
            return basicSetWindTurbineType3IEC( ( WindTurbineType3IEC ) otherEnd, msgs );
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            if( windTurbineType1or2IEC != null )
                msgs = ( ( InternalEObject ) windTurbineType1or2IEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_MECH_IEC, WindTurbineType1or2IEC.class, msgs );
            return basicSetWindTurbineType1or2IEC( ( WindTurbineType1or2IEC ) otherEnd, msgs );
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE4B_IEC:
            if( windTurbineType4bIEC != null )
                msgs = ( ( InternalEObject ) windTurbineType4bIEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_MECH_IEC, WindTurbineType4bIEC.class, msgs );
            return basicSetWindTurbineType4bIEC( ( WindTurbineType4bIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE3_IEC:
            return basicUnsetWindTurbineType3IEC( msgs );
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            return basicUnsetWindTurbineType1or2IEC( msgs );
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE4B_IEC:
            return basicUnsetWindTurbineType4bIEC( msgs );
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
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE3_IEC:
            if( resolve ) return getWindTurbineType3IEC();
            return basicGetWindTurbineType3IEC();
        case CimPackage.WIND_MECH_IEC__CDRT:
            return getCdrt();
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            if( resolve ) return getWindTurbineType1or2IEC();
            return basicGetWindTurbineType1or2IEC();
        case CimPackage.WIND_MECH_IEC__KDRT:
            return getKdrt();
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE4B_IEC:
            if( resolve ) return getWindTurbineType4bIEC();
            return basicGetWindTurbineType4bIEC();
        case CimPackage.WIND_MECH_IEC__HWTR:
            return getHwtr();
        case CimPackage.WIND_MECH_IEC__HGEN:
            return getHgen();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE3_IEC:
            setWindTurbineType3IEC( ( WindTurbineType3IEC ) newValue );
            return;
        case CimPackage.WIND_MECH_IEC__CDRT:
            setCdrt( ( Double ) newValue );
            return;
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            setWindTurbineType1or2IEC( ( WindTurbineType1or2IEC ) newValue );
            return;
        case CimPackage.WIND_MECH_IEC__KDRT:
            setKdrt( ( Double ) newValue );
            return;
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE4B_IEC:
            setWindTurbineType4bIEC( ( WindTurbineType4bIEC ) newValue );
            return;
        case CimPackage.WIND_MECH_IEC__HWTR:
            setHwtr( ( Double ) newValue );
            return;
        case CimPackage.WIND_MECH_IEC__HGEN:
            setHgen( ( Double ) newValue );
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
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE3_IEC:
            unsetWindTurbineType3IEC();
            return;
        case CimPackage.WIND_MECH_IEC__CDRT:
            unsetCdrt();
            return;
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            unsetWindTurbineType1or2IEC();
            return;
        case CimPackage.WIND_MECH_IEC__KDRT:
            unsetKdrt();
            return;
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE4B_IEC:
            unsetWindTurbineType4bIEC();
            return;
        case CimPackage.WIND_MECH_IEC__HWTR:
            unsetHwtr();
            return;
        case CimPackage.WIND_MECH_IEC__HGEN:
            unsetHgen();
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
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE3_IEC:
            return isSetWindTurbineType3IEC();
        case CimPackage.WIND_MECH_IEC__CDRT:
            return isSetCdrt();
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            return isSetWindTurbineType1or2IEC();
        case CimPackage.WIND_MECH_IEC__KDRT:
            return isSetKdrt();
        case CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE4B_IEC:
            return isSetWindTurbineType4bIEC();
        case CimPackage.WIND_MECH_IEC__HWTR:
            return isSetHwtr();
        case CimPackage.WIND_MECH_IEC__HGEN:
            return isSetHgen();
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
        result.append( " (cdrt: " );
        if( cdrtESet )
            result.append( cdrt );
        else
            result.append( "<unset>" );
        result.append( ", kdrt: " );
        if( kdrtESet )
            result.append( kdrt );
        else
            result.append( "<unset>" );
        result.append( ", hwtr: " );
        if( hwtrESet )
            result.append( hwtr );
        else
            result.append( "<unset>" );
        result.append( ", hgen: " );
        if( hgenESet )
            result.append( hgen );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindMechIECImpl
