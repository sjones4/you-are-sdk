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
