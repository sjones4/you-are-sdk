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
package com.github.sjones4.youcan.youare.model;

import java.io.Serializable;

/**
 *
 */
public class DeleteAccountResult implements Serializable {
  private static final long serialVersionUID = 1L;
  private Account account;

  public DeleteAccountResult() {
  }

  public DeleteAccountResult( final Account account ) {
    setAccount( account );
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount( final Account account ) {
    this.account = account;
  }

  public DeleteAccountResult withAccount( final Account account ) {
    setAccount( account );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getAccount() != null) sb.append("Account: " + getAccount() );
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof DeleteAccountResult == false) return false;
    DeleteAccountResult other = (DeleteAccountResult)obj;

    if (other.getAccount() == null ^ this.getAccount() == null) return false;
    if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false) return false;
    return true;
  }
}
