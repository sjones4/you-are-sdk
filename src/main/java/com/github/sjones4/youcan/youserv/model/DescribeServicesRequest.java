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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;

/**
 *
 */
public class DescribeServicesRequest extends AmazonWebServiceRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  private ListWithAutoConstructFlag<String> serviceNames;

  public List<String> getServiceNames() {
    if ( serviceNames == null) {
      serviceNames = new ListWithAutoConstructFlag<>();
      serviceNames.setAutoConstruct( true );
    }
    return serviceNames;
  }

  public void setServiceNames( final Collection<String> serviceNames ) {
    if ( serviceNames == null) {
      this.serviceNames = null;
      return;
    }
    ListWithAutoConstructFlag<String> propertiesCopy = new ListWithAutoConstructFlag<>( serviceNames.size());
    propertiesCopy.addAll( serviceNames );
    this.serviceNames = propertiesCopy;
  }

  public DescribeServicesRequest withServiceNames(String... serviceNames) {
    setServiceNames( Arrays.asList( serviceNames ) );
    return this;
  }

  public DescribeServicesRequest withServiceNames(Collection<String> serviceNames) {
    setServiceNames( serviceNames );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if ( getServiceNames() != null) sb.append("ServiceNames: " + getServiceNames() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + (( getServiceNames() == null) ? 0 : getServiceNames().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof DescribeServicesRequest == false) return false;
    DescribeServicesRequest other = (DescribeServicesRequest)obj;

    if (other.getServiceNames() == null ^ this.getServiceNames() == null) return false;
    if (other.getServiceNames() != null && other.getServiceNames().equals(this.getServiceNames()) == false) return false;
    return true;
  }
}
