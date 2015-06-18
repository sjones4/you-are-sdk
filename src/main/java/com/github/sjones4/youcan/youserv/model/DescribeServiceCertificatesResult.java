/*
 * Copyright 2015 Steve Jones. All Rights Reserved.
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
public class DescribeServiceCertificatesResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private ListWithAutoConstructFlag<ServiceCertificate> serviceCertificates;

  public List<ServiceCertificate> getServiceCertificates() {
    if (serviceCertificates == null) {
      serviceCertificates = new ListWithAutoConstructFlag<>();
      serviceCertificates.setAutoConstruct(true);
    }
    return serviceCertificates;
  }

  public void setServiceCertificates( Collection<ServiceCertificate> serviceCertificates ) {
    if (serviceCertificates == null) {
      this.serviceCertificates = null;
      return;
    }
    ListWithAutoConstructFlag<ServiceCertificate> serviceCertificatesCopy = new ListWithAutoConstructFlag<>(serviceCertificates.size());
    serviceCertificatesCopy.addAll(serviceCertificates);
    this.serviceCertificates = serviceCertificatesCopy;
  }

  public DescribeServiceCertificatesResult withServiceCertificates(ServiceCertificate... serviceStatuses) {
    setServiceCertificates( Arrays.asList( serviceStatuses ) );
    return this;
  }

  public DescribeServiceCertificatesResult withServiceCertificates(Collection<ServiceCertificate> serviceStatuses) {
    setServiceCertificates( serviceStatuses );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getServiceCertificates( ) != null) sb.append("ServiceCertificates: " + getServiceCertificates() );
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getServiceCertificates( ) == null) ? 0 : getServiceCertificates( ).hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof DescribeServiceCertificatesResult == false) return false;
    DescribeServiceCertificatesResult other = (DescribeServiceCertificatesResult)obj;

    if (other.getServiceCertificates( ) == null ^ this.getServiceCertificates() == null) return false;
    if (other.getServiceCertificates() != null && other.getServiceCertificates().equals(this.getServiceCertificates()) == false) return false;
    return true;
  }
}
