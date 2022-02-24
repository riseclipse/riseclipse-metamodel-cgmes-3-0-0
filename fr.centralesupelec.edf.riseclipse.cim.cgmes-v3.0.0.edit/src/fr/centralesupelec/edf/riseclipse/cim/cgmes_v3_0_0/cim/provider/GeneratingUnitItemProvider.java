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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratingUnitItemProvider extends EquipmentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneratingUnitItemProvider( AdapterFactory adapterFactory ) {
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

            addVariableCostPropertyDescriptor( object );
            addRatedGrossMaxPPropertyDescriptor( object );
            addTotalEfficiencyPropertyDescriptor( object );
            addControlAreaGeneratingUnitPropertyDescriptor( object );
            addRatedNetMaxPPropertyDescriptor( object );
            addGrossToNetActivePowerCurvesPropertyDescriptor( object );
            addNominalPPropertyDescriptor( object );
            addMaxOperatingPPropertyDescriptor( object );
            addRatedGrossMinPPropertyDescriptor( object );
            addGovernorSCDPropertyDescriptor( object );
            addMaximumAllowableSpinningReservePropertyDescriptor( object );
            addLongPFPropertyDescriptor( object );
            addStartupCostPropertyDescriptor( object );
            addShortPFPropertyDescriptor( object );
            addStartupTimePropertyDescriptor( object );
            addGenControlSourcePropertyDescriptor( object );
            addMinOperatingPPropertyDescriptor( object );
            addRotatingMachinePropertyDescriptor( object );
            addNormalPFPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Total Efficiency feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTotalEfficiencyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_totalEfficiency_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_totalEfficiency_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_TotalEfficiency(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rated Gross Min P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedGrossMinPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_ratedGrossMinP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_ratedGrossMinP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_RatedGrossMinP(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Startup Cost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartupCostPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_startupCost_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_startupCost_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_StartupCost(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rated Net Max P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedNetMaxPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_ratedNetMaxP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_ratedNetMaxP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_RatedNetMaxP(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Max Operating P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxOperatingPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_maxOperatingP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_maxOperatingP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_MaxOperatingP(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rated Gross Max P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedGrossMaxPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_ratedGrossMaxP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_ratedGrossMaxP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_RatedGrossMaxP(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Short PF feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShortPFPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_shortPF_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_shortPF_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_ShortPF(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Nominal P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNominalPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_nominalP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_nominalP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_NominalP(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Startup Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartupTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_startupTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_startupTime_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_StartupTime(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Governor SCD feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGovernorSCDPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_governorSCD_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_governorSCD_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_GovernorSCD(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gross To Net Active Power Curves feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGrossToNetActivePowerCurvesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_GrossToNetActivePowerCurves_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_GeneratingUnit_GrossToNetActivePowerCurves_feature", "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_GrossToNetActivePowerCurves(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gen Control Source feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGenControlSourcePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_genControlSource_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_genControlSource_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_GenControlSource(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rotating Machine feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRotatingMachinePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_RotatingMachine_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_RotatingMachine_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_RotatingMachine(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Normal PF feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNormalPFPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_normalPF_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_normalPF_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_NormalPF(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Long PF feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLongPFPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_longPF_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_longPF_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_LongPF(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Control Area Generating Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addControlAreaGeneratingUnitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_ControlAreaGeneratingUnit_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_GeneratingUnit_ControlAreaGeneratingUnit_feature", "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_ControlAreaGeneratingUnit(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Min Operating P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinOperatingPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_minOperatingP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_minOperatingP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_MinOperatingP(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Variable Cost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVariableCostPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GeneratingUnit_variableCost_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_variableCost_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_VariableCost(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Maximum Allowable Spinning Reserve feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaximumAllowableSpinningReservePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_GeneratingUnit_maximumAllowableSpinningReserve_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_GeneratingUnit_maximumAllowableSpinningReserve_feature", "_UI_GeneratingUnit_type" ),
                CimPackage.eINSTANCE.getGeneratingUnit_MaximumAllowableSpinningReserve(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This returns GeneratingUnit.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GeneratingUnit" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GeneratingUnit ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GeneratingUnit_type" )
                : getString( "_UI_GeneratingUnit_type" ) + " " + label;
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

        switch( notification.getFeatureID( GeneratingUnit.class ) ) {
        case CimPackage.GENERATING_UNIT__VARIABLE_COST:
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
        case CimPackage.GENERATING_UNIT__TOTAL_EFFICIENCY:
        case CimPackage.GENERATING_UNIT__RATED_NET_MAX_P:
        case CimPackage.GENERATING_UNIT__NOMINAL_P:
        case CimPackage.GENERATING_UNIT__MAX_OPERATING_P:
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
        case CimPackage.GENERATING_UNIT__GOVERNOR_SCD:
        case CimPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
        case CimPackage.GENERATING_UNIT__LONG_PF:
        case CimPackage.GENERATING_UNIT__STARTUP_COST:
        case CimPackage.GENERATING_UNIT__SHORT_PF:
        case CimPackage.GENERATING_UNIT__STARTUP_TIME:
        case CimPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
        case CimPackage.GENERATING_UNIT__MIN_OPERATING_P:
        case CimPackage.GENERATING_UNIT__NORMAL_PF:
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
