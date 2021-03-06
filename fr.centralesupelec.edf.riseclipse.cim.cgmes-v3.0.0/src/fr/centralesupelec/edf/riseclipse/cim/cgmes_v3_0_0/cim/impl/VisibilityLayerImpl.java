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

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VisibilityLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visibility Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VisibilityLayerImpl#getVisibleObjects <em>Visible Objects</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VisibilityLayerImpl#getDrawingOrder <em>Drawing Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisibilityLayerImpl extends IdentifiedObjectImpl implements VisibilityLayer {
    /**
     * The cached value of the '{@link #getVisibleObjects() <em>Visible Objects</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisibleObjects()
     * @generated
     * @ordered
     */
    protected EList< DiagramObject > visibleObjects;

    /**
     * The default value of the '{@link #getDrawingOrder() <em>Drawing Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDrawingOrder()
     * @generated
     * @ordered
     */
    protected static final BigInteger DRAWING_ORDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDrawingOrder() <em>Drawing Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDrawingOrder()
     * @generated
     * @ordered
     */
    protected BigInteger drawingOrder = DRAWING_ORDER_EDEFAULT;

    /**
     * This is true if the Drawing Order attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean drawingOrderESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VisibilityLayerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getVisibilityLayer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DiagramObject > getVisibleObjects() {
        if( visibleObjects == null ) {
            visibleObjects = new EObjectWithInverseEList.Unsettable.ManyInverse< >( DiagramObject.class,
                    this, CimPackage.VISIBILITY_LAYER__VISIBLE_OBJECTS, CimPackage.DIAGRAM_OBJECT__VISIBILITY_LAYERS );
        }
        return visibleObjects;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVisibleObjects() {
        if( visibleObjects != null ) ( ( InternalEList.Unsettable< ? > ) visibleObjects ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVisibleObjects() {
        return visibleObjects != null && ( ( InternalEList.Unsettable< ? > ) visibleObjects ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getDrawingOrder() {
        return drawingOrder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDrawingOrder( BigInteger newDrawingOrder ) {
        BigInteger oldDrawingOrder = drawingOrder;
        drawingOrder = newDrawingOrder;
        boolean oldDrawingOrderESet = drawingOrderESet;
        drawingOrderESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VISIBILITY_LAYER__DRAWING_ORDER,
                    oldDrawingOrder, drawingOrder, !oldDrawingOrderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDrawingOrder() {
        BigInteger oldDrawingOrder = drawingOrder;
        boolean oldDrawingOrderESet = drawingOrderESet;
        drawingOrder = DRAWING_ORDER_EDEFAULT;
        drawingOrderESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VISIBILITY_LAYER__DRAWING_ORDER,
                    oldDrawingOrder, DRAWING_ORDER_EDEFAULT, oldDrawingOrderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDrawingOrder() {
        return drawingOrderESet;
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
        case CimPackage.VISIBILITY_LAYER__VISIBLE_OBJECTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getVisibleObjects() )
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
        case CimPackage.VISIBILITY_LAYER__VISIBLE_OBJECTS:
            return ( ( InternalEList< ? > ) getVisibleObjects() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.VISIBILITY_LAYER__VISIBLE_OBJECTS:
            return getVisibleObjects();
        case CimPackage.VISIBILITY_LAYER__DRAWING_ORDER:
            return getDrawingOrder();
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
        case CimPackage.VISIBILITY_LAYER__VISIBLE_OBJECTS:
            getVisibleObjects().clear();
            getVisibleObjects().addAll( ( Collection< ? extends DiagramObject > ) newValue );
            return;
        case CimPackage.VISIBILITY_LAYER__DRAWING_ORDER:
            setDrawingOrder( ( BigInteger ) newValue );
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
        case CimPackage.VISIBILITY_LAYER__VISIBLE_OBJECTS:
            unsetVisibleObjects();
            return;
        case CimPackage.VISIBILITY_LAYER__DRAWING_ORDER:
            unsetDrawingOrder();
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
        case CimPackage.VISIBILITY_LAYER__VISIBLE_OBJECTS:
            return isSetVisibleObjects();
        case CimPackage.VISIBILITY_LAYER__DRAWING_ORDER:
            return isSetDrawingOrder();
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
        result.append( " (drawingOrder: " );
        if( drawingOrderESet )
            result.append( drawingOrder );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //VisibilityLayerImpl
