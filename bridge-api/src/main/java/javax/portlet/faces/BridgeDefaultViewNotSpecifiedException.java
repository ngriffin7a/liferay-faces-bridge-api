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
package javax.portlet.faces;

/**
 * @author  Neil Griffin
 */
public class BridgeDefaultViewNotSpecifiedException extends BridgeException {

	private static final long serialVersionUID = 7492388860641501588L;

	public BridgeDefaultViewNotSpecifiedException() {
		super();
	}

	public BridgeDefaultViewNotSpecifiedException(String message) {
		super(message);
	}

	public BridgeDefaultViewNotSpecifiedException(Exception e) {
		super(e);
	}

	public BridgeDefaultViewNotSpecifiedException(Throwable cause) {
		super(cause);
	}

	public BridgeDefaultViewNotSpecifiedException(String message, Throwable cause) {
		super(message, cause);
	}
}
