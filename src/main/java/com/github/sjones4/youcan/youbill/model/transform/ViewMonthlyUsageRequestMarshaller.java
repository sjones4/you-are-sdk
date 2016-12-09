package com.github.sjones4.youcan.youbill.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.github.sjones4.youcan.youbill.model.ViewMonthlyUsageRequest;

/*
 *
 */
public class ViewMonthlyUsageRequestMarshaller implements Marshaller<Request<ViewMonthlyUsageRequest>, ViewMonthlyUsageRequest> {
  @Override
  public Request<ViewMonthlyUsageRequest> marshall(ViewMonthlyUsageRequest viewMonthlyUsageRequest) {
    if (viewMonthlyUsageRequest == null )
      throw new AmazonClientException("Invalid argument passed to marshall(...)");
    Request<ViewMonthlyUsageRequest> request = new DefaultRequest<>(viewMonthlyUsageRequest, "Portal");
    request.addParameter("Action", "ViewMonthlyUsage");
    request.addParameter("Version", "2016-08-02");

    if ( viewMonthlyUsageRequest.getYear() != null) {
      request.addParameter("Year", StringUtils.fromString(viewMonthlyUsageRequest.getYear()));
    }

    if ( viewMonthlyUsageRequest.getMonth() != null) {
      request.addParameter("Month", StringUtils.fromString(viewMonthlyUsageRequest.getMonth()));
    }
    return request;
  }
}
