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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PFVArType2IEEEVArControllerItemProvider extends PFVArControllerType2DynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PFVArType2IEEEVArControllerItemProvider( AdapterFactory adapterFactory ) {
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

            addVclmtPropertyDescriptor( object );
            addExlonPropertyDescriptor( object );
            addKiPropertyDescriptor( object );
            addKpPropertyDescriptor( object );
            addVsPropertyDescriptor( object );
            addVrefPropertyDescriptor( object );
            addQrefPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Vclmt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVclmtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_PFVArType2IEEEVArController_vclmt_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType2IEEEVArController_vclmt_feature",
                        "_UI_PFVArType2IEEEVArController_type" ),
                CimPackage.eINSTANCE.getPFVArType2IEEEVArController_Vclmt(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Exlon feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExlonPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_PFVArType2IEEEVArController_exlon_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType2IEEEVArController_exlon_feature",
                        "_UI_PFVArType2IEEEVArController_type" ),
                CimPackage.eINSTANCE.getPFVArType2IEEEVArController_Exlon(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Ki feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PFVArType2IEEEVArController_ki_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType2IEEEVArController_ki_feature",
                                "_UI_PFVArType2IEEEVArController_type" ),
                        CimPackage.eINSTANCE.getPFVArType2IEEEVArController_Ki(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PFVArType2IEEEVArController_kp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType2IEEEVArController_kp_feature",
                                "_UI_PFVArType2IEEEVArController_type" ),
                        CimPackage.eINSTANCE.getPFVArType2IEEEVArController_Kp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PFVArType2IEEEVArController_vs_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType2IEEEVArController_vs_feature",
                                "_UI_PFVArType2IEEEVArController_type" ),
                        CimPackage.eINSTANCE.getPFVArType2IEEEVArController_Vs(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVrefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PFVArType2IEEEVArController_vref_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType2IEEEVArController_vref_feature",
                                "_UI_PFVArType2IEEEVArController_type" ),
                        CimPackage.eINSTANCE.getPFVArType2IEEEVArController_Vref(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Qref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQrefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PFVArType2IEEEVArController_qref_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType2IEEEVArController_qref_feature",
                                "_UI_PFVArType2IEEEVArController_type" ),
                        CimPackage.eINSTANCE.getPFVArType2IEEEVArController_Qref(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns PFVArType2IEEEVArController.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PFVArType2IEEEVArController" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PFVArType2IEEEVArController ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PFVArType2IEEEVArController_type" )
                : getString( "_UI_PFVArType2IEEEVArController_type" ) + " " + label;
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

        switch( notification.getFeatureID( PFVArType2IEEEVArController.class ) ) {
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VCLMT:
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__EXLON:
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__KI:
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__KP:
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VS:
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VREF:
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__QREF:
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

}
