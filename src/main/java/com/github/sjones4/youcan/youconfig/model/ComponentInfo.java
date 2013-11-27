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

/**
 *
 */
public class ComponentInfo {
  private String type;
  private String partition;
  private String name;
  private String hostName;
  private String fullName;
  private String state;
  private String detail;

  public String getType() {
    return type;
  }

  public void setType( final String type ) {
    this.type = type;
  }

  public String getPartition() {
    return partition;
  }

  public void setPartition( final String partition ) {
    this.partition = partition;
  }

  public String getName() {
    return name;
  }

  public void setName( final String name ) {
    this.name = name;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName( final String hostName ) {
    this.hostName = hostName;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName( final String fullName ) {
    this.fullName = fullName;
  }

  public String getState() {
    return state;
  }

  public void setState( final String state ) {
    this.state = state;
  }

  public String getDetail() {
    return detail;
  }

  public void setDetail( final String detail ) {
    this.detail = detail;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getType() != null) sb.append("Type: " + getType() + ",");
    if (getPartition() != null) sb.append("Partition: " + getPartition() + ",");
    if (getName() != null) sb.append("Name: " + getName() + ",");
    if (getHostName() != null) sb.append("HostName: " + getHostName() + ",");
    if (getFullName() != null) sb.append("FullName: " + getFullName() + ",");
    if (getState() != null) sb.append("State: " + getState() + ",");
    if (getDetail() != null) sb.append("Detail: " + getDetail() );
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
    hashCode = prime * hashCode + ((getPartition() == null) ? 0 : getPartition().hashCode());
    hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
    hashCode = prime * hashCode + ((getHostName() == null) ? 0 : getHostName().hashCode());
    hashCode = prime * hashCode + ((getFullName() == null) ? 0 : getFullName().hashCode());
    hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
    hashCode = prime * hashCode + ((getDetail() == null) ? 0 : getDetail().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof ComponentInfo == false) return false;
    ComponentInfo other = (ComponentInfo)obj;

    if (other.getType() == null ^ this.getType() == null) return false;
    if (other.getType() != null && other.getType().equals(this.getType()) == false) return false;
    if (other.getPartition() == null ^ this.getPartition() == null) return false;
    if (other.getPartition() != null && other.getPartition().equals(this.getPartition()) == false) return false;
    if (other.getName() == null ^ this.getName() == null) return false;
    if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
    if (other.getHostName() == null ^ this.getHostName() == null) return false;
    if (other.getHostName() != null && other.getHostName().equals(this.getHostName()) == false) return false;
    if (other.getFullName() == null ^ this.getFullName() == null) return false;
    if (other.getFullName() != null && other.getFullName().equals(this.getFullName()) == false) return false;
    if (other.getState() == null ^ this.getState() == null) return false;
    if (other.getState() != null && other.getState().equals(this.getState()) == false) return false;
    if (other.getDetail() == null ^ this.getDetail() == null) return false;
    if (other.getDetail() != null && other.getDetail().equals(this.getDetail()) == false) return false;
    return true;
  }
}
