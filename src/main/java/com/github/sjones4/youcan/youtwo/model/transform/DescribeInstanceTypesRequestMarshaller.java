/*
 * Copyright 2014 Steve Jones. All Rights Reserved.
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
package com.github.sjones4.youcan.youtwo.model.transform;

import java.util.List;
import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.github.sjones4.youcan.youtwo.model.DescribeInstanceTypesRequest;

/**
 *
 */
public class DescribeInstanceTypesRequestMarshaller implements Marshaller<Request<DescribeInstanceTypesRequest>, DescribeInstanceTypesRequest> {

  public Request<DescribeInstanceTypesRequest> marshall( DescribeInstanceTypesRequest describeInstanceTypesRequest ) {

    if (describeInstanceTypesRequest == null) {
      throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

    Request<DescribeInstanceTypesRequest> request = new DefaultRequest<>(describeInstanceTypesRequest, "AmazonEC2");
    request.addParameter("Action", "DescribeInstanceTypes");
    request.addParameter( "Version", "2013-10-15" );

    List<String> instanceTypesList = describeInstanceTypesRequest.getInstanceTypes();
    int instanceTypesListIndex = 1;

    for (String instanceTypesListValue : instanceTypesList) {
      if (instanceTypesListValue != null) {
        request.addParameter("InstanceType." + instanceTypesListIndex, StringUtils.fromString( instanceTypesListValue ));
      }

      instanceTypesListIndex++;
    }
    if ( describeInstanceTypesRequest.getAvailability() != null ) {
      request.addParameter( "Availability", StringUtils.fromBoolean( describeInstanceTypesRequest.getAvailability() ) );
    }
    if ( describeInstanceTypesRequest.getVerbose() != null ) {
      request.addParameter( "Verbose", StringUtils.fromBoolean( describeInstanceTypesRequest.getVerbose() ) );
    }

    return request;
  }
}
