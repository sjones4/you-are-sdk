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
package com.github.sjones4.youcan.youserv.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import com.amazonaws.internal.ListWithAutoConstructFlag;

/**
 *
 */
public class DescribeServicesResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private ListWithAutoConstructFlag<ServiceStatus> serviceStatuses;

  public List<ServiceStatus> getServiceStatuses() {
    if (serviceStatuses == null) {
      serviceStatuses = new ListWithAutoConstructFlag<>();
      serviceStatuses.setAutoConstruct(true);
    }
    return serviceStatuses;
  }

  public void setServiceStatuses( Collection<ServiceStatus> serviceStatuses ) {
    if (serviceStatuses == null) {
      this.serviceStatuses = null;
      return;
    }
    ListWithAutoConstructFlag<ServiceStatus> serviceStatusesCopy = new ListWithAutoConstructFlag<>(serviceStatuses.size());
    serviceStatusesCopy.addAll(serviceStatuses);
    this.serviceStatuses = serviceStatusesCopy;
  }

  public DescribeServicesResult withServiceStatuses(ServiceStatus... serviceStatuses) {
    setServiceStatuses( Arrays.asList( serviceStatuses ) );
    return this;
  }

  public DescribeServicesResult withServiceStatuses(Collection<ServiceStatus> serviceStatuses) {
    setServiceStatuses( serviceStatuses );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getServiceStatuses() != null) sb.append("ServiceStatus: " + getServiceStatuses() );
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getServiceStatuses() == null) ? 0 : getServiceStatuses().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof DescribeServicesResult == false) return false;
    DescribeServicesResult other = (DescribeServicesResult)obj;

    if (other.getServiceStatuses() == null ^ this.getServiceStatuses() == null) return false;
    if (other.getServiceStatuses() != null && other.getServiceStatuses().equals(this.getServiceStatuses()) == false) return false;
    return true;
  }
}
