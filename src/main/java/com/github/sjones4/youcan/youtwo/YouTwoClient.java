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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.CredentialUtils;
import com.github.sjones4.youcan.youtwo.model.DescribeInstanceTypesRequest;
import com.github.sjones4.youcan.youtwo.model.DescribeInstanceTypesResult;
import com.github.sjones4.youcan.youtwo.model.ModifyInstanceTypeAttributeRequest;
import com.github.sjones4.youcan.youtwo.model.ModifyInstanceTypeAttributeResult;
import com.github.sjones4.youcan.youtwo.model.transform.DescribeInstanceTypesRequestMarshaller;
import com.github.sjones4.youcan.youtwo.model.transform.DescribeInstanceTypesResultStaxUnmarshaller;
import com.github.sjones4.youcan.youtwo.model.transform.ModifyInstanceTypeAttributeRequestMarshaller;
import com.github.sjones4.youcan.youtwo.model.transform.ModifyInstanceTypeAttributeResultStaxUnmarshaller;

/**
 *
 */
public class YouTwoClient extends AmazonEC2Client implements YouTwo {
  private final AWSCredentialsProvider awsCredentialsProvider;

  public YouTwoClient( final AWSCredentialsProvider awsCredentialsProvider,
                       final ClientConfiguration clientConfiguration ) {
    super( awsCredentialsProvider, clientConfiguration );
    this.awsCredentialsProvider = awsCredentialsProvider;
  }

  public YouTwoClient() {
    this( new DefaultAWSCredentialsProviderChain(), new ClientConfiguration() );
  }

  public YouTwoClient( final AWSCredentials awsCredentials ) {
    this( new StaticCredentialsProvider( awsCredentials ), new ClientConfiguration()  );
  }

  public YouTwoClient( final AWSCredentials awsCredentials,
                       final ClientConfiguration clientConfiguration ) {
    this( new StaticCredentialsProvider( awsCredentials ), clientConfiguration );
  }

  public YouTwoClient( final ClientConfiguration clientConfiguration ) {
    this( new DefaultAWSCredentialsProviderChain(), clientConfiguration );
  }

  public YouTwoClient( final AWSCredentialsProvider awsCredentialsProvider ) {
    this( awsCredentialsProvider, new ClientConfiguration());
  }

  public DescribeInstanceTypesResult describeInstanceTypes( DescribeInstanceTypesRequest describeInstanceTypesRequest ) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(describeInstanceTypesRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<DescribeInstanceTypesRequest> request = null;
    Response<DescribeInstanceTypesResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime);
    try {
      request = new DescribeInstanceTypesRequestMarshaller().marshall(describeInstanceTypesRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new DescribeInstanceTypesResultStaxUnmarshaller( ), executionContext);
      return response.getAwsResponse();
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }

  public DescribeInstanceTypesResult describeInstanceTypes() throws AmazonClientException {
    return describeInstanceTypes( new DescribeInstanceTypesRequest( ) );
  }

  @Override
  public ModifyInstanceTypeAttributeResult modifyInstanceTypeAttribute(
      final ModifyInstanceTypeAttributeRequest modifyInstanceTypeAttributeRequest
  ) throws AmazonServiceException, AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(modifyInstanceTypeAttributeRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<ModifyInstanceTypeAttributeRequest> request = null;
    Response<ModifyInstanceTypeAttributeResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime);
    try {
      request = new ModifyInstanceTypeAttributeRequestMarshaller().marshall(modifyInstanceTypeAttributeRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new ModifyInstanceTypeAttributeResultStaxUnmarshaller( ), executionContext);
      return response.getAwsResponse();
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }

  private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
      final Request<Y> request,
      final Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
      final ExecutionContext executionContext)
  {
    request.setEndpoint(endpoint);
    request.setTimeOffset(timeOffset);

    executionContext.setCredentialsProvider( CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

    StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
    DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
    return client.execute(request, responseHandler, errorResponseHandler, executionContext);
  }
}
