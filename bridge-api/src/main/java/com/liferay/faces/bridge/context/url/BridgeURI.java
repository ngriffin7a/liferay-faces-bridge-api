/**
 * Copyright (c) 2000-2016 Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.faces.bridge.context.url;

import java.util.Map;

import javax.portlet.faces.Bridge;


/**
 * @author  Neil Griffin
 */
public interface BridgeURI {

	/**
	 * Returns a string-based representation of the URL.
	 */
	@Override
	public String toString();

	/**
	 * Returns the path component of the URI, relative to the specified context-path.
	 */
	public String getContextRelativePath(String contextPath);

	/**
	 * Determines whether or not the URI is escaped.
	 *
	 * @return  <code>true</code> if all occurrences of the ampersand character appear as &amp; otherwise, returns
	 *          <code>false</code>.
	 */
	public boolean isEscaped();

	/**
	 * Determines whether or not the URI is absolute, meaning it contains a scheme component. Note that according to the
	 * class-level documentation of {@link java.net.URI} an absolute URI is non-relative.
	 *
	 * @return  Returns true if the URI is absolute, otherwise returns false.
	 */
	public boolean isAbsolute();

	/**
	 * Determines whether or not the URL is opaque, meaning it is absolute and its scheme component does not begin with
	 * a forward-slash character. For more information see {@link java.net.URI#isOpaque()}.
	 *
	 * @return  <code>true</code> if the URL is opaque, otherwise <code>false</code>.
	 */
	public boolean isOpaque();

	/**
	 * Determines whether or not the path component of the URL is relative, meaning it does not begin with a
	 * forward-slash character.
	 *
	 * @return  <code>true</code> if the path is relative, otherwise <code>false</code>.
	 */
	public boolean isPathRelative();

	/**
	 * Determines whether or not the URL begins with the "portlet:" scheme.
	 *
	 * @return  <code>true</code> if the URL begins with the "portlet:" scheme, otherwise <code>false</code>.
	 */
	public boolean isPortletScheme();

	/**
	 * Determines whether or not the URI is relative, meaning it does not have a scheme component. Note that according
	 * to the class-level documentation of {@link java.net.URI} a relative URI is non-absolute.
	 *
	 * @return  Returns true if the URI is relative, otherwise returns false.
	 */
	public boolean isRelative();

	/**
	 * Determines whether or not the URI is external with respect to a context path, meaning it is not absolute and does
	 * not start with the context path.
	 *
	 * @param   contextPath  The context path for determining whether or not the URI is external.
	 *
	 * @return  <code>true</code> if external, otherwise <code>false</code>.
	 */
	public boolean isExternal(String contextPath);

	/**
	 * Determines whether or not the URL is hierarchical, meaning it is either 1) absolute and the scheme-specific part
	 * begins with a forward-slash character, or 2) is relative.
	 *
	 * @return  <code>true</code> if the URL is hierarchical, otherwise <code>false</code>.
	 */
	public boolean isHierarchical();

	/**
	 * Returns an immutable {@link Map} representing the URI parameters.
	 */
	public Map<String, String[]> getParameterMap();

	/**
	 * Returns the path component of the URI.
	 */
	public String getPath();

	/**
	 * Returns the {@link javax.portlet.faces.Bridge.PortletPhase} associated with this URL. Note that the value will be
	 * null if the URL does not begin with the "portlet:" scheme/prefix.
	 */
	public Bridge.PortletPhase getPortletPhase();

	/**
	 * Returns the query component, meaning all characters after the question-mark of the scheme-specific-part of the
	 * URI.
	 */
	public String getQuery();
}
