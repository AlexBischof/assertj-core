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
public interface IByteArrayAssert<S extends AbstractByteArrayAssert<S>> extends Assert<S, byte[]>, EnumerableAssert<AbstractEnumerableAssert<S, byte[], Byte>, Byte>,
		ArraySortedAssert<AbstractArrayAssert<S, byte[], Byte>, Byte> {
  S contains(byte... values);

  S containsOnly(byte... values);

  S containsOnlyOnce(byte... values);

  S containsSequence(byte... sequence);

  S containsSubsequence(byte... subsequence);

  S contains(byte value, Index index);

  S doesNotContain(byte... values);

  S doesNotContain(byte value, Index index);

  S doesNotHaveDuplicates();

  S startsWith(byte... sequence);

  S endsWith(byte... sequence);

  S containsExactly(byte... values);
}
