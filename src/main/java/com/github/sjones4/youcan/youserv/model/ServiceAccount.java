/*
 * Copyright 2018 Steve Jones. All Rights Reserved.
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

/**
 *
 */
public class ServiceAccount implements Serializable {
  private static final long serialVersionUID = 1L;

  private String name;
  private String number;
  private String canonicalId;

  public String getName( ) {
    return name;
  }

  public void setName( final String name ) {
    this.name = name;
  }

  public String getNumber( ) {
    return number;
  }

  public void setNumber( final String number ) {
    this.number = number;
  }

  public String getCanonicalId( ) {
    return canonicalId;
  }

  public void setCanonicalId( final String canonicalId ) {
    this.canonicalId = canonicalId;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getName( ) != null) sb.append("Name: " + getName( ) + ",");
    if (getNumber() != null) sb.append("Number: " + getNumber( ) + ",");
    if (getCanonicalId() != null) sb.append("CanonicalId: " + getCanonicalId( ));
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getName( ) == null) ? 0 : getName( ).hashCode());
    hashCode = prime * hashCode + ((getNumber( ) == null) ? 0 : getNumber( ).hashCode());
    hashCode = prime * hashCode + ((getCanonicalId( ) == null) ? 0 : getCanonicalId( ).hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof ServiceAccount == false) return false;
    ServiceAccount other = (ServiceAccount)obj;

    if (other.getName( ) == null ^ this.getName( ) == null) return false;
    if (other.getName( ) != null && other.getName( ).equals(this.getName( )) == false) return false;
    if (other.getNumber( ) == null ^ this.getNumber( ) == null) return false;
    if (other.getNumber( ) != null && other.getNumber( ).equals(this.getNumber( )) == false) return false;
    if (other.getCanonicalId( ) == null ^ this.getCanonicalId( ) == null) return false;
    if (other.getCanonicalId( ) != null && other.getCanonicalId( ).equals(this.getCanonicalId( )) == false) return false;
    return true;
  }
}
