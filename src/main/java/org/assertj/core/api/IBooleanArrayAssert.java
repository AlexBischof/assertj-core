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

import org.assertj.core.data.Index;

/**
 * Created by Alexander Bischof on 16.12.14.
 */
public interface IBooleanArrayAssert<S extends AbstractBooleanArrayAssert<S>> extends Assert<S, boolean[]>, EnumerableAssert<AbstractEnumerableAssert<S, boolean[], Boolean>, Boolean>,
		ArraySortedAssert<AbstractArrayAssert<S, boolean[], Boolean>, Boolean> {
  S contains(boolean... values);

  S containsOnly(boolean... values);

  S containsOnlyOnce(boolean... values);

  S containsSequence(boolean... sequence);

  S containsSubsequence(boolean... subsequence);

  S contains(boolean value, Index index);

  S doesNotContain(boolean... values);

  S doesNotContain(boolean value, Index index);

  S doesNotHaveDuplicates();

  S startsWith(boolean... sequence);

  S endsWith(boolean... sequence);

  S containsExactly(boolean... values);
}
