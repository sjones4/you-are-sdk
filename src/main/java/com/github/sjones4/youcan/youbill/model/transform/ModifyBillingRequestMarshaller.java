/*
 * Copyright 2016 Steve Jones. All Rights Reserved.
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

import java.util.List;
import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.github.sjones4.youcan.youbill.model.ModifyBillingRequest;

/**
 *
 */
public class ModifyBillingRequestMarshaller implements Marshaller<Request<ModifyBillingRequest>, ModifyBillingRequest> {

  public Request<ModifyBillingRequest> marshall(ModifyBillingRequest modifyBillingRequest) {
    if (modifyBillingRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

    Request<ModifyBillingRequest> request = new DefaultRequest<>(modifyBillingRequest, "Portal");
    request.addParameter("Action", "ModifyBilling");
    request.addParameter("Version", "2016-08-02");

    if ( modifyBillingRequest.getReportBucket() != null) {
        request.addParameter("ReportBucket", StringUtils.fromString(modifyBillingRequest.getReportBucket()));
    }

    if ( modifyBillingRequest.getDetailedBillingEnabled() != null) {
        request.addParameter("DetailedBillingEnabled", Boolean.toString(modifyBillingRequest.getDetailedBillingEnabled()));
    }

    final List<String> activeCostAllocationTags = modifyBillingRequest.getActiveCostAllocationTags( );
    int activeCostAllocationTagsListIndex = 1;
    for ( final String activeCostAllocationTag : activeCostAllocationTags) {
      if ( activeCostAllocationTag != null ) {
        request.addParameter("ActiveCostAllocationTags." + activeCostAllocationTagsListIndex, StringUtils.fromString( activeCostAllocationTag ));
      }
      activeCostAllocationTagsListIndex++;
    }

    return request;
  }
}