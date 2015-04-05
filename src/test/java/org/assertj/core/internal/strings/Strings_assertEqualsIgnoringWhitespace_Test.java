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
package org.assertj.core.internal.strings;

import org.assertj.core.api.AssertionInfo;
import org.assertj.core.internal.StringsBaseTest;
import org.junit.Test;

import static org.assertj.core.error.ShouldBeEqualIgnoringCase.shouldBeEqual;
import static org.assertj.core.test.CharArrays.arrayOf;
import static org.assertj.core.test.ErrorMessages.charSequenceToLookForIsNull;
import static org.assertj.core.test.TestData.someInfo;
import static org.assertj.core.test.TestFailures.failBecauseExpectedAssertionErrorWasNotThrown;
import static org.mockito.Mockito.verify;

/**
 * Tests for <code>{@link org.assertj.core.internal.Strings#assertEqualsIgnoringWhitespace(org.assertj.core.api.AssertionInfo, CharSequence, CharSequence)} </code>.
 *
 * @author Alex Ruiz
 * @author Joel Costigliola
 * @author Alexander Bischof
 */
public class Strings_assertEqualsIgnoringWhitespace_Test extends StringsBaseTest {

  @Test
  public void should_fail_if_actual_is_null_and_expected_is_not() {
    AssertionInfo info = someInfo();
    try {
      strings.assertEqualsIgnoringWhitespace(info, null, "Luke");
    } catch (AssertionError e) {
      verifyFailureThrownWhenStringsAreNotEqual(info, null, "Luke");
      return;
    }
    failBecauseExpectedAssertionErrorWasNotThrown();
  }

  @Test
  public void should_fail_if_actual_is_not_null_and_expected_is_null() {
    thrown.expectNullPointerException(charSequenceToLookForIsNull());
    strings.assertEqualsIgnoringWhitespace(someInfo(), "Luke", null);
  }

  @Test
  public void should_fail_if_both_Strings_are_not_equal_regardless_of_case() {
    AssertionInfo info = someInfo();
    try {
      strings.assertEqualsIgnoringWhitespace(info, "Yoda", "Luke");
    } catch (AssertionError e) {
      verifyFailureThrownWhenStringsAreNotEqual(info, "Yoda", "Luke");
      return;
    }
    failBecauseExpectedAssertionErrorWasNotThrown();
  }

  private void verifyFailureThrownWhenStringsAreNotEqual(AssertionInfo info, String actual, String expected) {
    verify(failures).failure(info, shouldBeEqual(actual, expected));
  }

  @Test
  public void should_pass_if_both_Strings_are_null() {
    strings.assertEqualsIgnoringWhitespace(someInfo(), null, null);
  }

  @Test
  public void should_pass_if_both_Strings_are_the_same() {
    String s = "Yoda";
    strings.assertEqualsIgnoringWhitespace(someInfo(), s, s);
  }

  @Test
  public void should_pass_if_both_Strings_are_equal_but_not_same() {
    strings.assertEqualsIgnoringWhitespace(someInfo(), " my\tfoo bar ", new String(arrayOf(' ', 'm', 'y', ' ', 'f', 'o', 'o', ' ', 'b', 'a', 'r')));
  }

  @Test
  public void should_pass_if_both_Strings_are_equal_ignoring_whitespace() {
    strings.assertEqualsIgnoringWhitespace(someInfo(), " my\tfoo bar ", " my foo bar");
  }
}
