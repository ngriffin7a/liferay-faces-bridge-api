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

/**
 * @author  Neil Griffin
 */
public abstract class BridgeURLWrapper implements BridgeURL {

	@Override
	public boolean isSecure() {
		return getWrapped().isSecure();
	}

	@Override
	public String getFacesViewTarget() {
		return getWrapped().getFacesViewTarget();
	}

	@Override
	public boolean isSelfReferencing() {
		return getWrapped().isSelfReferencing();
	}

	@Override
	public String getParameter(String name) {
		return getWrapped().getParameter(name);
	}

	@Override
	public void setParameter(String name, String value) {
		getWrapped().setParameter(name, value);
	}

	@Override
	public void setParameter(String name, String[] value) {
		getWrapped().setParameter(name, value);
	}

	@Override
	public void setSecure(boolean secure) {
		getWrapped().setSecure(secure);
	}

	@Override
	public void setSelfReferencing(boolean selfReferencing) {
		getWrapped().setSelfReferencing(selfReferencing);
	}

	public abstract BridgeURL getWrapped();
}
