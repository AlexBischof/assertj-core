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
public interface ICharArrayAssert<S extends AbstractCharArrayAssert<S>> extends Assert<S, char[]>, EnumerableAssert<AbstractEnumerableAssert<S, char[], Character>, Character>,
		ArraySortedAssert<AbstractArrayAssert<S, char[], Character>, Character> {
  S contains(char... values);

  S containsOnly(char... values);

  S containsOnlyOnce(char... values);

  S containsSequence(char... sequence);

  S containsSubsequence(char... subsequence);

  S contains(char value, Index index);

  S doesNotContain(char... values);

  S doesNotContain(char value, Index index);

  S doesNotHaveDuplicates();

  S startsWith(char... sequence);

  S endsWith(char... sequence);

  S containsExactly(char... values);

  S inUnicode();
}
