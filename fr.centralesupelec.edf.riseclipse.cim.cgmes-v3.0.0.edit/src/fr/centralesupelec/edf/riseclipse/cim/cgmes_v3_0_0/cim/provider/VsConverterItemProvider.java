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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VsConverterItemProvider extends ACDCConverterItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VsConverterItemProvider( AdapterFactory adapterFactory ) {
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

            addMaxModulationIndexPropertyDescriptor( object );
            addCapabilityCurvePropertyDescriptor( object );
            addVSCDynamicsPropertyDescriptor( object );
            addTargetQpccPropertyDescriptor( object );
            addQSharePropertyDescriptor( object );
            addDroopPropertyDescriptor( object );
            addPPccControlPropertyDescriptor( object );
            addTargetPhasePccPropertyDescriptor( object );
            addTargetPWMfactorPropertyDescriptor( object );
            addTargetUpccPropertyDescriptor( object );
            addQPccControlPropertyDescriptor( object );
            addDroopCompensationPropertyDescriptor( object );
            addTargetPowerFactorPccPropertyDescriptor( object );
            addDeltaPropertyDescriptor( object );
            addUvPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Capability Curve feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCapabilityCurvePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_VsConverter_CapabilityCurve_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_VsConverter_CapabilityCurve_feature",
                                "_UI_VsConverter_type" ),
                        CimPackage.eINSTANCE.getVsConverter_CapabilityCurve(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the VSC Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVSCDynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_VsConverter_VSCDynamics_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_VsConverter_VSCDynamics_feature",
                                "_UI_VsConverter_type" ),
                        CimPackage.eINSTANCE.getVsConverter_VSCDynamics(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Target Qpcc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetQpccPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_VsConverter_targetQpcc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_VsConverter_targetQpcc_feature",
                                "_UI_VsConverter_type" ),
                        CimPackage.eINSTANCE.getVsConverter_TargetQpcc(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the QShare feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQSharePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_VsConverter_qShare_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_VsConverter_qShare_feature",
                                "_UI_VsConverter_type" ),
                        CimPackage.eINSTANCE.getVsConverter_QShare(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Droop feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDroopPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_VsConverter_droop_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_VsConverter_droop_feature",
                                "_UI_VsConverter_type" ),
                        CimPackage.eINSTANCE.getVsConverter_Droop(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the PPcc Control feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPPccControlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_VsConverter_pPccControl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_VsConverter_pPccControl_feature",
                                "_UI_VsConverter_type" ),
                        CimPackage.eINSTANCE.getVsConverter_PPccControl(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Target Phase Pcc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetPhasePccPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_VsConverter_targetPhasePcc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_VsConverter_targetPhasePcc_feature",
                                "_UI_VsConverter_type" ),
                        CimPackage.eINSTANCE.getVsConverter_TargetPhasePcc(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Target PW Mfactor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetPWMfactorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_VsConverter_targetPWMfactor_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_VsConverter_targetPWMfactor_feature",
                                "_UI_VsConverter_type" ),
                        CimPackage.eINSTANCE.getVsConverter_TargetPWMfactor(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Target Upcc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetUpccPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_VsConverter_targetUpcc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_VsConverter_targetUpcc_feature",
                                "_UI_VsConverter_type" ),
                        CimPackage.eINSTANCE.getVsConverter_TargetUpcc(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the QPcc Control feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQPccControlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_VsConverter_qPccControl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_VsConverter_qPccControl_feature",
                                "_UI_VsConverter_type" ),
                        CimPackage.eINSTANCE.getVsConverter_QPccControl(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Droop Compensation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDroopCompensationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_VsConverter_droopCompensation_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_VsConverter_droopCompensation_feature",
                                "_UI_VsConverter_type" ),
                        CimPackage.eINSTANCE.getVsConverter_DroopCompensation(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Target Power Factor Pcc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetPowerFactorPccPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_VsConverter_targetPowerFactorPcc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_VsConverter_targetPowerFactorPcc_feature",
                                "_UI_VsConverter_type" ),
                        CimPackage.eINSTANCE.getVsConverter_TargetPowerFactorPcc(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Delta feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDeltaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_VsConverter_delta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_VsConverter_delta_feature",
                                "_UI_VsConverter_type" ),
                        CimPackage.eINSTANCE.getVsConverter_Delta(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Uv feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUvPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_VsConverter_uv_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_VsConverter_uv_feature",
                                "_UI_VsConverter_type" ),
                        CimPackage.eINSTANCE.getVsConverter_Uv(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Max Modulation Index feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxModulationIndexPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_VsConverter_maxModulationIndex_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_VsConverter_maxModulationIndex_feature",
                                "_UI_VsConverter_type" ),
                        CimPackage.eINSTANCE.getVsConverter_MaxModulationIndex(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns VsConverter.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/VsConverter" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( VsConverter ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_VsConverter_type" )
                : getString( "_UI_VsConverter_type" ) + " " + label;
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

        switch( notification.getFeatureID( VsConverter.class ) ) {
        case CimPackage.VS_CONVERTER__MAX_MODULATION_INDEX:
        case CimPackage.VS_CONVERTER__TARGET_QPCC:
        case CimPackage.VS_CONVERTER__QSHARE:
        case CimPackage.VS_CONVERTER__DROOP:
        case CimPackage.VS_CONVERTER__PPCC_CONTROL:
        case CimPackage.VS_CONVERTER__TARGET_PHASE_PCC:
        case CimPackage.VS_CONVERTER__TARGET_PW_MFACTOR:
        case CimPackage.VS_CONVERTER__TARGET_UPCC:
        case CimPackage.VS_CONVERTER__QPCC_CONTROL:
        case CimPackage.VS_CONVERTER__DROOP_COMPENSATION:
        case CimPackage.VS_CONVERTER__TARGET_POWER_FACTOR_PCC:
        case CimPackage.VS_CONVERTER__DELTA:
        case CimPackage.VS_CONVERTER__UV:
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
