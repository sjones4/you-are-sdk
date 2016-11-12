/*
 * Copyright 2016 Steve Jones. All Rights Reserved.
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
public class AccountSettings implements Serializable {

  private static final long serialVersionUID = 1L;

  private Boolean userBillingAccess;

  public Boolean getUserBillingAccess( ) {
    return userBillingAccess;
  }

  public void setUserBillingAccess( final Boolean userBillingAccess ) {
    this.userBillingAccess = userBillingAccess;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getUserBillingAccess() != null) sb.append("UserBillingAccess: " + getUserBillingAccess() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getUserBillingAccess() == null) ? 0 : getUserBillingAccess().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof AccountSettings == false) return false;
    AccountSettings other = (AccountSettings)obj;

    if (other.getUserBillingAccess() == null ^ this.getUserBillingAccess() == null) return false;
    if (other.getUserBillingAccess() != null && other.getUserBillingAccess().equals(this.getUserBillingAccess()) == false) return false;
    return true;
  }
}
