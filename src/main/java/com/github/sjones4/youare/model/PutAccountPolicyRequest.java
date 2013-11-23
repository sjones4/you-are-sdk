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
public class PutAccountPolicyRequest extends AmazonWebServiceRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  private String accountName;
  private String policyName;
  private String policyDocument;

  public PutAccountPolicyRequest() {}

  public PutAccountPolicyRequest(String accountName, String policyName, String policyDocument) {
    setAccountName(accountName);
    setPolicyName(policyName);
    setPolicyDocument(policyDocument);
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public PutAccountPolicyRequest withAccountName(String accountName) {
    setAccountName( accountName );
    return this;
  }

  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public PutAccountPolicyRequest withPolicyName(String policyName) {
    setPolicyName( policyName );
    return this;
  }

  public String getPolicyDocument() {
    return policyDocument;
  }

  public void setPolicyDocument(String policyDocument) {
    this.policyDocument = policyDocument;
  }

  public PutAccountPolicyRequest withPolicyDocument(String policyDocument) {
    setPolicyDocument( policyDocument );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getAccountName() != null) sb.append("AccountName: " + getAccountName() + ",");
    if (getPolicyName() != null) sb.append("PolicyName: " + getPolicyName() + ",");
    if (getPolicyDocument() != null) sb.append("PolicyDocument: " + getPolicyDocument() );
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
    hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
    hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof PutAccountPolicyRequest == false) return false;
    PutAccountPolicyRequest other = (PutAccountPolicyRequest)obj;

    if (other.getAccountName() == null ^ this.getAccountName() == null) return false;
    if (other.getAccountName() != null && other.getAccountName().equals(this.getAccountName()) == false) return false;
    if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
    if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false;
    if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null) return false;
    if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false) return false;
    return true;
  }
}
