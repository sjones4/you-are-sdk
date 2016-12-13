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
package com.github.sjones4.youcan.youbill;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.protocol.json.JsonClientMetadata;
import com.amazonaws.protocol.json.JsonErrorResponseMetadata;
import com.amazonaws.protocol.json.JsonOperationMetadata;
import com.amazonaws.protocol.json.SdkJsonProtocolFactory;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.CredentialUtils;
import com.github.sjones4.youcan.youbill.model.ModifyAccountRequest;
import com.github.sjones4.youcan.youbill.model.ModifyAccountResult;
import com.github.sjones4.youcan.youbill.model.ModifyBillingRequest;
import com.github.sjones4.youcan.youbill.model.ModifyBillingResult;
import com.github.sjones4.youcan.youbill.model.ViewAccountRequest;
import com.github.sjones4.youcan.youbill.model.ViewAccountResult;
import com.github.sjones4.youcan.youbill.model.ViewBillingRequest;
import com.github.sjones4.youcan.youbill.model.ViewBillingResult;
import com.github.sjones4.youcan.youbill.model.ViewMonthlyUsageRequest;
import com.github.sjones4.youcan.youbill.model.ViewMonthlyUsageResult;
import com.github.sjones4.youcan.youbill.model.ViewUsageRequest;
import com.github.sjones4.youcan.youbill.model.ViewUsageResult;
import com.github.sjones4.youcan.youbill.model.transform.ModifyAccountRequestMarshaller;
import com.github.sjones4.youcan.youbill.model.transform.ModifyAccountResultJsonUnmarshaller;
import com.github.sjones4.youcan.youbill.model.transform.ModifyBillingRequestMarshaller;
import com.github.sjones4.youcan.youbill.model.transform.ModifyBillingResultJsonUnmarshaller;
import com.github.sjones4.youcan.youbill.model.transform.ViewAccountRequestMarshaller;
import com.github.sjones4.youcan.youbill.model.transform.ViewAccountResultJsonUnmarshaller;
import com.github.sjones4.youcan.youbill.model.transform.ViewBillingRequestMarshaller;
import com.github.sjones4.youcan.youbill.model.transform.ViewBillingResultJsonUnmarshaller;
import com.github.sjones4.youcan.youbill.model.transform.ViewMonthlyUsageRequestMarshaller;
import com.github.sjones4.youcan.youbill.model.transform.ViewMonthlyUsageResultJsonUnmarshaller;
import com.github.sjones4.youcan.youbill.model.transform.ViewUsageRequestMarshaller;
import com.github.sjones4.youcan.youbill.model.transform.ViewUsageResultJsonUnmarshaller;

/**
 *
 */
public class YouBillClient extends AmazonWebServiceClient implements YouBill {

  private AWSCredentialsProvider awsCredentialsProvider;

  private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
      .withProtocolVersion("1.0")
      .withSupportsCbor(false)
      .withSupportsIon(false));

  public YouBillClient( ) {
    this( new DefaultAWSCredentialsProviderChain( ), new ClientConfiguration( ) );
  }

  public YouBillClient( final ClientConfiguration clientConfiguration ) {
    this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
  }

  public YouBillClient( final AWSCredentials awsCredentials ) {
    this( new AWSStaticCredentialsProvider( awsCredentials ), new ClientConfiguration( ) );
  }

  public YouBillClient( final AWSCredentialsProvider awsCredentialsProvider) {
    this( awsCredentialsProvider, new ClientConfiguration() );
  }

  public YouBillClient( final AWSCredentials awsCredentials,  final ClientConfiguration clientConfiguration) {
    this( new AWSStaticCredentialsProvider( awsCredentials ), clientConfiguration );
  }

  public YouBillClient( final AWSCredentialsProvider awsCredentialsProvider,
                       final ClientConfiguration clientConfiguration) {
    super( clientConfiguration );
    this.awsCredentialsProvider = awsCredentialsProvider;
    init( );
  }

  private void init() {
    setEndpoint("http://localhost:8773/services/Portal");
  }

  private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
      final Request<Y> request,
      final Unmarshaller<X, JsonUnmarshallerContext> unmarshaller,
      final ExecutionContext executionContext
  ) {
    request.setEndpoint(endpoint);
    request.setTimeOffset(timeOffset);

    executionContext.setCredentialsProvider( CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

    HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler = protocolFactory.createResponseHandler(
        new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), unmarshaller);
    HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(
        new JsonErrorResponseMetadata( ) );
    return client.execute(request, responseHandler, errorResponseHandler, executionContext);
  }

  @Override
  public ViewAccountResult viewAccount( final ViewAccountRequest viewAccountRequest ) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(viewAccountRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<ViewAccountRequest> request = null;
    Response<ViewAccountResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime );
    try {
      request = new ViewAccountRequestMarshaller().marshall(viewAccountRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new ViewAccountResultJsonUnmarshaller(), executionContext);
      return response.getAwsResponse();
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }

  @Override
  public ModifyAccountResult modifyAccount( final ModifyAccountRequest modifyAccountRequest ) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(modifyAccountRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<ModifyAccountRequest> request = null;
    Response<ModifyAccountResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime );
    try {
      request = new ModifyAccountRequestMarshaller().marshall(modifyAccountRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new ModifyAccountResultJsonUnmarshaller(), executionContext);
      return response.getAwsResponse();
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }

  @Override
  public ViewBillingResult viewBilling( final ViewBillingRequest viewBillingRequest ) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(viewBillingRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<ViewBillingRequest> request = null;
    Response<ViewBillingResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime );
    try {
      request = new ViewBillingRequestMarshaller().marshall(viewBillingRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new ViewBillingResultJsonUnmarshaller(), executionContext);
      return response.getAwsResponse();
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }

  @Override
  public ModifyBillingResult modifyBilling( final ModifyBillingRequest modifyBillingRequest ) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(modifyBillingRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<ModifyBillingRequest> request = null;
    Response<ModifyBillingResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime );
    try {
      request = new ModifyBillingRequestMarshaller().marshall(modifyBillingRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new ModifyBillingResultJsonUnmarshaller(), executionContext);
      return response.getAwsResponse();
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }

  @Override
  public ViewUsageResult viewUsage(final ViewUsageRequest viewUsageRequest ) throws AmazonClientException {
    final ExecutionContext executionContext = createExecutionContext(viewUsageRequest);
    final AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<ViewUsageRequest> request = null;
    Response<ViewUsageResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime );
    try {
      request = new ViewUsageRequestMarshaller().marshall(viewUsageRequest);
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new ViewUsageResultJsonUnmarshaller(), executionContext);
      return response.getAwsResponse();
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }

  @Override
  public ViewMonthlyUsageResult viewMonthlyUsage(ViewMonthlyUsageRequest viewMonthlyUsageRequest) throws AmazonClientException {
    final ExecutionContext executionContext = createExecutionContext(viewMonthlyUsageRequest);
    final AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<ViewMonthlyUsageRequest> request = null;
    Response<ViewMonthlyUsageResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime );
    try {
      request = new ViewMonthlyUsageRequestMarshaller().marshall(viewMonthlyUsageRequest);
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new ViewMonthlyUsageResultJsonUnmarshaller(), executionContext);
      return response.getAwsResponse();
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }
}
