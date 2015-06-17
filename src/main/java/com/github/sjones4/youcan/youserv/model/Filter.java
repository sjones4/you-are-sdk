/*
 * Copyright 2015 Steve Jones. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.github.sjones4.youcan.youserv.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import com.amazonaws.internal.ListWithAutoConstructFlag;

/**
 *
 */
public class Filter implements Serializable {
  private static final long serialVersionUID = 1L;

  private String name;
  private ListWithAutoConstructFlag<String> values;

  public String getName() {
    return name;
  }

  public void setName( final String name ) {
    this.name = name;
  }

  public Filter withName( final String name ) {
    setName( name );
    return this;
  }

  public List<String> getValues() {
    if ( values == null) {
      values = new ListWithAutoConstructFlag<>();
      values.setAutoConstruct( true );
    }
    return values;
  }

  public void setValues( final Collection<String> values ) {
    if ( values == null) {
      this.values = null;
      return;
    }
    ListWithAutoConstructFlag<String> valuesCopy = new ListWithAutoConstructFlag<>( values.size());
    valuesCopy.addAll( values );
    this.values = valuesCopy;
  }

  public Filter withValues(String... values) {
    setValues( Arrays.asList( values ) );
    return this;
  }

  public Filter withValues(Collection<String> values) {
    setValues( values );
    return this;
  }

}
