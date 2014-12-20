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

import org.assertj.core.api.iterable.Extractor;
import org.assertj.core.groups.Tuple;

import java.util.Collection;

/**
 * Created by Alexander Bischof on 16.12.14.
 */
public interface IIterableAssert<S extends AbstractIterableAssert<S, A, T>, A extends Iterable<T>, T>extends Assert<S, A>, ObjectEnumerableAssert<S, T> {
  S isSubsetOf(Iterable<? extends T> values);

  S doesNotContainAnyElementsOf(Iterable<? extends T> iterable);

  ListAssert<Object> extracting(String propertyOrField);

  ListAssert<Object> extractingResultOf(String method);

  <P> ListAssert<P> extractingResultOf(String method, Class<P> extractedType);

  <P> ListAssert<P> extracting(String propertyOrField, Class<P> extractingType);

  ListAssert<Tuple> extracting(String... propertiesOrFields);

  <V> ListAssert<V> extracting(Extractor<? super T, V> extractor);

  <V> ListAssert<V> flatExtracting(Extractor<? super T, ? extends Collection<V>> extractor);

  S containsExactlyElementsOf(Iterable<? extends T> iterable);

  S containsOnlyElementsOf(Iterable<? extends T> iterable);

  S hasSameElementsAs(Iterable<? extends T> iterable);

  S usingFieldByFieldElementComparator();

  S usingElementComparatorOnFields(String... fields);

  S usingElementComparatorIgnoringFields(String... fields);
}
