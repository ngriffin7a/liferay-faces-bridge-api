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

import javax.faces.context.FacesContext;


/**
 * @author  Neil Griffin
 */
public interface BridgeURLEncoder {

	/**
	 * Returns an encoded bridge "action" URL, meaning a URL that conforms to the deviation requirements of {@link
	 * javax.faces.context.ExternalContext#encodeActionURL(String)} listed in Section 6.1.3.1 of the Bridge Spec.
	 */
	public BridgeURL encodeActionURL(FacesContext facesContext, String url) throws URISyntaxException;

	public BridgeURL encodeBookmarkableURL(FacesContext facesContext, String url, Map<String, List<String>> parameters)
		throws URISyntaxException;

	public BridgeURL encodePartialActionURL(FacesContext facesContext, String url) throws URISyntaxException;

	public BridgeURL encodeRedirectURL(FacesContext facesContext, String url, Map<String, List<String>> parameters)
		throws URISyntaxException;

	public BridgeURL encodeResourceURL(FacesContext facesContext, String url) throws URISyntaxException;
}
