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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.provider.CimEditPlugin;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.provider.PowerSystemResourceItemProvider;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BoundaryPointItemProvider extends PowerSystemResourceItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BoundaryPointItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addConnectivityNodePropertyDescriptor( object );
            addToEndNamePropertyDescriptor( object );
            addIsDirectCurrentPropertyDescriptor( object );
            addFromEndNamePropertyDescriptor( object );
            addToEndIsoCodePropertyDescriptor( object );
            addIsExcludedFromAreaInterchangePropertyDescriptor( object );
            addToEndNameTsoPropertyDescriptor( object );
            addFromEndIsoCodePropertyDescriptor( object );
            addFromEndNameTsoPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the To End Iso Code feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addToEndIsoCodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BoundaryPoint_toEndIsoCode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BoundaryPoint_toEndIsoCode_feature",
                                "_UI_BoundaryPoint_type" ),
                        EuPackage.Literals.BOUNDARY_POINT__TO_END_ISO_CODE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the To End Name Tso feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addToEndNameTsoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BoundaryPoint_toEndNameTso_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BoundaryPoint_toEndNameTso_feature",
                                "_UI_BoundaryPoint_type" ),
                        EuPackage.Literals.BOUNDARY_POINT__TO_END_NAME_TSO,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the From End Iso Code feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFromEndIsoCodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BoundaryPoint_fromEndIsoCode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BoundaryPoint_fromEndIsoCode_feature",
                                "_UI_BoundaryPoint_type" ),
                        EuPackage.Literals.BOUNDARY_POINT__FROM_END_ISO_CODE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Is Excluded From Area Interchange feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsExcludedFromAreaInterchangePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BoundaryPoint_isExcludedFromAreaInterchange_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_BoundaryPoint_isExcludedFromAreaInterchange_feature", "_UI_BoundaryPoint_type" ),
                        EuPackage.Literals.BOUNDARY_POINT__IS_EXCLUDED_FROM_AREA_INTERCHANGE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Connectivity Node feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConnectivityNodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BoundaryPoint_ConnectivityNode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BoundaryPoint_ConnectivityNode_feature",
                                "_UI_BoundaryPoint_type" ),
                        EuPackage.Literals.BOUNDARY_POINT__CONNECTIVITY_NODE,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Is Direct Current feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsDirectCurrentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BoundaryPoint_isDirectCurrent_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BoundaryPoint_isDirectCurrent_feature",
                                "_UI_BoundaryPoint_type" ),
                        EuPackage.Literals.BOUNDARY_POINT__IS_DIRECT_CURRENT,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the From End Name Tso feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFromEndNameTsoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BoundaryPoint_fromEndNameTso_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BoundaryPoint_fromEndNameTso_feature",
                                "_UI_BoundaryPoint_type" ),
                        EuPackage.Literals.BOUNDARY_POINT__FROM_END_NAME_TSO,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the From End Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFromEndNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BoundaryPoint_fromEndName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BoundaryPoint_fromEndName_feature",
                                "_UI_BoundaryPoint_type" ),
                        EuPackage.Literals.BOUNDARY_POINT__FROM_END_NAME,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the To End Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addToEndNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_BoundaryPoint_toEndName_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BoundaryPoint_toEndName_feature",
                                "_UI_BoundaryPoint_type" ),
                        EuPackage.Literals.BOUNDARY_POINT__TO_END_NAME,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns BoundaryPoint.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/BoundaryPoint" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( BoundaryPoint ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_BoundaryPoint_type" )
                : getString( "_UI_BoundaryPoint_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( BoundaryPoint.class ) ) {
        case EuPackage.BOUNDARY_POINT__TO_END_NAME:
        case EuPackage.BOUNDARY_POINT__IS_DIRECT_CURRENT:
        case EuPackage.BOUNDARY_POINT__FROM_END_NAME:
        case EuPackage.BOUNDARY_POINT__TO_END_ISO_CODE:
        case EuPackage.BOUNDARY_POINT__IS_EXCLUDED_FROM_AREA_INTERCHANGE:
        case EuPackage.BOUNDARY_POINT__TO_END_NAME_TSO:
        case EuPackage.BOUNDARY_POINT__FROM_END_ISO_CODE:
        case EuPackage.BOUNDARY_POINT__FROM_END_NAME_TSO:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return CimEditPlugin.INSTANCE;
    }

}
