/*************************************************************************
 * Copyright 2009-2014 Eucalyptus Systems, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Please contact Eucalyptus Systems, Inc., 6755 Hollister Ave., Goleta
 * CA 93117, USA or visit http://www.eucalyptus.com/licenses/ if you need
 * additional information or have any questions.
 ************************************************************************/
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
