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
public interface IFloatArrayAssert<S extends AbstractFloatArrayAssert<S>> extends Assert<S, float[]>, EnumerableAssert<AbstractEnumerableAssert<S, float[], Float>, Float>,
		ArraySortedAssert<AbstractArrayAssert<S, float[], Float>, Float> {
  S contains(float... values);

  S containsOnly(float... values);

  S containsOnlyOnce(float... values);

  S containsSequence(float... sequence);

  S containsSubsequence(float... subsequence);

  S contains(float value, Index index);

  S doesNotContain(float... values);

  S doesNotContain(float value, Index index);

  S doesNotHaveDuplicates();

  S startsWith(float... sequence);

  S endsWith(float... sequence);

  S containsExactly(float... values);
}
