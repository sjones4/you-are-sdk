/*
 * Copyright 2017 Steve Jones. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 *
 */
public class ModifyInstanceTypeAttributeRequest extends AmazonWebServiceRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  private String name;
  private Integer cpu;
  private Integer disk;
  private Integer memory;

  public String getName( ) {
    return name;
  }

  public void setName( final String name ) {
    this.name = name;
  }

  public ModifyInstanceTypeAttributeRequest withName( final String name ) {
    setName( name );
    return this;
  }

  public Integer getCpu( ) {
    return cpu;
  }

  public void setCpu( final Integer cpu ) {
    this.cpu = cpu;
  }

  public ModifyInstanceTypeAttributeRequest withCpu( final Integer cpu ) {
    setCpu( cpu );
    return this;
  }

  public Integer getDisk( ) {
    return disk;
  }

  public void setDisk( final Integer disk ) {
    this.disk = disk;
  }

  public ModifyInstanceTypeAttributeRequest withDisk( final Integer disk ) {
    setDisk( disk );
    return this;
  }

  public Integer getMemory( ) {
    return memory;
  }

  public void setMemory( final Integer memory ) {
    this.memory = memory;
  }

  public ModifyInstanceTypeAttributeRequest withMemory( final Integer memory ) {
    setMemory( memory );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getName() != null) sb.append("Name: " + getName() + ",");
    if (getCpu() != null) sb.append("Cpu: " + getCpu() + ",");
    if (getDisk() != null) sb.append("Disk: " + getDisk() + ",");
    if (getMemory() != null) sb.append("Memory: " + getMemory() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
    hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
    hashCode = prime * hashCode + ((getDisk() == null) ? 0 : getDisk().hashCode());
    hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof ModifyInstanceTypeAttributeRequest == false) return false;
    ModifyInstanceTypeAttributeRequest other = (ModifyInstanceTypeAttributeRequest)obj;

    if (other.getName() == null ^ this.getName() == null) return false;
    if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
    if (other.getCpu() == null ^ this.getCpu() == null) return false;
    if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false) return false;
    if (other.getDisk() == null ^ this.getDisk() == null) return false;
    if (other.getDisk() != null && other.getDisk().equals(this.getDisk()) == false) return false;
    if (other.getMemory() == null ^ this.getMemory() == null) return false;
    if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false) return false;
    return true;
  }
}
