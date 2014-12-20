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
public interface ICharacterAssert<S extends AbstractCharacterAssert<S>> extends Assert<S, Character>, ComparableAssert<S, Character> {
  S isEqualTo(char expected);

  S isNotEqualTo(char other);

  S isLessThan(char other);

  S isLessThanOrEqualTo(char other);

  S isGreaterThan(char other);

  S inUnicode();

  S isGreaterThanOrEqualTo(char other);

  S isLowerCase();

  S isUpperCase();
}
