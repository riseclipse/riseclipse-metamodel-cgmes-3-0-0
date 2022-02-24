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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronous Machine Equivalent Circuit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineEquivalentCircuitImpl#getRfd <em>Rfd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineEquivalentCircuitImpl#getX1d <em>X1d</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineEquivalentCircuitImpl#getX1q <em>X1q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineEquivalentCircuitImpl#getX2q <em>X2q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineEquivalentCircuitImpl#getXfd <em>Xfd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineEquivalentCircuitImpl#getXad <em>Xad</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineEquivalentCircuitImpl#getXaq <em>Xaq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineEquivalentCircuitImpl#getR1d <em>R1d</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineEquivalentCircuitImpl#getR1q <em>R1q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineEquivalentCircuitImpl#getR2q <em>R2q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineEquivalentCircuitImpl#getXf1d <em>Xf1d</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronousMachineEquivalentCircuitImpl extends SynchronousMachineDetailedImpl
        implements SynchronousMachineEquivalentCircuit {
    /**
     * The default value of the '{@link #getRfd() <em>Rfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfd()
     * @generated
     * @ordered
     */
    protected static final Double RFD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRfd() <em>Rfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRfd()
     * @generated
     * @ordered
     */
    protected Double rfd = RFD_EDEFAULT;

    /**
     * This is true if the Rfd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rfdESet;

    /**
     * The default value of the '{@link #getX1d() <em>X1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX1d()
     * @generated
     * @ordered
     */
    protected static final Double X1D_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX1d() <em>X1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX1d()
     * @generated
     * @ordered
     */
    protected Double x1d = X1D_EDEFAULT;

    /**
     * This is true if the X1d attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x1dESet;

    /**
     * The default value of the '{@link #getX1q() <em>X1q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX1q()
     * @generated
     * @ordered
     */
    protected static final Double X1Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX1q() <em>X1q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX1q()
     * @generated
     * @ordered
     */
    protected Double x1q = X1Q_EDEFAULT;

    /**
     * This is true if the X1q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x1qESet;

    /**
     * The default value of the '{@link #getX2q() <em>X2q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX2q()
     * @generated
     * @ordered
     */
    protected static final Double X2Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX2q() <em>X2q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX2q()
     * @generated
     * @ordered
     */
    protected Double x2q = X2Q_EDEFAULT;

    /**
     * This is true if the X2q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x2qESet;

    /**
     * The default value of the '{@link #getXfd() <em>Xfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXfd()
     * @generated
     * @ordered
     */
    protected static final Double XFD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXfd() <em>Xfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXfd()
     * @generated
     * @ordered
     */
    protected Double xfd = XFD_EDEFAULT;

    /**
     * This is true if the Xfd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xfdESet;

    /**
     * The default value of the '{@link #getXad() <em>Xad</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXad()
     * @generated
     * @ordered
     */
    protected static final Double XAD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXad() <em>Xad</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXad()
     * @generated
     * @ordered
     */
    protected Double xad = XAD_EDEFAULT;

    /**
     * This is true if the Xad attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xadESet;

    /**
     * The default value of the '{@link #getXaq() <em>Xaq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXaq()
     * @generated
     * @ordered
     */
    protected static final Double XAQ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXaq() <em>Xaq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXaq()
     * @generated
     * @ordered
     */
    protected Double xaq = XAQ_EDEFAULT;

    /**
     * This is true if the Xaq attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xaqESet;

    /**
     * The default value of the '{@link #getR1d() <em>R1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR1d()
     * @generated
     * @ordered
     */
    protected static final Double R1D_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR1d() <em>R1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR1d()
     * @generated
     * @ordered
     */
    protected Double r1d = R1D_EDEFAULT;

    /**
     * This is true if the R1d attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r1dESet;

    /**
     * The default value of the '{@link #getR1q() <em>R1q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR1q()
     * @generated
     * @ordered
     */
    protected static final Double R1Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR1q() <em>R1q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR1q()
     * @generated
     * @ordered
     */
    protected Double r1q = R1Q_EDEFAULT;

    /**
     * This is true if the R1q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r1qESet;

    /**
     * The default value of the '{@link #getR2q() <em>R2q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR2q()
     * @generated
     * @ordered
     */
    protected static final Double R2Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR2q() <em>R2q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR2q()
     * @generated
     * @ordered
     */
    protected Double r2q = R2Q_EDEFAULT;

    /**
     * This is true if the R2q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r2qESet;

    /**
     * The default value of the '{@link #getXf1d() <em>Xf1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXf1d()
     * @generated
     * @ordered
     */
    protected static final Double XF1D_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXf1d() <em>Xf1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXf1d()
     * @generated
     * @ordered
     */
    protected Double xf1d = XF1D_EDEFAULT;

    /**
     * This is true if the Xf1d attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xf1dESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SynchronousMachineEquivalentCircuitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSynchronousMachineEquivalentCircuit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRfd() {
        return rfd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRfd( Double newRfd ) {
        Double oldRfd = rfd;
        rfd = newRfd;
        boolean oldRfdESet = rfdESet;
        rfdESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RFD, oldRfd, rfd, !oldRfdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRfd() {
        Double oldRfd = rfd;
        boolean oldRfdESet = rfdESet;
        rfd = RFD_EDEFAULT;
        rfdESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RFD, oldRfd, RFD_EDEFAULT, oldRfdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRfd() {
        return rfdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getX1d() {
        return x1d;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX1d( Double newX1d ) {
        Double oldX1d = x1d;
        x1d = newX1d;
        boolean oldX1dESet = x1dESet;
        x1dESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X1D, oldX1d, x1d, !oldX1dESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX1d() {
        Double oldX1d = x1d;
        boolean oldX1dESet = x1dESet;
        x1d = X1D_EDEFAULT;
        x1dESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X1D, oldX1d, X1D_EDEFAULT, oldX1dESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX1d() {
        return x1dESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getX1q() {
        return x1q;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX1q( Double newX1q ) {
        Double oldX1q = x1q;
        x1q = newX1q;
        boolean oldX1qESet = x1qESet;
        x1qESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X1Q, oldX1q, x1q, !oldX1qESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX1q() {
        Double oldX1q = x1q;
        boolean oldX1qESet = x1qESet;
        x1q = X1Q_EDEFAULT;
        x1qESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X1Q, oldX1q, X1Q_EDEFAULT, oldX1qESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX1q() {
        return x1qESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getX2q() {
        return x2q;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX2q( Double newX2q ) {
        Double oldX2q = x2q;
        x2q = newX2q;
        boolean oldX2qESet = x2qESet;
        x2qESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X2Q, oldX2q, x2q, !oldX2qESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX2q() {
        Double oldX2q = x2q;
        boolean oldX2qESet = x2qESet;
        x2q = X2Q_EDEFAULT;
        x2qESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X2Q, oldX2q, X2Q_EDEFAULT, oldX2qESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX2q() {
        return x2qESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXfd() {
        return xfd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXfd( Double newXfd ) {
        Double oldXfd = xfd;
        xfd = newXfd;
        boolean oldXfdESet = xfdESet;
        xfdESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XFD, oldXfd, xfd, !oldXfdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXfd() {
        Double oldXfd = xfd;
        boolean oldXfdESet = xfdESet;
        xfd = XFD_EDEFAULT;
        xfdESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XFD, oldXfd, XFD_EDEFAULT, oldXfdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXfd() {
        return xfdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXad() {
        return xad;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXad( Double newXad ) {
        Double oldXad = xad;
        xad = newXad;
        boolean oldXadESet = xadESet;
        xadESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XAD, oldXad, xad, !oldXadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXad() {
        Double oldXad = xad;
        boolean oldXadESet = xadESet;
        xad = XAD_EDEFAULT;
        xadESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XAD, oldXad, XAD_EDEFAULT, oldXadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXad() {
        return xadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXaq() {
        return xaq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXaq( Double newXaq ) {
        Double oldXaq = xaq;
        xaq = newXaq;
        boolean oldXaqESet = xaqESet;
        xaqESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XAQ, oldXaq, xaq, !oldXaqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXaq() {
        Double oldXaq = xaq;
        boolean oldXaqESet = xaqESet;
        xaq = XAQ_EDEFAULT;
        xaqESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XAQ, oldXaq, XAQ_EDEFAULT, oldXaqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXaq() {
        return xaqESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getR1d() {
        return r1d;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR1d( Double newR1d ) {
        Double oldR1d = r1d;
        r1d = newR1d;
        boolean oldR1dESet = r1dESet;
        r1dESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R1D, oldR1d, r1d, !oldR1dESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR1d() {
        Double oldR1d = r1d;
        boolean oldR1dESet = r1dESet;
        r1d = R1D_EDEFAULT;
        r1dESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R1D, oldR1d, R1D_EDEFAULT, oldR1dESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR1d() {
        return r1dESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getR1q() {
        return r1q;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR1q( Double newR1q ) {
        Double oldR1q = r1q;
        r1q = newR1q;
        boolean oldR1qESet = r1qESet;
        r1qESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R1Q, oldR1q, r1q, !oldR1qESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR1q() {
        Double oldR1q = r1q;
        boolean oldR1qESet = r1qESet;
        r1q = R1Q_EDEFAULT;
        r1qESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R1Q, oldR1q, R1Q_EDEFAULT, oldR1qESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR1q() {
        return r1qESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getR2q() {
        return r2q;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR2q( Double newR2q ) {
        Double oldR2q = r2q;
        r2q = newR2q;
        boolean oldR2qESet = r2qESet;
        r2qESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R2Q, oldR2q, r2q, !oldR2qESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR2q() {
        Double oldR2q = r2q;
        boolean oldR2qESet = r2qESet;
        r2q = R2Q_EDEFAULT;
        r2qESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R2Q, oldR2q, R2Q_EDEFAULT, oldR2qESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR2q() {
        return r2qESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXf1d() {
        return xf1d;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXf1d( Double newXf1d ) {
        Double oldXf1d = xf1d;
        xf1d = newXf1d;
        boolean oldXf1dESet = xf1dESet;
        xf1dESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XF1D, oldXf1d, xf1d, !oldXf1dESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXf1d() {
        Double oldXf1d = xf1d;
        boolean oldXf1dESet = xf1dESet;
        xf1d = XF1D_EDEFAULT;
        xf1dESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XF1D, oldXf1d, XF1D_EDEFAULT, oldXf1dESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXf1d() {
        return xf1dESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RFD:
            return getRfd();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X1D:
            return getX1d();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X1Q:
            return getX1q();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X2Q:
            return getX2q();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XFD:
            return getXfd();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XAD:
            return getXad();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XAQ:
            return getXaq();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R1D:
            return getR1d();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R1Q:
            return getR1q();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R2Q:
            return getR2q();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XF1D:
            return getXf1d();
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
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RFD:
            setRfd( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X1D:
            setX1d( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X1Q:
            setX1q( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X2Q:
            setX2q( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XFD:
            setXfd( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XAD:
            setXad( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XAQ:
            setXaq( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R1D:
            setR1d( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R1Q:
            setR1q( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R2Q:
            setR2q( ( Double ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XF1D:
            setXf1d( ( Double ) newValue );
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
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RFD:
            unsetRfd();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X1D:
            unsetX1d();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X1Q:
            unsetX1q();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X2Q:
            unsetX2q();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XFD:
            unsetXfd();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XAD:
            unsetXad();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XAQ:
            unsetXaq();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R1D:
            unsetR1d();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R1Q:
            unsetR1q();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R2Q:
            unsetR2q();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XF1D:
            unsetXf1d();
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
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RFD:
            return isSetRfd();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X1D:
            return isSetX1d();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X1Q:
            return isSetX1q();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__X2Q:
            return isSetX2q();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XFD:
            return isSetXfd();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XAD:
            return isSetXad();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XAQ:
            return isSetXaq();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R1D:
            return isSetR1d();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R1Q:
            return isSetR1q();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__R2Q:
            return isSetR2q();
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XF1D:
            return isSetXf1d();
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
        result.append( " (rfd: " );
        if( rfdESet )
            result.append( rfd );
        else
            result.append( "<unset>" );
        result.append( ", x1d: " );
        if( x1dESet )
            result.append( x1d );
        else
            result.append( "<unset>" );
        result.append( ", x1q: " );
        if( x1qESet )
            result.append( x1q );
        else
            result.append( "<unset>" );
        result.append( ", x2q: " );
        if( x2qESet )
            result.append( x2q );
        else
            result.append( "<unset>" );
        result.append( ", xfd: " );
        if( xfdESet )
            result.append( xfd );
        else
            result.append( "<unset>" );
        result.append( ", xad: " );
        if( xadESet )
            result.append( xad );
        else
            result.append( "<unset>" );
        result.append( ", xaq: " );
        if( xaqESet )
            result.append( xaq );
        else
            result.append( "<unset>" );
        result.append( ", r1d: " );
        if( r1dESet )
            result.append( r1d );
        else
            result.append( "<unset>" );
        result.append( ", r1q: " );
        if( r1qESet )
            result.append( r1q );
        else
            result.append( "<unset>" );
        result.append( ", r2q: " );
        if( r2qESet )
            result.append( r2q );
        else
            result.append( "<unset>" );
        result.append( ", xf1d: " );
        if( xf1dESet )
            result.append( xf1d );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SynchronousMachineEquivalentCircuitImpl
