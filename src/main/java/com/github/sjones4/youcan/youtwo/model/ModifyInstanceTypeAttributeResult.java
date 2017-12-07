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

/**
 *
 */
public class ModifyInstanceTypeAttributeResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private InstanceType instanceType;
  private InstanceType previousInstanceType;

  public InstanceType getInstanceType( ) {
    return instanceType;
  }

  public void setInstanceType( final InstanceType instanceType ) {
    this.instanceType = instanceType;
  }

  public ModifyInstanceTypeAttributeResult withInstanceType( final InstanceType instanceType ) {
    setInstanceType( instanceType );
    return this;
  }

  public InstanceType getPreviousInstanceType( ) {
    return previousInstanceType;
  }

  public void setPreviousInstanceType( final InstanceType previousInstanceType ) {
    this.previousInstanceType = previousInstanceType;
  }

  public ModifyInstanceTypeAttributeResult withPreviousInstanceType( final InstanceType previousInstanceType ) {
    setPreviousInstanceType( previousInstanceType );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType());
    if (getPreviousInstanceType() != null) sb.append("PreviousInstanceType: " + getPreviousInstanceType());
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
    hashCode = prime * hashCode + ((getPreviousInstanceType() == null) ? 0 : getPreviousInstanceType().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof ModifyInstanceTypeAttributeResult == false) return false;
    ModifyInstanceTypeAttributeResult other = (ModifyInstanceTypeAttributeResult)obj;

    if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
    if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false;
    if (other.getPreviousInstanceType() == null ^ this.getPreviousInstanceType() == null) return false;
    if (other.getPreviousInstanceType() != null && other.getPreviousInstanceType().equals(this.getPreviousInstanceType()) == false) return false;
    return true;
  }
}
