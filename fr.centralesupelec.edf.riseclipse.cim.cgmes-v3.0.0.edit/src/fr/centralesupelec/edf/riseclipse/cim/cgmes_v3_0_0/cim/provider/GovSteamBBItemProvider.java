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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamBB;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamBB} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovSteamBBItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovSteamBBItemProvider( AdapterFactory adapterFactory ) {
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

            addKsPropertyDescriptor( object );
            addKpPropertyDescriptor( object );
            addKdPropertyDescriptor( object );
            addKgPropertyDescriptor( object );
            addK3PropertyDescriptor( object );
            addK2PropertyDescriptor( object );
            addPeflagPropertyDescriptor( object );
            addTnPropertyDescriptor( object );
            addTdPropertyDescriptor( object );
            addT6PropertyDescriptor( object );
            addT5PropertyDescriptor( object );
            addT4PropertyDescriptor( object );
            addT1PropertyDescriptor( object );
            addPmaxPropertyDescriptor( object );
            addPminPropertyDescriptor( object );
            addKlsPropertyDescriptor( object );
            addFcutPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Ks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamBB_ks_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamBB_ks_feature",
                                "_UI_GovSteamBB_type" ),
                        CimPackage.eINSTANCE.getGovSteamBB_Ks(),
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
                        getString( "_UI_GovSteamBB_kp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamBB_kp_feature",
                                "_UI_GovSteamBB_type" ),
                        CimPackage.eINSTANCE.getGovSteamBB_Kp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamBB_kd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamBB_kd_feature",
                                "_UI_GovSteamBB_type" ),
                        CimPackage.eINSTANCE.getGovSteamBB_Kd(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kg feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKgPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamBB_kg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamBB_kg_feature",
                                "_UI_GovSteamBB_type" ),
                        CimPackage.eINSTANCE.getGovSteamBB_Kg(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the K3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamBB_k3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamBB_k3_feature",
                                "_UI_GovSteamBB_type" ),
                        CimPackage.eINSTANCE.getGovSteamBB_K3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the K2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamBB_k2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamBB_k2_feature",
                                "_UI_GovSteamBB_type" ),
                        CimPackage.eINSTANCE.getGovSteamBB_K2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Peflag feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPeflagPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamBB_peflag_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamBB_peflag_feature",
                                "_UI_GovSteamBB_type" ),
                        CimPackage.eINSTANCE.getGovSteamBB_Peflag(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamBB_tn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamBB_tn_feature",
                                "_UI_GovSteamBB_type" ),
                        CimPackage.eINSTANCE.getGovSteamBB_Tn(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Td feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamBB_td_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamBB_td_feature",
                                "_UI_GovSteamBB_type" ),
                        CimPackage.eINSTANCE.getGovSteamBB_Td(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the T6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamBB_t6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamBB_t6_feature",
                                "_UI_GovSteamBB_type" ),
                        CimPackage.eINSTANCE.getGovSteamBB_T6(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the T5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamBB_t5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamBB_t5_feature",
                                "_UI_GovSteamBB_type" ),
                        CimPackage.eINSTANCE.getGovSteamBB_T5(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the T4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamBB_t4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamBB_t4_feature",
                                "_UI_GovSteamBB_type" ),
                        CimPackage.eINSTANCE.getGovSteamBB_T4(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the T1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamBB_t1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamBB_t1_feature",
                                "_UI_GovSteamBB_type" ),
                        CimPackage.eINSTANCE.getGovSteamBB_T1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamBB_pmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamBB_pmax_feature",
                                "_UI_GovSteamBB_type" ),
                        CimPackage.eINSTANCE.getGovSteamBB_Pmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamBB_pmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamBB_pmin_feature",
                                "_UI_GovSteamBB_type" ),
                        CimPackage.eINSTANCE.getGovSteamBB_Pmin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kls feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKlsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamBB_kls_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamBB_kls_feature",
                                "_UI_GovSteamBB_type" ),
                        CimPackage.eINSTANCE.getGovSteamBB_Kls(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fcut feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFcutPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamBB_fcut_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamBB_fcut_feature",
                                "_UI_GovSteamBB_type" ),
                        CimPackage.eINSTANCE.getGovSteamBB_Fcut(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns GovSteamBB.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovSteamBB" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovSteamBB ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovSteamBB_type" )
                : getString( "_UI_GovSteamBB_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovSteamBB.class ) ) {
        case CimPackage.GOV_STEAM_BB__KS:
        case CimPackage.GOV_STEAM_BB__KP:
        case CimPackage.GOV_STEAM_BB__KD:
        case CimPackage.GOV_STEAM_BB__KG:
        case CimPackage.GOV_STEAM_BB__K3:
        case CimPackage.GOV_STEAM_BB__K2:
        case CimPackage.GOV_STEAM_BB__PEFLAG:
        case CimPackage.GOV_STEAM_BB__TN:
        case CimPackage.GOV_STEAM_BB__TD:
        case CimPackage.GOV_STEAM_BB__T6:
        case CimPackage.GOV_STEAM_BB__T5:
        case CimPackage.GOV_STEAM_BB__T4:
        case CimPackage.GOV_STEAM_BB__T1:
        case CimPackage.GOV_STEAM_BB__PMAX:
        case CimPackage.GOV_STEAM_BB__PMIN:
        case CimPackage.GOV_STEAM_BB__KLS:
        case CimPackage.GOV_STEAM_BB__FCUT:
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
