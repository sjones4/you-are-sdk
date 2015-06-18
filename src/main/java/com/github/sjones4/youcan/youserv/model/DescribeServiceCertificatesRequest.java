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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;

/**
 *
 */
public class DescribeServiceCertificatesRequest extends AmazonWebServiceRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  private String format;
  private String fingerprintDigest;
  private ListWithAutoConstructFlag<Filter> filters;

  public String getFormat() {
    return format;
  }

  public void setFormat( final String format ) {
    this.format = format;
  }

  public DescribeServiceCertificatesRequest withFormat( final String format ) {
    setFormat( format );
    return this;
  }

  public String getFingerprintDigest() {
    return fingerprintDigest;
  }

  public void setFingerprintDigest( final String fingerprintDigest ) {
    this.fingerprintDigest = fingerprintDigest;
  }

  public DescribeServiceCertificatesRequest withFingerprintDigest( final String fingerprintDigest ) {
    setFingerprintDigest( fingerprintDigest );
    return this;
  }

  public List<Filter> getFilters() {
    if ( filters == null) {
      filters = new ListWithAutoConstructFlag<>();
      filters.setAutoConstruct( true );
    }
    return filters;
  }

  public void setFilters( final Collection<Filter> filters ) {
    if ( filters == null) {
      this.filters = null;
      return;
    }
    ListWithAutoConstructFlag<Filter> filtersCopy = new ListWithAutoConstructFlag<>( filters.size());
    filtersCopy.addAll( filters );
    this.filters = filtersCopy;
  }

  public DescribeServiceCertificatesRequest withFilters(Filter... filters) {
    setFilters( Arrays.asList( filters ) );
    return this;
  }

  public DescribeServiceCertificatesRequest withFilters(Collection<Filter> filters) {
    setFilters( filters );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if ( getFormat() != null) sb.append("Format: " + getFormat() + ",");
    if ( getFormat( ) != null) sb.append("FingerprintDigest: " + getFingerprintDigest( ) + ",");
    if ( getFilters() != null) sb.append("Filters: " + getFilters() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + (( getFormat( ) == null) ? 0 : getFormat().hashCode());
    hashCode = prime * hashCode + (( getFingerprintDigest( ) == null) ? 0 : getFingerprintDigest( ).hashCode());
    hashCode = prime * hashCode + (( getFilters( ) == null) ? 0 : getFilters( ).hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof DescribeServiceCertificatesRequest == false) return false;
    DescribeServiceCertificatesRequest other = (DescribeServiceCertificatesRequest)obj;

    if (other.getFormat( ) == null ^ this.getFormat( ) == null) return false;
    if (other.getFormat() != null && other.getFormat( ).equals(this.getFormat( )) == false) return false;
    if (other.getFingerprintDigest( ) == null ^ this.getFingerprintDigest( ) == null) return false;
    if (other.getFingerprintDigest() != null && other.getFingerprintDigest( ).equals(this.getFingerprintDigest()) == false) return false;
    if (other.getFilters( ) == null ^ this.getFilters( ) == null) return false;
    if (other.getFilters( ) != null && other.getFilters( ).equals(this.getFilters()) == false) return false;
    return true;
  }
}
