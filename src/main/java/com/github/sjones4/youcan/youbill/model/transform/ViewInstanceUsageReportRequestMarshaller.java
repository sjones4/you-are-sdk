package com.github.sjones4.youcan.youbill.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.transform.Marshaller;
import com.github.sjones4.youcan.youbill.model.ViewInstanceUsageReportRequest;

/*
 *
 */
public class ViewInstanceUsageReportRequestMarshaller implements Marshaller<Request<ViewInstanceUsageReportRequest>, ViewInstanceUsageReportRequest> {
  @Override
  public Request<ViewInstanceUsageReportRequest> marshall(ViewInstanceUsageReportRequest viewInstanceUsageReportRequest) {
    if (viewInstanceUsageReportRequest == null )
      throw new AmazonClientException("Invalid argument passed to marshall(...)");
    Request<ViewInstanceUsageReportRequest> request = new DefaultRequest<>(viewInstanceUsageReportRequest, "Ec2Reports");
    request.addParameter("Action", "ViewInstanceUsageReport");
    request.addParameter("Version", "2016-08-02");
    return request;
  }
}
