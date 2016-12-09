package com.github.sjones4.youcan.youbill;

import com.amazonaws.AmazonClientException;
import com.github.sjones4.youcan.youbill.model.ViewInstanceUsageReportRequest;
import com.github.sjones4.youcan.youbill.model.ViewInstanceUsageReportResult;
import com.github.sjones4.youcan.youbill.model.ViewReservedInstanceUtilizationReportRequest;
import com.github.sjones4.youcan.youbill.model.ViewReservedInstanceUtilizationReportResult;

/*
 *
 */
public interface YouEc2Reports {
  ViewInstanceUsageReportResult viewInstanceUsageReport(ViewInstanceUsageReportRequest viewInstanceUsageReportRequest) throws AmazonClientException;
  ViewReservedInstanceUtilizationReportResult viewReservedInstanceUtilizationReport(ViewReservedInstanceUtilizationReportRequest viewReservedInstanceUtilizationReportRequest)  throws AmazonClientException;
}
