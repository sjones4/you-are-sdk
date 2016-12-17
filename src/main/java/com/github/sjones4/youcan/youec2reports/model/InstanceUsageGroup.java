package com.github.sjones4.youcan.youec2reports.model;

import com.github.sjones4.youcan.youbill.model.BillingSettings;

/*
 *
 */
public class InstanceUsageGroup {
  private String type;
  private String key;

  public void setType(final String type) {
    this.type = type;
  }

  public String getType() {
    return this.type;
  }

  public void setKey(final String key) {
    this.key = key;
  }

  public String getKey() {
    return this.key;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if ( this.getType() != null) sb.append("Type: " + this.getType() + ",");
    if ( getKey() != null) sb.append("Key: " + getKey() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + (( getType() == null) ? 0 : getType().hashCode());
    hashCode = prime * hashCode + (( getKey() == null) ? 0 : getKey().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof InstanceUsageGroup == false) return false;
    InstanceUsageGroup other = (InstanceUsageGroup)obj;

    if (this.type == null && other.type != null)
      return false;
    else if (this.type != null && !this.type.equals(other.type))
      return false;

    if (this.key == null && other.key != null)
      return false;
    else if (this.key != null && !this.key.equals(other.key))
      return false;
    return true;
  }
}
