package com.github.sjones4.youcan.youec2reports;

import com.amazonaws.AmazonClientException;
import com.github.sjones4.youcan.youec2reports.model.ViewInstanceUsageReportRequest;
import com.github.sjones4.youcan.youec2reports.model.ViewInstanceUsageReportResult;
import com.github.sjones4.youcan.youec2reports.model.ViewReservedInstanceUtilizationReportRequest;
import com.github.sjones4.youcan.youec2reports.model.ViewReservedInstanceUtilizationReportResult;

/*
 *
 */
public interface YouEc2Reports {
  ViewInstanceUsageReportResult viewInstanceUsageReport(ViewInstanceUsageReportRequest viewInstanceUsageReportRequest) throws AmazonClientException;
  ViewReservedInstanceUtilizationReportResult viewReservedInstanceUtilizationReport(ViewReservedInstanceUtilizationReportRequest viewReservedInstanceUtilizationReportRequest)  throws AmazonClientException;
}
