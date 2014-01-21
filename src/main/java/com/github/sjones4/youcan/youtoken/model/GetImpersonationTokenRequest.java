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
 *
 */
public class GetImpersonationTokenRequest extends AmazonWebServiceRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private String accountAlias;
  private String userName;
  private String userId;

  public GetImpersonationTokenRequest() {}

  public String getAccountAlias() {
    return accountAlias;
  }

  public void setAccountAlias( final String accountAlias ) {
    this.accountAlias = accountAlias;
  }

  public GetImpersonationTokenRequest withAccountAlias( final String accountAlias ) {
    setAccountAlias( accountAlias );
    return this;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName( final String userName ) {
    this.userName = userName;
  }

  public GetImpersonationTokenRequest withUserName( final String userName ){
    setUserName( userName );
    return this;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId( final String userId ) {
    this.userId = userId;
  }

  public GetImpersonationTokenRequest withUserId( final String userId ) {
    setUserId( userId );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getAccountAlias() != null) sb.append("AccountAlias: " + getAccountAlias() + ",");
    if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
    if (getUserId() != null) sb.append("UserId: " + getUserId() );
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getAccountAlias() == null) ? 0 : getAccountAlias().hashCode());
    hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
    hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof GetImpersonationTokenRequest == false) return false;
    GetImpersonationTokenRequest other = (GetImpersonationTokenRequest)obj;

    if (other.getAccountAlias() == null ^ this.getAccountAlias() == null) return false;
    if (other.getAccountAlias() != null && other.getAccountAlias().equals(this.getAccountAlias()) == false) return false;
    if (other.getUserName() == null ^ this.getUserName() == null) return false;
    if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false;
    if (other.getUserId() == null ^ this.getUserId() == null) return false;
    if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false) return false;
    return true;
  }

}
