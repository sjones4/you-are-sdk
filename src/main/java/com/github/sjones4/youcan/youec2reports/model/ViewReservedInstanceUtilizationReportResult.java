package com.github.sjones4.youcan.youec2reports.model;

import java.io.Serializable;

/*
 *
 */
public class ViewReservedInstanceUtilizationReportResult  implements Serializable {
  private static final long serialVersionUID = 1L;

  private String utilizationReport;

  public String getUtilizationReport() {
    return this.utilizationReport;
  }

  public void setUtilizationReport(final String utilizationReport) {
    this.utilizationReport = utilizationReport;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder( );
    sb.append( "{" );
    if (getUtilizationReport() != null) sb.append("utilizationReport: " + getUtilizationReport() );
    sb.append( "}" );
    return sb.toString( );
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getUtilizationReport() == null) ? 0 : getUtilizationReport().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals( Object obj ) {
    if ( this == obj ) return true;
    if ( obj == null ) return false;

    if ( obj instanceof ViewReservedInstanceUtilizationReportResult == false ) return false;
    final ViewReservedInstanceUtilizationReportResult other = (ViewReservedInstanceUtilizationReportResult) obj;

    if (this.utilizationReport == null && other.utilizationReport != null)
      return false;
    else if (this.utilizationReport != null && !this.utilizationReport.equals(other.utilizationReport))
      return false;

    return true;
  }
}