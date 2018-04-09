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

  private Boolean listAll;
  private ListWithAutoConstructFlag<String> serviceNames;
  private ListWithAutoConstructFlag<Filter> filters;

  public Boolean getListAll( ) {
    return listAll;
  }

  public void setListAll( final Boolean listAll ) {
    this.listAll = listAll;
  }

  public DescribeServicesRequest withListAll( final Boolean listAll ) {
    setListAll( listAll );
    return this;
  }

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
    ListWithAutoConstructFlag<String> serviceNamesCopy = new ListWithAutoConstructFlag<>( serviceNames.size());
    serviceNamesCopy.addAll( serviceNames );
    this.serviceNames = serviceNamesCopy;
  }

  public DescribeServicesRequest withServiceNames(String... serviceNames) {
    setServiceNames( Arrays.asList( serviceNames ) );
    return this;
  }

  public DescribeServicesRequest withServiceNames(Collection<String> serviceNames) {
    setServiceNames( serviceNames );
    return this;
  }

  public List<Filter> getFilters() {
    if ( filters == null) {
      filters = new ListWithAutoConstructFlag<>();
      filters.setAutoConstruct( true );
    }
    return filters;
  }

  /**
   * Set filters, supported from Eucalyptus 4.2
   */
  public void setFilters( final Collection<Filter> filters ) {
    if ( filters == null) {
      this.filters = null;
      return;
    }
    ListWithAutoConstructFlag<Filter> filtersCopy = new ListWithAutoConstructFlag<>( filters.size());
    filtersCopy.addAll( filters );
    this.filters = filtersCopy;
  }

  /**
   * Set filters, supported from Eucalyptus 4.2
   */
  public DescribeServicesRequest withFilters(Filter... filters) {
    setFilters( Arrays.asList( filters ) );
    return this;
  }

  /**
   * Set filters, supported from Eucalyptus 4.2
   */
  public DescribeServicesRequest withFilters(Collection<Filter> filters) {
    setFilters( filters );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if ( getListAll() != null) sb.append("ListAll: " + getListAll() + ",");
    if ( getServiceNames() != null) sb.append("ServiceNames: " + getServiceNames() + ",");
    if ( getFilters() != null) sb.append("Filters: " + getFilters() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + (( getListAll() == null) ? 0 : getListAll().hashCode());
    hashCode = prime * hashCode + (( getServiceNames() == null) ? 0 : getServiceNames().hashCode());
    hashCode = prime * hashCode + (( getFilters( ) == null) ? 0 : getFilters( ).hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof DescribeServicesRequest == false) return false;
    DescribeServicesRequest other = (DescribeServicesRequest)obj;

    if (other.getListAll() == null ^ this.getListAll() == null) return false;
    if (other.getListAll() != null && other.getListAll().equals(this.getListAll()) == false) return false;
    if (other.getServiceNames() == null ^ this.getServiceNames() == null) return false;
    if (other.getServiceNames() != null && other.getServiceNames().equals(this.getServiceNames()) == false) return false;
    if (other.getFilters( ) == null ^ this.getFilters( ) == null) return false;
    if (other.getFilters( ) != null && other.getFilters( ).equals(this.getFilters()) == false) return false;
    return true;
  }
}
