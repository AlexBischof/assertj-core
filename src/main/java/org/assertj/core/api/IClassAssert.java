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

import java.lang.annotation.Annotation;

/**
 * Created by Alexander Bischof on 16.12.14.
 */
public interface IClassAssert<S extends AbstractClassAssert<S>> extends Assert<S, Class<?>> {
  S isAssignableFrom(Class<?>... others);

  S isNotInterface();

  S isInterface();

  S isAnnotation();

  S isNotAnnotation();

  S hasAnnotations(@SuppressWarnings("unchecked") Class<? extends Annotation>... annotations);

  @SuppressWarnings("unchecked") S hasAnnotation(Class<? extends Annotation> annotation);

  S hasFields(String... fields);

  S hasDeclaredFields(String... fields);
}
