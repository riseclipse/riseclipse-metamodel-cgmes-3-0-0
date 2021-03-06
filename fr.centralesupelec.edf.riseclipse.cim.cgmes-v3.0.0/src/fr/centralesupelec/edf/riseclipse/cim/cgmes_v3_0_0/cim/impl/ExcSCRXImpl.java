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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSCRX;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc SCRX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcSCRXImpl#getCswitch <em>Cswitch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcSCRXImpl#getK <em>K</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcSCRXImpl#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcSCRXImpl#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcSCRXImpl#getTatb <em>Tatb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcSCRXImpl#getRcrfd <em>Rcrfd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcSCRXImpl#getEmax <em>Emax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcSCRXImpl#getEmin <em>Emin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcSCRXImpl extends ExcitationSystemDynamicsImpl implements ExcSCRX {
    /**
     * The default value of the '{@link #getCswitch() <em>Cswitch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCswitch()
     * @generated
     * @ordered
     */
    protected static final Boolean CSWITCH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCswitch() <em>Cswitch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCswitch()
     * @generated
     * @ordered
     */
    protected Boolean cswitch = CSWITCH_EDEFAULT;

    /**
     * This is true if the Cswitch attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cswitchESet;

    /**
     * The default value of the '{@link #getK() <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK()
     * @generated
     * @ordered
     */
    protected static final Double K_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK() <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK()
     * @generated
     * @ordered
     */
    protected Double k = K_EDEFAULT;

    /**
     * This is true if the K attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kESet;

    /**
     * The default value of the '{@link #getTe() <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTe()
     * @generated
     * @ordered
     */
    protected static final Double TE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTe() <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTe()
     * @generated
     * @ordered
     */
    protected Double te = TE_EDEFAULT;

    /**
     * This is true if the Te attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean teESet;

    /**
     * The default value of the '{@link #getTb() <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb()
     * @generated
     * @ordered
     */
    protected static final Double TB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTb() <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb()
     * @generated
     * @ordered
     */
    protected Double tb = TB_EDEFAULT;

    /**
     * This is true if the Tb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tbESet;

    /**
     * The default value of the '{@link #getTatb() <em>Tatb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTatb()
     * @generated
     * @ordered
     */
    protected static final Double TATB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTatb() <em>Tatb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTatb()
     * @generated
     * @ordered
     */
    protected Double tatb = TATB_EDEFAULT;

    /**
     * This is true if the Tatb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tatbESet;

    /**
     * The default value of the '{@link #getRcrfd() <em>Rcrfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRcrfd()
     * @generated
     * @ordered
     */
    protected static final Double RCRFD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRcrfd() <em>Rcrfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRcrfd()
     * @generated
     * @ordered
     */
    protected Double rcrfd = RCRFD_EDEFAULT;

    /**
     * This is true if the Rcrfd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rcrfdESet;

    /**
     * The default value of the '{@link #getEmax() <em>Emax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmax()
     * @generated
     * @ordered
     */
    protected static final Double EMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEmax() <em>Emax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmax()
     * @generated
     * @ordered
     */
    protected Double emax = EMAX_EDEFAULT;

    /**
     * This is true if the Emax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean emaxESet;

    /**
     * The default value of the '{@link #getEmin() <em>Emin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmin()
     * @generated
     * @ordered
     */
    protected static final Double EMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEmin() <em>Emin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmin()
     * @generated
     * @ordered
     */
    protected Double emin = EMIN_EDEFAULT;

    /**
     * This is true if the Emin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean eminESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcSCRXImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcSCRX();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getCswitch() {
        return cswitch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCswitch( Boolean newCswitch ) {
        Boolean oldCswitch = cswitch;
        cswitch = newCswitch;
        boolean oldCswitchESet = cswitchESet;
        cswitchESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SCRX__CSWITCH, oldCswitch, cswitch,
                    !oldCswitchESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCswitch() {
        Boolean oldCswitch = cswitch;
        boolean oldCswitchESet = cswitchESet;
        cswitch = CSWITCH_EDEFAULT;
        cswitchESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SCRX__CSWITCH, oldCswitch,
                    CSWITCH_EDEFAULT, oldCswitchESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCswitch() {
        return cswitchESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getK() {
        return k;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK( Double newK ) {
        Double oldK = k;
        k = newK;
        boolean oldKESet = kESet;
        kESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SCRX__K, oldK, k, !oldKESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK() {
        Double oldK = k;
        boolean oldKESet = kESet;
        k = K_EDEFAULT;
        kESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SCRX__K, oldK, K_EDEFAULT,
                    oldKESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK() {
        return kESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTe() {
        return te;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTe( Double newTe ) {
        Double oldTe = te;
        te = newTe;
        boolean oldTeESet = teESet;
        teESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SCRX__TE, oldTe, te, !oldTeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTe() {
        Double oldTe = te;
        boolean oldTeESet = teESet;
        te = TE_EDEFAULT;
        teESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SCRX__TE, oldTe, TE_EDEFAULT,
                    oldTeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTe() {
        return teESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTb() {
        return tb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTb( Double newTb ) {
        Double oldTb = tb;
        tb = newTb;
        boolean oldTbESet = tbESet;
        tbESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SCRX__TB, oldTb, tb, !oldTbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTb() {
        Double oldTb = tb;
        boolean oldTbESet = tbESet;
        tb = TB_EDEFAULT;
        tbESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SCRX__TB, oldTb, TB_EDEFAULT,
                    oldTbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTb() {
        return tbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTatb() {
        return tatb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTatb( Double newTatb ) {
        Double oldTatb = tatb;
        tatb = newTatb;
        boolean oldTatbESet = tatbESet;
        tatbESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SCRX__TATB, oldTatb, tatb,
                    !oldTatbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTatb() {
        Double oldTatb = tatb;
        boolean oldTatbESet = tatbESet;
        tatb = TATB_EDEFAULT;
        tatbESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SCRX__TATB, oldTatb, TATB_EDEFAULT,
                    oldTatbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTatb() {
        return tatbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRcrfd() {
        return rcrfd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRcrfd( Double newRcrfd ) {
        Double oldRcrfd = rcrfd;
        rcrfd = newRcrfd;
        boolean oldRcrfdESet = rcrfdESet;
        rcrfdESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SCRX__RCRFD, oldRcrfd, rcrfd,
                    !oldRcrfdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRcrfd() {
        Double oldRcrfd = rcrfd;
        boolean oldRcrfdESet = rcrfdESet;
        rcrfd = RCRFD_EDEFAULT;
        rcrfdESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SCRX__RCRFD, oldRcrfd,
                    RCRFD_EDEFAULT, oldRcrfdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRcrfd() {
        return rcrfdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEmax() {
        return emax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEmax( Double newEmax ) {
        Double oldEmax = emax;
        emax = newEmax;
        boolean oldEmaxESet = emaxESet;
        emaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SCRX__EMAX, oldEmax, emax,
                    !oldEmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEmax() {
        Double oldEmax = emax;
        boolean oldEmaxESet = emaxESet;
        emax = EMAX_EDEFAULT;
        emaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SCRX__EMAX, oldEmax, EMAX_EDEFAULT,
                    oldEmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEmax() {
        return emaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEmin() {
        return emin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEmin( Double newEmin ) {
        Double oldEmin = emin;
        emin = newEmin;
        boolean oldEminESet = eminESet;
        eminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SCRX__EMIN, oldEmin, emin,
                    !oldEminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEmin() {
        Double oldEmin = emin;
        boolean oldEminESet = eminESet;
        emin = EMIN_EDEFAULT;
        eminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SCRX__EMIN, oldEmin, EMIN_EDEFAULT,
                    oldEminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEmin() {
        return eminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_SCRX__CSWITCH:
            return getCswitch();
        case CimPackage.EXC_SCRX__K:
            return getK();
        case CimPackage.EXC_SCRX__TE:
            return getTe();
        case CimPackage.EXC_SCRX__TB:
            return getTb();
        case CimPackage.EXC_SCRX__TATB:
            return getTatb();
        case CimPackage.EXC_SCRX__RCRFD:
            return getRcrfd();
        case CimPackage.EXC_SCRX__EMAX:
            return getEmax();
        case CimPackage.EXC_SCRX__EMIN:
            return getEmin();
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
        case CimPackage.EXC_SCRX__CSWITCH:
            setCswitch( ( Boolean ) newValue );
            return;
        case CimPackage.EXC_SCRX__K:
            setK( ( Double ) newValue );
            return;
        case CimPackage.EXC_SCRX__TE:
            setTe( ( Double ) newValue );
            return;
        case CimPackage.EXC_SCRX__TB:
            setTb( ( Double ) newValue );
            return;
        case CimPackage.EXC_SCRX__TATB:
            setTatb( ( Double ) newValue );
            return;
        case CimPackage.EXC_SCRX__RCRFD:
            setRcrfd( ( Double ) newValue );
            return;
        case CimPackage.EXC_SCRX__EMAX:
            setEmax( ( Double ) newValue );
            return;
        case CimPackage.EXC_SCRX__EMIN:
            setEmin( ( Double ) newValue );
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
        case CimPackage.EXC_SCRX__CSWITCH:
            unsetCswitch();
            return;
        case CimPackage.EXC_SCRX__K:
            unsetK();
            return;
        case CimPackage.EXC_SCRX__TE:
            unsetTe();
            return;
        case CimPackage.EXC_SCRX__TB:
            unsetTb();
            return;
        case CimPackage.EXC_SCRX__TATB:
            unsetTatb();
            return;
        case CimPackage.EXC_SCRX__RCRFD:
            unsetRcrfd();
            return;
        case CimPackage.EXC_SCRX__EMAX:
            unsetEmax();
            return;
        case CimPackage.EXC_SCRX__EMIN:
            unsetEmin();
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
        case CimPackage.EXC_SCRX__CSWITCH:
            return isSetCswitch();
        case CimPackage.EXC_SCRX__K:
            return isSetK();
        case CimPackage.EXC_SCRX__TE:
            return isSetTe();
        case CimPackage.EXC_SCRX__TB:
            return isSetTb();
        case CimPackage.EXC_SCRX__TATB:
            return isSetTatb();
        case CimPackage.EXC_SCRX__RCRFD:
            return isSetRcrfd();
        case CimPackage.EXC_SCRX__EMAX:
            return isSetEmax();
        case CimPackage.EXC_SCRX__EMIN:
            return isSetEmin();
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
        result.append( " (cswitch: " );
        if( cswitchESet )
            result.append( cswitch );
        else
            result.append( "<unset>" );
        result.append( ", k: " );
        if( kESet )
            result.append( k );
        else
            result.append( "<unset>" );
        result.append( ", te: " );
        if( teESet )
            result.append( te );
        else
            result.append( "<unset>" );
        result.append( ", tb: " );
        if( tbESet )
            result.append( tb );
        else
            result.append( "<unset>" );
        result.append( ", tatb: " );
        if( tatbESet )
            result.append( tatb );
        else
            result.append( "<unset>" );
        result.append( ", rcrfd: " );
        if( rcrfdESet )
            result.append( rcrfd );
        else
            result.append( "<unset>" );
        result.append( ", emax: " );
        if( emaxESet )
            result.append( emax );
        else
            result.append( "<unset>" );
        result.append( ", emin: " );
        if( eminESet )
            result.append( emin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcSCRXImpl
