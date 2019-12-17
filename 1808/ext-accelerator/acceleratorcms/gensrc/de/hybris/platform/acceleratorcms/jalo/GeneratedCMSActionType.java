/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 11 Dec, 2019 2:50:57 PM                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.acceleratorcms.jalo;

import de.hybris.platform.acceleratorcms.constants.AcceleratorCmsConstants;
import de.hybris.platform.cms2.jalo.CMSComponentType;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.CMSActionType CMSActionType}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCMSActionType extends CMSComponentType
{
	/** Qualifier of the <code>CMSActionType.componentTypes</code> attribute **/
	public static final String COMPONENTTYPES = "componentTypes";
	/** Relation ordering override parameter constants for ApplicableCmsActionsTypeForCmsComponent from ((acceleratorcms))*/
	protected static String APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT_SRC_ORDERED = "relation.ApplicableCmsActionsTypeForCmsComponent.source.ordered";
	protected static String APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT_TGT_ORDERED = "relation.ApplicableCmsActionsTypeForCmsComponent.target.ordered";
	/** Relation disable markmodifed parameter constants for ApplicableCmsActionsTypeForCmsComponent from ((acceleratorcms))*/
	protected static String APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT_MARKMODIFIED = "relation.ApplicableCmsActionsTypeForCmsComponent.markmodified";
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSActionType.componentTypes</code> attribute.
	 * @return the componentTypes
	 */
	public Collection<CMSComponentType> getComponentTypes(final SessionContext ctx)
	{
		final List<CMSComponentType> items = getLinkedItems( 
			ctx,
			true,
			AcceleratorCmsConstants.Relations.APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT,
			"CMSComponentType",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSActionType.componentTypes</code> attribute.
	 * @return the componentTypes
	 */
	public Collection<CMSComponentType> getComponentTypes()
	{
		return getComponentTypes( getSession().getSessionContext() );
	}
	
	public long getComponentTypesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			AcceleratorCmsConstants.Relations.APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT,
			"CMSComponentType",
			null
		);
	}
	
	public long getComponentTypesCount()
	{
		return getComponentTypesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSActionType.componentTypes</code> attribute. 
	 * @param value the componentTypes
	 */
	public void setComponentTypes(final SessionContext ctx, final Collection<CMSComponentType> value)
	{
		setLinkedItems( 
			ctx,
			true,
			AcceleratorCmsConstants.Relations.APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSActionType.componentTypes</code> attribute. 
	 * @param value the componentTypes
	 */
	public void setComponentTypes(final Collection<CMSComponentType> value)
	{
		setComponentTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to componentTypes. 
	 * @param value the item to add to componentTypes
	 */
	public void addToComponentTypes(final SessionContext ctx, final CMSComponentType value)
	{
		addLinkedItems( 
			ctx,
			true,
			AcceleratorCmsConstants.Relations.APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to componentTypes. 
	 * @param value the item to add to componentTypes
	 */
	public void addToComponentTypes(final CMSComponentType value)
	{
		addToComponentTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from componentTypes. 
	 * @param value the item to remove from componentTypes
	 */
	public void removeFromComponentTypes(final SessionContext ctx, final CMSComponentType value)
	{
		removeLinkedItems( 
			ctx,
			true,
			AcceleratorCmsConstants.Relations.APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from componentTypes. 
	 * @param value the item to remove from componentTypes
	 */
	public void removeFromComponentTypes(final CMSComponentType value)
	{
		removeFromComponentTypes( getSession().getSessionContext(), value );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("CMSComponentType");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(APPLICABLECMSACTIONSTYPEFORCMSCOMPONENT_MARKMODIFIED);
		}
		return true;
	}
	
}
