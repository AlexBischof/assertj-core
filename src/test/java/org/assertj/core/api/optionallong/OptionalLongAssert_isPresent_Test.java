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
package org.assertj.core.api.optionallong;

import org.assertj.core.api.BaseTest;
import org.junit.Test;

import java.util.OptionalLong;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.error.OptionalLongShouldBePresent.shouldBePresent;
import static org.assertj.core.util.FailureMessages.actualIsNull;

public class OptionalLongAssert_isPresent_Test extends BaseTest {

    @Test
    public void should_pass_when_OptionalLong_is_present() throws Exception {
        assertThat(OptionalLong.of(10l)).isPresent();
    }

    @Test
    public void should_fail_when_OptionalLong_is_empty() throws Exception {
        thrown.expectAssertionError(shouldBePresent().create());

        assertThat(OptionalLong.empty()).isPresent();
    }

    @Test
    public void should_fail_when_OptionalLong_is_null() throws Exception {
        thrown.expectAssertionError(actualIsNull());

        assertThat((OptionalLong) null).isPresent();
    }
}
