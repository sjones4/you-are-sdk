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
public class InstanceType implements Serializable {
  private static final long serialVersionUID = 1L;

  private String name;
  private Integer cpu;
  private Integer disk;
  private Integer memory;
  private ListWithAutoConstructFlag<InstanceTypeZoneStatus> availability;
  private ListWithAutoConstructFlag<InstanceTypeEphemeralDisk> ephemeralDisk;

  public String getName() {
    return name;
  }

  public void setName( final String name ) {
    this.name = name;
  }

  public InstanceType withName( final String name ) {
    setName( name );
    return this;
  }

  public Integer getCpu() {
    return cpu;
  }

  public void setCpu( final Integer cpu ) {
    this.cpu = cpu;
  }

  public InstanceType withCpu( final Integer cpu ) {
    setCpu( cpu );
    return this;
  }

  public Integer getDisk() {
    return disk;
  }

  public void setDisk( final Integer disk ) {
    this.disk = disk;
  }

  public InstanceType withDisk( final Integer disk ) {
    setDisk( disk );
    return this;
  }

  public Integer getMemory() {
    return memory;
  }

  public void setMemory( final Integer memory ) {
    this.memory = memory;
  }

  public InstanceType withMemory( final Integer memory ) {
    setMemory( memory );
    return this;
  }

  public List<InstanceTypeZoneStatus> getAvailability() {
    if (availability == null) {
      availability = new ListWithAutoConstructFlag<>();
      availability.setAutoConstruct(true);
    }
    return availability;
  }

  public void setAvailability( Collection<InstanceTypeZoneStatus> availability) {
    if (availability == null) {
      this.availability = null;
      return;
    }
    ListWithAutoConstructFlag<InstanceTypeZoneStatus> availabilityCopy = new ListWithAutoConstructFlag<>(availability.size());
    availabilityCopy.addAll(availability);
    this.availability = availabilityCopy;
  }

  public InstanceType withAvailability(InstanceTypeZoneStatus... availability) {
    return withAvailability( Arrays.asList( availability ) );
  }

  public InstanceType withAvailability( Collection<InstanceTypeZoneStatus> availability ) {
    if (availability == null) {
      this.availability = null;
    } else {
      ListWithAutoConstructFlag<InstanceTypeZoneStatus> availabilityCopy = new ListWithAutoConstructFlag<>(availability.size());
      availabilityCopy.addAll(availability);
      this.availability = availabilityCopy;
    }

    return this;
  }

  public List<InstanceTypeEphemeralDisk> getEphemeralDisk() {
    if (ephemeralDisk == null) {
      ephemeralDisk = new ListWithAutoConstructFlag<>();
      ephemeralDisk.setAutoConstruct(true);
    }
    return ephemeralDisk;
  }

  public void setEphemeralDisk( Collection<InstanceTypeEphemeralDisk> ephemeralDisk) {
    if (ephemeralDisk == null) {
      this.ephemeralDisk = null;
      return;
    }
    ListWithAutoConstructFlag<InstanceTypeEphemeralDisk> ephemeralDiskCopy = new ListWithAutoConstructFlag<>(ephemeralDisk.size());
    ephemeralDiskCopy.addAll(ephemeralDisk);
    this.ephemeralDisk = ephemeralDiskCopy;
  }

  public InstanceType withEphemeralDisk(InstanceTypeEphemeralDisk... ephemeralDisk) {
    return withEphemeralDisk( Arrays.asList( ephemeralDisk ) );
  }

  public InstanceType withEphemeralDisk( Collection<InstanceTypeEphemeralDisk> ephemeralDisk ) {
    if (ephemeralDisk == null) {
      this.ephemeralDisk = null;
    } else {
      ListWithAutoConstructFlag<InstanceTypeEphemeralDisk> ephemeralDiskCopy = new ListWithAutoConstructFlag<>(ephemeralDisk.size());
      ephemeralDiskCopy.addAll(ephemeralDisk);
      this.ephemeralDisk = ephemeralDiskCopy;
    }

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
    if (getAvailability() != null) sb.append("Availability: " + getAvailability() + ",");
    if (getEphemeralDisk() != null) sb.append("EphemeralDisk: " + getEphemeralDisk());
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
    hashCode = prime * hashCode + ((getAvailability() == null) ? 0 : getAvailability().hashCode());
    hashCode = prime * hashCode + ((getEphemeralDisk() == null) ? 0 : getEphemeralDisk().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof InstanceType == false) return false;
    InstanceType other = (InstanceType)obj;

    if (other.getName() == null ^ this.getName() == null) return false;
    if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
    if (other.getCpu() == null ^ this.getCpu() == null) return false;
    if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false) return false;
    if (other.getDisk() == null ^ this.getDisk() == null) return false;
    if (other.getDisk() != null && other.getDisk().equals(this.getDisk()) == false) return false;
    if (other.getMemory() == null ^ this.getMemory() == null) return false;
    if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false) return false;
    if (other.getAvailability() == null ^ this.getAvailability() == null) return false;
    if (other.getAvailability() != null && other.getAvailability().equals(this.getAvailability()) == false) return false;
    if (other.getEphemeralDisk() == null ^ this.getEphemeralDisk() == null) return false;
    if (other.getEphemeralDisk() != null && other.getEphemeralDisk().equals(this.getEphemeralDisk()) == false) return false;
    return true;
  }
}
