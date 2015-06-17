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
package com.github.sjones4.youcan.youprop.model;

import java.io.Serializable;

/**
 *
 */
public class Property implements Serializable {
  private static final long serialVersionUID = 1L;

  private String name;
  private String value;
  private String description;
  private String defaultValue;
  private Boolean readOnly;

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

  public String getDescription() {
    return description;
  }

  public void setDescription( final String description ) {
    this.description = description;
  }

  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue( final String defaultValue ) {
    this.defaultValue = defaultValue;
  }

  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly( final Boolean readOnly ) {
    this.readOnly = readOnly;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getName() != null) sb.append("Name: " + getName() + ",");
    if (getValue() != null) sb.append("Value: " + getValue() + ",");
    if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
    if (getDefaultValue( ) != null) sb.append("DefaultValue: " + getDefaultValue( ) + ",");
    if (getReadOnly( ) != null) sb.append("ReadOnly: " + getReadOnly( ) + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
    hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
    hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
    hashCode = prime * hashCode + ((getDefaultValue( ) == null) ? 0 : getDefaultValue( ).hashCode());
    hashCode = prime * hashCode + ((getReadOnly( ) == null) ? 0 : getReadOnly( ).hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof Property == false) return false;
    Property other = (Property)obj;

    if (other.getName() == null ^ this.getName() == null) return false;
    if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
    if (other.getValue() == null ^ this.getValue() == null) return false;
    if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false;
    if (other.getDescription() == null ^ this.getDescription() == null) return false;
    if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false;
    if (other.getDefaultValue( ) == null ^ this.getDefaultValue( ) == null) return false;
    if (other.getDefaultValue() != null && other.getDefaultValue( ).equals(this.getDefaultValue( )) == false) return false;
    if (other.getReadOnly( ) == null ^ this.getReadOnly( ) == null) return false;
    if (other.getReadOnly( ) != null && other.getReadOnly( ).equals(this.getReadOnly()) == false) return false;
    return true;
  }
}
