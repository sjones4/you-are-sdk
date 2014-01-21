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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * @see com.github.sjones4.youcan.youtoken.PasswordCredentials
 */
public class GetAccessTokenRequest extends AmazonWebServiceRequest implements Serializable {

  private Integer durationSeconds;

  public GetAccessTokenRequest( ) {
  }

  public Integer getDurationSeconds() {
    return durationSeconds;
  }

  public void setDurationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
  }

  public GetAccessTokenRequest withDurationSeconds(Integer durationSeconds) {
    this.setDurationSeconds( durationSeconds );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getDurationSeconds() != null) sb.append("DurationSeconds: " + getDurationSeconds() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof GetAccessTokenRequest == false) return false;
    GetAccessTokenRequest other = (GetAccessTokenRequest)obj;

    if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null) return false;
    if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false) return false;
    return true;
  }
}
