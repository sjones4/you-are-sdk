/*
 * Copyright 2017 Steve Jones. All Rights Reserved.
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
package com.github.sjones4.youcan.youbill.model;

import java.io.Serializable;

/**
 *
 */
public class ViewUsageResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private String data;
  public String getData() {
    return data;
  }

  public void setData( final String data ) {
    this.data = data;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder( );
    sb.append( "{" );
    if (getData() != null) sb.append("data: " + getData() );
    sb.append( "}" );
    return sb.toString( );
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals( Object obj ) {
    if ( this == obj ) return true;
    if ( obj == null ) return false;

    if ( obj instanceof ViewUsageResult == false ) return false;
    final ViewUsageResult other = (ViewUsageResult) obj;

    if (this.data == null && other.data != null)
      return false;
    else if (this.data != null && !this.data.equals(other.data))
      return false;

    return true;
  }
}
