package com.github.sjones4.youcan.youec2reports.model;


import java.io.Serializable;

public class InstanceUsageFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  private String type;
  private String key;
  private String value;


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

  public void setValue(final String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (this.getType() != null) sb.append("Type: " + this.getType() + ",");
    if (getKey() != null) sb.append("Key: " + getKey() + ",");
    if (getValue() != null) sb.append("Value: " + getValue() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
    hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
    hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof InstanceUsageFilter == false) return false;
    InstanceUsageFilter other = (InstanceUsageFilter) obj;

    if (this.type == null && other.type != null)
      return false;
    else if (this.type != null && !this.type.equals(other.type))
      return false;

    if (this.key == null && other.key != null)
      return false;
    else if (this.key != null && !this.key.equals(other.key))
      return false;

    if (this.value == null && other.value != null)
      return false;
    else if (this.value != null && !this.value.equals(other.value))
      return false;

    return true;
  }
}
