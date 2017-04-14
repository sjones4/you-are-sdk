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