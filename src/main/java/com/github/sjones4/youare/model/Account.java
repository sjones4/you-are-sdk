/*
 * Copyright 2013 Steve Jones. All Rights Reserved.
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
package com.github.sjones4.youare.model;

import java.io.Serializable;

/**
 *
 */
public class Account implements Serializable {
  private static final long serialVersionUID = 1L;
  private String accountId;
  private String accountName;

  public Account( ) {
  }

  public Account( final String accountId, final String accountName ) {
    setAccountId( accountId );
    setAccountName( accountName );
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId( final String accountId ) {
    this.accountId = accountId;
  }

  public Account withAccountId( final String accountId) {
    setAccountId( accountId );
    return this;
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName( final String accountName ) {
    this.accountName = accountName;
  }

  public Account withAccountName( final String accountName ) {
    setAccountName( accountName );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getAccountId() != null) sb.append("AccountId: " + getAccountId() + ",");
    if (getAccountName() != null) sb.append("AccountName: " + getAccountName());
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
    hashCode = prime * hashCode + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof Account == false) return false;
    Account other = (Account)obj;

    if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
    if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false;
    if (other.getAccountName() == null ^ this.getAccountName() == null) return false;
    if (other.getAccountName() != null && other.getAccountName().equals(this.getAccountName()) == false) return false;
    return true;
  }
}
