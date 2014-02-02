/*
 * Copyright 2014 Steve Jones. All Rights Reserved.
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
package com.github.sjones4.youcan.youtwo.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;

/**
 *
 */
public class DescribeInstanceTypesRequest extends AmazonWebServiceRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  private Boolean verbose;
  private Boolean availability;
  private ListWithAutoConstructFlag<String> instanceTypes;

  public Boolean getVerbose() {
    return verbose;
  }

  public void setVerbose( final Boolean verbose ) {
    this.verbose = verbose;
  }

  public DescribeInstanceTypesRequest withVerbose( final Boolean verbose ) {
    setVerbose( verbose );
    return this;
  }

  public Boolean getAvailability() {
    return availability;
  }

  public void setAvailability( final Boolean availability ) {
    this.availability = availability;
  }

  public DescribeInstanceTypesRequest withAvailability( final Boolean availability ) {
    setAvailability( availability );
    return this;
  }

  public List<String> getInstanceTypes() {
    if (instanceTypes == null) {
      instanceTypes = new ListWithAutoConstructFlag<String>();
      instanceTypes.setAutoConstruct(true);
    }
    return instanceTypes;
  }

  public void setInstanceTypes( Collection<String> instanceTypes ) {
    if (instanceTypes == null) {
      this.instanceTypes = null;
      return;
    }
    ListWithAutoConstructFlag<String> instanceTypesCopy = new ListWithAutoConstructFlag<>(instanceTypes.size());
    instanceTypesCopy.addAll(instanceTypes);
    this.instanceTypes = instanceTypesCopy;
  }

  public DescribeInstanceTypesRequest withInstanceTypes(String... instanceTypes) {
    return withInstanceTypes( Arrays.asList( instanceTypes ) );
  }

  public DescribeInstanceTypesRequest withInstanceTypes( Collection<String> instanceTypes ) {
    if (instanceTypes == null) {
      this.instanceTypes = null;
    } else {
      ListWithAutoConstructFlag<String> instanceTypesCopy = new ListWithAutoConstructFlag<>(instanceTypes.size());
      instanceTypesCopy.addAll(instanceTypes);
      this.instanceTypes = instanceTypesCopy;
    }

    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getVerbose() != null) sb.append("Verbose: " + getVerbose() + ",");
    if (getAvailability() != null) sb.append("Availability: " + getAvailability() + ",");
    if (getInstanceTypes() != null) sb.append("InstanceTypes: " + getInstanceTypes());
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getVerbose() == null) ? 0 : getVerbose().hashCode());
    hashCode = prime * hashCode + ((getAvailability() == null) ? 0 : getAvailability().hashCode());
    hashCode = prime * hashCode + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof DescribeInstanceTypesRequest == false) return false;
    DescribeInstanceTypesRequest other = (DescribeInstanceTypesRequest)obj;

    if (other.getVerbose() == null ^ this.getVerbose() == null) return false;
    if (other.getVerbose() != null && other.getVerbose().equals(this.getVerbose()) == false) return false;
    if (other.getAvailability() == null ^ this.getAvailability() == null) return false;
    if (other.getAvailability() != null && other.getAvailability().equals(this.getAvailability()) == false) return false;
    if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null) return false;
    if (other.getInstanceTypes() != null && other.getInstanceTypes().equals(this.getInstanceTypes()) == false) return false;
    return true;
  }
}
