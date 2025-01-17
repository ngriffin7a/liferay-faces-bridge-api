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
package javax.portlet.faces.component;

import java.io.Serializable;

import javax.faces.component.NamingContainer;
import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.portlet.faces.BridgeUtil;
import javax.portlet.faces.annotation.PortletNamingContainer;


/**
 * This class satisfies namespacing requirements of Section 6.6 of the specification.
 *
 * @author  Neil Griffin
 */
@PortletNamingContainer
public class PortletNamingContainerUIViewRoot extends UIViewRoot implements NamingContainer, Serializable {

	// serialVersionUID
	private static final long serialVersionUID = 6744332823172081041L;

	// Private Data Members
	private String namespace;

	@Override
	public String getContainerClientId(FacesContext facesContext) {

		if (BridgeUtil.isPortletRequest()) {

			if (namespace == null) {
				ExternalContext externalContext = facesContext.getExternalContext();
				namespace = externalContext.encodeNamespace("");
			}

			return namespace;
		}
		else {
			return null;
		}
	}

}
