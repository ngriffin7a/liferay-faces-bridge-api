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
package com.liferay.faces.bridge.context;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.faces.FacesWrapper;
import javax.faces.context.FacesContext;
import javax.portlet.PortletConfig;
import javax.portlet.PortletContext;
import javax.portlet.PortletRequest;
import javax.portlet.PortletSession;
import javax.servlet.ServletContext;

import com.liferay.faces.bridge.model.UploadedFile;
import com.liferay.faces.bridge.scope.BridgeRequestScope;


/**
 * This abstract class provides a contract for defining a factory that knows how to create {@link Map} instances. It is
 * inspired by the factory pattern found in the JSF API like {@link javax.faces.context.FacesContextFactory} and {@link
 * javax.faces.context.ExternalContextFactory}. By implementing the {@link javax.faces.FacesWrapper} interface, the
 * class provides implementations with the opportunity to wrap another factory (participate in a chain-of-responsibility
 * pattern). If an implementation wraps a factory, then it should provide a one-arg constructor so that the wrappable
 * factory can be passed at initialization time.
 *
 * @author  Neil Griffin
 */
public abstract class ContextMapFactory implements FacesWrapper<ContextMapFactory> {

	/**
	 * Returns a {@link Map} of application-scoped attributes stored in the underlying {@link
	 * javax.portlet.PortletContext}.
	 *
	 * @param  portletContext    The current portlet context.
	 * @param  preferPreDestroy  Flag indicating whether or not methods annotated with the @PreDestroy annotation are
	 *                           preferably invoked over the @BridgePreDestroy annotation.
	 */
	public abstract Map<String, Object> getApplicationScopeMap(PortletContext portletContext, boolean preferPreDestroy);

	/**
	 * Returns a {@link Map} of URL parameters that are found in the query-string of the current Faces view.
	 */
	public abstract Map<String, String> getFacesViewParameterMap(String facesViewQueryString);

	/**
	 * Returns a {@link Map} of init-param values associated with the portlet context.
	 */
	public abstract Map<String, String> getInitParameterMap(PortletContext portletContext);

	/**
	 * Returns a {@link Map} of cookies associated with the request.
	 *
	 * @param  portletRequest  The current portlet request.
	 */
	public abstract Map<String, Object> getRequestCookieMap(PortletRequest portletRequest);

	/**
	 * Returns a {@link Map} of request headers with a single (the first) value for each key.
	 */
	public abstract Map<String, String> getRequestHeaderMap(PortletRequest portletRequest);

	/**
	 * Returns a {@link Map} of request headers with multiple values for each key.
	 */
	public abstract Map<String, String[]> getRequestHeaderValuesMap(PortletRequest portletRequest);

	/**
	 * Returns a {@link Map} of request parameters with a single (the first) value for each key.
	 */
	public abstract Map<String, String> getRequestParameterMap(PortletRequest portletRequest, String responseNamespace,
		PortletConfig portletConfig, BridgeRequestScope bridgeRequestScope, String defaultRenderKitId,
		String facesViewQueryString);

	/**
	 * Returns a {@link Map} of request parameters with multiple values for each key.
	 */
	public abstract Map<String, String[]> getRequestParameterValuesMap(PortletRequest portletRequest,
		String responseNamespace, PortletConfig portletConfig, BridgeRequestScope bridgeRequestScope,
		String defaultRenderKitId, String facesViewQueryString);

	/**
	 * Returns a {@link Map} of request-scoped attributes stored in the underlying {@link javax.portlet.PortletRequest}.
	 *
	 * @param  portletContext         The current portlet context.
	 * @param  portletRequest         The current portlet request.
	 * @param  removedAttributeNames  The set of attribute names that have been removed from the bridge request scope
	 *                                due to their exclusion.
	 * @param  preferPreDestroy       Determines whether or not methods annotated with the @PreDestroy annotation are
	 *                                preferably invoked over the @BridgePreDestroy annotation.
	 */
	public abstract Map<String, Object> getRequestScopeMap(PortletContext portletContext, PortletRequest portletRequest,
		Set<String> removedAttributeNames, boolean preferPreDestroy);

	/**
	 * Returns a {@link Map} of attributes stored in the underlying {@link javax.servlet.ServletContext}.
	 */
	public abstract Map<String, Object> getServletContextAttributeMap(ServletContext servletContext);

	/**
	 * Returns a {@link Map} of session-scoped attributes stored in the underlying {@link javax.portlet.PortletSession}.
	 *
	 * @param  portletContext    The current portlet context.
	 * @param  portletSession    The current portlet session.
	 * @param  scope             The scope of the session map, which can be PortletSession.PORTLET_SCOPE or
	 *                           PortletSession.APPLICATION_SCOPE
	 * @param  preferPreDestroy  Flag indicating whether or not methods annotated with the @PreDestroy annotation are
	 *                           preferably invoked over the @BridgePreDestroy annotation.
	 */
	public abstract Map<String, Object> getSessionScopeMap(PortletContext portletContext, PortletSession portletSession,
		int scope, boolean preferPreDestroy);

	/**
	 * Returns a {@link Map} of uploaded files.
	 */
	public abstract Map<String, List<UploadedFile>> getUploadedFileMap(PortletRequest portletRequest);
}
