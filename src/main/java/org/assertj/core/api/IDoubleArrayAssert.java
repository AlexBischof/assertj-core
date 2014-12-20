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
public interface IDoubleArrayAssert<S extends AbstractDoubleArrayAssert<S>> extends Assert<S, double[]>, EnumerableAssert<AbstractEnumerableAssert<S, double[], Double>, Double>,
		ArraySortedAssert<AbstractArrayAssert<S, double[], Double>, Double> {
  S contains(double... values);

  S containsOnly(double... values);

  S containsOnlyOnce(double... values);

  S containsSequence(double... sequence);

  S containsSubsequence(double... subsequence);

  S contains(double value, Index index);

  S doesNotContain(double... values);

  S doesNotContain(double value, Index index);

  S doesNotHaveDuplicates();

  S startsWith(double... sequence);

  S endsWith(double... sequence);

  S containsExactly(double... values);
}
