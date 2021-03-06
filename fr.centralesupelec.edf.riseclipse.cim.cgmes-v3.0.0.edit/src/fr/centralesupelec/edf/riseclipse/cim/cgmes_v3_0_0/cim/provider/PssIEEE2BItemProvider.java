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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE2B} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PssIEEE2BItemProvider extends PowerSystemStabilizerDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PssIEEE2BItemProvider( AdapterFactory adapterFactory ) {
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

            addT11PropertyDescriptor( object );
            addT10PropertyDescriptor( object );
            addMPropertyDescriptor( object );
            addNPropertyDescriptor( object );
            addT3PropertyDescriptor( object );
            addT2PropertyDescriptor( object );
            addT4PropertyDescriptor( object );
            addT1PropertyDescriptor( object );
            addT7PropertyDescriptor( object );
            addT6PropertyDescriptor( object );
            addT9PropertyDescriptor( object );
            addT8PropertyDescriptor( object );
            addVsi1maxPropertyDescriptor( object );
            addVsi1minPropertyDescriptor( object );
            addInputSignal2TypePropertyDescriptor( object );
            addInputSignal1TypePropertyDescriptor( object );
            addVstmaxPropertyDescriptor( object );
            addVsi2maxPropertyDescriptor( object );
            addVstminPropertyDescriptor( object );
            addVsi2minPropertyDescriptor( object );
            addTw3PropertyDescriptor( object );
            addTw4PropertyDescriptor( object );
            addTw1PropertyDescriptor( object );
            addTw2PropertyDescriptor( object );
            addKs2PropertyDescriptor( object );
            addKs3PropertyDescriptor( object );
            addKs1PropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the T11 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT11PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_t11_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_t11_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_T11(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the T10 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT10PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_t10_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_t10_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_T10(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the M feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_m_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_m_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_M(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the N feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_n_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_n_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_N(),
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
                        getString( "_UI_PssIEEE2B_t3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_t3_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_T3(),
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
                        getString( "_UI_PssIEEE2B_t2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_t2_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_T2(),
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
                        getString( "_UI_PssIEEE2B_t4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_t4_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_T4(),
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
                        getString( "_UI_PssIEEE2B_t1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_t1_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_T1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the T7 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT7PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_t7_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_t7_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_T7(),
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
                        getString( "_UI_PssIEEE2B_t6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_t6_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_T6(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the T9 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT9PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_t9_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_t9_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_T9(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the T8 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT8PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_t8_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_t8_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_T8(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vsi1max feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVsi1maxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_vsi1max_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_vsi1max_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_Vsi1max(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vsi1min feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVsi1minPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_vsi1min_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_vsi1min_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_Vsi1min(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Input Signal2 Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInputSignal2TypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_inputSignal2Type_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_inputSignal2Type_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_InputSignal2Type(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Input Signal1 Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInputSignal1TypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_inputSignal1Type_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_inputSignal1Type_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_InputSignal1Type(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vstmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVstmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_vstmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_vstmax_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_Vstmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vsi2max feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVsi2maxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_vsi2max_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_vsi2max_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_Vsi2max(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vstmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVstminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_vstmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_vstmin_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_Vstmin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vsi2min feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVsi2minPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_vsi2min_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_vsi2min_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_Vsi2min(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tw3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTw3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_tw3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_tw3_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_Tw3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tw4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTw4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_tw4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_tw4_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_Tw4(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tw1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTw1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_tw1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_tw1_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_Tw1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tw2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTw2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_tw2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_tw2_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_Tw2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ks2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKs2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_ks2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_ks2_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_Ks2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ks3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKs3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_ks3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_ks3_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_Ks3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ks1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKs1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PssIEEE2B_ks1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssIEEE2B_ks1_feature",
                                "_UI_PssIEEE2B_type" ),
                        CimPackage.eINSTANCE.getPssIEEE2B_Ks1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns PssIEEE2B.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PssIEEE2B" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PssIEEE2B ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PssIEEE2B_type" )
                : getString( "_UI_PssIEEE2B_type" ) + " " + label;
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

        switch( notification.getFeatureID( PssIEEE2B.class ) ) {
        case CimPackage.PSS_IEEE2B__T11:
        case CimPackage.PSS_IEEE2B__T10:
        case CimPackage.PSS_IEEE2B__M:
        case CimPackage.PSS_IEEE2B__N:
        case CimPackage.PSS_IEEE2B__T3:
        case CimPackage.PSS_IEEE2B__T2:
        case CimPackage.PSS_IEEE2B__T4:
        case CimPackage.PSS_IEEE2B__T1:
        case CimPackage.PSS_IEEE2B__T7:
        case CimPackage.PSS_IEEE2B__T6:
        case CimPackage.PSS_IEEE2B__T9:
        case CimPackage.PSS_IEEE2B__T8:
        case CimPackage.PSS_IEEE2B__VSI1MAX:
        case CimPackage.PSS_IEEE2B__VSI1MIN:
        case CimPackage.PSS_IEEE2B__INPUT_SIGNAL2_TYPE:
        case CimPackage.PSS_IEEE2B__INPUT_SIGNAL1_TYPE:
        case CimPackage.PSS_IEEE2B__VSTMAX:
        case CimPackage.PSS_IEEE2B__VSI2MAX:
        case CimPackage.PSS_IEEE2B__VSTMIN:
        case CimPackage.PSS_IEEE2B__VSI2MIN:
        case CimPackage.PSS_IEEE2B__TW3:
        case CimPackage.PSS_IEEE2B__TW4:
        case CimPackage.PSS_IEEE2B__TW1:
        case CimPackage.PSS_IEEE2B__TW2:
        case CimPackage.PSS_IEEE2B__KS2:
        case CimPackage.PSS_IEEE2B__KS3:
        case CimPackage.PSS_IEEE2B__KS1:
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
