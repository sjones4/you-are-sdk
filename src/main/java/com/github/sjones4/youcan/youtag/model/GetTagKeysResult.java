/*
 * Copyright 2016 Steve Jones. All Rights Reserved.
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
package com.github.sjones4.youcan.youtag.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import com.amazonaws.internal.ListWithAutoConstructFlag;

/**
 *
 */
public class GetTagKeysResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private ListWithAutoConstructFlag<String> tagKeys;

  public java.util.List<String> getTagKeys() {
    if ( tagKeys == null) {
      tagKeys = new ListWithAutoConstructFlag<>();
      tagKeys.setAutoConstruct(true);
    }
    return tagKeys;
  }

  public void setTagKeys( Collection<String> tagKeys ) {
    if ( tagKeys == null) {
      this.tagKeys = null;
      return;
    }
    ListWithAutoConstructFlag<String> tagKeysCopy = new ListWithAutoConstructFlag<String>(tagKeys.size());
    tagKeysCopy.addAll( tagKeys );
    this.tagKeys = tagKeysCopy;
  }

  public GetTagKeysResult withTagKeys( String... tagKeys) {
    setTagKeys( Arrays.asList( tagKeys ) );
    return this;
  }

  public GetTagKeysResult withTagKeys(Collection<String> tagKeys) {
    setTagKeys( tagKeys );
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if ( getTagKeys() != null) sb.append("TagKeys: " + getTagKeys() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + (( getTagKeys() == null) ? 0 : getTagKeys().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof GetTagKeysResult == false) return false;
    GetTagKeysResult other = (GetTagKeysResult)obj;

    if (other.getTagKeys() == null ^ this.getTagKeys() == null) return false;
    if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false) return false;
    return true;
  }
}
