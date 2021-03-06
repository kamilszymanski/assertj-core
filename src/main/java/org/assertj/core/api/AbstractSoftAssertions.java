/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2014 the original author or authors.
 */
package org.assertj.core.api;

public class AbstractSoftAssertions {

  protected final SoftProxies proxies;

  public AbstractSoftAssertions() {
	super();
    proxies = new SoftProxies();
  }

  protected <T, V> V proxy(Class<V> assertClass, Class<T> actualClass, T actual) {
    return proxies.create(assertClass, actualClass, actual);
  }
}