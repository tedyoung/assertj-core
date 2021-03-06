/*
 * Created on Jun 11, 2012
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2010-2012 the original author or authors.
 */
package org.assertj.core.error;

import static junit.framework.Assert.assertEquals;
import static org.assertj.core.error.ShouldBeExactlyInstanceOf.shouldBeExactlyInstance;

import java.io.File;

import org.assertj.core.description.Description;
import org.assertj.core.internal.TestDescription;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for <code>{@link ShouldBeExactlyInstanceOf#create(Description)}</code>.
 * 
 * @author Nicolas François
 */
public class ShouldBeExactlyInstance_create_Test {

  private ErrorMessageFactory factory;

  @Before
  public void setUp() {
    factory = shouldBeExactlyInstance("Yoda", File.class);
  }

  @Test
  public void should_create_error_message() {
    String message = factory.create(new TestDescription("Test"));
    assertEquals(
        "[Test] \nExpecting:\n <'Yoda'>\nto be exactly an instance of:\n <java.io.File>\nbut was an instance of:\n <java.lang.String>",
        message);
  }
}
