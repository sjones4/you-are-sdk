package com.github.sjones4.youcan.youec2reports.model;

import com.amazonaws.AmazonWebServiceRequest;

import java.io.Serializable;

/*
 *
 */
public class ViewInstanceUsageReportRequest  extends AmazonWebServiceRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("{");
    // no request parameter
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof ViewInstanceUsageReportRequest == false) return false;
    final ViewInstanceUsageReportRequest other = (ViewInstanceUsageReportRequest)obj;

    return true;
  }

}
