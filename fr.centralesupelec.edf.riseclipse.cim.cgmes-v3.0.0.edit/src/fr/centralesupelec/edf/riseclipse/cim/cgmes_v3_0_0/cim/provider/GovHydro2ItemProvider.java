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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro2;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovHydro2ItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovHydro2ItemProvider( AdapterFactory adapterFactory ) {
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

            addEpsPropertyDescriptor( object );
            addRpermPropertyDescriptor( object );
            addDb2PropertyDescriptor( object );
            addDb1PropertyDescriptor( object );
            addBturbPropertyDescriptor( object );
            addTrPropertyDescriptor( object );
            addTwPropertyDescriptor( object );
            addTpPropertyDescriptor( object );
            addUcPropertyDescriptor( object );
            addUoPropertyDescriptor( object );
            addTgPropertyDescriptor( object );
            addPmaxPropertyDescriptor( object );
            addAturbPropertyDescriptor( object );
            addPminPropertyDescriptor( object );
            addKturbPropertyDescriptor( object );
            addRtempPropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addPgv5PropertyDescriptor( object );
            addPgv6PropertyDescriptor( object );
            addPgv3PropertyDescriptor( object );
            addPgv4PropertyDescriptor( object );
            addPgv1PropertyDescriptor( object );
            addPgv2PropertyDescriptor( object );
            addGv3PropertyDescriptor( object );
            addGv4PropertyDescriptor( object );
            addGv1PropertyDescriptor( object );
            addGv2PropertyDescriptor( object );
            addGv5PropertyDescriptor( object );
            addGv6PropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Eps feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEpsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydro2_eps_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_eps_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Eps(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rperm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRpermPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydro2_rperm_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_rperm_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Rperm(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Db2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDb2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydro2_db2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_db2_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Db2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Db1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDb1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydro2_db1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_db1_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Db1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Bturb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBturbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydro2_bturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_bturb_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Bturb(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydro2_tr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_tr_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Tr(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tw feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydro2_tw_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_tw_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Tw(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydro2_tp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_tp_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Tp(),
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
                        getString( "_UI_GovHydro2_uc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_uc_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Uc(),
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
                        getString( "_UI_GovHydro2_uo_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_uo_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Uo(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tg feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTgPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydro2_tg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_tg_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Tg(),
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
                        getString( "_UI_GovHydro2_pmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_pmax_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Pmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Aturb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAturbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydro2_aturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_aturb_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Aturb(),
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
                        getString( "_UI_GovHydro2_pmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_pmin_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Pmin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kturb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKturbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydro2_kturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_kturb_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Kturb(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rtemp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRtempPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydro2_rtemp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_rtemp_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Rtemp(),
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
                        getString( "_UI_GovHydro2_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_mwbase_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Mwbase(),
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
                        getString( "_UI_GovHydro2_pgv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_pgv5_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Pgv5(),
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
                        getString( "_UI_GovHydro2_pgv6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_pgv6_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Pgv6(),
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
                        getString( "_UI_GovHydro2_pgv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_pgv3_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Pgv3(),
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
                        getString( "_UI_GovHydro2_pgv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_pgv4_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Pgv4(),
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
                        getString( "_UI_GovHydro2_pgv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_pgv1_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Pgv1(),
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
                        getString( "_UI_GovHydro2_pgv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_pgv2_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Pgv2(),
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
                        getString( "_UI_GovHydro2_gv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_gv3_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Gv3(),
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
                        getString( "_UI_GovHydro2_gv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_gv4_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Gv4(),
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
                        getString( "_UI_GovHydro2_gv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_gv1_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Gv1(),
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
                        getString( "_UI_GovHydro2_gv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_gv2_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Gv2(),
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
                        getString( "_UI_GovHydro2_gv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_gv5_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Gv5(),
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
                        getString( "_UI_GovHydro2_gv6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro2_gv6_feature",
                                "_UI_GovHydro2_type" ),
                        CimPackage.eINSTANCE.getGovHydro2_Gv6(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns GovHydro2.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovHydro2" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovHydro2 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovHydro2_type" )
                : getString( "_UI_GovHydro2_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovHydro2.class ) ) {
        case CimPackage.GOV_HYDRO2__EPS:
        case CimPackage.GOV_HYDRO2__RPERM:
        case CimPackage.GOV_HYDRO2__DB2:
        case CimPackage.GOV_HYDRO2__DB1:
        case CimPackage.GOV_HYDRO2__BTURB:
        case CimPackage.GOV_HYDRO2__TR:
        case CimPackage.GOV_HYDRO2__TW:
        case CimPackage.GOV_HYDRO2__TP:
        case CimPackage.GOV_HYDRO2__UC:
        case CimPackage.GOV_HYDRO2__UO:
        case CimPackage.GOV_HYDRO2__TG:
        case CimPackage.GOV_HYDRO2__PMAX:
        case CimPackage.GOV_HYDRO2__ATURB:
        case CimPackage.GOV_HYDRO2__PMIN:
        case CimPackage.GOV_HYDRO2__KTURB:
        case CimPackage.GOV_HYDRO2__RTEMP:
        case CimPackage.GOV_HYDRO2__MWBASE:
        case CimPackage.GOV_HYDRO2__PGV5:
        case CimPackage.GOV_HYDRO2__PGV6:
        case CimPackage.GOV_HYDRO2__PGV3:
        case CimPackage.GOV_HYDRO2__PGV4:
        case CimPackage.GOV_HYDRO2__PGV1:
        case CimPackage.GOV_HYDRO2__PGV2:
        case CimPackage.GOV_HYDRO2__GV3:
        case CimPackage.GOV_HYDRO2__GV4:
        case CimPackage.GOV_HYDRO2__GV1:
        case CimPackage.GOV_HYDRO2__GV2:
        case CimPackage.GOV_HYDRO2__GV5:
        case CimPackage.GOV_HYDRO2__GV6:
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
