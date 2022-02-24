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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Voltage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.BaseVoltageImpl#getNominalVoltage <em>Nominal Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.BaseVoltageImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.BaseVoltageImpl#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.BaseVoltageImpl#getTransformerEnds <em>Transformer Ends</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.BaseVoltageImpl#getTopologicalNode <em>Topological Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseVoltageImpl extends IdentifiedObjectImpl implements BaseVoltage {
    /**
     * The default value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalVoltage()
     * @generated
     * @ordered
     */
    protected static final Double NOMINAL_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalVoltage()
     * @generated
     * @ordered
     */
    protected Double nominalVoltage = NOMINAL_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Nominal Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nominalVoltageESet;

    /**
     * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConductingEquipment()
     * @generated
     * @ordered
     */
    protected EList< ConductingEquipment > conductingEquipment;

    /**
     * The cached value of the '{@link #getVoltageLevel() <em>Voltage Level</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageLevel()
     * @generated
     * @ordered
     */
    protected EList< VoltageLevel > voltageLevel;

    /**
     * The cached value of the '{@link #getTransformerEnds() <em>Transformer Ends</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerEnds()
     * @generated
     * @ordered
     */
    protected EList< TransformerEnd > transformerEnds;

    /**
     * The cached value of the '{@link #getTopologicalNode() <em>Topological Node</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTopologicalNode()
     * @generated
     * @ordered
     */
    protected EList< TopologicalNode > topologicalNode;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BaseVoltageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBaseVoltage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TransformerEnd > getTransformerEnds() {
        if( transformerEnds == null ) {
            transformerEnds = new EObjectWithInverseResolvingEList.Unsettable< >( TransformerEnd.class,
                    this, CimPackage.BASE_VOLTAGE__TRANSFORMER_ENDS, CimPackage.TRANSFORMER_END__BASE_VOLTAGE );
        }
        return transformerEnds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransformerEnds() {
        if( transformerEnds != null ) ( ( InternalEList.Unsettable< ? > ) transformerEnds ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransformerEnds() {
        return transformerEnds != null && ( ( InternalEList.Unsettable< ? > ) transformerEnds ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TopologicalNode > getTopologicalNode() {
        if( topologicalNode == null ) {
            topologicalNode = new EObjectWithInverseResolvingEList.Unsettable< >( TopologicalNode.class,
                    this, CimPackage.BASE_VOLTAGE__TOPOLOGICAL_NODE, CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE );
        }
        return topologicalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTopologicalNode() {
        if( topologicalNode != null ) ( ( InternalEList.Unsettable< ? > ) topologicalNode ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTopologicalNode() {
        return topologicalNode != null && ( ( InternalEList.Unsettable< ? > ) topologicalNode ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConductingEquipment > getConductingEquipment() {
        if( conductingEquipment == null ) {
            conductingEquipment = new EObjectWithInverseResolvingEList.Unsettable< >(
                    ConductingEquipment.class, this, CimPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT,
                    CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE );
        }
        return conductingEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConductingEquipment() {
        if( conductingEquipment != null ) ( ( InternalEList.Unsettable< ? > ) conductingEquipment ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConductingEquipment() {
        return conductingEquipment != null && ( ( InternalEList.Unsettable< ? > ) conductingEquipment ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getNominalVoltage() {
        return nominalVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNominalVoltage( Double newNominalVoltage ) {
        Double oldNominalVoltage = nominalVoltage;
        nominalVoltage = newNominalVoltage;
        boolean oldNominalVoltageESet = nominalVoltageESet;
        nominalVoltageESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BASE_VOLTAGE__NOMINAL_VOLTAGE,
                    oldNominalVoltage, nominalVoltage, !oldNominalVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNominalVoltage() {
        Double oldNominalVoltage = nominalVoltage;
        boolean oldNominalVoltageESet = nominalVoltageESet;
        nominalVoltage = NOMINAL_VOLTAGE_EDEFAULT;
        nominalVoltageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BASE_VOLTAGE__NOMINAL_VOLTAGE,
                    oldNominalVoltage, NOMINAL_VOLTAGE_EDEFAULT, oldNominalVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNominalVoltage() {
        return nominalVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< VoltageLevel > getVoltageLevel() {
        if( voltageLevel == null ) {
            voltageLevel = new EObjectWithInverseResolvingEList.Unsettable< >( VoltageLevel.class, this,
                    CimPackage.BASE_VOLTAGE__VOLTAGE_LEVEL, CimPackage.VOLTAGE_LEVEL__BASE_VOLTAGE );
        }
        return voltageLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltageLevel() {
        if( voltageLevel != null ) ( ( InternalEList.Unsettable< ? > ) voltageLevel ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageLevel() {
        return voltageLevel != null && ( ( InternalEList.Unsettable< ? > ) voltageLevel ).isSet();
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
        case CimPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConductingEquipment() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getVoltageLevel() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.BASE_VOLTAGE__TRANSFORMER_ENDS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTransformerEnds() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTopologicalNode() )
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
        case CimPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
            return ( ( InternalEList< ? > ) getConductingEquipment() ).basicRemove( otherEnd, msgs );
        case CimPackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
            return ( ( InternalEList< ? > ) getVoltageLevel() ).basicRemove( otherEnd, msgs );
        case CimPackage.BASE_VOLTAGE__TRANSFORMER_ENDS:
            return ( ( InternalEList< ? > ) getTransformerEnds() ).basicRemove( otherEnd, msgs );
        case CimPackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
            return ( ( InternalEList< ? > ) getTopologicalNode() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.BASE_VOLTAGE__NOMINAL_VOLTAGE:
            return getNominalVoltage();
        case CimPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
            return getConductingEquipment();
        case CimPackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
            return getVoltageLevel();
        case CimPackage.BASE_VOLTAGE__TRANSFORMER_ENDS:
            return getTransformerEnds();
        case CimPackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
            return getTopologicalNode();
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
        case CimPackage.BASE_VOLTAGE__NOMINAL_VOLTAGE:
            setNominalVoltage( ( Double ) newValue );
            return;
        case CimPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
            getConductingEquipment().clear();
            getConductingEquipment().addAll( ( Collection< ? extends ConductingEquipment > ) newValue );
            return;
        case CimPackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
            getVoltageLevel().clear();
            getVoltageLevel().addAll( ( Collection< ? extends VoltageLevel > ) newValue );
            return;
        case CimPackage.BASE_VOLTAGE__TRANSFORMER_ENDS:
            getTransformerEnds().clear();
            getTransformerEnds().addAll( ( Collection< ? extends TransformerEnd > ) newValue );
            return;
        case CimPackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
            getTopologicalNode().clear();
            getTopologicalNode().addAll( ( Collection< ? extends TopologicalNode > ) newValue );
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
        case CimPackage.BASE_VOLTAGE__NOMINAL_VOLTAGE:
            unsetNominalVoltage();
            return;
        case CimPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
            unsetConductingEquipment();
            return;
        case CimPackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
            unsetVoltageLevel();
            return;
        case CimPackage.BASE_VOLTAGE__TRANSFORMER_ENDS:
            unsetTransformerEnds();
            return;
        case CimPackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
            unsetTopologicalNode();
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
        case CimPackage.BASE_VOLTAGE__NOMINAL_VOLTAGE:
            return isSetNominalVoltage();
        case CimPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
            return isSetConductingEquipment();
        case CimPackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
            return isSetVoltageLevel();
        case CimPackage.BASE_VOLTAGE__TRANSFORMER_ENDS:
            return isSetTransformerEnds();
        case CimPackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
            return isSetTopologicalNode();
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
        result.append( " (nominalVoltage: " );
        if( nominalVoltageESet )
            result.append( nominalVoltage );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //BaseVoltageImpl
