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
package com.github.sjones4.youcan.youtwo;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.ec2.AmazonEC2;
import com.github.sjones4.youcan.youtwo.model.DescribeInstanceTypesRequest;
import com.github.sjones4.youcan.youtwo.model.DescribeInstanceTypesResult;

/**
 *
 */
public interface YouTwo extends AmazonEC2 {

  DescribeInstanceTypesResult describeInstanceTypes( DescribeInstanceTypesRequest describeInstanceTypesRequest ) throws AmazonServiceException, AmazonClientException;

  DescribeInstanceTypesResult describeInstanceTypes( ) throws AmazonServiceException, AmazonClientException;
}
