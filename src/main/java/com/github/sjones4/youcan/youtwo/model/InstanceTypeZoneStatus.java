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

/**
 *
 */
public class InstanceTypeZoneStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  private String name;
  private String zoneName;
  private Integer max;
  private Integer available;

  public String getName() {
    return name;
  }

  public void setName( final String name ) {
    this.name = name;
  }

  public InstanceTypeZoneStatus withName( final String name ) {
    setName( name );
    return this;
  }

  public String getZoneName() {
    return zoneName;
  }

  public void setZoneName( final String zoneName ) {
    this.zoneName = zoneName;
  }

  public InstanceTypeZoneStatus withZoneName( final String zoneName ) {
    setZoneName( zoneName );
    return this;
  }

  public Integer getMax() {
    return max;
  }

  public void setMax( final Integer max ) {
    this.max = max;
  }

  public InstanceTypeZoneStatus withMax( final Integer max ) {
    setMax( max );
    return this;
  }

  public Integer getAvailable() {
    return available;
  }

  public void setAvailable( final Integer available ) {
    this.available = available;
  }

  public InstanceTypeZoneStatus withAvailable( final Integer available ) {
    setAvailable( available );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getName() != null) sb.append("Name: " + getName() + ",");
    if (getZoneName() != null) sb.append("ZoneName: " + getZoneName() + ",");
    if (getMax() != null) sb.append("Max: " + getMax() + ",");
    if (getAvailable() != null) sb.append("Available: " + getAvailable());
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
    hashCode = prime * hashCode + ((getZoneName() == null) ? 0 : getZoneName().hashCode());
    hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
    hashCode = prime * hashCode + ((getAvailable() == null) ? 0 : getAvailable().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof InstanceTypeZoneStatus == false) return false;
    InstanceTypeZoneStatus other = (InstanceTypeZoneStatus)obj;

    if (other.getName() == null ^ this.getName() == null) return false;
    if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
    if (other.getZoneName() == null ^ this.getZoneName() == null) return false;
    if (other.getZoneName() != null && other.getZoneName().equals(this.getZoneName()) == false) return false;
    if (other.getMax() == null ^ this.getMax() == null) return false;
    if (other.getMax() != null && other.getMax().equals(this.getMax()) == false) return false;
    if (other.getAvailable() == null ^ this.getAvailable() == null) return false;
    if (other.getAvailable() != null && other.getAvailable().equals(this.getAvailable()) == false) return false;
    return true;
  }
}
