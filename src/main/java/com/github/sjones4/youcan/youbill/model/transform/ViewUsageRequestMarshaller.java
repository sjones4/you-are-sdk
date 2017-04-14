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
