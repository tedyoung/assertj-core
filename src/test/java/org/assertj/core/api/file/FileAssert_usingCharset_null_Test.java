/*
 * Created on Jul 21, 2012
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2011 the original author or authors.
 */
package org.assertj.core.api.file;

import static org.assertj.core.test.ExpectedException.none;

import java.nio.charset.Charset;


import org.assertj.core.api.FileAssert;
import org.assertj.core.api.FileAssertBaseTest;
import org.assertj.core.test.ExpectedException;
import org.junit.Rule;
import org.junit.Test;

/**
 * Test for <code>{@link FileAssert#usingCharset(Charset)}</code> when the provided charset is null.
 * 
 * @author Olivier Michallat
 */
public class FileAssert_usingCharset_null_Test extends FileAssertBaseTest {

  @Rule
  public ExpectedException thrown = none();

  @Override
  @Test
  public void should_have_internal_effects() {
    thrown.expectNullPointerException("The charset should not be null");
    assertions.usingCharset((Charset) null);
  }
  
  @Override
  @Test
  public void should_return_this() {
    // Disable this test since the call fails
  }
  
  @Override
  protected FileAssert invoke_api_method() {
    // not used here
    return null;
  }

  @Override
  protected void verify_internal_effects() {
    // not used here
  }
}
