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
import com.amazonaws.AmazonWebServiceRequest;

/**
 *
 */
public class ListAccountPoliciesRequest  extends AmazonWebServiceRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  private String accountName;

  public ListAccountPoliciesRequest() {}

  public ListAccountPoliciesRequest(String accountName ) {
    setAccountName( accountName );
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName( String accountName ) {
    this.accountName = accountName;
  }

  public ListAccountPoliciesRequest withAccountName(String accountName) {
    setAccountName( accountName );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if ( getAccountName() != null) sb.append("AccountName: " + getAccountName() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + (( getAccountName() == null) ? 0 : getAccountName().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof ListAccountPoliciesRequest == false) return false;
    ListAccountPoliciesRequest other = (ListAccountPoliciesRequest)obj;

    if (other.getAccountName() == null ^ this.getAccountName() == null) return false;
    if (other.getAccountName() != null && other.getAccountName().equals(this.getAccountName()) == false) return false;
    return true;
  }
}
