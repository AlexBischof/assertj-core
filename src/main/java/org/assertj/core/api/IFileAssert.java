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
import java.nio.charset.Charset;

/**
 * Created by Alexander Bischof on 16.12.14.
 */
public interface IFileAssert<S extends AbstractFileAssert<S>> extends Assert<S, File> {
  S exists();

  S doesNotExist();

  S isFile();

  S isDirectory();

  S isAbsolute();

  S isRelative();

  S hasContentEqualTo(File expected);

  S hasBinaryContent(byte[] expected);

  S usingCharset(String charsetName);

  S usingCharset(Charset charset);

  S hasContent(String expected);

  S canWrite();

  S canRead();

  S hasParent(File expected);

  S hasParent(String expected);

  S hasExtension(String expected);

  S hasName(String expected);

  S hasNoParent();
}
