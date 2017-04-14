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
package com.github.sjones4.youcan.youec2reports.model;

import com.amazonaws.internal.ListWithAutoConstructFlag;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/*
 *
 */
public class InstanceUsageFilters implements Serializable {
  private static final long serialVersionUID = 1L;

  private ListWithAutoConstructFlag<InstanceUsageFilter> member;

  private void setMember(final Collection<InstanceUsageFilter> member) {
    if (member == null) {
      this.member = null;
      return;
    }

    this.member = new ListWithAutoConstructFlag<InstanceUsageFilter>(member.size());
    this.member.addAll(member);
  }

  public List<InstanceUsageFilter> getMember() {
    if (this.member == null) {
      this.member = new ListWithAutoConstructFlag<InstanceUsageFilter>();
      this.member.setAutoConstruct(true);
    }
    return this.member;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getMember() != null) sb.append("Filters: " + getMember() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getMember() == null) ? 0 : getMember().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof InstanceUsageFilters == false) return false;
    InstanceUsageFilters other = (InstanceUsageFilters) obj;

    if (this.member == null && other.member != null)
      return false;
    else if (this.member != null && !this.member.equals(other.member))
      return false;
    return true;
  }
}
