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

import com.amazonaws.AmazonWebServiceRequest;

import java.io.Serializable;
import java.util.Date;

/*
 *
 */
public class ViewInstanceUsageReportRequest  extends AmazonWebServiceRequest implements Serializable {
  private static final long serialVersionUID = 1L;
  private String granularity;
  private InstanceUsageFilters filters;
  private Date timeRangeStart;
  private Date timeRangeEnd;
  private InstanceUsageGroup groupBy;


  public String getGranularity() {
    return this.granularity;
  }

  public void setGranularity(final String granularity) {
    this.granularity = granularity;
  }

  public InstanceUsageFilters getFilters() {
    return this.filters;
  }

  public void setFilters(final InstanceUsageFilters filters) {
    this.filters = filters;
  }

  public Date getTimeRangeStart() {
    return this.timeRangeStart;
  }

  public void setTimeRangeStart(final Date timeRangeStart) {
    this.timeRangeStart = timeRangeStart;
  }

  public Date getTimeRangeEnd() {
    return this.timeRangeEnd;
  }

  public void setTimeRangeEnd(final Date timeRangeEnd) {
    this.timeRangeEnd = timeRangeEnd;
  }

  public InstanceUsageGroup getGroupBy() {
    return this.groupBy;
  }

  public void setGroupBy(final InstanceUsageGroup groupBy) {
    this.groupBy = groupBy;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getGranularity() != null) sb.append("Granularity: " + getGranularity() + ",");
    if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
    if (getTimeRangeStart() != null) sb.append("TimeRangeStart: " + getTimeRangeStart() + ",");
    if (getTimeRangeEnd() != null) sb.append("TimeRangeEnd: " + getTimeRangeEnd() + ",");
    if (getGroupBy() != null) sb.append("GroupBy: " + getGroupBy() + ",");
    // no request parameter
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;
    hashCode = prime * hashCode + (( getGranularity() == null) ? 0 : getGranularity().hashCode());
    hashCode = prime * hashCode + (( getFilters() == null) ? 0 : getFilters().hashCode());
    hashCode = prime * hashCode + (( getTimeRangeStart() == null) ? 0 : getTimeRangeStart().hashCode());
    hashCode = prime * hashCode + (( getTimeRangeEnd() == null) ? 0 : getTimeRangeEnd().hashCode());
    hashCode = prime * hashCode + (( getGroupBy() == null) ? 0 : getGroupBy().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof ViewInstanceUsageReportRequest == false) return false;
    final ViewInstanceUsageReportRequest other = (ViewInstanceUsageReportRequest)obj;

    if (this.granularity == null && other.granularity != null)
      return false;
    else if (this.granularity != null && !this.granularity.equals(other.granularity))
      return false;

    if (this.filters == null && other.filters != null)
      return false;
    else if (this.filters != null && !this.filters.equals(other.filters))
      return false;

    if (this.timeRangeStart == null && other.timeRangeStart != null)
      return false;
    else if (this.timeRangeStart != null && !this.timeRangeStart.equals(other.timeRangeStart))
      return false;

    if (this.timeRangeEnd == null && other.timeRangeEnd != null)
      return false;
    else if (this.timeRangeEnd != null && !this.timeRangeEnd.equals(other.timeRangeEnd))
      return false;

    if (this.groupBy == null && other.groupBy != null)
      return false;
    else if (this.groupBy != null && !this.groupBy.equals(other.groupBy))
      return false;

    return true;
  }

}
