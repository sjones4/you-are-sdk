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

import java.io.Serializable;

/*
 *
 */
public class ViewInstanceUsageReportResult  implements Serializable {
  private static final long serialVersionUID = 1L;

  private String usageReport;

  public String getUsageReport() {
    return this.usageReport;
  }

  public void setUsageReport(final String usageReport) {
    this.usageReport = usageReport;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder( );
    sb.append( "{" );
    if (getUsageReport() != null) sb.append("usageReport: " + getUsageReport() );
    sb.append( "}" );
    return sb.toString( );
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getUsageReport() == null) ? 0 : getUsageReport().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals( Object obj ) {
    if ( this == obj ) return true;
    if ( obj == null ) return false;

    if ( obj instanceof ViewInstanceUsageReportResult == false ) return false;
    final ViewInstanceUsageReportResult other = (ViewInstanceUsageReportResult) obj;

    if (this.usageReport == null && other.usageReport != null)
      return false;
    else if (this.usageReport != null && !this.usageReport.equals(other.usageReport))
      return false;

    return true;
  }
}