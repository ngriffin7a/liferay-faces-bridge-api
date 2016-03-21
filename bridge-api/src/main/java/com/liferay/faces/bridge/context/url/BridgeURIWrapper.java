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

import java.util.Map;

import javax.faces.FacesWrapper;
import javax.portlet.faces.Bridge;


/**
 * @author  Neil Griffin
 */
public abstract class BridgeURIWrapper implements BridgeURI, FacesWrapper<BridgeURI> {
	@Override
	public String getContextRelativePath(String contextPath) {
		return getWrapped().getContextRelativePath(contextPath);
	}

	@Override
	public boolean isEscaped() {
		return getWrapped().isEscaped();
	}

	@Override
	public boolean isAbsolute() {
		return getWrapped().isAbsolute();
	}

	@Override
	public boolean isOpaque() {
		return getWrapped().isOpaque();
	}

	@Override
	public boolean isPathRelative() {
		return getWrapped().isPathRelative();
	}

	@Override
	public boolean isPortletScheme() {
		return getWrapped().isPortletScheme();
	}

	@Override
	public boolean isRelative() {
		return getWrapped().isRelative();
	}

	@Override
	public boolean isExternal(String contextPath) {
		return getWrapped().isExternal(contextPath);
	}

	@Override
	public boolean isHierarchical() {
		return getWrapped().isHierarchical();
	}

	@Override
	public Map<String, String[]> getParameterMap() {
		return getWrapped().getParameterMap();
	}

	@Override
	public String getPath() {
		return getWrapped().getPath();
	}

	@Override
	public Bridge.PortletPhase getPortletPhase() {
		return getWrapped().getPortletPhase();
	}

	@Override
	public String getQuery() {
		return getWrapped().getQuery();
	}

	@Override
	public abstract BridgeURI getWrapped();
}
