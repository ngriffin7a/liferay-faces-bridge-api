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
package com.liferay.faces.bridge.scope;

import java.util.Map;
import java.util.Set;

import javax.faces.FacesWrapper;
import javax.faces.context.FacesContext;
import javax.portlet.PortletMode;
import javax.portlet.RenderRequest;
import javax.portlet.faces.Bridge.PortletPhase;


/**
 * @author  Neil Griffin
 */
public abstract class BridgeRequestScopeWrapper implements BridgeRequestScope, FacesWrapper<BridgeRequestScope> {

	public void removeExcludedAttributes(RenderRequest renderRequest) {
		getWrapped().removeExcludedAttributes(renderRequest);
	}

	public void restoreState(FacesContext facesContext) {
		getWrapped().restoreState(facesContext);
	}

	public void saveState(FacesContext facesContext) {
		getWrapped().saveState(facesContext);
	}

	public PortletPhase getBeganInPhase() {
		return getWrapped().getBeganInPhase();
	}

	public boolean isFacesLifecycleExecuted() {
		return getWrapped().isFacesLifecycleExecuted();
	}

	public boolean isNavigationOccurred() {
		return getWrapped().isNavigationOccurred();
	}

	public boolean isPortletModeChanged() {
		return getWrapped().isPortletModeChanged();
	}

	public boolean isRedirectOccurred() {
		return getWrapped().isRedirectOccurred();
	}

	public long getDateCreated() {
		return getWrapped().getDateCreated();
	}

	public void setFacesLifecycleExecuted(boolean facesLifecycleExecuted) {
		getWrapped().setFacesLifecycleExecuted(facesLifecycleExecuted);
	}

	public String getId() {
		return getWrapped().getId();
	}

	public void setIdPrefix(String idPrefix) {
		getWrapped().setIdPrefix(idPrefix);
	}

	public void setNavigationOccurred(boolean navigationOccurred) {
		getWrapped().setNavigationOccurred(navigationOccurred);
	}

	public PortletMode getPortletMode() {
		return getWrapped().getPortletMode();
	}

	public void setPortletMode(PortletMode portletMode) {
		getWrapped().setPortletMode(portletMode);
	}

	public void setPortletModeChanged(boolean portletModeChanged) {
		getWrapped().setPortletModeChanged(portletModeChanged);
	}

	public Map<String, String> getPreservedActionParameterMap() {
		return getWrapped().getPreservedActionParameterMap();
	}

	public String getPreservedViewStateParam() {
		return getWrapped().getPreservedViewStateParam();
	}

	public void setRedirectOccurred(boolean redirectOccurred) {
		getWrapped().setRedirectOccurred(redirectOccurred);
	}

	public Set<String> getRemovedAttributeNames() {
		return getWrapped().getRemovedAttributeNames();
	}

	public abstract BridgeRequestScope getWrapped();
}
