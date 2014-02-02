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
public class InstanceTypeEphemeralDisk implements Serializable {
  private static final long serialVersionUID = 1L;

  private String virtualDeviceName;
  private String deviceName;
  private Integer size;
  private String format;

  public String getVirtualDeviceName() {
    return virtualDeviceName;
  }

  public void setVirtualDeviceName( final String virtualDeviceName ) {
    this.virtualDeviceName = virtualDeviceName;
  }

  public InstanceTypeEphemeralDisk withVirtualDeviceName( final String virtualDeviceName ) {
    setVirtualDeviceName( virtualDeviceName );
    return this;
  }

  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName( final String deviceName ) {
    this.deviceName = deviceName;
  }

  public InstanceTypeEphemeralDisk withDeviceName( final String deviceName ) {
    setDeviceName( deviceName );
    return this;
  }

  public Integer getSize() {
    return size;
  }

  public void setSize( final Integer size ) {
    this.size = size;
  }

  public InstanceTypeEphemeralDisk withSize( final Integer size ) {
    setSize( size );
    return this;
  }

  public String getFormat() {
    return format;
  }

  public void setFormat( final String format ) {
    this.format = format;
  }

  public InstanceTypeEphemeralDisk withFormat( final String format ) {
    setFormat( format );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getVirtualDeviceName() != null) sb.append("VirtualDeviceName: " + getVirtualDeviceName() + ",");
    if (getDeviceName() != null) sb.append("DeviceName: " + getDeviceName() + ",");
    if (getSize() != null) sb.append("Size: " + getSize() + ",");
    if (getFormat() != null) sb.append("Format: " + getFormat());
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getVirtualDeviceName() == null) ? 0 : getVirtualDeviceName().hashCode());
    hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
    hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
    hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof InstanceTypeEphemeralDisk == false) return false;
    InstanceTypeEphemeralDisk other = (InstanceTypeEphemeralDisk)obj;

    if (other.getVirtualDeviceName() == null ^ this.getVirtualDeviceName() == null) return false;
    if (other.getVirtualDeviceName() != null && other.getVirtualDeviceName().equals(this.getVirtualDeviceName()) == false) return false;
    if (other.getDeviceName() == null ^ this.getDeviceName() == null) return false;
    if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false) return false;
    if (other.getSize() == null ^ this.getSize() == null) return false;
    if (other.getSize() != null && other.getSize().equals(this.getSize()) == false) return false;
    if (other.getFormat() == null ^ this.getFormat() == null) return false;
    if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false;
    return true;
  }
}
