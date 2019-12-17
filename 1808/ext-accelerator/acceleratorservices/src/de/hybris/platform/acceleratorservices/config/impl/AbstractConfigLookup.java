/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.acceleratorservices.config.impl;

import de.hybris.platform.acceleratorservices.config.ConfigLookup;

import org.apache.commons.lang.BooleanUtils;
import org.apache.log4j.Logger;

/**
 */
public abstract class AbstractConfigLookup implements ConfigLookup
{
	private static final Logger LOG = Logger.getLogger(AbstractConfigLookup.class);

	private static final String FAILED_TO_PARSE_BOOLEAN_PREFIX_MSG = "Failed to parse boolean property value for key";
	private static final String FAILED_TO_PARSE_DOUBLE_PREFIX_MSG = "Failed to parse double property value for key";
	private static final String FAILED_TO_PARSE_LONG_PREFIX_MSG = "Failed to parse long property value for key";
	private static final String FAILED_TO_PARSE_INT_PREFIX_MSG = "Failed to parse int property value for key";
	private static final String VALUE_MSG = "] value was [";

	protected abstract String getProperty(final String property);


	// Helper methods to get the config property in different formats

	@Override
	public int getInt(final String key, final int defaultValue)
	{
		final String property = getProperty(key);
		if (property != null && !property.isEmpty())
		{
			try
			{
				final Integer integerValue = Integer.valueOf(property);
				if (integerValue != null)
				{
					return integerValue.intValue();
				}
			}
			catch (final NumberFormatException ex)
			{
				if (LOG.isDebugEnabled())
				{
					LOG.debug(FAILED_TO_PARSE_INT_PREFIX_MSG + " [" + key + VALUE_MSG + property + "]", ex);
				}
			}
		}
		return defaultValue;
	}

	@Override
	public long getLong(final String key, final long defaultValue)
	{
		final String property = getProperty(key);
		if (property != null && !property.isEmpty())
		{
			try
			{
				final Long longValue = Long.valueOf(property);
				if (longValue != null)
				{
					return longValue.longValue();
				}
			}
			catch (final NumberFormatException ex)
			{
				if (LOG.isDebugEnabled())
				{
					LOG.debug(FAILED_TO_PARSE_LONG_PREFIX_MSG + " [" + key + VALUE_MSG + property + "]", ex);
				}
			}
		}
		return defaultValue;
	}

	@Override
	public double getDouble(final String key, final double defaultValue)
	{
		final String property = getProperty(key);
		if (property != null && !property.isEmpty())
		{
			try
			{
				final Double doubleValue = Double.valueOf(property);
				if (doubleValue != null)
				{
					return doubleValue.doubleValue();
				}
			}
			catch (final NumberFormatException ex)
			{
				if (LOG.isDebugEnabled())
				{
					LOG.debug(FAILED_TO_PARSE_DOUBLE_PREFIX_MSG + " [" + key + VALUE_MSG + property + "]", ex);
				}
			}
		}
		return defaultValue;
	}

	@Override
	public boolean getBoolean(final String key, final boolean defaultValue)
	{
		final String property = getProperty(key);
		if (property != null && !property.isEmpty())
		{
			try
			{
				return Boolean.TRUE.equals(BooleanUtils.toBooleanObject(property));
			}
			catch (final NumberFormatException ex)
			{
				if (LOG.isDebugEnabled())
				{
					LOG.debug(FAILED_TO_PARSE_BOOLEAN_PREFIX_MSG + " [" + key + VALUE_MSG + property + "]", ex);
				}
			}
		}
		return defaultValue;
	}

	@Override
	public String getString(final String key, final String defaultValue)
	{
		final String property = getProperty(key);
		if (property != null && !property.isEmpty())
		{
			return property;
		}
		return defaultValue;
	}
}
