/**
 * Copyright (c) 2000-2016 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.bridge.context.url;

import javax.faces.FacesWrapper;
import javax.portlet.faces.BridgeFactoryFinder;

import com.liferay.faces.bridge.config.BridgeConfig;


/**
 * @author  Neil Griffin
 */
public abstract class BridgeURLEncoderFactory implements FacesWrapper<BridgeURLEncoderFactory> {

	public static BridgeURLEncoder getBridgeURLEncoderInstance(BridgeConfig bridgeConfig) {

		BridgeURLEncoderFactory bridgeURLEncoderFactory = (BridgeURLEncoderFactory) BridgeFactoryFinder.getFactory(
				BridgeURLEncoderFactory.class);

		return bridgeURLEncoderFactory.getBridgeURLEncoder(bridgeConfig);
	}

	public abstract BridgeURLEncoder getBridgeURLEncoder(BridgeConfig bridgeConfig);

	/**
	 * @see  javax.faces.FacesWrapper#getWrapped()
	 */
	@Override
	public abstract BridgeURLEncoderFactory getWrapped();
}
