/*
 * Copyright 2013 Steve Jones. All Rights Reserved.
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
package com.github.sjones4.youcan.youprop.model.transform;

import java.util.List;
import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.github.sjones4.youcan.youprop.model.DescribePropertiesRequest;

/**
 *
 */
public class DescribePropertiesRequestMarshaller implements Marshaller<Request<DescribePropertiesRequest>, DescribePropertiesRequest> {

  public Request<DescribePropertiesRequest> marshall(DescribePropertiesRequest describePropertiesRequest) {

    if (describePropertiesRequest == null) {
      throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

    final Request<DescribePropertiesRequest> request = new DefaultRequest<>(describePropertiesRequest, "EucalyptusProperties");
    request.addParameter("Action", "DescribeProperties");
    request.addParameter("Version", "eucalyptus");

    final List<String> propertiesList = describePropertiesRequest.getProperties( );
    int propertiesListIndex = 1;

    for ( final String propertiesListValue : propertiesList ) {
      if (propertiesListValue != null) {
        request.addParameter("Property." + propertiesListIndex, StringUtils.fromString( propertiesListValue ));
      }

      propertiesListIndex++;
    }

    return request;
  }
}
