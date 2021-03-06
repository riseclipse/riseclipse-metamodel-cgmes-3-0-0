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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectGluePoint;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Object Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiagramObjectPointImpl#getDiagramObject <em>Diagram Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiagramObjectPointImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiagramObjectPointImpl#getDiagramObjectGluePoint <em>Diagram Object Glue Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiagramObjectPointImpl#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiagramObjectPointImpl#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiagramObjectPointImpl#getZPosition <em>ZPosition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramObjectPointImpl extends CimObjectWithIDImpl implements DiagramObjectPoint {
    /**
     * The cached value of the '{@link #getDiagramObject() <em>Diagram Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagramObject()
     * @generated
     * @ordered
     */
    protected DiagramObject diagramObject;

    /**
     * This is true if the Diagram Object reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean diagramObjectESet;

    /**
     * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequenceNumber()
     * @generated
     * @ordered
     */
    protected static final BigInteger SEQUENCE_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequenceNumber()
     * @generated
     * @ordered
     */
    protected BigInteger sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

    /**
     * This is true if the Sequence Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sequenceNumberESet;

    /**
     * The cached value of the '{@link #getDiagramObjectGluePoint() <em>Diagram Object Glue Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagramObjectGluePoint()
     * @generated
     * @ordered
     */
    protected DiagramObjectGluePoint diagramObjectGluePoint;

    /**
     * This is true if the Diagram Object Glue Point reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean diagramObjectGluePointESet;

    /**
     * The default value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYPosition()
     * @generated
     * @ordered
     */
    protected static final Double YPOSITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYPosition()
     * @generated
     * @ordered
     */
    protected Double yPosition = YPOSITION_EDEFAULT;

    /**
     * This is true if the YPosition attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean yPositionESet;

    /**
     * The default value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXPosition()
     * @generated
     * @ordered
     */
    protected static final Double XPOSITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXPosition()
     * @generated
     * @ordered
     */
    protected Double xPosition = XPOSITION_EDEFAULT;

    /**
     * This is true if the XPosition attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xPositionESet;

    /**
     * The default value of the '{@link #getZPosition() <em>ZPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZPosition()
     * @generated
     * @ordered
     */
    protected static final Double ZPOSITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getZPosition() <em>ZPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZPosition()
     * @generated
     * @ordered
     */
    protected Double zPosition = ZPOSITION_EDEFAULT;

    /**
     * This is true if the ZPosition attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean zPositionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramObjectPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDiagramObjectPoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagramObject getDiagramObject() {
        return diagramObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiagramObject( DiagramObject newDiagramObject, NotificationChain msgs ) {
        DiagramObject oldDiagramObject = diagramObject;
        diagramObject = newDiagramObject;
        boolean oldDiagramObjectESet = diagramObjectESet;
        diagramObjectESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT, oldDiagramObject, newDiagramObject,
                    !oldDiagramObjectESet );
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
    public void setDiagramObject( DiagramObject newDiagramObject ) {
        if( newDiagramObject != diagramObject ) {
            NotificationChain msgs = null;
            if( diagramObject != null )
                msgs = ( ( InternalEObject ) diagramObject ).eInverseRemove( this,
                        CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS, DiagramObject.class, msgs );
            if( newDiagramObject != null )
                msgs = ( ( InternalEObject ) newDiagramObject ).eInverseAdd( this,
                        CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS, DiagramObject.class, msgs );
            msgs = basicSetDiagramObject( newDiagramObject, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiagramObjectESet = diagramObjectESet;
            diagramObjectESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT,
                        newDiagramObject, newDiagramObject, !oldDiagramObjectESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDiagramObject( NotificationChain msgs ) {
        DiagramObject oldDiagramObject = diagramObject;
        diagramObject = null;
        boolean oldDiagramObjectESet = diagramObjectESet;
        diagramObjectESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT, oldDiagramObject, null, oldDiagramObjectESet );
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
    public void unsetDiagramObject() {
        if( diagramObject != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) diagramObject ).eInverseRemove( this,
                    CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS, DiagramObject.class, msgs );
            msgs = basicUnsetDiagramObject( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiagramObjectESet = diagramObjectESet;
            diagramObjectESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT, null, null, oldDiagramObjectESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiagramObject() {
        return diagramObjectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSequenceNumber( BigInteger newSequenceNumber ) {
        BigInteger oldSequenceNumber = sequenceNumber;
        sequenceNumber = newSequenceNumber;
        boolean oldSequenceNumberESet = sequenceNumberESet;
        sequenceNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DIAGRAM_OBJECT_POINT__SEQUENCE_NUMBER,
                    oldSequenceNumber, sequenceNumber, !oldSequenceNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSequenceNumber() {
        BigInteger oldSequenceNumber = sequenceNumber;
        boolean oldSequenceNumberESet = sequenceNumberESet;
        sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;
        sequenceNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DIAGRAM_OBJECT_POINT__SEQUENCE_NUMBER,
                    oldSequenceNumber, SEQUENCE_NUMBER_EDEFAULT, oldSequenceNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSequenceNumber() {
        return sequenceNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagramObjectGluePoint getDiagramObjectGluePoint() {
        return diagramObjectGluePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiagramObjectGluePoint( DiagramObjectGluePoint newDiagramObjectGluePoint,
            NotificationChain msgs ) {
        DiagramObjectGluePoint oldDiagramObjectGluePoint = diagramObjectGluePoint;
        diagramObjectGluePoint = newDiagramObjectGluePoint;
        boolean oldDiagramObjectGluePointESet = diagramObjectGluePointESet;
        diagramObjectGluePointESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT_GLUE_POINT, oldDiagramObjectGluePoint,
                    newDiagramObjectGluePoint, !oldDiagramObjectGluePointESet );
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
    public void setDiagramObjectGluePoint( DiagramObjectGluePoint newDiagramObjectGluePoint ) {
        if( newDiagramObjectGluePoint != diagramObjectGluePoint ) {
            NotificationChain msgs = null;
            if( diagramObjectGluePoint != null )
                msgs = ( ( InternalEObject ) diagramObjectGluePoint ).eInverseRemove( this,
                        CimPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS, DiagramObjectGluePoint.class,
                        msgs );
            if( newDiagramObjectGluePoint != null )
                msgs = ( ( InternalEObject ) newDiagramObjectGluePoint ).eInverseAdd( this,
                        CimPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS, DiagramObjectGluePoint.class,
                        msgs );
            msgs = basicSetDiagramObjectGluePoint( newDiagramObjectGluePoint, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiagramObjectGluePointESet = diagramObjectGluePointESet;
            diagramObjectGluePointESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT_GLUE_POINT, newDiagramObjectGluePoint,
                        newDiagramObjectGluePoint, !oldDiagramObjectGluePointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDiagramObjectGluePoint( NotificationChain msgs ) {
        DiagramObjectGluePoint oldDiagramObjectGluePoint = diagramObjectGluePoint;
        diagramObjectGluePoint = null;
        boolean oldDiagramObjectGluePointESet = diagramObjectGluePointESet;
        diagramObjectGluePointESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT_GLUE_POINT, oldDiagramObjectGluePoint, null,
                    oldDiagramObjectGluePointESet );
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
    public void unsetDiagramObjectGluePoint() {
        if( diagramObjectGluePoint != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) diagramObjectGluePoint ).eInverseRemove( this,
                    CimPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS, DiagramObjectGluePoint.class, msgs );
            msgs = basicUnsetDiagramObjectGluePoint( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiagramObjectGluePointESet = diagramObjectGluePointESet;
            diagramObjectGluePointESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT_GLUE_POINT, null, null,
                        oldDiagramObjectGluePointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiagramObjectGluePoint() {
        return diagramObjectGluePointESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getYPosition() {
        return yPosition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setYPosition( Double newYPosition ) {
        Double oldYPosition = yPosition;
        yPosition = newYPosition;
        boolean oldYPositionESet = yPositionESet;
        yPositionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DIAGRAM_OBJECT_POINT__YPOSITION,
                    oldYPosition, yPosition, !oldYPositionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetYPosition() {
        Double oldYPosition = yPosition;
        boolean oldYPositionESet = yPositionESet;
        yPosition = YPOSITION_EDEFAULT;
        yPositionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DIAGRAM_OBJECT_POINT__YPOSITION,
                    oldYPosition, YPOSITION_EDEFAULT, oldYPositionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetYPosition() {
        return yPositionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXPosition() {
        return xPosition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXPosition( Double newXPosition ) {
        Double oldXPosition = xPosition;
        xPosition = newXPosition;
        boolean oldXPositionESet = xPositionESet;
        xPositionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DIAGRAM_OBJECT_POINT__XPOSITION,
                    oldXPosition, xPosition, !oldXPositionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXPosition() {
        Double oldXPosition = xPosition;
        boolean oldXPositionESet = xPositionESet;
        xPosition = XPOSITION_EDEFAULT;
        xPositionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DIAGRAM_OBJECT_POINT__XPOSITION,
                    oldXPosition, XPOSITION_EDEFAULT, oldXPositionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXPosition() {
        return xPositionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getZPosition() {
        return zPosition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setZPosition( Double newZPosition ) {
        Double oldZPosition = zPosition;
        zPosition = newZPosition;
        boolean oldZPositionESet = zPositionESet;
        zPositionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DIAGRAM_OBJECT_POINT__ZPOSITION,
                    oldZPosition, zPosition, !oldZPositionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetZPosition() {
        Double oldZPosition = zPosition;
        boolean oldZPositionESet = zPositionESet;
        zPosition = ZPOSITION_EDEFAULT;
        zPositionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DIAGRAM_OBJECT_POINT__ZPOSITION,
                    oldZPosition, ZPOSITION_EDEFAULT, oldZPositionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetZPosition() {
        return zPositionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT:
            if( diagramObject != null )
                msgs = ( ( InternalEObject ) diagramObject ).eInverseRemove( this,
                        CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS, DiagramObject.class, msgs );
            return basicSetDiagramObject( ( DiagramObject ) otherEnd, msgs );
        case CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT_GLUE_POINT:
            if( diagramObjectGluePoint != null )
                msgs = ( ( InternalEObject ) diagramObjectGluePoint ).eInverseRemove( this,
                        CimPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS, DiagramObjectGluePoint.class,
                        msgs );
            return basicSetDiagramObjectGluePoint( ( DiagramObjectGluePoint ) otherEnd, msgs );
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
        case CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT:
            return basicUnsetDiagramObject( msgs );
        case CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT_GLUE_POINT:
            return basicUnsetDiagramObjectGluePoint( msgs );
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
        case CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT:
            return getDiagramObject();
        case CimPackage.DIAGRAM_OBJECT_POINT__SEQUENCE_NUMBER:
            return getSequenceNumber();
        case CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT_GLUE_POINT:
            return getDiagramObjectGluePoint();
        case CimPackage.DIAGRAM_OBJECT_POINT__YPOSITION:
            return getYPosition();
        case CimPackage.DIAGRAM_OBJECT_POINT__XPOSITION:
            return getXPosition();
        case CimPackage.DIAGRAM_OBJECT_POINT__ZPOSITION:
            return getZPosition();
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
        case CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT:
            setDiagramObject( ( DiagramObject ) newValue );
            return;
        case CimPackage.DIAGRAM_OBJECT_POINT__SEQUENCE_NUMBER:
            setSequenceNumber( ( BigInteger ) newValue );
            return;
        case CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT_GLUE_POINT:
            setDiagramObjectGluePoint( ( DiagramObjectGluePoint ) newValue );
            return;
        case CimPackage.DIAGRAM_OBJECT_POINT__YPOSITION:
            setYPosition( ( Double ) newValue );
            return;
        case CimPackage.DIAGRAM_OBJECT_POINT__XPOSITION:
            setXPosition( ( Double ) newValue );
            return;
        case CimPackage.DIAGRAM_OBJECT_POINT__ZPOSITION:
            setZPosition( ( Double ) newValue );
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
        case CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT:
            unsetDiagramObject();
            return;
        case CimPackage.DIAGRAM_OBJECT_POINT__SEQUENCE_NUMBER:
            unsetSequenceNumber();
            return;
        case CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT_GLUE_POINT:
            unsetDiagramObjectGluePoint();
            return;
        case CimPackage.DIAGRAM_OBJECT_POINT__YPOSITION:
            unsetYPosition();
            return;
        case CimPackage.DIAGRAM_OBJECT_POINT__XPOSITION:
            unsetXPosition();
            return;
        case CimPackage.DIAGRAM_OBJECT_POINT__ZPOSITION:
            unsetZPosition();
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
        case CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT:
            return isSetDiagramObject();
        case CimPackage.DIAGRAM_OBJECT_POINT__SEQUENCE_NUMBER:
            return isSetSequenceNumber();
        case CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT_GLUE_POINT:
            return isSetDiagramObjectGluePoint();
        case CimPackage.DIAGRAM_OBJECT_POINT__YPOSITION:
            return isSetYPosition();
        case CimPackage.DIAGRAM_OBJECT_POINT__XPOSITION:
            return isSetXPosition();
        case CimPackage.DIAGRAM_OBJECT_POINT__ZPOSITION:
            return isSetZPosition();
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
        result.append( " (sequenceNumber: " );
        if( sequenceNumberESet )
            result.append( sequenceNumber );
        else
            result.append( "<unset>" );
        result.append( ", yPosition: " );
        if( yPositionESet )
            result.append( yPosition );
        else
            result.append( "<unset>" );
        result.append( ", xPosition: " );
        if( xPositionESet )
            result.append( xPosition );
        else
            result.append( "<unset>" );
        result.append( ", zPosition: " );
        if( zPositionESet )
            result.append( zPosition );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DiagramObjectPointImpl
