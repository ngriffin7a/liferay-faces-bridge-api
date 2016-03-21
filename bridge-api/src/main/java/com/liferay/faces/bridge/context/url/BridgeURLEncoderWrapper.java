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

import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

import javax.faces.FacesWrapper;
import javax.faces.context.FacesContext;


/**
 * @author  Neil Griffin
 */
public abstract class BridgeURLEncoderWrapper implements BridgeURLEncoder, FacesWrapper<BridgeURLEncoder> {

	@Override
	public BridgeURL encodeActionURL(FacesContext facesContext, String url) throws URISyntaxException {
		return getWrapped().encodeActionURL(facesContext, url);
	}

	@Override
	public BridgeURL encodeBookmarkableURL(FacesContext facesContext, String url, Map<String, List<String>> parameters)
		throws URISyntaxException {
		return getWrapped().encodeBookmarkableURL(facesContext, url, parameters);
	}

	@Override
	public BridgeURL encodePartialActionURL(FacesContext facesContext, String url) throws URISyntaxException {
		return getWrapped().encodePartialActionURL(facesContext, url);
	}

	@Override
	public BridgeURL encodeRedirectURL(FacesContext facesContext, String url, Map<String, List<String>> parameters)
		throws URISyntaxException {
		return getWrapped().encodeRedirectURL(facesContext, url, parameters);
	}

	@Override
	public BridgeURL encodeResourceURL(FacesContext facesContext, String url) throws URISyntaxException {
		return getWrapped().encodeResourceURL(facesContext, url);
	}

	@Override
	public abstract BridgeURLEncoder getWrapped();
}
