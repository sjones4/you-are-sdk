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
package com.github.sjones4.youcan.youconfig.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import com.amazonaws.internal.ListWithAutoConstructFlag;

/**
 *
 */
public class DescribeComponentsResult  implements Serializable {
  private static final long serialVersionUID = 1L;

  private ListWithAutoConstructFlag<ComponentInfo> componentInfos;

  public List<ComponentInfo> getComponentInfos() {
    if (componentInfos == null) {
      componentInfos = new ListWithAutoConstructFlag<>();
      componentInfos.setAutoConstruct(true);
    }
    return componentInfos;
  }

  public void setComponentInfos( Collection<ComponentInfo> componentInfos ) {
    if (componentInfos == null) {
      this.componentInfos = null;
      return;
    }
    ListWithAutoConstructFlag<ComponentInfo> componentInfosCopy = new ListWithAutoConstructFlag<>(componentInfos.size());
    componentInfosCopy.addAll(componentInfos);
    this.componentInfos = componentInfosCopy;
  }

  public DescribeComponentsResult withProperties(ComponentInfo... componentInfos) {
    setComponentInfos( Arrays.asList( componentInfos ) );
    return this;
  }

  public DescribeComponentsResult withAddresses(Collection<ComponentInfo> setComponentInfos) {
    setComponentInfos( setComponentInfos );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if ( getComponentInfos() != null) sb.append("ComponentInfos: " + getComponentInfos() );
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + (( getComponentInfos() == null) ? 0 : getComponentInfos().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof DescribeComponentsResult == false) return false;
    DescribeComponentsResult other = (DescribeComponentsResult)obj;

    if (other.getComponentInfos() == null ^ this.getComponentInfos() == null) return false;
    if (other.getComponentInfos() != null && other.getComponentInfos().equals(this.getComponentInfos()) == false) return false;
    return true;
  }
}
