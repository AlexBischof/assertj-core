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

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.Callable;

public abstract class AbstractSoftAssertions {

  final ErrorCollector collector;

  protected AbstractSoftAssertions() {
	this.collector = new ErrorCollector();
  }

  @SuppressWarnings("unchecked")
  protected <V> V jdkProxy(Class<V> interfaceClass, final Object objectToProxy) {

	return (V) Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class[]{interfaceClass}, new InvocationHandler() {
	  @Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		try {
		  result = method.invoke(objectToProxy, args);
		} catch (InvocationTargetException e) {
		  Throwable cause = e.getCause();
		  if (cause instanceof AssertionError){
		    collector.addThrowable(e);
		  }
		}
		return result;
	  }
	});
  }

  /**
   * Creates a new instance of <code>{@link BigDecimalAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IBigDecimalAssert assertThat(BigDecimal actual) {
	return jdkProxy(IBigDecimalAssert.class, new BigDecimalAssert(actual));
  }

  // assertThat* methods duplicated from Assertions

  /**
   * Creates a new instance of <code>{@link BooleanAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IBooleanAssert assertThat(boolean actual) {
	return jdkProxy(IBooleanAssert.class, new BooleanAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link BooleanAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IBooleanAssert assertThat(Boolean actual) {
	return jdkProxy(IBooleanAssert.class, new BooleanAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link BooleanArrayAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IBooleanArrayAssert assertThat(boolean[] actual) {
	return jdkProxy(IBooleanArrayAssert.class, new BooleanArrayAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link ByteAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IByteAssert assertThat(byte actual) {
	return jdkProxy(IByteAssert.class, new ByteAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link ByteAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IByteAssert assertThat(Byte actual) {
	return jdkProxy(IByteAssert.class, new ByteAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link ByteArrayAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IByteArrayAssert assertThat(byte[] actual) {
	return jdkProxy(IByteArrayAssert.class, new ByteArrayAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link CharacterAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public ICharacterAssert jdkProxy(char actual) {
	return jdkProxy(ICharacterAssert.class, new CharacterAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link CharArrayAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public ICharArrayAssert assertThat(char[] actual) {
	return jdkProxy(ICharArrayAssert.class, new CharArrayAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link CharacterAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public ICharacterAssert assertThat(Character actual) {
	return jdkProxy(ICharacterAssert.class, new CharacterAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link ClassAssert}</code>
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IClassAssert assertThat(Class<?> actual) {
	return jdkProxy(IClassAssert.class, new ClassAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link IterableAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @SuppressWarnings("unchecked")
  public <T> IIterableAssert<?,?, T> assertThat(Iterable<T> actual) {
	return jdkProxy(IIterableAssert.class, new IterableAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link IterableAssert}</code>. The <code>{@link Iterator}</code> is first
   * converted
   * into an <code>{@link Iterable}</code>
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @SuppressWarnings("unchecked")
  public <T> IIterableAssert<?,?,T> assertThat(Iterator<T> actual) {
	return jdkProxy(IIterableAssert.class, new IterableAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link DoubleAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IDoubleAssert assertThat(double actual) {
	return jdkProxy(IDoubleAssert.class, new DoubleAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link DoubleAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IDoubleAssert assertThat(Double actual) {
	return jdkProxy(IDoubleAssert.class, new DoubleAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link DoubleArrayAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IDoubleArrayAssert assertThat(double[] actual) {
	return jdkProxy(IDoubleArrayAssert.class, new DoubleArrayAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link FileAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IFileAssert assertThat(File actual) {
	return jdkProxy(IFileAssert.class, new FileAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link InputStreamAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IInputStreamAssert assertThat(InputStream actual) {
	return jdkProxy(IInputStreamAssert.class, new InputStreamAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link FloatAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IFloatAssert assertThat(float actual) {
	return jdkProxy(IFloatAssert.class, new FloatAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link FloatAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IFloatAssert assertThat(Float actual) {
	return jdkProxy(IFloatAssert.class, new FloatAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link FloatArrayAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IFloatArrayAssert assertThat(float[] actual) {
	return jdkProxy(IFloatArrayAssert.class, new FloatArrayAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link IntegerAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IIntegerAssert assertThat(int actual) {
	return jdkProxy(IIntegerAssert.class, new IntegerAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link IntArrayAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IIntArrayAssert assertThat(int[] actual) {
	return jdkProxy(IIntArrayAssert.class, new IntArrayAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link IntegerAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IIntegerAssert assertThat(Integer actual) {
	return jdkProxy(IIntegerAssert.class, new IntegerAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link ListAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @SuppressWarnings("unchecked")
  public <T> IListAssert<?, ?, T> assertThat(List<T> actual) {
	return jdkProxy(IListAssert.class, new ListAssert<T>(actual));
  }

  /**
   * Creates a new instance of <code>{@link LongAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public ILongAssert assertThat(long actual) {
	return jdkProxy(ILongAssert.class, new LongAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link LongAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public ILongAssert assertThat(Long actual) {
	return jdkProxy(ILongAssert.class, new LongAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link LongArrayAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public ILongArrayAssert assertThat(long[] actual) {
	return jdkProxy(ILongArrayAssert.class, new LongArrayAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link ObjectAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @SuppressWarnings("unchecked")
  public <T> IObjectAssert<T> assertThat(T actual) {
	return jdkProxy(IObjectAssert.class, new ObjectAssert<T>(actual));
  }

  /**
   * Creates a new instance of <code>{@link ObjectArrayAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @SuppressWarnings("unchecked")
  public <T> IObjectArrayAssert<T> assertThat(T[] actual) {
	return jdkProxy(IObjectArrayAssert.class, new ObjectArrayAssert<T>(actual));
  }

  /**
   * Creates a new instance of <code>{@link MapAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @SuppressWarnings("unchecked")
  public <K, V> IMapAssert<?,?,K, V> assertThat(Map<K, V> actual) {
	return jdkProxy(IMapAssert.class, new MapAssert<K,V>(actual));
  }

  /**
   * Creates a new instance of <code>{@link ShortAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IShortAssert assertThat(short actual) {
	return jdkProxy(IShortAssert.class, new ShortAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link ShortAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IShortAssert assertThat(Short actual) {
	return jdkProxy(IShortAssert.class, new ShortAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link ShortArrayAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IShortArrayAssert assertThat(short[] actual) {
	return jdkProxy(IShortArrayAssert.class, new ShortArrayAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link CharSequenceAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public ICharSequenceAssert assertThat(CharSequence actual) {
	return jdkProxy(ICharSequenceAssert.class, new CharSequenceAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link StringAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IStringAssert assertThat(String actual) {
	return jdkProxy(IStringAssert.class, new StringAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link DateAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public IDateAssert assertThat(Date actual) {
	return jdkProxy(IDateAssert.class, new DateAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link ThrowableAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion Throwable.
   */
  public IThrowableAssert assertThat(Throwable actual) {
	return jdkProxy(IThrowableAssert.class, new ThrowableAssert(actual));
  }

  /**
   * Creates a new instance of <code>{@link ThrowableAssert}</code> with the exception thrown by the given
   * {@link Callable} execution.
   * <p>
   * Example :
   *
   * <pre><code class='java'>
   * SoftAssertions softly = new SoftAssertions();
   * softly.assertThatExceptionThrownBy(new Callable&lt;Void&gt;()
   *
   *   {@literal @}Override
   *   public Void call() throws Exception {
   *     throw new Exception("something was wrong");
   *   }
   *
   * }).isInstanceOf(Exception.class)
   *   .hasMessage("something was wrong");
   * </code></pre>
   *
   * @param callable the callable whose execution throws an exception we want to check.
   * @return the created assertion object.
   */
  public <V> IThrowableAssert assertThatExceptionThrownBy(Callable<V> callable) {
	return assertThat(new ThrowableAssert(callable).actual);
  }
}
