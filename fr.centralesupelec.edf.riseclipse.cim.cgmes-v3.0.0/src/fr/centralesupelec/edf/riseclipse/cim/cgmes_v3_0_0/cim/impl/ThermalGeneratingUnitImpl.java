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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CAESPlant;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CogenerationPlant;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CombinedCyclePlant;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.FossilFuel;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ThermalGeneratingUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thermal Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ThermalGeneratingUnitImpl#getFossilFuels <em>Fossil Fuels</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ThermalGeneratingUnitImpl#getCombinedCyclePlant <em>Combined Cycle Plant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ThermalGeneratingUnitImpl#getCogenerationPlant <em>Cogeneration Plant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ThermalGeneratingUnitImpl#getCAESPlant <em>CAES Plant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThermalGeneratingUnitImpl extends GeneratingUnitImpl implements ThermalGeneratingUnit {
    /**
     * The cached value of the '{@link #getFossilFuels() <em>Fossil Fuels</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFossilFuels()
     * @generated
     * @ordered
     */
    protected EList< FossilFuel > fossilFuels;

    /**
     * The cached value of the '{@link #getCombinedCyclePlant() <em>Combined Cycle Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCombinedCyclePlant()
     * @generated
     * @ordered
     */
    protected CombinedCyclePlant combinedCyclePlant;

    /**
     * This is true if the Combined Cycle Plant reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean combinedCyclePlantESet;

    /**
     * The cached value of the '{@link #getCogenerationPlant() <em>Cogeneration Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCogenerationPlant()
     * @generated
     * @ordered
     */
    protected CogenerationPlant cogenerationPlant;

    /**
     * This is true if the Cogeneration Plant reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cogenerationPlantESet;

    /**
     * The cached value of the '{@link #getCAESPlant() <em>CAES Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCAESPlant()
     * @generated
     * @ordered
     */
    protected CAESPlant caesPlant;

    /**
     * This is true if the CAES Plant reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean caesPlantESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ThermalGeneratingUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getThermalGeneratingUnit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FossilFuel > getFossilFuels() {
        if( fossilFuels == null ) {
            fossilFuels = new EObjectWithInverseResolvingEList.Unsettable< >( FossilFuel.class, this,
                    CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS, CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT );
        }
        return fossilFuels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFossilFuels() {
        if( fossilFuels != null ) ( ( InternalEList.Unsettable< ? > ) fossilFuels ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFossilFuels() {
        return fossilFuels != null && ( ( InternalEList.Unsettable< ? > ) fossilFuels ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CAESPlant getCAESPlant() {
        return caesPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCAESPlant( CAESPlant newCAESPlant, NotificationChain msgs ) {
        CAESPlant oldCAESPlant = caesPlant;
        caesPlant = newCAESPlant;
        boolean oldCAESPlantESet = caesPlantESet;
        caesPlantESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, oldCAESPlant, newCAESPlant, !oldCAESPlantESet );
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
    public void setCAESPlant( CAESPlant newCAESPlant ) {
        if( newCAESPlant != caesPlant ) {
            NotificationChain msgs = null;
            if( caesPlant != null )
                msgs = ( ( InternalEObject ) caesPlant ).eInverseRemove( this,
                        CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, CAESPlant.class, msgs );
            if( newCAESPlant != null )
                msgs = ( ( InternalEObject ) newCAESPlant ).eInverseAdd( this,
                        CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, CAESPlant.class, msgs );
            msgs = basicSetCAESPlant( newCAESPlant, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCAESPlantESet = caesPlantESet;
            caesPlantESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT,
                        newCAESPlant, newCAESPlant, !oldCAESPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCAESPlant( NotificationChain msgs ) {
        CAESPlant oldCAESPlant = caesPlant;
        caesPlant = null;
        boolean oldCAESPlantESet = caesPlantESet;
        caesPlantESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, oldCAESPlant, null, oldCAESPlantESet );
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
    public void unsetCAESPlant() {
        if( caesPlant != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) caesPlant ).eInverseRemove( this,
                    CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, CAESPlant.class, msgs );
            msgs = basicUnsetCAESPlant( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCAESPlantESet = caesPlantESet;
            caesPlantESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, null, null, oldCAESPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCAESPlant() {
        return caesPlantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CombinedCyclePlant getCombinedCyclePlant() {
        return combinedCyclePlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCombinedCyclePlant( CombinedCyclePlant newCombinedCyclePlant,
            NotificationChain msgs ) {
        CombinedCyclePlant oldCombinedCyclePlant = combinedCyclePlant;
        combinedCyclePlant = newCombinedCyclePlant;
        boolean oldCombinedCyclePlantESet = combinedCyclePlantESet;
        combinedCyclePlantESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT, oldCombinedCyclePlant,
                    newCombinedCyclePlant, !oldCombinedCyclePlantESet );
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
    public void setCombinedCyclePlant( CombinedCyclePlant newCombinedCyclePlant ) {
        if( newCombinedCyclePlant != combinedCyclePlant ) {
            NotificationChain msgs = null;
            if( combinedCyclePlant != null )
                msgs = ( ( InternalEObject ) combinedCyclePlant ).eInverseRemove( this,
                        CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS, CombinedCyclePlant.class, msgs );
            if( newCombinedCyclePlant != null )
                msgs = ( ( InternalEObject ) newCombinedCyclePlant ).eInverseAdd( this,
                        CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS, CombinedCyclePlant.class, msgs );
            msgs = basicSetCombinedCyclePlant( newCombinedCyclePlant, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCombinedCyclePlantESet = combinedCyclePlantESet;
            combinedCyclePlantESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT, newCombinedCyclePlant,
                        newCombinedCyclePlant, !oldCombinedCyclePlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCombinedCyclePlant( NotificationChain msgs ) {
        CombinedCyclePlant oldCombinedCyclePlant = combinedCyclePlant;
        combinedCyclePlant = null;
        boolean oldCombinedCyclePlantESet = combinedCyclePlantESet;
        combinedCyclePlantESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT, oldCombinedCyclePlant, null,
                    oldCombinedCyclePlantESet );
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
    public void unsetCombinedCyclePlant() {
        if( combinedCyclePlant != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) combinedCyclePlant ).eInverseRemove( this,
                    CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS, CombinedCyclePlant.class, msgs );
            msgs = basicUnsetCombinedCyclePlant( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCombinedCyclePlantESet = combinedCyclePlantESet;
            combinedCyclePlantESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT, null, null,
                        oldCombinedCyclePlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCombinedCyclePlant() {
        return combinedCyclePlantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CogenerationPlant getCogenerationPlant() {
        return cogenerationPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCogenerationPlant( CogenerationPlant newCogenerationPlant,
            NotificationChain msgs ) {
        CogenerationPlant oldCogenerationPlant = cogenerationPlant;
        cogenerationPlant = newCogenerationPlant;
        boolean oldCogenerationPlantESet = cogenerationPlantESet;
        cogenerationPlantESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT, oldCogenerationPlant, newCogenerationPlant,
                    !oldCogenerationPlantESet );
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
    public void setCogenerationPlant( CogenerationPlant newCogenerationPlant ) {
        if( newCogenerationPlant != cogenerationPlant ) {
            NotificationChain msgs = null;
            if( cogenerationPlant != null )
                msgs = ( ( InternalEObject ) cogenerationPlant ).eInverseRemove( this,
                        CimPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS, CogenerationPlant.class, msgs );
            if( newCogenerationPlant != null )
                msgs = ( ( InternalEObject ) newCogenerationPlant ).eInverseAdd( this,
                        CimPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS, CogenerationPlant.class, msgs );
            msgs = basicSetCogenerationPlant( newCogenerationPlant, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCogenerationPlantESet = cogenerationPlantESet;
            cogenerationPlantESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT, newCogenerationPlant,
                        newCogenerationPlant, !oldCogenerationPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCogenerationPlant( NotificationChain msgs ) {
        CogenerationPlant oldCogenerationPlant = cogenerationPlant;
        cogenerationPlant = null;
        boolean oldCogenerationPlantESet = cogenerationPlantESet;
        cogenerationPlantESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT, oldCogenerationPlant, null,
                    oldCogenerationPlantESet );
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
    public void unsetCogenerationPlant() {
        if( cogenerationPlant != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) cogenerationPlant ).eInverseRemove( this,
                    CimPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS, CogenerationPlant.class, msgs );
            msgs = basicUnsetCogenerationPlant( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCogenerationPlantESet = cogenerationPlantESet;
            cogenerationPlantESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT, null, null,
                        oldCogenerationPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCogenerationPlant() {
        return cogenerationPlantESet;
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
        case CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFossilFuels() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
            if( combinedCyclePlant != null )
                msgs = ( ( InternalEObject ) combinedCyclePlant ).eInverseRemove( this,
                        CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS, CombinedCyclePlant.class, msgs );
            return basicSetCombinedCyclePlant( ( CombinedCyclePlant ) otherEnd, msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
            if( cogenerationPlant != null )
                msgs = ( ( InternalEObject ) cogenerationPlant ).eInverseRemove( this,
                        CimPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS, CogenerationPlant.class, msgs );
            return basicSetCogenerationPlant( ( CogenerationPlant ) otherEnd, msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
            if( caesPlant != null )
                msgs = ( ( InternalEObject ) caesPlant ).eInverseRemove( this,
                        CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, CAESPlant.class, msgs );
            return basicSetCAESPlant( ( CAESPlant ) otherEnd, msgs );
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
        case CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
            return ( ( InternalEList< ? > ) getFossilFuels() ).basicRemove( otherEnd, msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
            return basicUnsetCombinedCyclePlant( msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
            return basicUnsetCogenerationPlant( msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
            return basicUnsetCAESPlant( msgs );
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
        case CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
            return getFossilFuels();
        case CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
            return getCombinedCyclePlant();
        case CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
            return getCogenerationPlant();
        case CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
            return getCAESPlant();
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
        case CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
            getFossilFuels().clear();
            getFossilFuels().addAll( ( Collection< ? extends FossilFuel > ) newValue );
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
            setCombinedCyclePlant( ( CombinedCyclePlant ) newValue );
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
            setCogenerationPlant( ( CogenerationPlant ) newValue );
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
            setCAESPlant( ( CAESPlant ) newValue );
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
        case CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
            unsetFossilFuels();
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
            unsetCombinedCyclePlant();
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
            unsetCogenerationPlant();
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
            unsetCAESPlant();
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
        case CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
            return isSetFossilFuels();
        case CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
            return isSetCombinedCyclePlant();
        case CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
            return isSetCogenerationPlant();
        case CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
            return isSetCAESPlant();
        }
        return super.eIsSet( featureID );
    }

} //ThermalGeneratingUnitImpl
