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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquivalentBranchImpl#getR21 <em>R21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquivalentBranchImpl#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquivalentBranchImpl#getX21 <em>X21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquivalentBranchImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquivalentBranchImpl#getNegativeR21 <em>Negative R21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquivalentBranchImpl#getNegativeR12 <em>Negative R12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquivalentBranchImpl#getZeroR21 <em>Zero R21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquivalentBranchImpl#getZeroR12 <em>Zero R12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquivalentBranchImpl#getNegativeX21 <em>Negative X21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquivalentBranchImpl#getPositiveR12 <em>Positive R12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquivalentBranchImpl#getNegativeX12 <em>Negative X12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquivalentBranchImpl#getPositiveX12 <em>Positive X12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquivalentBranchImpl#getPositiveR21 <em>Positive R21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquivalentBranchImpl#getPositiveX21 <em>Positive X21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquivalentBranchImpl#getZeroX21 <em>Zero X21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquivalentBranchImpl#getZeroX12 <em>Zero X12</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquivalentBranchImpl extends EquivalentEquipmentImpl implements EquivalentBranch {
    /**
     * The default value of the '{@link #getR21() <em>R21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR21()
     * @generated
     * @ordered
     */
    protected static final Double R21_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR21() <em>R21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR21()
     * @generated
     * @ordered
     */
    protected Double r21 = R21_EDEFAULT;

    /**
     * This is true if the R21 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r21ESet;

    /**
     * The default value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected static final Double X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected Double x = X_EDEFAULT;

    /**
     * This is true if the X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xESet;

    /**
     * The default value of the '{@link #getX21() <em>X21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX21()
     * @generated
     * @ordered
     */
    protected static final Double X21_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX21() <em>X21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX21()
     * @generated
     * @ordered
     */
    protected Double x21 = X21_EDEFAULT;

    /**
     * This is true if the X21 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x21ESet;

    /**
     * The default value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected static final Double R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected Double r = R_EDEFAULT;

    /**
     * This is true if the R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rESet;

    /**
     * The default value of the '{@link #getNegativeR21() <em>Negative R21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNegativeR21()
     * @generated
     * @ordered
     */
    protected static final Double NEGATIVE_R21_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNegativeR21() <em>Negative R21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNegativeR21()
     * @generated
     * @ordered
     */
    protected Double negativeR21 = NEGATIVE_R21_EDEFAULT;

    /**
     * This is true if the Negative R21 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean negativeR21ESet;

    /**
     * The default value of the '{@link #getNegativeR12() <em>Negative R12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNegativeR12()
     * @generated
     * @ordered
     */
    protected static final Double NEGATIVE_R12_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNegativeR12() <em>Negative R12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNegativeR12()
     * @generated
     * @ordered
     */
    protected Double negativeR12 = NEGATIVE_R12_EDEFAULT;

    /**
     * This is true if the Negative R12 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean negativeR12ESet;

    /**
     * The default value of the '{@link #getZeroR21() <em>Zero R21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZeroR21()
     * @generated
     * @ordered
     */
    protected static final Double ZERO_R21_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getZeroR21() <em>Zero R21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZeroR21()
     * @generated
     * @ordered
     */
    protected Double zeroR21 = ZERO_R21_EDEFAULT;

    /**
     * This is true if the Zero R21 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean zeroR21ESet;

    /**
     * The default value of the '{@link #getZeroR12() <em>Zero R12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZeroR12()
     * @generated
     * @ordered
     */
    protected static final Double ZERO_R12_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getZeroR12() <em>Zero R12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZeroR12()
     * @generated
     * @ordered
     */
    protected Double zeroR12 = ZERO_R12_EDEFAULT;

    /**
     * This is true if the Zero R12 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean zeroR12ESet;

    /**
     * The default value of the '{@link #getNegativeX21() <em>Negative X21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNegativeX21()
     * @generated
     * @ordered
     */
    protected static final Double NEGATIVE_X21_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNegativeX21() <em>Negative X21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNegativeX21()
     * @generated
     * @ordered
     */
    protected Double negativeX21 = NEGATIVE_X21_EDEFAULT;

    /**
     * This is true if the Negative X21 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean negativeX21ESet;

    /**
     * The default value of the '{@link #getPositiveR12() <em>Positive R12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositiveR12()
     * @generated
     * @ordered
     */
    protected static final Double POSITIVE_R12_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPositiveR12() <em>Positive R12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositiveR12()
     * @generated
     * @ordered
     */
    protected Double positiveR12 = POSITIVE_R12_EDEFAULT;

    /**
     * This is true if the Positive R12 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean positiveR12ESet;

    /**
     * The default value of the '{@link #getNegativeX12() <em>Negative X12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNegativeX12()
     * @generated
     * @ordered
     */
    protected static final Double NEGATIVE_X12_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNegativeX12() <em>Negative X12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNegativeX12()
     * @generated
     * @ordered
     */
    protected Double negativeX12 = NEGATIVE_X12_EDEFAULT;

    /**
     * This is true if the Negative X12 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean negativeX12ESet;

    /**
     * The default value of the '{@link #getPositiveX12() <em>Positive X12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositiveX12()
     * @generated
     * @ordered
     */
    protected static final Double POSITIVE_X12_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPositiveX12() <em>Positive X12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositiveX12()
     * @generated
     * @ordered
     */
    protected Double positiveX12 = POSITIVE_X12_EDEFAULT;

    /**
     * This is true if the Positive X12 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean positiveX12ESet;

    /**
     * The default value of the '{@link #getPositiveR21() <em>Positive R21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositiveR21()
     * @generated
     * @ordered
     */
    protected static final Double POSITIVE_R21_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPositiveR21() <em>Positive R21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositiveR21()
     * @generated
     * @ordered
     */
    protected Double positiveR21 = POSITIVE_R21_EDEFAULT;

    /**
     * This is true if the Positive R21 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean positiveR21ESet;

    /**
     * The default value of the '{@link #getPositiveX21() <em>Positive X21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositiveX21()
     * @generated
     * @ordered
     */
    protected static final Double POSITIVE_X21_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPositiveX21() <em>Positive X21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositiveX21()
     * @generated
     * @ordered
     */
    protected Double positiveX21 = POSITIVE_X21_EDEFAULT;

    /**
     * This is true if the Positive X21 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean positiveX21ESet;

    /**
     * The default value of the '{@link #getZeroX21() <em>Zero X21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZeroX21()
     * @generated
     * @ordered
     */
    protected static final Double ZERO_X21_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getZeroX21() <em>Zero X21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZeroX21()
     * @generated
     * @ordered
     */
    protected Double zeroX21 = ZERO_X21_EDEFAULT;

    /**
     * This is true if the Zero X21 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean zeroX21ESet;

    /**
     * The default value of the '{@link #getZeroX12() <em>Zero X12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZeroX12()
     * @generated
     * @ordered
     */
    protected static final Double ZERO_X12_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getZeroX12() <em>Zero X12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZeroX12()
     * @generated
     * @ordered
     */
    protected Double zeroX12 = ZERO_X12_EDEFAULT;

    /**
     * This is true if the Zero X12 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean zeroX12ESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EquivalentBranchImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEquivalentBranch();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getR() {
        return r;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR( Double newR ) {
        Double oldR = r;
        r = newR;
        boolean oldRESet = rESet;
        rESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_BRANCH__R, oldR, r,
                    !oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR() {
        Double oldR = r;
        boolean oldRESet = rESet;
        r = R_EDEFAULT;
        rESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_BRANCH__R, oldR, R_EDEFAULT,
                    oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR() {
        return rESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getNegativeR21() {
        return negativeR21;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNegativeR21( Double newNegativeR21 ) {
        Double oldNegativeR21 = negativeR21;
        negativeR21 = newNegativeR21;
        boolean oldNegativeR21ESet = negativeR21ESet;
        negativeR21ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_BRANCH__NEGATIVE_R21,
                    oldNegativeR21, negativeR21, !oldNegativeR21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNegativeR21() {
        Double oldNegativeR21 = negativeR21;
        boolean oldNegativeR21ESet = negativeR21ESet;
        negativeR21 = NEGATIVE_R21_EDEFAULT;
        negativeR21ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_BRANCH__NEGATIVE_R21,
                    oldNegativeR21, NEGATIVE_R21_EDEFAULT, oldNegativeR21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNegativeR21() {
        return negativeR21ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getNegativeR12() {
        return negativeR12;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNegativeR12( Double newNegativeR12 ) {
        Double oldNegativeR12 = negativeR12;
        negativeR12 = newNegativeR12;
        boolean oldNegativeR12ESet = negativeR12ESet;
        negativeR12ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_BRANCH__NEGATIVE_R12,
                    oldNegativeR12, negativeR12, !oldNegativeR12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNegativeR12() {
        Double oldNegativeR12 = negativeR12;
        boolean oldNegativeR12ESet = negativeR12ESet;
        negativeR12 = NEGATIVE_R12_EDEFAULT;
        negativeR12ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_BRANCH__NEGATIVE_R12,
                    oldNegativeR12, NEGATIVE_R12_EDEFAULT, oldNegativeR12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNegativeR12() {
        return negativeR12ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getZeroR21() {
        return zeroR21;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setZeroR21( Double newZeroR21 ) {
        Double oldZeroR21 = zeroR21;
        zeroR21 = newZeroR21;
        boolean oldZeroR21ESet = zeroR21ESet;
        zeroR21ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_BRANCH__ZERO_R21, oldZeroR21,
                    zeroR21, !oldZeroR21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetZeroR21() {
        Double oldZeroR21 = zeroR21;
        boolean oldZeroR21ESet = zeroR21ESet;
        zeroR21 = ZERO_R21_EDEFAULT;
        zeroR21ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_BRANCH__ZERO_R21,
                    oldZeroR21, ZERO_R21_EDEFAULT, oldZeroR21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetZeroR21() {
        return zeroR21ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getZeroR12() {
        return zeroR12;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setZeroR12( Double newZeroR12 ) {
        Double oldZeroR12 = zeroR12;
        zeroR12 = newZeroR12;
        boolean oldZeroR12ESet = zeroR12ESet;
        zeroR12ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_BRANCH__ZERO_R12, oldZeroR12,
                    zeroR12, !oldZeroR12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetZeroR12() {
        Double oldZeroR12 = zeroR12;
        boolean oldZeroR12ESet = zeroR12ESet;
        zeroR12 = ZERO_R12_EDEFAULT;
        zeroR12ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_BRANCH__ZERO_R12,
                    oldZeroR12, ZERO_R12_EDEFAULT, oldZeroR12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetZeroR12() {
        return zeroR12ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getNegativeX21() {
        return negativeX21;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNegativeX21( Double newNegativeX21 ) {
        Double oldNegativeX21 = negativeX21;
        negativeX21 = newNegativeX21;
        boolean oldNegativeX21ESet = negativeX21ESet;
        negativeX21ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_BRANCH__NEGATIVE_X21,
                    oldNegativeX21, negativeX21, !oldNegativeX21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNegativeX21() {
        Double oldNegativeX21 = negativeX21;
        boolean oldNegativeX21ESet = negativeX21ESet;
        negativeX21 = NEGATIVE_X21_EDEFAULT;
        negativeX21ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_BRANCH__NEGATIVE_X21,
                    oldNegativeX21, NEGATIVE_X21_EDEFAULT, oldNegativeX21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNegativeX21() {
        return negativeX21ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPositiveR12() {
        return positiveR12;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPositiveR12( Double newPositiveR12 ) {
        Double oldPositiveR12 = positiveR12;
        positiveR12 = newPositiveR12;
        boolean oldPositiveR12ESet = positiveR12ESet;
        positiveR12ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_BRANCH__POSITIVE_R12,
                    oldPositiveR12, positiveR12, !oldPositiveR12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPositiveR12() {
        Double oldPositiveR12 = positiveR12;
        boolean oldPositiveR12ESet = positiveR12ESet;
        positiveR12 = POSITIVE_R12_EDEFAULT;
        positiveR12ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_BRANCH__POSITIVE_R12,
                    oldPositiveR12, POSITIVE_R12_EDEFAULT, oldPositiveR12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPositiveR12() {
        return positiveR12ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getNegativeX12() {
        return negativeX12;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNegativeX12( Double newNegativeX12 ) {
        Double oldNegativeX12 = negativeX12;
        negativeX12 = newNegativeX12;
        boolean oldNegativeX12ESet = negativeX12ESet;
        negativeX12ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_BRANCH__NEGATIVE_X12,
                    oldNegativeX12, negativeX12, !oldNegativeX12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNegativeX12() {
        Double oldNegativeX12 = negativeX12;
        boolean oldNegativeX12ESet = negativeX12ESet;
        negativeX12 = NEGATIVE_X12_EDEFAULT;
        negativeX12ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_BRANCH__NEGATIVE_X12,
                    oldNegativeX12, NEGATIVE_X12_EDEFAULT, oldNegativeX12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNegativeX12() {
        return negativeX12ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPositiveX12() {
        return positiveX12;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPositiveX12( Double newPositiveX12 ) {
        Double oldPositiveX12 = positiveX12;
        positiveX12 = newPositiveX12;
        boolean oldPositiveX12ESet = positiveX12ESet;
        positiveX12ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_BRANCH__POSITIVE_X12,
                    oldPositiveX12, positiveX12, !oldPositiveX12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPositiveX12() {
        Double oldPositiveX12 = positiveX12;
        boolean oldPositiveX12ESet = positiveX12ESet;
        positiveX12 = POSITIVE_X12_EDEFAULT;
        positiveX12ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_BRANCH__POSITIVE_X12,
                    oldPositiveX12, POSITIVE_X12_EDEFAULT, oldPositiveX12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPositiveX12() {
        return positiveX12ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPositiveR21() {
        return positiveR21;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPositiveR21( Double newPositiveR21 ) {
        Double oldPositiveR21 = positiveR21;
        positiveR21 = newPositiveR21;
        boolean oldPositiveR21ESet = positiveR21ESet;
        positiveR21ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_BRANCH__POSITIVE_R21,
                    oldPositiveR21, positiveR21, !oldPositiveR21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPositiveR21() {
        Double oldPositiveR21 = positiveR21;
        boolean oldPositiveR21ESet = positiveR21ESet;
        positiveR21 = POSITIVE_R21_EDEFAULT;
        positiveR21ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_BRANCH__POSITIVE_R21,
                    oldPositiveR21, POSITIVE_R21_EDEFAULT, oldPositiveR21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPositiveR21() {
        return positiveR21ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPositiveX21() {
        return positiveX21;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPositiveX21( Double newPositiveX21 ) {
        Double oldPositiveX21 = positiveX21;
        positiveX21 = newPositiveX21;
        boolean oldPositiveX21ESet = positiveX21ESet;
        positiveX21ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_BRANCH__POSITIVE_X21,
                    oldPositiveX21, positiveX21, !oldPositiveX21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPositiveX21() {
        Double oldPositiveX21 = positiveX21;
        boolean oldPositiveX21ESet = positiveX21ESet;
        positiveX21 = POSITIVE_X21_EDEFAULT;
        positiveX21ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_BRANCH__POSITIVE_X21,
                    oldPositiveX21, POSITIVE_X21_EDEFAULT, oldPositiveX21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPositiveX21() {
        return positiveX21ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getZeroX21() {
        return zeroX21;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setZeroX21( Double newZeroX21 ) {
        Double oldZeroX21 = zeroX21;
        zeroX21 = newZeroX21;
        boolean oldZeroX21ESet = zeroX21ESet;
        zeroX21ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_BRANCH__ZERO_X21, oldZeroX21,
                    zeroX21, !oldZeroX21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetZeroX21() {
        Double oldZeroX21 = zeroX21;
        boolean oldZeroX21ESet = zeroX21ESet;
        zeroX21 = ZERO_X21_EDEFAULT;
        zeroX21ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_BRANCH__ZERO_X21,
                    oldZeroX21, ZERO_X21_EDEFAULT, oldZeroX21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetZeroX21() {
        return zeroX21ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getZeroX12() {
        return zeroX12;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setZeroX12( Double newZeroX12 ) {
        Double oldZeroX12 = zeroX12;
        zeroX12 = newZeroX12;
        boolean oldZeroX12ESet = zeroX12ESet;
        zeroX12ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_BRANCH__ZERO_X12, oldZeroX12,
                    zeroX12, !oldZeroX12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetZeroX12() {
        Double oldZeroX12 = zeroX12;
        boolean oldZeroX12ESet = zeroX12ESet;
        zeroX12 = ZERO_X12_EDEFAULT;
        zeroX12ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_BRANCH__ZERO_X12,
                    oldZeroX12, ZERO_X12_EDEFAULT, oldZeroX12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetZeroX12() {
        return zeroX12ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getX() {
        return x;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX( Double newX ) {
        Double oldX = x;
        x = newX;
        boolean oldXESet = xESet;
        xESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_BRANCH__X, oldX, x,
                    !oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX() {
        Double oldX = x;
        boolean oldXESet = xESet;
        x = X_EDEFAULT;
        xESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_BRANCH__X, oldX, X_EDEFAULT,
                    oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX() {
        return xESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getX21() {
        return x21;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX21( Double newX21 ) {
        Double oldX21 = x21;
        x21 = newX21;
        boolean oldX21ESet = x21ESet;
        x21ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_BRANCH__X21, oldX21, x21,
                    !oldX21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX21() {
        Double oldX21 = x21;
        boolean oldX21ESet = x21ESet;
        x21 = X21_EDEFAULT;
        x21ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_BRANCH__X21, oldX21,
                    X21_EDEFAULT, oldX21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX21() {
        return x21ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getR21() {
        return r21;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR21( Double newR21 ) {
        Double oldR21 = r21;
        r21 = newR21;
        boolean oldR21ESet = r21ESet;
        r21ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIVALENT_BRANCH__R21, oldR21, r21,
                    !oldR21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR21() {
        Double oldR21 = r21;
        boolean oldR21ESet = r21ESet;
        r21 = R21_EDEFAULT;
        r21ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIVALENT_BRANCH__R21, oldR21,
                    R21_EDEFAULT, oldR21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR21() {
        return r21ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EQUIVALENT_BRANCH__R21:
            return getR21();
        case CimPackage.EQUIVALENT_BRANCH__X:
            return getX();
        case CimPackage.EQUIVALENT_BRANCH__X21:
            return getX21();
        case CimPackage.EQUIVALENT_BRANCH__R:
            return getR();
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_R21:
            return getNegativeR21();
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_R12:
            return getNegativeR12();
        case CimPackage.EQUIVALENT_BRANCH__ZERO_R21:
            return getZeroR21();
        case CimPackage.EQUIVALENT_BRANCH__ZERO_R12:
            return getZeroR12();
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_X21:
            return getNegativeX21();
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_R12:
            return getPositiveR12();
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_X12:
            return getNegativeX12();
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_X12:
            return getPositiveX12();
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_R21:
            return getPositiveR21();
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_X21:
            return getPositiveX21();
        case CimPackage.EQUIVALENT_BRANCH__ZERO_X21:
            return getZeroX21();
        case CimPackage.EQUIVALENT_BRANCH__ZERO_X12:
            return getZeroX12();
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
        case CimPackage.EQUIVALENT_BRANCH__R21:
            setR21( ( Double ) newValue );
            return;
        case CimPackage.EQUIVALENT_BRANCH__X:
            setX( ( Double ) newValue );
            return;
        case CimPackage.EQUIVALENT_BRANCH__X21:
            setX21( ( Double ) newValue );
            return;
        case CimPackage.EQUIVALENT_BRANCH__R:
            setR( ( Double ) newValue );
            return;
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_R21:
            setNegativeR21( ( Double ) newValue );
            return;
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_R12:
            setNegativeR12( ( Double ) newValue );
            return;
        case CimPackage.EQUIVALENT_BRANCH__ZERO_R21:
            setZeroR21( ( Double ) newValue );
            return;
        case CimPackage.EQUIVALENT_BRANCH__ZERO_R12:
            setZeroR12( ( Double ) newValue );
            return;
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_X21:
            setNegativeX21( ( Double ) newValue );
            return;
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_R12:
            setPositiveR12( ( Double ) newValue );
            return;
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_X12:
            setNegativeX12( ( Double ) newValue );
            return;
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_X12:
            setPositiveX12( ( Double ) newValue );
            return;
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_R21:
            setPositiveR21( ( Double ) newValue );
            return;
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_X21:
            setPositiveX21( ( Double ) newValue );
            return;
        case CimPackage.EQUIVALENT_BRANCH__ZERO_X21:
            setZeroX21( ( Double ) newValue );
            return;
        case CimPackage.EQUIVALENT_BRANCH__ZERO_X12:
            setZeroX12( ( Double ) newValue );
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
        case CimPackage.EQUIVALENT_BRANCH__R21:
            unsetR21();
            return;
        case CimPackage.EQUIVALENT_BRANCH__X:
            unsetX();
            return;
        case CimPackage.EQUIVALENT_BRANCH__X21:
            unsetX21();
            return;
        case CimPackage.EQUIVALENT_BRANCH__R:
            unsetR();
            return;
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_R21:
            unsetNegativeR21();
            return;
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_R12:
            unsetNegativeR12();
            return;
        case CimPackage.EQUIVALENT_BRANCH__ZERO_R21:
            unsetZeroR21();
            return;
        case CimPackage.EQUIVALENT_BRANCH__ZERO_R12:
            unsetZeroR12();
            return;
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_X21:
            unsetNegativeX21();
            return;
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_R12:
            unsetPositiveR12();
            return;
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_X12:
            unsetNegativeX12();
            return;
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_X12:
            unsetPositiveX12();
            return;
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_R21:
            unsetPositiveR21();
            return;
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_X21:
            unsetPositiveX21();
            return;
        case CimPackage.EQUIVALENT_BRANCH__ZERO_X21:
            unsetZeroX21();
            return;
        case CimPackage.EQUIVALENT_BRANCH__ZERO_X12:
            unsetZeroX12();
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
        case CimPackage.EQUIVALENT_BRANCH__R21:
            return isSetR21();
        case CimPackage.EQUIVALENT_BRANCH__X:
            return isSetX();
        case CimPackage.EQUIVALENT_BRANCH__X21:
            return isSetX21();
        case CimPackage.EQUIVALENT_BRANCH__R:
            return isSetR();
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_R21:
            return isSetNegativeR21();
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_R12:
            return isSetNegativeR12();
        case CimPackage.EQUIVALENT_BRANCH__ZERO_R21:
            return isSetZeroR21();
        case CimPackage.EQUIVALENT_BRANCH__ZERO_R12:
            return isSetZeroR12();
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_X21:
            return isSetNegativeX21();
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_R12:
            return isSetPositiveR12();
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_X12:
            return isSetNegativeX12();
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_X12:
            return isSetPositiveX12();
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_R21:
            return isSetPositiveR21();
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_X21:
            return isSetPositiveX21();
        case CimPackage.EQUIVALENT_BRANCH__ZERO_X21:
            return isSetZeroX21();
        case CimPackage.EQUIVALENT_BRANCH__ZERO_X12:
            return isSetZeroX12();
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
        result.append( " (r21: " );
        if( r21ESet )
            result.append( r21 );
        else
            result.append( "<unset>" );
        result.append( ", x: " );
        if( xESet )
            result.append( x );
        else
            result.append( "<unset>" );
        result.append( ", x21: " );
        if( x21ESet )
            result.append( x21 );
        else
            result.append( "<unset>" );
        result.append( ", r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", negativeR21: " );
        if( negativeR21ESet )
            result.append( negativeR21 );
        else
            result.append( "<unset>" );
        result.append( ", negativeR12: " );
        if( negativeR12ESet )
            result.append( negativeR12 );
        else
            result.append( "<unset>" );
        result.append( ", zeroR21: " );
        if( zeroR21ESet )
            result.append( zeroR21 );
        else
            result.append( "<unset>" );
        result.append( ", zeroR12: " );
        if( zeroR12ESet )
            result.append( zeroR12 );
        else
            result.append( "<unset>" );
        result.append( ", negativeX21: " );
        if( negativeX21ESet )
            result.append( negativeX21 );
        else
            result.append( "<unset>" );
        result.append( ", positiveR12: " );
        if( positiveR12ESet )
            result.append( positiveR12 );
        else
            result.append( "<unset>" );
        result.append( ", negativeX12: " );
        if( negativeX12ESet )
            result.append( negativeX12 );
        else
            result.append( "<unset>" );
        result.append( ", positiveX12: " );
        if( positiveX12ESet )
            result.append( positiveX12 );
        else
            result.append( "<unset>" );
        result.append( ", positiveR21: " );
        if( positiveR21ESet )
            result.append( positiveR21 );
        else
            result.append( "<unset>" );
        result.append( ", positiveX21: " );
        if( positiveX21ESet )
            result.append( positiveX21 );
        else
            result.append( "<unset>" );
        result.append( ", zeroX21: " );
        if( zeroX21ESet )
            result.append( zeroX21 );
        else
            result.append( "<unset>" );
        result.append( ", zeroX12: " );
        if( zeroX12ESet )
            result.append( zeroX12 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EquivalentBranchImpl
