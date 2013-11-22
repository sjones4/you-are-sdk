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
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import com.amazonaws.internal.ListWithAutoConstructFlag;

/**
 *
 */
public class ListAccountsResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private ListWithAutoConstructFlag<Account> accounts;

  public List<Account> getAccounts() {
    if (accounts == null) {
      accounts = new ListWithAutoConstructFlag<>();
      accounts.setAutoConstruct(true);
    }
    return accounts;
  }

  public void setAccounts(java.util.Collection<Account> accounts) {
    if (accounts == null) {
      this.accounts = null;
      return;
    }
    ListWithAutoConstructFlag<Account> accountsCopy = new ListWithAutoConstructFlag<>(accounts.size());
    accountsCopy.addAll(accounts);
    this.accounts = accountsCopy;
  }

  public ListAccountsResult withAccounts(Account... accounts) {
    if (getAccounts() == null) setAccounts( Arrays.asList( accounts ) );
    return this;
  }

  public ListAccountsResult withUsers( Collection<Account> users) {
    setAccounts( accounts );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getAccounts() != null) sb.append("Accounts: " + getAccounts() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof ListAccountsResult == false) return false;
    ListAccountsResult other = (ListAccountsResult)obj;

    if (other.getAccounts() == null ^ this.getAccounts() == null) return false;
    if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false) return false;
    return true;
  }
}
