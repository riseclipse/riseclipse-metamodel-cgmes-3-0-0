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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc IEEEST5B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST5BImpl#getToc1 <em>Toc1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST5BImpl#getToc2 <em>Toc2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST5BImpl#getTob2 <em>Tob2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST5BImpl#getTob1 <em>Tob1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST5BImpl#getTb2 <em>Tb2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST5BImpl#getTb1 <em>Tb1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST5BImpl#getTc1 <em>Tc1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST5BImpl#getTc2 <em>Tc2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST5BImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST5BImpl#getKr <em>Kr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST5BImpl#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST5BImpl#getVrmin <em>Vrmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST5BImpl#getTub2 <em>Tub2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST5BImpl#getTub1 <em>Tub1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST5BImpl#getTuc2 <em>Tuc2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST5BImpl#getTuc1 <em>Tuc1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST5BImpl#getVrmax <em>Vrmax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcIEEEST5BImpl extends ExcitationSystemDynamicsImpl implements ExcIEEEST5B {
    /**
     * The default value of the '{@link #getToc1() <em>Toc1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToc1()
     * @generated
     * @ordered
     */
    protected static final Double TOC1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getToc1() <em>Toc1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToc1()
     * @generated
     * @ordered
     */
    protected Double toc1 = TOC1_EDEFAULT;

    /**
     * This is true if the Toc1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean toc1ESet;

    /**
     * The default value of the '{@link #getToc2() <em>Toc2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToc2()
     * @generated
     * @ordered
     */
    protected static final Double TOC2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getToc2() <em>Toc2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToc2()
     * @generated
     * @ordered
     */
    protected Double toc2 = TOC2_EDEFAULT;

    /**
     * This is true if the Toc2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean toc2ESet;

    /**
     * The default value of the '{@link #getTob2() <em>Tob2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTob2()
     * @generated
     * @ordered
     */
    protected static final Double TOB2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTob2() <em>Tob2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTob2()
     * @generated
     * @ordered
     */
    protected Double tob2 = TOB2_EDEFAULT;

    /**
     * This is true if the Tob2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tob2ESet;

    /**
     * The default value of the '{@link #getTob1() <em>Tob1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTob1()
     * @generated
     * @ordered
     */
    protected static final Double TOB1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTob1() <em>Tob1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTob1()
     * @generated
     * @ordered
     */
    protected Double tob1 = TOB1_EDEFAULT;

    /**
     * This is true if the Tob1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tob1ESet;

    /**
     * The default value of the '{@link #getTb2() <em>Tb2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb2()
     * @generated
     * @ordered
     */
    protected static final Double TB2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTb2() <em>Tb2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb2()
     * @generated
     * @ordered
     */
    protected Double tb2 = TB2_EDEFAULT;

    /**
     * This is true if the Tb2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tb2ESet;

    /**
     * The default value of the '{@link #getTb1() <em>Tb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb1()
     * @generated
     * @ordered
     */
    protected static final Double TB1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTb1() <em>Tb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb1()
     * @generated
     * @ordered
     */
    protected Double tb1 = TB1_EDEFAULT;

    /**
     * This is true if the Tb1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tb1ESet;

    /**
     * The default value of the '{@link #getTc1() <em>Tc1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc1()
     * @generated
     * @ordered
     */
    protected static final Double TC1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTc1() <em>Tc1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc1()
     * @generated
     * @ordered
     */
    protected Double tc1 = TC1_EDEFAULT;

    /**
     * This is true if the Tc1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tc1ESet;

    /**
     * The default value of the '{@link #getTc2() <em>Tc2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc2()
     * @generated
     * @ordered
     */
    protected static final Double TC2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTc2() <em>Tc2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc2()
     * @generated
     * @ordered
     */
    protected Double tc2 = TC2_EDEFAULT;

    /**
     * This is true if the Tc2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tc2ESet;

    /**
     * The default value of the '{@link #getT1() <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1()
     * @generated
     * @ordered
     */
    protected static final Double T1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT1() <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1()
     * @generated
     * @ordered
     */
    protected Double t1 = T1_EDEFAULT;

    /**
     * This is true if the T1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t1ESet;

    /**
     * The default value of the '{@link #getKr() <em>Kr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKr()
     * @generated
     * @ordered
     */
    protected static final Double KR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKr() <em>Kr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKr()
     * @generated
     * @ordered
     */
    protected Double kr = KR_EDEFAULT;

    /**
     * This is true if the Kr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean krESet;

    /**
     * The default value of the '{@link #getKc() <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKc()
     * @generated
     * @ordered
     */
    protected static final Double KC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKc() <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKc()
     * @generated
     * @ordered
     */
    protected Double kc = KC_EDEFAULT;

    /**
     * This is true if the Kc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kcESet;

    /**
     * The default value of the '{@link #getVrmin() <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmin()
     * @generated
     * @ordered
     */
    protected static final Double VRMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVrmin() <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmin()
     * @generated
     * @ordered
     */
    protected Double vrmin = VRMIN_EDEFAULT;

    /**
     * This is true if the Vrmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vrminESet;

    /**
     * The default value of the '{@link #getTub2() <em>Tub2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTub2()
     * @generated
     * @ordered
     */
    protected static final Double TUB2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTub2() <em>Tub2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTub2()
     * @generated
     * @ordered
     */
    protected Double tub2 = TUB2_EDEFAULT;

    /**
     * This is true if the Tub2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tub2ESet;

    /**
     * The default value of the '{@link #getTub1() <em>Tub1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTub1()
     * @generated
     * @ordered
     */
    protected static final Double TUB1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTub1() <em>Tub1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTub1()
     * @generated
     * @ordered
     */
    protected Double tub1 = TUB1_EDEFAULT;

    /**
     * This is true if the Tub1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tub1ESet;

    /**
     * The default value of the '{@link #getTuc2() <em>Tuc2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTuc2()
     * @generated
     * @ordered
     */
    protected static final Double TUC2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTuc2() <em>Tuc2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTuc2()
     * @generated
     * @ordered
     */
    protected Double tuc2 = TUC2_EDEFAULT;

    /**
     * This is true if the Tuc2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tuc2ESet;

    /**
     * The default value of the '{@link #getTuc1() <em>Tuc1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTuc1()
     * @generated
     * @ordered
     */
    protected static final Double TUC1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTuc1() <em>Tuc1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTuc1()
     * @generated
     * @ordered
     */
    protected Double tuc1 = TUC1_EDEFAULT;

    /**
     * This is true if the Tuc1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tuc1ESet;

    /**
     * The default value of the '{@link #getVrmax() <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmax()
     * @generated
     * @ordered
     */
    protected static final Double VRMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVrmax() <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmax()
     * @generated
     * @ordered
     */
    protected Double vrmax = VRMAX_EDEFAULT;

    /**
     * This is true if the Vrmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vrmaxESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcIEEEST5BImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcIEEEST5B();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getToc1() {
        return toc1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setToc1( Double newToc1 ) {
        Double oldToc1 = toc1;
        toc1 = newToc1;
        boolean oldToc1ESet = toc1ESet;
        toc1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST5B__TOC1, oldToc1, toc1,
                    !oldToc1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetToc1() {
        Double oldToc1 = toc1;
        boolean oldToc1ESet = toc1ESet;
        toc1 = TOC1_EDEFAULT;
        toc1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST5B__TOC1, oldToc1,
                    TOC1_EDEFAULT, oldToc1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetToc1() {
        return toc1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getToc2() {
        return toc2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setToc2( Double newToc2 ) {
        Double oldToc2 = toc2;
        toc2 = newToc2;
        boolean oldToc2ESet = toc2ESet;
        toc2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST5B__TOC2, oldToc2, toc2,
                    !oldToc2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetToc2() {
        Double oldToc2 = toc2;
        boolean oldToc2ESet = toc2ESet;
        toc2 = TOC2_EDEFAULT;
        toc2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST5B__TOC2, oldToc2,
                    TOC2_EDEFAULT, oldToc2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetToc2() {
        return toc2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTob2() {
        return tob2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTob2( Double newTob2 ) {
        Double oldTob2 = tob2;
        tob2 = newTob2;
        boolean oldTob2ESet = tob2ESet;
        tob2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST5B__TOB2, oldTob2, tob2,
                    !oldTob2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTob2() {
        Double oldTob2 = tob2;
        boolean oldTob2ESet = tob2ESet;
        tob2 = TOB2_EDEFAULT;
        tob2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST5B__TOB2, oldTob2,
                    TOB2_EDEFAULT, oldTob2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTob2() {
        return tob2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTob1() {
        return tob1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTob1( Double newTob1 ) {
        Double oldTob1 = tob1;
        tob1 = newTob1;
        boolean oldTob1ESet = tob1ESet;
        tob1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST5B__TOB1, oldTob1, tob1,
                    !oldTob1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTob1() {
        Double oldTob1 = tob1;
        boolean oldTob1ESet = tob1ESet;
        tob1 = TOB1_EDEFAULT;
        tob1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST5B__TOB1, oldTob1,
                    TOB1_EDEFAULT, oldTob1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTob1() {
        return tob1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTb2() {
        return tb2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTb2( Double newTb2 ) {
        Double oldTb2 = tb2;
        tb2 = newTb2;
        boolean oldTb2ESet = tb2ESet;
        tb2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST5B__TB2, oldTb2, tb2,
                    !oldTb2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTb2() {
        Double oldTb2 = tb2;
        boolean oldTb2ESet = tb2ESet;
        tb2 = TB2_EDEFAULT;
        tb2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST5B__TB2, oldTb2,
                    TB2_EDEFAULT, oldTb2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTb2() {
        return tb2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTb1() {
        return tb1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTb1( Double newTb1 ) {
        Double oldTb1 = tb1;
        tb1 = newTb1;
        boolean oldTb1ESet = tb1ESet;
        tb1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST5B__TB1, oldTb1, tb1,
                    !oldTb1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTb1() {
        Double oldTb1 = tb1;
        boolean oldTb1ESet = tb1ESet;
        tb1 = TB1_EDEFAULT;
        tb1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST5B__TB1, oldTb1,
                    TB1_EDEFAULT, oldTb1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTb1() {
        return tb1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTc1() {
        return tc1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTc1( Double newTc1 ) {
        Double oldTc1 = tc1;
        tc1 = newTc1;
        boolean oldTc1ESet = tc1ESet;
        tc1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST5B__TC1, oldTc1, tc1,
                    !oldTc1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTc1() {
        Double oldTc1 = tc1;
        boolean oldTc1ESet = tc1ESet;
        tc1 = TC1_EDEFAULT;
        tc1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST5B__TC1, oldTc1,
                    TC1_EDEFAULT, oldTc1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTc1() {
        return tc1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTc2() {
        return tc2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTc2( Double newTc2 ) {
        Double oldTc2 = tc2;
        tc2 = newTc2;
        boolean oldTc2ESet = tc2ESet;
        tc2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST5B__TC2, oldTc2, tc2,
                    !oldTc2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTc2() {
        Double oldTc2 = tc2;
        boolean oldTc2ESet = tc2ESet;
        tc2 = TC2_EDEFAULT;
        tc2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST5B__TC2, oldTc2,
                    TC2_EDEFAULT, oldTc2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTc2() {
        return tc2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT1() {
        return t1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT1( Double newT1 ) {
        Double oldT1 = t1;
        t1 = newT1;
        boolean oldT1ESet = t1ESet;
        t1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST5B__T1, oldT1, t1,
                    !oldT1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT1() {
        Double oldT1 = t1;
        boolean oldT1ESet = t1ESet;
        t1 = T1_EDEFAULT;
        t1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST5B__T1, oldT1, T1_EDEFAULT,
                    oldT1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT1() {
        return t1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKr() {
        return kr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKr( Double newKr ) {
        Double oldKr = kr;
        kr = newKr;
        boolean oldKrESet = krESet;
        krESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST5B__KR, oldKr, kr,
                    !oldKrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKr() {
        Double oldKr = kr;
        boolean oldKrESet = krESet;
        kr = KR_EDEFAULT;
        krESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST5B__KR, oldKr, KR_EDEFAULT,
                    oldKrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKr() {
        return krESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKc() {
        return kc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKc( Double newKc ) {
        Double oldKc = kc;
        kc = newKc;
        boolean oldKcESet = kcESet;
        kcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST5B__KC, oldKc, kc,
                    !oldKcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKc() {
        Double oldKc = kc;
        boolean oldKcESet = kcESet;
        kc = KC_EDEFAULT;
        kcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST5B__KC, oldKc, KC_EDEFAULT,
                    oldKcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKc() {
        return kcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVrmin() {
        return vrmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVrmin( Double newVrmin ) {
        Double oldVrmin = vrmin;
        vrmin = newVrmin;
        boolean oldVrminESet = vrminESet;
        vrminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST5B__VRMIN, oldVrmin, vrmin,
                    !oldVrminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVrmin() {
        Double oldVrmin = vrmin;
        boolean oldVrminESet = vrminESet;
        vrmin = VRMIN_EDEFAULT;
        vrminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST5B__VRMIN, oldVrmin,
                    VRMIN_EDEFAULT, oldVrminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVrmin() {
        return vrminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTub2() {
        return tub2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTub2( Double newTub2 ) {
        Double oldTub2 = tub2;
        tub2 = newTub2;
        boolean oldTub2ESet = tub2ESet;
        tub2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST5B__TUB2, oldTub2, tub2,
                    !oldTub2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTub2() {
        Double oldTub2 = tub2;
        boolean oldTub2ESet = tub2ESet;
        tub2 = TUB2_EDEFAULT;
        tub2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST5B__TUB2, oldTub2,
                    TUB2_EDEFAULT, oldTub2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTub2() {
        return tub2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTub1() {
        return tub1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTub1( Double newTub1 ) {
        Double oldTub1 = tub1;
        tub1 = newTub1;
        boolean oldTub1ESet = tub1ESet;
        tub1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST5B__TUB1, oldTub1, tub1,
                    !oldTub1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTub1() {
        Double oldTub1 = tub1;
        boolean oldTub1ESet = tub1ESet;
        tub1 = TUB1_EDEFAULT;
        tub1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST5B__TUB1, oldTub1,
                    TUB1_EDEFAULT, oldTub1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTub1() {
        return tub1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTuc2() {
        return tuc2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTuc2( Double newTuc2 ) {
        Double oldTuc2 = tuc2;
        tuc2 = newTuc2;
        boolean oldTuc2ESet = tuc2ESet;
        tuc2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST5B__TUC2, oldTuc2, tuc2,
                    !oldTuc2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTuc2() {
        Double oldTuc2 = tuc2;
        boolean oldTuc2ESet = tuc2ESet;
        tuc2 = TUC2_EDEFAULT;
        tuc2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST5B__TUC2, oldTuc2,
                    TUC2_EDEFAULT, oldTuc2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTuc2() {
        return tuc2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTuc1() {
        return tuc1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTuc1( Double newTuc1 ) {
        Double oldTuc1 = tuc1;
        tuc1 = newTuc1;
        boolean oldTuc1ESet = tuc1ESet;
        tuc1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST5B__TUC1, oldTuc1, tuc1,
                    !oldTuc1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTuc1() {
        Double oldTuc1 = tuc1;
        boolean oldTuc1ESet = tuc1ESet;
        tuc1 = TUC1_EDEFAULT;
        tuc1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST5B__TUC1, oldTuc1,
                    TUC1_EDEFAULT, oldTuc1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTuc1() {
        return tuc1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVrmax() {
        return vrmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVrmax( Double newVrmax ) {
        Double oldVrmax = vrmax;
        vrmax = newVrmax;
        boolean oldVrmaxESet = vrmaxESet;
        vrmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST5B__VRMAX, oldVrmax, vrmax,
                    !oldVrmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVrmax() {
        Double oldVrmax = vrmax;
        boolean oldVrmaxESet = vrmaxESet;
        vrmax = VRMAX_EDEFAULT;
        vrmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST5B__VRMAX, oldVrmax,
                    VRMAX_EDEFAULT, oldVrmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVrmax() {
        return vrmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_IEEEST5B__TOC1:
            return getToc1();
        case CimPackage.EXC_IEEEST5B__TOC2:
            return getToc2();
        case CimPackage.EXC_IEEEST5B__TOB2:
            return getTob2();
        case CimPackage.EXC_IEEEST5B__TOB1:
            return getTob1();
        case CimPackage.EXC_IEEEST5B__TB2:
            return getTb2();
        case CimPackage.EXC_IEEEST5B__TB1:
            return getTb1();
        case CimPackage.EXC_IEEEST5B__TC1:
            return getTc1();
        case CimPackage.EXC_IEEEST5B__TC2:
            return getTc2();
        case CimPackage.EXC_IEEEST5B__T1:
            return getT1();
        case CimPackage.EXC_IEEEST5B__KR:
            return getKr();
        case CimPackage.EXC_IEEEST5B__KC:
            return getKc();
        case CimPackage.EXC_IEEEST5B__VRMIN:
            return getVrmin();
        case CimPackage.EXC_IEEEST5B__TUB2:
            return getTub2();
        case CimPackage.EXC_IEEEST5B__TUB1:
            return getTub1();
        case CimPackage.EXC_IEEEST5B__TUC2:
            return getTuc2();
        case CimPackage.EXC_IEEEST5B__TUC1:
            return getTuc1();
        case CimPackage.EXC_IEEEST5B__VRMAX:
            return getVrmax();
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
        case CimPackage.EXC_IEEEST5B__TOC1:
            setToc1( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST5B__TOC2:
            setToc2( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST5B__TOB2:
            setTob2( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST5B__TOB1:
            setTob1( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST5B__TB2:
            setTb2( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST5B__TB1:
            setTb1( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST5B__TC1:
            setTc1( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST5B__TC2:
            setTc2( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST5B__T1:
            setT1( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST5B__KR:
            setKr( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST5B__KC:
            setKc( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST5B__VRMIN:
            setVrmin( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST5B__TUB2:
            setTub2( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST5B__TUB1:
            setTub1( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST5B__TUC2:
            setTuc2( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST5B__TUC1:
            setTuc1( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST5B__VRMAX:
            setVrmax( ( Double ) newValue );
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
        case CimPackage.EXC_IEEEST5B__TOC1:
            unsetToc1();
            return;
        case CimPackage.EXC_IEEEST5B__TOC2:
            unsetToc2();
            return;
        case CimPackage.EXC_IEEEST5B__TOB2:
            unsetTob2();
            return;
        case CimPackage.EXC_IEEEST5B__TOB1:
            unsetTob1();
            return;
        case CimPackage.EXC_IEEEST5B__TB2:
            unsetTb2();
            return;
        case CimPackage.EXC_IEEEST5B__TB1:
            unsetTb1();
            return;
        case CimPackage.EXC_IEEEST5B__TC1:
            unsetTc1();
            return;
        case CimPackage.EXC_IEEEST5B__TC2:
            unsetTc2();
            return;
        case CimPackage.EXC_IEEEST5B__T1:
            unsetT1();
            return;
        case CimPackage.EXC_IEEEST5B__KR:
            unsetKr();
            return;
        case CimPackage.EXC_IEEEST5B__KC:
            unsetKc();
            return;
        case CimPackage.EXC_IEEEST5B__VRMIN:
            unsetVrmin();
            return;
        case CimPackage.EXC_IEEEST5B__TUB2:
            unsetTub2();
            return;
        case CimPackage.EXC_IEEEST5B__TUB1:
            unsetTub1();
            return;
        case CimPackage.EXC_IEEEST5B__TUC2:
            unsetTuc2();
            return;
        case CimPackage.EXC_IEEEST5B__TUC1:
            unsetTuc1();
            return;
        case CimPackage.EXC_IEEEST5B__VRMAX:
            unsetVrmax();
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
        case CimPackage.EXC_IEEEST5B__TOC1:
            return isSetToc1();
        case CimPackage.EXC_IEEEST5B__TOC2:
            return isSetToc2();
        case CimPackage.EXC_IEEEST5B__TOB2:
            return isSetTob2();
        case CimPackage.EXC_IEEEST5B__TOB1:
            return isSetTob1();
        case CimPackage.EXC_IEEEST5B__TB2:
            return isSetTb2();
        case CimPackage.EXC_IEEEST5B__TB1:
            return isSetTb1();
        case CimPackage.EXC_IEEEST5B__TC1:
            return isSetTc1();
        case CimPackage.EXC_IEEEST5B__TC2:
            return isSetTc2();
        case CimPackage.EXC_IEEEST5B__T1:
            return isSetT1();
        case CimPackage.EXC_IEEEST5B__KR:
            return isSetKr();
        case CimPackage.EXC_IEEEST5B__KC:
            return isSetKc();
        case CimPackage.EXC_IEEEST5B__VRMIN:
            return isSetVrmin();
        case CimPackage.EXC_IEEEST5B__TUB2:
            return isSetTub2();
        case CimPackage.EXC_IEEEST5B__TUB1:
            return isSetTub1();
        case CimPackage.EXC_IEEEST5B__TUC2:
            return isSetTuc2();
        case CimPackage.EXC_IEEEST5B__TUC1:
            return isSetTuc1();
        case CimPackage.EXC_IEEEST5B__VRMAX:
            return isSetVrmax();
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
        result.append( " (toc1: " );
        if( toc1ESet )
            result.append( toc1 );
        else
            result.append( "<unset>" );
        result.append( ", toc2: " );
        if( toc2ESet )
            result.append( toc2 );
        else
            result.append( "<unset>" );
        result.append( ", tob2: " );
        if( tob2ESet )
            result.append( tob2 );
        else
            result.append( "<unset>" );
        result.append( ", tob1: " );
        if( tob1ESet )
            result.append( tob1 );
        else
            result.append( "<unset>" );
        result.append( ", tb2: " );
        if( tb2ESet )
            result.append( tb2 );
        else
            result.append( "<unset>" );
        result.append( ", tb1: " );
        if( tb1ESet )
            result.append( tb1 );
        else
            result.append( "<unset>" );
        result.append( ", tc1: " );
        if( tc1ESet )
            result.append( tc1 );
        else
            result.append( "<unset>" );
        result.append( ", tc2: " );
        if( tc2ESet )
            result.append( tc2 );
        else
            result.append( "<unset>" );
        result.append( ", t1: " );
        if( t1ESet )
            result.append( t1 );
        else
            result.append( "<unset>" );
        result.append( ", kr: " );
        if( krESet )
            result.append( kr );
        else
            result.append( "<unset>" );
        result.append( ", kc: " );
        if( kcESet )
            result.append( kc );
        else
            result.append( "<unset>" );
        result.append( ", vrmin: " );
        if( vrminESet )
            result.append( vrmin );
        else
            result.append( "<unset>" );
        result.append( ", tub2: " );
        if( tub2ESet )
            result.append( tub2 );
        else
            result.append( "<unset>" );
        result.append( ", tub1: " );
        if( tub1ESet )
            result.append( tub1 );
        else
            result.append( "<unset>" );
        result.append( ", tuc2: " );
        if( tuc2ESet )
            result.append( tuc2 );
        else
            result.append( "<unset>" );
        result.append( ", tuc1: " );
        if( tuc1ESet )
            result.append( tuc1 );
        else
            result.append( "<unset>" );
        result.append( ", vrmax: " );
        if( vrmaxESet )
            result.append( vrmax );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcIEEEST5BImpl
