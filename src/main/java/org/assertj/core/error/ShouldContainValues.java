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
package org.assertj.core.error;

import java.util.Set;

/**
 * Creates an error message indicating that an assertion that verifies a map contains a values.
 * 
 * @author Alexander Bischof
 */
public class ShouldContainValues extends BasicErrorMessageFactory {

  /**
   * Creates a new </code>{@link ShouldContainValues}</code>.
   *
   * @param actual the actual value in the failed assertion.
   * @return the created {@code ErrorMessageFactory}.
   */
  public static <V> ErrorMessageFactory shouldContainValues(Object actual, Set<V> values) {
	if (values.size() == 1) return new ShouldContainValues(actual, values.iterator().next());
	return new ShouldContainValues(actual, values);
  }

  private <V> ShouldContainValues(Object actual, Set<V> values) {
	super("\nExpecting:\n <%s>\nto contain values:\n <%s>", actual, values);
  }

  private <V> ShouldContainValues(Object actual, V values) {
	super("\nExpecting:\n <%s>\nto contain values:\n <%s>", actual, values);
  }
}