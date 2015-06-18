/*
 * Copyright 2015 Steve Jones. All Rights Reserved.
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
import com.github.sjones4.youcan.youserv.model.DescribeServiceCertificatesRequest;
import com.github.sjones4.youcan.youserv.model.Filter;

/**
 *
 */
public class DescribeServiceCertificatesRequestMarshaller implements Marshaller<Request<DescribeServiceCertificatesRequest>, DescribeServiceCertificatesRequest> {

  public Request<DescribeServiceCertificatesRequest> marshall( DescribeServiceCertificatesRequest describeServiceCertificatesRequest ) {

    if (describeServiceCertificatesRequest == null) {
      throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

    final Request<DescribeServiceCertificatesRequest> request = new DefaultRequest<>(describeServiceCertificatesRequest, "EucalyptusServices");
    request.addParameter("Action", "DescribeServiceCertificates");
    request.addParameter("Version", "eucalyptus");

    if ( describeServiceCertificatesRequest.getFormat( ) != null ) {
      request.addParameter( "Format", describeServiceCertificatesRequest.getFormat( ) );
    }

    if ( describeServiceCertificatesRequest.getFingerprintDigest( ) != null ) {
      request.addParameter( "FingerprintDigest", describeServiceCertificatesRequest.getFingerprintDigest( ) );
    }

    final List<Filter> filtersList = describeServiceCertificatesRequest.getFilters( );
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
