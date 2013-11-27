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
import java.util.Arrays;
import java.util.Collection;
import com.amazonaws.internal.ListWithAutoConstructFlag;

/**
 *
 */
public class ListAccountPoliciesResult  implements Serializable {
  private static final long serialVersionUID = 1L;

  private ListWithAutoConstructFlag<String> policyNames;

  public java.util.List<String> getPolicyNames() {
    if (policyNames == null) {
      policyNames = new ListWithAutoConstructFlag<>();
      policyNames.setAutoConstruct(true);
    }
    return policyNames;
  }

  public void setPolicyNames(Collection<String> policyNames) {
    if (policyNames == null) {
      this.policyNames = null;
      return;
    }
    ListWithAutoConstructFlag<String> policyNamesCopy = new ListWithAutoConstructFlag<String>(policyNames.size());
    policyNamesCopy.addAll(policyNames);
    this.policyNames = policyNamesCopy;
  }

  public ListAccountPoliciesResult withPolicyNames(String... policyNames) {
    setPolicyNames( Arrays.asList( policyNames ) );
    return this;
  }

  public ListAccountPoliciesResult withPolicyNames(Collection<String> policyNames) {
    setPolicyNames( policyNames );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getPolicyNames() != null) sb.append("PolicyNames: " + getPolicyNames() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof ListAccountPoliciesResult == false) return false;
    ListAccountPoliciesResult other = (ListAccountPoliciesResult)obj;

    if (other.getPolicyNames() == null ^ this.getPolicyNames() == null) return false;
    if (other.getPolicyNames() != null && other.getPolicyNames().equals(this.getPolicyNames()) == false) return false;
    return true;
  }
}
