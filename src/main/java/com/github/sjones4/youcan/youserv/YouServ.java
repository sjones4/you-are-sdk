/*
 * Copyright 2013-2015 Steve Jones. All Rights Reserved.
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
package com.github.sjones4.youcan.youserv;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.github.sjones4.youcan.youserv.model.DescribeServiceCertificatesRequest;
import com.github.sjones4.youcan.youserv.model.DescribeServiceCertificatesResult;
import com.github.sjones4.youcan.youserv.model.DescribeServicesRequest;
import com.github.sjones4.youcan.youserv.model.DescribeServicesResult;

/**
 *
 */
public interface YouServ {

  DescribeServicesResult describeServices( )  throws AmazonServiceException, AmazonClientException;

  DescribeServicesResult describeServices( DescribeServicesRequest request )  throws AmazonServiceException, AmazonClientException;

  DescribeServiceCertificatesResult describeServiceCertificates( )  throws AmazonServiceException, AmazonClientException;

  DescribeServiceCertificatesResult describeServiceCertificates( DescribeServiceCertificatesRequest request )  throws AmazonServiceException, AmazonClientException;

}
