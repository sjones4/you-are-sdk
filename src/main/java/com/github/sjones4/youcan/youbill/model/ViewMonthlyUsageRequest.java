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
package com.github.sjones4.youcan.youbill.model;

import com.amazonaws.AmazonWebServiceRequest;

import java.io.Serializable;
/*
 *
 */
public class ViewMonthlyUsageRequest  extends AmazonWebServiceRequest implements Serializable {
  private static final long serialVersionUID = 1L;
  private String year;
  private String month;

  public String getYear()  { return year; }
  public void setYear(final String year) {
    this.year = year;
  }

  public String getMonth() { return month; }
  public void setMonth(final String month) { this.month = month; }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("{");
    if ( getYear() != null) sb.append("Year: " + getYear() + ",");
    if ( getMonth() != null) sb.append("Month: " + getMonth() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + (( getYear() == null) ? 0 : getYear().hashCode());
    hashCode = prime * hashCode + (( getMonth() == null) ? 0 : getMonth().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof ViewMonthlyUsageRequest == false) return false;
    final ViewMonthlyUsageRequest other = (ViewMonthlyUsageRequest)obj;

    if (this.year == null && other.year != null)
      return false;
    else if (this.year != null && !this.year.equals(other.year))
      return false;

    if (this.month == null && other.month != null)
      return false;
    else if (this.month != null && !this.month.equals(other.month))
      return false;

    return true;
  }
}
