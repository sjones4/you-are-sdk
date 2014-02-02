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
import com.amazonaws.internal.ListWithAutoConstructFlag;

/**
 *
 */
public class DescribeInstanceTypesResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private ListWithAutoConstructFlag<InstanceType> instanceTypes;

  public List<InstanceType> getInstanceTypes() {
    if (instanceTypes == null) {
      instanceTypes = new com.amazonaws.internal.ListWithAutoConstructFlag<>();
      instanceTypes.setAutoConstruct(true);
    }
    return instanceTypes;
  }

  public void setInstanceTypes( Collection<InstanceType> instanceTypes ) {
    if (instanceTypes == null) {
      this.instanceTypes = null;
      return;
    }
    ListWithAutoConstructFlag<InstanceType> instanceTypesCopy = new ListWithAutoConstructFlag<>(instanceTypes.size());
    instanceTypesCopy.addAll(instanceTypes);
    this.instanceTypes = instanceTypesCopy;
  }

  public DescribeInstanceTypesResult withInstanceTypes(InstanceType... instanceTypes) {
    return withInstanceTypes( Arrays.asList( instanceTypes ) );
  }

  public DescribeInstanceTypesResult withInstanceTypes( Collection<InstanceType> instanceTypes ) {
    if (instanceTypes == null) {
      this.instanceTypes = null;
    } else {
      ListWithAutoConstructFlag<InstanceType> instanceTypesCopy = new ListWithAutoConstructFlag<>(instanceTypes.size());
      instanceTypesCopy.addAll(instanceTypes);
      this.instanceTypes = instanceTypesCopy;
    }

    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getInstanceTypes() != null) sb.append("InstanceTypes: " + getInstanceTypes());
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof DescribeInstanceTypesResult == false) return false;
    DescribeInstanceTypesResult other = (DescribeInstanceTypesResult)obj;

    if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null) return false;
    if (other.getInstanceTypes() != null && other.getInstanceTypes().equals(this.getInstanceTypes()) == false) return false;
    return true;
  }
}
