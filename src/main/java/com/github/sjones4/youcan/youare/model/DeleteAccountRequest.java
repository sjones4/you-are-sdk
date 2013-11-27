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
import com.amazonaws.AmazonWebServiceRequest;

/**
 *
 */
public class DeleteAccountRequest extends AmazonWebServiceRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  private String accountName;
  private Boolean recursive;

  public DeleteAccountRequest() {
  }

  public DeleteAccountRequest( final String accountName,
                               final Boolean recursive ) {
    setAccountName( accountName );
    setRecursive( recursive );
  }

  public String getAccountName( ) {
    return accountName;
  }

  public void setAccountName( final String accountName ) {
    this.accountName = accountName;
  }

  public DeleteAccountRequest withAccountName( final String accountName ) {
    setAccountName( accountName );
    return this;
  }

  public Boolean getRecursive() {
    return recursive;
  }

  public void setRecursive( final Boolean recursive ) {
    this.recursive = recursive;
  }

  public DeleteAccountRequest withRecursive( final Boolean recursive ) {
    setRecursive( recursive );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getAccountName() != null) sb.append("AccountName: " + getAccountName() );
    if (getRecursive() != null) sb.append("Recursive: " + getRecursive() );
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
    hashCode = prime * hashCode + ((getRecursive() == null) ? 0 : getRecursive().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof DeleteAccountRequest == false) return false;
    DeleteAccountRequest other = (DeleteAccountRequest)obj;

    if (other.getAccountName() == null ^ this.getAccountName() == null) return false;
    if (other.getAccountName() != null && other.getAccountName().equals(this.getAccountName()) == false) return false;
    if (other.getRecursive() == null ^ this.getRecursive() == null) return false;
    if (other.getRecursive() != null && other.getRecursive().equals(this.getRecursive()) == false) return false;
    return true;
  }
}
