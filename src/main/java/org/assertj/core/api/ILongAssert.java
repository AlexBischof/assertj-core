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

/**
 * Created by Alexander Bischof on 16.12.14.
 */
public interface ILongAssert<S extends AbstractLongAssert<S>> extends Assert<S, Long>, ComparableAssert<S, Long>, NumberAssert<S, Long> {
  S isEqualTo(long expected);

  S isNotEqualTo(long other);

  S isLessThan(long other);

  S isLessThanOrEqualTo(long other);

  S isGreaterThan(long other);

  S isGreaterThanOrEqualTo(long other);
}
