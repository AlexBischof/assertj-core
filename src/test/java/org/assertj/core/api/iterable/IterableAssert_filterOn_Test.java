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
 * Copyright 2012-2015 the original author or authors.
 */
package org.assertj.core.api.iterable;

import org.assertj.core.api.filter.Filters;
import org.assertj.core.groups.Tuple;
import org.assertj.core.test.Employee;
import org.assertj.core.test.ExpectedException;
import org.assertj.core.test.Name;
import org.assertj.core.util.introspection.IntrospectionError;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.assertj.core.api.filter.Filters.In.in;
import static org.assertj.core.api.filter.Filters.Not.not;
import static org.assertj.core.api.filter.Filters.NotIn.notIn;
import static org.assertj.core.test.ExpectedException.none;
import static org.assertj.core.util.Lists.newArrayList;

/**
 * Tests for <code>{@link org.assertj.core.api.AbstractIterableAssert#filterOn(String, Object)}</code> and
 * <code>{@link org.assertj.core.api.AbstractIterableAssert#filterOn(String, org.assertj.core.api.filter.FilterOperation)}</code>
 *
 * @author Alexander Bischof
 */
public class IterableAssert_filterOn_Test {

  private Employee yoda;
  private Employee obi;
  private Employee luke;
  private Iterable<Employee> employees;

  @Before
  public void setUp() {
    yoda = new Employee(1L, new Name("Yoda"), 800);
    obi = new Employee(3L, new Name("Obi"), 800);
    luke = new Employee(2L, new Name("Luke", "Skywalker"), 26);
    employees = newArrayList(yoda, luke, obi);
  }

  @Rule
  public ExpectedException thrown = none();

  @Test
  public void should_allow_filter_on_property_values_extracted_from_given_iterable() throws Exception {
      assertThat(employees).filterOn("age", 800).containsOnly(yoda, obi);
  }

  @Test
  public void should_allow_filter_on_property_values_extracted_with_filteroperation_notin() throws Exception {
      assertThat(employees).filterOn("age", notIn(800)).containsOnly(luke);
  }

  @Test
  public void should_allow_filter_on_property_values_extracted_with_filteroperation_in() throws Exception {
      assertThat(employees).filterOn("age", in(800)).containsOnly(yoda, obi);
  }

  @Test
  public void should_allow_filter_on_property_values_extracted_with_filteroperation_not() throws Exception {
      assertThat(employees).filterOn("age", not(800)).containsOnly(luke);
  }
}
