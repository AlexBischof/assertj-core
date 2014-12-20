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
public interface ILongArrayAssert<S extends AbstractLongArrayAssert<S>> extends Assert<S, long[]>, EnumerableAssert<AbstractEnumerableAssert<S, long[], Long>, Long>,
		ArraySortedAssert<AbstractArrayAssert<S, long[], Long>, Long> {
  S contains(long... values);

  S containsOnly(long... values);

  S containsOnlyOnce(long... values);

  S containsSequence(long... sequence);

  S containsSubsequence(long... subsequence);

  S contains(long value, Index index);

  S doesNotContain(long... values);

  S doesNotContain(long value, Index index);

  S doesNotHaveDuplicates();

  S startsWith(long... sequence);

  S endsWith(long... sequence);

  S containsExactly(long... values);
}
