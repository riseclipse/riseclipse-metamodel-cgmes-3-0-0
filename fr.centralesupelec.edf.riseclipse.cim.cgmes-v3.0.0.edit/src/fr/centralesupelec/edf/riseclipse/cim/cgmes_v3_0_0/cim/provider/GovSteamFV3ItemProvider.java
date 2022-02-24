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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV3;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamFV3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovSteamFV3ItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovSteamFV3ItemProvider( AdapterFactory adapterFactory ) {
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

            addPrmaxPropertyDescriptor( object );
            addKPropertyDescriptor( object );
            addPgv6PropertyDescriptor( object );
            addPgv1PropertyDescriptor( object );
            addPgv2PropertyDescriptor( object );
            addPgv3PropertyDescriptor( object );
            addPgv4PropertyDescriptor( object );
            addPgv5PropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addPminPropertyDescriptor( object );
            addUoPropertyDescriptor( object );
            addUcPropertyDescriptor( object );
            addTaPropertyDescriptor( object );
            addTbPropertyDescriptor( object );
            addTcPropertyDescriptor( object );
            addT1PropertyDescriptor( object );
            addT2PropertyDescriptor( object );
            addT5PropertyDescriptor( object );
            addT6PropertyDescriptor( object );
            addT3PropertyDescriptor( object );
            addT4PropertyDescriptor( object );
            addK2PropertyDescriptor( object );
            addK3PropertyDescriptor( object );
            addK1PropertyDescriptor( object );
            addGv6PropertyDescriptor( object );
            addGv4PropertyDescriptor( object );
            addGv5PropertyDescriptor( object );
            addGv2PropertyDescriptor( object );
            addGv3PropertyDescriptor( object );
            addGv1PropertyDescriptor( object );
            addPmaxPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Prmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_prmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_prmax_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Prmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the K feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_k_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_k_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_K(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pgv6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_pgv6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_pgv6_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Pgv6(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pgv1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_pgv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_pgv1_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Pgv1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pgv2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_pgv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_pgv2_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Pgv2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pgv3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_pgv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_pgv3_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Pgv3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pgv4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_pgv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_pgv4_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Pgv4(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pgv5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_pgv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_pgv5_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Pgv5(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Mwbase feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMwbasePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_mwbase_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Mwbase(),
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
                        getString( "_UI_GovSteamFV3_pmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_pmin_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Pmin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Uo feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_uo_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_uo_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Uo(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Uc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_uc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_uc_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Uc(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ta feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_ta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_ta_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Ta(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_tb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_tb_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Tb(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_tc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_tc_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Tc(),
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
                        getString( "_UI_GovSteamFV3_t1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_t1_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_T1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the T2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_t2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_t2_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_T2(),
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
                        getString( "_UI_GovSteamFV3_t5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_t5_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_T5(),
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
                        getString( "_UI_GovSteamFV3_t6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_t6_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_T6(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the T3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_t3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_t3_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_T3(),
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
                        getString( "_UI_GovSteamFV3_t4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_t4_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_T4(),
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
                        getString( "_UI_GovSteamFV3_k2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_k2_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_K2(),
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
                        getString( "_UI_GovSteamFV3_k3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_k3_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_K3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the K1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_k1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_k1_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_K1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gv6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_gv6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_gv6_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Gv6(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gv4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_gv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_gv4_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Gv4(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gv5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_gv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_gv5_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Gv5(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gv2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_gv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_gv2_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Gv2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gv3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_gv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_gv3_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Gv3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gv1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovSteamFV3_gv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_gv1_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Gv1(),
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
                        getString( "_UI_GovSteamFV3_pmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV3_pmax_feature",
                                "_UI_GovSteamFV3_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV3_Pmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns GovSteamFV3.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovSteamFV3" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovSteamFV3 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovSteamFV3_type" )
                : getString( "_UI_GovSteamFV3_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovSteamFV3.class ) ) {
        case CimPackage.GOV_STEAM_FV3__PRMAX:
        case CimPackage.GOV_STEAM_FV3__K:
        case CimPackage.GOV_STEAM_FV3__PGV6:
        case CimPackage.GOV_STEAM_FV3__PGV1:
        case CimPackage.GOV_STEAM_FV3__PGV2:
        case CimPackage.GOV_STEAM_FV3__PGV3:
        case CimPackage.GOV_STEAM_FV3__PGV4:
        case CimPackage.GOV_STEAM_FV3__PGV5:
        case CimPackage.GOV_STEAM_FV3__MWBASE:
        case CimPackage.GOV_STEAM_FV3__PMIN:
        case CimPackage.GOV_STEAM_FV3__UO:
        case CimPackage.GOV_STEAM_FV3__UC:
        case CimPackage.GOV_STEAM_FV3__TA:
        case CimPackage.GOV_STEAM_FV3__TB:
        case CimPackage.GOV_STEAM_FV3__TC:
        case CimPackage.GOV_STEAM_FV3__T1:
        case CimPackage.GOV_STEAM_FV3__T2:
        case CimPackage.GOV_STEAM_FV3__T5:
        case CimPackage.GOV_STEAM_FV3__T6:
        case CimPackage.GOV_STEAM_FV3__T3:
        case CimPackage.GOV_STEAM_FV3__T4:
        case CimPackage.GOV_STEAM_FV3__K2:
        case CimPackage.GOV_STEAM_FV3__K3:
        case CimPackage.GOV_STEAM_FV3__K1:
        case CimPackage.GOV_STEAM_FV3__GV6:
        case CimPackage.GOV_STEAM_FV3__GV4:
        case CimPackage.GOV_STEAM_FV3__GV5:
        case CimPackage.GOV_STEAM_FV3__GV2:
        case CimPackage.GOV_STEAM_FV3__GV3:
        case CimPackage.GOV_STEAM_FV3__GV1:
        case CimPackage.GOV_STEAM_FV3__PMAX:
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
