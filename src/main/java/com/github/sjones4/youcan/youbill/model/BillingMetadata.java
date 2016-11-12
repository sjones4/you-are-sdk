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
import java.util.Arrays;
import java.util.Collection;
import com.amazonaws.internal.ListWithAutoConstructFlag;

/**
 *
 */
public class BillingMetadata implements Serializable {
  private static final long serialVersionUID = 1L;

  private ListWithAutoConstructFlag<String> inactiveCostAllocationTags;

  public java.util.List<String> getInactiveCostAllocationTags() {
    if ( inactiveCostAllocationTags == null) {
      inactiveCostAllocationTags = new ListWithAutoConstructFlag<>();
      inactiveCostAllocationTags.setAutoConstruct(true);
    }
    return inactiveCostAllocationTags;
  }

  public void setInactiveCostAllocationTags( Collection<String> inactiveCostAllocationTags ) {
    if ( inactiveCostAllocationTags == null) {
      this.inactiveCostAllocationTags = null;
      return;
    }
    ListWithAutoConstructFlag<String> inactiveCostAllocationTagsCopy
        = new ListWithAutoConstructFlag<String>( inactiveCostAllocationTags.size( ) );
    inactiveCostAllocationTagsCopy.addAll( inactiveCostAllocationTags );
    this.inactiveCostAllocationTags = inactiveCostAllocationTagsCopy;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if ( getInactiveCostAllocationTags() != null) sb.append("InactiveCostAllocationTags: " + getInactiveCostAllocationTags() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + (( getInactiveCostAllocationTags() == null) ? 0 : getInactiveCostAllocationTags().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof BillingMetadata == false) return false;
    BillingMetadata other = (BillingMetadata)obj;

    if (other.getInactiveCostAllocationTags() == null ^ this.getInactiveCostAllocationTags() == null) return false;
    if (other.getInactiveCostAllocationTags() != null && other.getInactiveCostAllocationTags().equals(this.getInactiveCostAllocationTags()) == false) return false;
    return true;
  }
}
