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
package com.github.sjones4.youcan.youec2reports.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.github.sjones4.youcan.youec2reports.model.InstanceUsageFilter;
import com.github.sjones4.youcan.youec2reports.model.InstanceUsageFilters;
import com.github.sjones4.youcan.youec2reports.model.InstanceUsageGroup;
import com.github.sjones4.youcan.youec2reports.model.ViewInstanceUsageReportRequest;

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

    if ( viewInstanceUsageReportRequest.getGranularity() != null) {
      request.addParameter("Granularity", StringUtils.fromString(viewInstanceUsageReportRequest.getGranularity()));
    }

    final InstanceUsageFilters filters = viewInstanceUsageReportRequest.getFilters();
    if (filters != null && filters.getMember() != null) {
      int filterIndex = 1;
      for (final InstanceUsageFilter filter : filters.getMember()) {
        if (filter.getType() != null)
          request.addParameter("Filters.member." + filterIndex + ".Type", StringUtils.fromString(filter.getType()));
        if (filter.getKey() != null)
          request.addParameter("Filters.member." + filterIndex + ".Key", StringUtils.fromString(filter.getKey()));
        if (filter.getValue() != null)
          request.addParameter("Filters.member." + filterIndex + ".Value", StringUtils.fromString(filter.getValue()));
        filterIndex++;
      }
    }
    if (viewInstanceUsageReportRequest.getTimeRangeStart() != null) {
      request.addParameter("TimeRangeStart", StringUtils.fromDate(viewInstanceUsageReportRequest.getTimeRangeStart()));
    }
    if (viewInstanceUsageReportRequest.getTimeRangeEnd() != null) {
      request.addParameter("TimeRangeEnd", StringUtils.fromDate(viewInstanceUsageReportRequest.getTimeRangeEnd()));
    }

    final InstanceUsageGroup groupBy = viewInstanceUsageReportRequest.getGroupBy();
    if (groupBy != null ) {
      if (groupBy.getType() != null)
        request.addParameter("GroupBy.Type", groupBy.getType());
      if (groupBy.getKey() != null)
        request.addParameter("GroupBy.Key", groupBy.getKey());
    }
    return request;
  }
}
