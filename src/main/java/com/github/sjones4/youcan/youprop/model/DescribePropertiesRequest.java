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
package com.github.sjones4.youcan.youprop.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;

/**
 *
 */
public class DescribePropertiesRequest extends AmazonWebServiceRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  private ListWithAutoConstructFlag<String> properties;

  public List<String> getProperties() {
    if (properties == null) {
      properties = new ListWithAutoConstructFlag<>();
      properties.setAutoConstruct(true);
    }
    return properties;
  }

  public void setProperties( final Collection<String> properties ) {
    if (properties == null) {
      this.properties = null;
      return;
    }
    ListWithAutoConstructFlag<String> propertiesCopy = new ListWithAutoConstructFlag<>(properties.size());
    propertiesCopy.addAll(properties);
    this.properties = propertiesCopy;
  }

  public DescribePropertiesRequest withProperties(String... properties) {
    setProperties( Arrays.asList( properties ) );
    return this;
  }

  public DescribePropertiesRequest withProperties(Collection<String> properties) {
    setProperties( properties );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getProperties() != null) sb.append("Properties: " + getProperties() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof DescribePropertiesRequest == false) return false;
    DescribePropertiesRequest other = (DescribePropertiesRequest)obj;

    if (other.getProperties() == null ^ this.getProperties() == null) return false;
    if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false) return false;
    return true;
  }

}
