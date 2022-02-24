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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identified Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.IdentifiedObjectImpl#getEnergyIdentCodeEic <em>Energy Ident Code Eic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.IdentifiedObjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.IdentifiedObjectImpl#getMRID <em>MRID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.IdentifiedObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.IdentifiedObjectImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.IdentifiedObjectImpl#getDiagramObjects <em>Diagram Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifiedObjectImpl extends CimObjectWithIDImpl implements IdentifiedObject {
    /**
     * The default value of the '{@link #getEnergyIdentCodeEic() <em>Energy Ident Code Eic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyIdentCodeEic()
     * @generated
     * @ordered
     */
    protected static final String ENERGY_IDENT_CODE_EIC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnergyIdentCodeEic() <em>Energy Ident Code Eic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyIdentCodeEic()
     * @generated
     * @ordered
     */
    protected String energyIdentCodeEic = ENERGY_IDENT_CODE_EIC_EDEFAULT;

    /**
     * This is true if the Energy Ident Code Eic attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energyIdentCodeEicESet;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * This is true if the Description attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean descriptionESet;

    /**
     * The default value of the '{@link #getMRID() <em>MRID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMRID()
     * @generated
     * @ordered
     */
    protected static final String MRID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMRID() <em>MRID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMRID()
     * @generated
     * @ordered
     */
    protected String mRID = MRID_EDEFAULT;

    /**
     * This is true if the MRID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mRIDESet;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

    /**
     * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortName()
     * @generated
     * @ordered
     */
    protected static final String SHORT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortName()
     * @generated
     * @ordered
     */
    protected String shortName = SHORT_NAME_EDEFAULT;

    /**
     * This is true if the Short Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shortNameESet;

    /**
     * The cached value of the '{@link #getDiagramObjects() <em>Diagram Objects</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagramObjects()
     * @generated
     * @ordered
     */
    protected EList< DiagramObject > diagramObjects;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IdentifiedObjectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getIdentifiedObject();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMRID() {
        return mRID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMRID( String newMRID ) {
        String oldMRID = mRID;
        mRID = newMRID;
        boolean oldMRIDESet = mRIDESet;
        mRIDESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.IDENTIFIED_OBJECT__MRID, oldMRID, mRID,
                    !oldMRIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMRID() {
        String oldMRID = mRID;
        boolean oldMRIDESet = mRIDESet;
        mRID = MRID_EDEFAULT;
        mRIDESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.IDENTIFIED_OBJECT__MRID, oldMRID,
                    MRID_EDEFAULT, oldMRIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMRID() {
        return mRIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getShortName() {
        return shortName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShortName( String newShortName ) {
        String oldShortName = shortName;
        shortName = newShortName;
        boolean oldShortNameESet = shortNameESet;
        shortNameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.IDENTIFIED_OBJECT__SHORT_NAME,
                    oldShortName, shortName, !oldShortNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShortName() {
        String oldShortName = shortName;
        boolean oldShortNameESet = shortNameESet;
        shortName = SHORT_NAME_EDEFAULT;
        shortNameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.IDENTIFIED_OBJECT__SHORT_NAME,
                    oldShortName, SHORT_NAME_EDEFAULT, oldShortNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShortName() {
        return shortNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DiagramObject > getDiagramObjects() {
        if( diagramObjects == null ) {
            diagramObjects = new EObjectWithInverseResolvingEList.Unsettable< >( DiagramObject.class,
                    this, CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS, CimPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT );
        }
        return diagramObjects;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiagramObjects() {
        if( diagramObjects != null ) ( ( InternalEList.Unsettable< ? > ) diagramObjects ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiagramObjects() {
        return diagramObjects != null && ( ( InternalEList.Unsettable< ? > ) diagramObjects ).isSet();
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
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDiagramObjects() )
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
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            return ( ( InternalEList< ? > ) getDiagramObjects() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getEnergyIdentCodeEic() {
        return energyIdentCodeEic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnergyIdentCodeEic( String newEnergyIdentCodeEic ) {
        String oldEnergyIdentCodeEic = energyIdentCodeEic;
        energyIdentCodeEic = newEnergyIdentCodeEic;
        boolean oldEnergyIdentCodeEicESet = energyIdentCodeEicESet;
        energyIdentCodeEicESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.IDENTIFIED_OBJECT__ENERGY_IDENT_CODE_EIC,
                    oldEnergyIdentCodeEic, energyIdentCodeEic, !oldEnergyIdentCodeEicESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergyIdentCodeEic() {
        String oldEnergyIdentCodeEic = energyIdentCodeEic;
        boolean oldEnergyIdentCodeEicESet = energyIdentCodeEicESet;
        energyIdentCodeEic = ENERGY_IDENT_CODE_EIC_EDEFAULT;
        energyIdentCodeEicESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.IDENTIFIED_OBJECT__ENERGY_IDENT_CODE_EIC, oldEnergyIdentCodeEic,
                    ENERGY_IDENT_CODE_EIC_EDEFAULT, oldEnergyIdentCodeEicESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergyIdentCodeEic() {
        return energyIdentCodeEicESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.IDENTIFIED_OBJECT__NAME, oldName, name,
                    !oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.IDENTIFIED_OBJECT__NAME, oldName,
                    NAME_EDEFAULT, oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDescription( String newDescription ) {
        String oldDescription = description;
        description = newDescription;
        boolean oldDescriptionESet = descriptionESet;
        descriptionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.IDENTIFIED_OBJECT__DESCRIPTION,
                    oldDescription, description, !oldDescriptionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDescription() {
        String oldDescription = description;
        boolean oldDescriptionESet = descriptionESet;
        description = DESCRIPTION_EDEFAULT;
        descriptionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.IDENTIFIED_OBJECT__DESCRIPTION,
                    oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDescription() {
        return descriptionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.IDENTIFIED_OBJECT__ENERGY_IDENT_CODE_EIC:
            return getEnergyIdentCodeEic();
        case CimPackage.IDENTIFIED_OBJECT__DESCRIPTION:
            return getDescription();
        case CimPackage.IDENTIFIED_OBJECT__MRID:
            return getMRID();
        case CimPackage.IDENTIFIED_OBJECT__NAME:
            return getName();
        case CimPackage.IDENTIFIED_OBJECT__SHORT_NAME:
            return getShortName();
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            return getDiagramObjects();
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
        case CimPackage.IDENTIFIED_OBJECT__ENERGY_IDENT_CODE_EIC:
            setEnergyIdentCodeEic( ( String ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__DESCRIPTION:
            setDescription( ( String ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__MRID:
            setMRID( ( String ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__NAME:
            setName( ( String ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__SHORT_NAME:
            setShortName( ( String ) newValue );
            return;
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            getDiagramObjects().clear();
            getDiagramObjects().addAll( ( Collection< ? extends DiagramObject > ) newValue );
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
        case CimPackage.IDENTIFIED_OBJECT__ENERGY_IDENT_CODE_EIC:
            unsetEnergyIdentCodeEic();
            return;
        case CimPackage.IDENTIFIED_OBJECT__DESCRIPTION:
            unsetDescription();
            return;
        case CimPackage.IDENTIFIED_OBJECT__MRID:
            unsetMRID();
            return;
        case CimPackage.IDENTIFIED_OBJECT__NAME:
            unsetName();
            return;
        case CimPackage.IDENTIFIED_OBJECT__SHORT_NAME:
            unsetShortName();
            return;
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            unsetDiagramObjects();
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
        case CimPackage.IDENTIFIED_OBJECT__ENERGY_IDENT_CODE_EIC:
            return isSetEnergyIdentCodeEic();
        case CimPackage.IDENTIFIED_OBJECT__DESCRIPTION:
            return isSetDescription();
        case CimPackage.IDENTIFIED_OBJECT__MRID:
            return isSetMRID();
        case CimPackage.IDENTIFIED_OBJECT__NAME:
            return isSetName();
        case CimPackage.IDENTIFIED_OBJECT__SHORT_NAME:
            return isSetShortName();
        case CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
            return isSetDiagramObjects();
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
        result.append( " (energyIdentCodeEic: " );
        if( energyIdentCodeEicESet )
            result.append( energyIdentCodeEic );
        else
            result.append( "<unset>" );
        result.append( ", description: " );
        if( descriptionESet )
            result.append( description );
        else
            result.append( "<unset>" );
        result.append( ", mRID: " );
        if( mRIDESet )
            result.append( mRID );
        else
            result.append( "<unset>" );
        result.append( ", name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ", shortName: " );
        if( shortNameESet )
            result.append( shortName );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //IdentifiedObjectImpl
