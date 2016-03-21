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

import java.util.List;
import java.util.Map;

import javax.faces.FacesWrapper;
import javax.faces.context.FacesContext;


/**
 * @author  Neil Griffin
 */
public abstract class BridgeURLFactory implements FacesWrapper<BridgeURLFactory> {

	public abstract BridgeURL getBridgeActionURL(FacesContext facesContext, BridgeURI bridgeURI, String viewId);

	public abstract BridgeURL getBridgeBookmarkableURL(FacesContext facesContext, BridgeURI bridgeURI,
		Map<String, List<String>> parameters, String viewId);

	public abstract BridgeURL getBridgePartialActionURL(FacesContext facesContext, BridgeURI bridgeURI, String viewId);

	public abstract BridgeURL getBridgeRedirectURL(FacesContext facesContext, BridgeURI bridgeURI,
		Map<String, List<String>> parameters, String redirectViewId);

	public abstract BridgeResourceURL getBridgeResourceURL(FacesContext facesContext, BridgeURI bridgeURI,
		String viewId);
}
