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
import java.util.Collection;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;

/**
 *
 */
public class ModifyBillingRequest extends AmazonWebServiceRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  private String reportBucket;
  private Boolean detailedBillingEnabled;
  private ListWithAutoConstructFlag<String> activeCostAllocationTags;

  public String getReportBucket( ) {
    return reportBucket;
  }

  public void setReportBucket( final String reportBucket ) {
    this.reportBucket = reportBucket;
  }

  public Boolean getDetailedBillingEnabled( ) {
    return detailedBillingEnabled;
  }

  public void setDetailedBillingEnabled( final Boolean detailedBillingEnabled ) {
    this.detailedBillingEnabled = detailedBillingEnabled;
  }

  public java.util.List<String> getActiveCostAllocationTags( ) {
    if ( activeCostAllocationTags == null) {
      activeCostAllocationTags = new ListWithAutoConstructFlag<>();
      activeCostAllocationTags.setAutoConstruct(true);
    }
    return activeCostAllocationTags;
  }

  public void setActiveCostAllocationTags( Collection<String> activeCostAllocationTags ) {
    if ( activeCostAllocationTags == null) {
      this.activeCostAllocationTags = null;
      return;
    }
    ListWithAutoConstructFlag<String> activeCostAllocationTagsCopy
        = new ListWithAutoConstructFlag<String>( activeCostAllocationTags.size( ) );
    activeCostAllocationTagsCopy.addAll( activeCostAllocationTags );
    this.activeCostAllocationTags = activeCostAllocationTagsCopy;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if ( getReportBucket() != null) sb.append("ReportBucket: " + getReportBucket() + ",");
    if ( getDetailedBillingEnabled() != null) sb.append("DetailedBillingEnabled: " + getDetailedBillingEnabled() + ",");
    if ( getActiveCostAllocationTags() != null) sb.append("ActiveCostAllocationTags: " + getActiveCostAllocationTags() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + (( getReportBucket() == null) ? 0 : getReportBucket().hashCode());
    hashCode = prime * hashCode + (( getDetailedBillingEnabled() == null) ? 0 : getDetailedBillingEnabled().hashCode());
    hashCode = prime * hashCode + (( getActiveCostAllocationTags() == null) ? 0 : getActiveCostAllocationTags().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof ModifyBillingRequest == false) return false;
    ModifyBillingRequest other = (ModifyBillingRequest)obj;

    if (other.getReportBucket() == null ^ this.getReportBucket() == null) return false;
    if (other.getReportBucket() != null && other.getReportBucket().equals(this.getReportBucket()) == false) return false;
    if (other.getDetailedBillingEnabled() == null ^ this.getDetailedBillingEnabled() == null) return false;
    if (other.getDetailedBillingEnabled() != null && other.getDetailedBillingEnabled().equals(this.getDetailedBillingEnabled()) == false) return false;
    if (other.getActiveCostAllocationTags() == null ^ this.getActiveCostAllocationTags() == null) return false;
    if (other.getActiveCostAllocationTags() != null && other.getActiveCostAllocationTags().equals(this.getActiveCostAllocationTags()) == false) return false;
    return true;
  }
}
