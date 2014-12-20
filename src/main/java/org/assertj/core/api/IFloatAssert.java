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

import org.assertj.core.data.Offset;

/**
 * Created by Alexander Bischof on 16.12.14.
 */
public interface IFloatAssert<S extends AbstractFloatAssert<S>> extends Assert<S, Float>, ComparableAssert<S, Float>, FloatingPointNumberAssert<S, Float> {
  S isEqualTo(float expected);

  // duplicate javadoc of isCloseTo(Float other, Offset<Float> offset but can't define it in super class
  S isCloseTo(float other, Offset<Float> offset);

  S isEqualTo(float expected, Offset<Float> offset);

  S isNotEqualTo(float other);

  S isLessThan(float other);

  S isLessThanOrEqualTo(float other);

  S isGreaterThan(float other);

  S isGreaterThanOrEqualTo(float other);
}
