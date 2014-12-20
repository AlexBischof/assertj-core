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

import org.assertj.core.data.MapEntry;

import java.util.Map;

/**
 * Created by Alexander Bischof on 16.12.14.
 */
public interface IMapAssert<S extends AbstractMapAssert<S, A, K, V>, A extends Map<K, V>, K, V> extends Assert<S, A>, EnumerableAssert<S, MapEntry> {
  S hasSameSizeAs(Map<?, ?> other);

  S contains(MapEntry... entries);

  S containsEntry(K key, V value);

  S doesNotContain(MapEntry... entries);

  S doesNotContainEntry(K key, V value);

  @SuppressWarnings("unchecked") S containsKey(K key);

  S containsKeys(@SuppressWarnings("unchecked") K... keys);

  S doesNotContainKey(K key);

  S containsOnlyKeys(@SuppressWarnings("unchecked") K... keys);

  S containsValue(V value);

  S doesNotContainValue(V value);

  S containsOnly(MapEntry... entries);

  S containsExactly(MapEntry... entries);
}
