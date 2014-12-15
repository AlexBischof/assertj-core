package org.assertj.core.api.abstract_;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * @author Alexander Bischof
 */
public class AbstractAssert_failWithThreaddump_Test {

  @Test
  public void should_fail_with_String() {
    assertThat("Hello").withThreadDump().isEqualTo("World");
  }

  @Test
  public void should_fail_with_Boolean() {
	assertThat(false).withThreadDump().isTrue();
  }

  @Test
  public void should_fail_with_List() {
	assertThat(Arrays.asList(1)).withThreadDump().isEmpty();
  }
}
