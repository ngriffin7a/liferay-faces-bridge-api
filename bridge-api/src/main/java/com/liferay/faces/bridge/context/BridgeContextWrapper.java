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
package com.liferay.faces.bridge.context;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.Map;

import javax.faces.FacesWrapper;
import javax.portlet.PortletConfig;
import javax.portlet.PortletContext;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.faces.Bridge.PortletPhase;
import javax.portlet.faces.BridgeDefaultViewNotSpecifiedException;
import javax.portlet.faces.BridgeInvalidViewPathException;

import com.liferay.faces.bridge.config.BridgeConfig;
import com.liferay.faces.bridge.context.url.BridgeResourceURL;
import com.liferay.faces.bridge.context.url.BridgeURL;
import com.liferay.faces.bridge.scope.BridgeRequestScope;


/**
 * @author  Neil Griffin
 */
public abstract class BridgeContextWrapper extends BridgeContext implements FacesWrapper<BridgeContext> {

	@Override
	public BridgeURL encodeActionURL(String url) {
		return getWrapped().encodeActionURL(url);
	}

	@Override
	public BridgeURL encodeBookmarkableURL(String baseURL, Map<String, List<String>> parameters) {
		return getWrapped().encodeBookmarkableURL(baseURL, parameters);
	}

	@Override
	public BridgeURL encodePartialActionURL(String url) {
		return getWrapped().encodePartialActionURL(url);
	}

	@Override
	public BridgeURL encodeRedirectURL(String baseUrl, Map<String, List<String>> parameters) {
		return getWrapped().encodeRedirectURL(baseUrl, parameters);
	}

	@Override
	public BridgeResourceURL encodeResourceURL(String url) {
		return getWrapped().encodeResourceURL(url);
	}

	@Override
	public void redirect(String url) throws IOException {
		getWrapped().redirect(url);
	}

	@Override
	public void release() {
		getWrapped().release();
	}

	@Override
	public Map<String, Object> getAttributes() {
		return getWrapped().getAttributes();
	}

	@Override
	public BridgeConfig getBridgeConfig() {
		return getWrapped().getBridgeConfig();
	}

	@Override
	public BridgeRequestScope getBridgeRequestScope() {
		return getWrapped().getBridgeRequestScope();
	}

	@Override
	public String getDefaultRenderKitId() {
		return getWrapped().getDefaultRenderKitId();
	}

	@Override
	public Map<String, String> getDefaultViewIdMap() {
		return getWrapped().getDefaultViewIdMap();
	}

	@Override
	public String getFacesViewId() throws BridgeDefaultViewNotSpecifiedException, BridgeInvalidViewPathException {
		return getWrapped().getFacesViewId();
	}

	@Override
	public String getFacesViewIdFromPath(String viewPath) {
		return getWrapped().getFacesViewIdFromPath(viewPath);
	}

	@Override
	public String getFacesViewIdFromPath(String viewPath, boolean mustExist) {
		return getWrapped().getFacesViewIdFromPath(viewPath, mustExist);
	}

	@Override
	public String getFacesViewQueryString() {
		return getWrapped().getFacesViewQueryString();
	}

	@Override
	public boolean isRenderRedirectAfterDispatch() {
		return getWrapped().isRenderRedirectAfterDispatch();
	}

	@Override
	public IncongruityContext getIncongruityContext() {
		return getWrapped().getIncongruityContext();
	}

	@Override
	public String getInitParameter(String name) {
		return getWrapped().getInitParameter(name);
	}

	@Override
	public PortletConfig getPortletConfig() {
		return getWrapped().getPortletConfig();
	}

	@Override
	public PortletContext getPortletContext() {
		return getWrapped().getPortletContext();
	}

	@Override
	public PortletRequest getPortletRequest() {
		return getWrapped().getPortletRequest();
	}

	@Override
	public PortletPhase getPortletRequestPhase() {
		return getWrapped().getPortletRequestPhase();
	}

	@Override
	public PortletResponse getPortletResponse() {
		return getWrapped().getPortletResponse();
	}

	@Override
	public List<String> getPreFacesRequestAttrNames() {
		return getWrapped().getPreFacesRequestAttrNames();
	}

	@Override
	public Map<String, String[]> getPreservedActionParams() {
		return getWrapped().getPreservedActionParams();
	}

	@Override
	public void setRenderRedirectAfterDispatch(boolean renderRedirectAfterDispatch) {
		getWrapped().setRenderRedirectAfterDispatch(renderRedirectAfterDispatch);
	}

	@Override
	public String getRenderRedirectViewId() {
		return getWrapped().getRenderRedirectViewId();
	}

	@Override
	public void setRenderRedirectViewId(String renderRedirectViewId) {
		getWrapped().setRenderRedirectViewId(renderRedirectViewId);
	}

	@Override
	public Map<String, String> getRequestHeaderMap() {
		return getWrapped().getRequestHeaderMap();
	}

	@Override
	public Map<String, String[]> getRequestHeaderValuesMap() {
		return getWrapped().getRequestHeaderValuesMap();
	}

	@Override
	public Map<String, String> getRequestParameterMap() {
		return getWrapped().getRequestParameterMap();
	}

	@Override
	public Map<String, String[]> getRequestParameterValuesMap() {
		return getWrapped().getRequestParameterValuesMap();
	}

	@Override
	public String getRequestPathInfo() {
		return getWrapped().getRequestPathInfo();
	}

	@Override
	public String getRequestServletPath() {
		return getWrapped().getRequestServletPath();
	}

	@Override
	public Writer getResponseOutputWriter() throws IOException {
		return getWrapped().getResponseOutputWriter();
	}

	@Override
	public boolean isPreserveActionParams() {
		return getWrapped().isPreserveActionParams();
	}

	@Override
	public String getSavedViewState() {
		return getWrapped().getSavedViewState();
	}

	@Override
	public void setSavedViewState(String savedViewState) {
		getWrapped().setSavedViewState(savedViewState);
	}

	@Override
	public boolean isRenderRedirect() {
		return getWrapped().isRenderRedirect();
	}

	public abstract BridgeContext getWrapped();
}
