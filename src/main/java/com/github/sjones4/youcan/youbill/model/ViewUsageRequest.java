package com.github.sjones4.youcan.youbill.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.Date;

/**
 *
 */
public class ViewUsageRequest  extends AmazonWebServiceRequest implements Serializable {
  private static final long serialVersionUID = 1L;
  private String services;
  private String usageTypes;
  private String operations;
  private Date timePeriodFrom;
  private Date timePeriodTo;
  private String reportGranularity;

  public String getServices() {
    return services;
  }
  public void setServices(final String services) {
    this.services = services;
  }
  public String getUsageTypes() {
    return usageTypes;
  }
  public void setUsageTypes(final String usageTypes) {
    this.usageTypes = usageTypes;
  }
  public String getOperations() { return operations; }
  public void setOperations(final String operations) {
    this.operations = operations;
  }
  public Date getTimePeriodFrom() {
    return timePeriodFrom;
  }
  public void setTimePeriodFrom(final Date timePeriodFrom) {
    this.timePeriodFrom = timePeriodFrom;
  }
  public Date getTimePeriodTo() {
    return timePeriodTo;
  }
  public void setTimePeriodTo(final Date timePeriodTo) {
    this.timePeriodTo = timePeriodTo;
  }
  public String getReportGranularity() {
    return reportGranularity;
  }
  public void setReportGranularity(final String reportGranularity) {
    this.reportGranularity = reportGranularity;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if ( getServices() != null) sb.append("Services: " + getServices() + ",");
    if ( getUsageTypes() != null) sb.append("UsageTypes: " + getUsageTypes() + ",");
    if ( getOperations() != null) sb.append("Operations: " + getOperations() + ",");
    if ( getTimePeriodFrom() != null) sb.append("TimePeriodFrom: " + getTimePeriodFrom() + ",");
    if ( getTimePeriodTo() != null) sb.append("TimePeriodTo: " + getTimePeriodTo() + ",");
    if ( getReportGranularity() != null) sb.append("ReportGranularity: " + getReportGranularity() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + (( getServices() == null) ? 0 : getServices().hashCode());
    hashCode = prime * hashCode + (( getUsageTypes() == null) ? 0 : getUsageTypes().hashCode());
    hashCode = prime * hashCode + (( getOperations() == null) ? 0 : getOperations().hashCode());
    hashCode = prime * hashCode + (( getTimePeriodFrom() == null) ? 0 : getTimePeriodFrom().hashCode());
    hashCode = prime * hashCode + (( getTimePeriodTo() == null) ? 0 : getTimePeriodTo().hashCode());
    hashCode = prime * hashCode + (( getReportGranularity() == null) ? 0 : getReportGranularity().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof ViewUsageRequest == false) return false;
    ViewUsageRequest other = (ViewUsageRequest)obj;

    if (this.services == null && other.services != null)
      return false;
    else if (this.services!=null && !this.services.equals(other.services))
      return false;

    if (this.usageTypes == null && other.usageTypes != null)
      return false;
    else if (this.usageTypes != null && !this.usageTypes.equals(other.usageTypes))
      return false;

    if (this.operations == null && other.operations != null)
      return false;
    else if (this.operations != null && !this.operations.equals(other.operations))
      return false;

    if (this.timePeriodFrom == null && other.timePeriodFrom != null)
      return false;
    else if (this.timePeriodFrom  != null && !this.timePeriodFrom.equals(other.timePeriodFrom))
      return false;

    if (this.timePeriodTo == null && other.timePeriodTo != null)
      return false;
    else if (this.timePeriodTo != null && !this.timePeriodTo.equals(other.timePeriodTo))
      return false;

    if (this.reportGranularity == null && other.reportGranularity != null)
      return false;
    else if (this.reportGranularity != null && !this.reportGranularity.equals(other.reportGranularity))
      return false;

    return true;
  }
}
