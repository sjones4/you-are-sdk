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
package com.github.sjones4.youcan.youprop.model;

/**
 *
 */
public class ModifyPropertyValueResult {
  private String name;
  private String value;
  private String oldValue;

  public String getName() {
    return name;
  }

  public void setName( final String name ) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue( final String value ) {
    this.value = value;
  }

  public String getOldValue() {
    return oldValue;
  }

  public void setOldValue( final String oldValue ) {
    this.oldValue = oldValue;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getName() != null) sb.append("Name: " + getName() + ",");
    if (getValue() != null) sb.append("Value: " + getValue() + ",");
    if (getOldValue() != null) sb.append("OldValue: " + getOldValue());
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
    hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
    hashCode = prime * hashCode + ((getOldValue() == null) ? 0 : getOldValue().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof ModifyPropertyValueResult == false) return false;
    ModifyPropertyValueResult other = (ModifyPropertyValueResult)obj;

    if (other.getName() == null ^ this.getName() == null) return false;
    if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
    if (other.getValue() == null ^ this.getValue() == null) return false;
    if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false;
    if (other.getOldValue() == null ^ this.getOldValue() == null) return false;
    if (other.getOldValue() != null && other.getOldValue().equals(this.getOldValue()) == false) return false;
    return true;
  }
}
