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
public interface IIntArrayAssert<S extends AbstractIntArrayAssert<S>> extends Assert<S, int[]>, EnumerableAssert<AbstractEnumerableAssert<S, int[], Integer>, Integer>,
		ArraySortedAssert<AbstractArrayAssert<S, int[], Integer>, Integer> {
  S contains(int... values);

  S containsOnly(int... values);

  S containsOnlyOnce(int... values);

  S containsSequence(int... sequence);

  S containsSubsequence(int... subsequence);

  S contains(int value, Index index);

  S doesNotContain(int... values);

  S doesNotContain(int value, Index index);

  S doesNotHaveDuplicates();

  S startsWith(int... sequence);

  S endsWith(int... sequence);

  S containsExactly(int... values);
}
