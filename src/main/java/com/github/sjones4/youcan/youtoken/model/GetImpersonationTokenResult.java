/*
 * Copyright 2014 Steve Jones. All Rights Reserved.
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
package com.github.sjones4.youcan.youtoken.model;

import java.io.Serializable;
import com.amazonaws.services.securitytoken.model.Credentials;

/**
 *
 */
public class GetImpersonationTokenResult implements Serializable {

  private Credentials credentials;

  public Credentials getCredentials() {
    return credentials;
  }

  public void setCredentials(Credentials credentials) {
    this.credentials = credentials;
  }

  public GetImpersonationTokenResult withCredentials(Credentials credentials) {
    this.credentials = credentials;
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getCredentials() != null) sb.append("Credentials: " + getCredentials() );
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof GetImpersonationTokenResult == false) return false;
    GetImpersonationTokenResult other = (GetImpersonationTokenResult)obj;

    if (other.getCredentials() == null ^ this.getCredentials() == null) return false;
    if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false) return false;
    return true;
  }

}
