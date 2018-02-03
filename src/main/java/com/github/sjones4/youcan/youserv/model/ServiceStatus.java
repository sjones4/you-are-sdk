/*
 * Copyright 2018 Steve Jones. All Rights Reserved.
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
import java.util.Collection;
import java.util.List;
import com.amazonaws.internal.ListWithAutoConstructFlag;

/**
 *
 */
public class ServiceStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  private ServiceId serviceId;
  private String localState;
  private Integer localEpoch;
  private ListWithAutoConstructFlag<ServiceAccount> serviceAccounts;

  public ServiceId getServiceId() {
    return serviceId;
  }

  public void setServiceId( final ServiceId serviceId ) {
    this.serviceId = serviceId;
  }

  public String getLocalState() {
    return localState;
  }

  public void setLocalState( final String localState ) {
    this.localState = localState;
  }

  public Integer getLocalEpoch() {
    return localEpoch;
  }

  public void setLocalEpoch( final Integer localEpoch ) {
    this.localEpoch = localEpoch;
  }

  public List<ServiceAccount> getServiceAccounts() {
    if (serviceAccounts == null) {
      serviceAccounts = new ListWithAutoConstructFlag<>();
      serviceAccounts.setAutoConstruct(true);
    }
    return serviceAccounts;
  }

  public void setServiceAccounts( Collection<ServiceAccount> serviceAccounts ) {
    if (serviceAccounts == null) {
      this.serviceAccounts = null;
      return;
    }
    ListWithAutoConstructFlag<ServiceAccount> serviceAccountsCopy = new ListWithAutoConstructFlag<>(serviceAccounts.size());
    serviceAccountsCopy.addAll(serviceAccounts);
    this.serviceAccounts = serviceAccountsCopy;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getServiceId() != null) sb.append("ServiceId: " + getServiceId() + ",");
    if (getLocalState() != null) sb.append("LocalState: " + getLocalState() + ",");
    if (getLocalEpoch() != null) sb.append("LocalEpoch: " + getLocalEpoch() + ",");
    if (getServiceAccounts() != null) sb.append("ServiceAccounts: " + getServiceAccounts() );
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
    hashCode = prime * hashCode + ((getLocalState() == null) ? 0 : getLocalState().hashCode());
    hashCode = prime * hashCode + ((getLocalEpoch() == null) ? 0 : getLocalEpoch().hashCode());
    hashCode = prime * hashCode + ((getServiceAccounts() == null) ? 0 : getServiceAccounts().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof ServiceStatus == false) return false;
    ServiceStatus other = (ServiceStatus)obj;

    if (other.getServiceId() == null ^ this.getServiceId() == null) return false;
    if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false) return false;
    if (other.getLocalState() == null ^ this.getLocalState() == null) return false;
    if (other.getLocalState() != null && other.getLocalState().equals(this.getLocalState()) == false) return false;
    if (other.getLocalEpoch() == null ^ this.getLocalEpoch() == null) return false;
    if (other.getLocalEpoch() != null && other.getLocalEpoch().equals(this.getLocalEpoch()) == false) return false;
    if (other.getServiceAccounts() == null ^ this.getServiceAccounts() == null) return false;
    if (other.getServiceAccounts() != null && other.getServiceAccounts().equals(this.getServiceAccounts()) == false) return false;
    return true;
  }
}
