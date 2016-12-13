package com.github.sjones4.youcan.youec2reports.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.transform.Marshaller;
import com.github.sjones4.youcan.youec2reports.model.ViewReservedInstanceUtilizationReportRequest;

/*
 *
 */
public class ViewReservedInstanceUtilizationReportRequestMarshaller implements Marshaller<Request<ViewReservedInstanceUtilizationReportRequest>, ViewReservedInstanceUtilizationReportRequest> {
  @Override
  public Request<ViewReservedInstanceUtilizationReportRequest> marshall(ViewReservedInstanceUtilizationReportRequest viewReservedInstanceUtilizationReportRequest) {
    if (viewReservedInstanceUtilizationReportRequest == null )
      throw new AmazonClientException("Invalid argument passed to marshall(...)");
    Request<ViewReservedInstanceUtilizationReportRequest> request = new DefaultRequest<>(viewReservedInstanceUtilizationReportRequest, "Ec2Reports");
    request.addParameter("Action", "ViewReservedInstanceUtilizationReport");
    request.addParameter("Version", "2016-08-02");
    return request;
  }
}