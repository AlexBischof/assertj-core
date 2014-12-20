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
public interface IShortArrayAssert<S extends AbstractShortArrayAssert<S>> extends Assert<S, short[]>, EnumerableAssert<AbstractEnumerableAssert<S, short[], Short>, Short>,
		ArraySortedAssert<AbstractArrayAssert<S, short[], Short>, Short> {
  S contains(short... values);

  S containsOnly(short... values);

  S containsOnlyOnce(short... values);

  S containsSequence(short... sequence);

  S containsSubsequence(short... subsequence);

  S contains(short value, Index index);

  S doesNotContain(short... values);

  S doesNotContain(short value, Index index);

  S doesNotHaveDuplicates();

  S startsWith(short... sequence);

  S endsWith(short... sequence);

  S containsExactly(short... values);
}
