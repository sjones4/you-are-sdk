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
package com.github.sjones4.youcan.youserv.model.transform;

import java.util.List;
import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.github.sjones4.youcan.youserv.model.DescribeServicesRequest;
import com.github.sjones4.youcan.youserv.model.Filter;

/**
 *
 */
public class DescribeServicesRequestMarshaller implements Marshaller<Request<DescribeServicesRequest>, DescribeServicesRequest> {

  public Request<DescribeServicesRequest> marshall( DescribeServicesRequest describeServicesRequest ) {

    if (describeServicesRequest == null) {
      throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

    final Request<DescribeServicesRequest> request = new DefaultRequest<>(describeServicesRequest, "EucalyptusServices");
    request.addParameter("Action", "DescribeServices");
    request.addParameter("Version", "eucalyptus");

    if ( describeServicesRequest.getListAll( ) != null ) {
      request.addParameter( "ListAll", StringUtils.fromBoolean( describeServicesRequest.getListAll( ) ) );
    }

    final List<String> servicesList = describeServicesRequest.getServiceNames( );
    int servicesListIndex = 1;

    for ( final String servicesListValue : servicesList) {
      if ( servicesListValue != null ) {
        request.addParameter("ServiceName." + servicesListIndex, StringUtils.fromString( servicesListValue ));
      }

      servicesListIndex++;
    }

    final List<Filter> filtersList = describeServicesRequest.getFilters( );
    int filtersListIndex = 1;

    for ( final Filter filtersListValue : filtersList ) {
      Filter filterMember = filtersListValue;
      if (filterMember != null) {
        if ( filterMember.getName( ) != null ) {
          request.addParameter( "Filter." + filtersListIndex + ".Name", StringUtils.fromString( filterMember.getName( ) ) );
        }

        if ( filterMember.getValues( ) != null ) {
          final List<String> valuesList = filterMember.getValues( );
          int valuesListIndex = 1;

          for ( final String valuesListValue : valuesList ) {
            if ( valuesListValue != null ) {
              request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString( valuesListValue ));
            }

            valuesListIndex++;
          }
        }
      }
      filtersListIndex++;
    }

    return request;
  }
}
