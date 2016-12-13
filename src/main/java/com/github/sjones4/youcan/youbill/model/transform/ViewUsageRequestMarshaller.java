package com.github.sjones4.youcan.youbill.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.github.sjones4.youcan.youbill.model.ViewUsageRequest;

/*
 */
public class ViewUsageRequestMarshaller implements Marshaller<Request<ViewUsageRequest>, ViewUsageRequest> {
  @Override
  public Request<ViewUsageRequest> marshall(ViewUsageRequest viewUsageRequest) {
    if (viewUsageRequest == null )
      throw new AmazonClientException("Invalid argument passed to marshall(...)");
    Request<ViewUsageRequest> request = new DefaultRequest<>(viewUsageRequest, "Portal");
    request.addParameter("Action", "ViewUsage");
    request.addParameter("Version", "2016-08-02");


    if ( viewUsageRequest.getServices() != null) {
      request.addParameter("Services", StringUtils.fromString(viewUsageRequest.getServices()));
    }

    if ( viewUsageRequest.getUsageTypes() != null) {
      request.addParameter("UsageTypes", StringUtils.fromString(viewUsageRequest.getUsageTypes()));
    }

    if ( viewUsageRequest.getOperations()  != null) {
      request.addParameter("Operations", StringUtils.fromString(viewUsageRequest.getOperations()));
    }

    if ( viewUsageRequest.getTimePeriodFrom() != null) {
      request.addParameter("TimePeriodFrom", StringUtils.fromDate(viewUsageRequest.getTimePeriodFrom()));
    }

    if ( viewUsageRequest.getTimePeriodTo() != null) {
      request.addParameter("TimePeriodTo", StringUtils.fromDate(viewUsageRequest.getTimePeriodTo()));
    }

    if (viewUsageRequest.getReportGranularity() != null) {
      request.addParameter("ReportGranularity", StringUtils.fromString(viewUsageRequest.getReportGranularity()));
    }
    return request;
  }
}
