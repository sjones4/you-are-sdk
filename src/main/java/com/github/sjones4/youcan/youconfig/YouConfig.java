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
package com.github.sjones4.youcan.youconfig;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.github.sjones4.youcan.youconfig.model.DescribeComponentsRequest;
import com.github.sjones4.youcan.youconfig.model.DescribeComponentsResult;

/**
 *
 */
public interface YouConfig {

  DescribeComponentsResult describeComponents( )  throws AmazonServiceException, AmazonClientException;

  DescribeComponentsResult describeComponents( DescribeComponentsRequest describeComponentsRequest )  throws AmazonServiceException, AmazonClientException;
}
