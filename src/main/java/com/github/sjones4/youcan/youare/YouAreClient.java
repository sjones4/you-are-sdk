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
package com.github.sjones4.youcan.youare;

import java.net.URI;
import java.util.Map;
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
import com.amazonaws.services.identitymanagement.AmazonIdentityManagementClient;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import com.github.sjones4.youcan.youare.model.CreateAccountRequest;
import com.github.sjones4.youcan.youare.model.CreateAccountResult;
import com.github.sjones4.youcan.youare.model.DeleteAccountPolicyRequest;
import com.github.sjones4.youcan.youare.model.DeleteAccountRequest;
import com.github.sjones4.youcan.youare.model.GetAccountPolicyRequest;
import com.github.sjones4.youcan.youare.model.GetAccountPolicyResult;
import com.github.sjones4.youcan.youare.model.ListAccountPoliciesRequest;
import com.github.sjones4.youcan.youare.model.ListAccountPoliciesResult;
import com.github.sjones4.youcan.youare.model.ListAccountsRequest;
import com.github.sjones4.youcan.youare.model.ListAccountsResult;
import com.github.sjones4.youcan.youare.model.PutAccountPolicyRequest;
import com.github.sjones4.youcan.youare.model.transform.CreateAccountRequestMarshaller;
import com.github.sjones4.youcan.youare.model.transform.CreateAccountResultStaxUnmarshaller;
import com.github.sjones4.youcan.youare.model.transform.DeleteAccountPolicyRequestMarshaller;
import com.github.sjones4.youcan.youare.model.transform.DeleteAccountRequestMarshaller;
import com.github.sjones4.youcan.youare.model.transform.GetAccountPolicyRequestMarshaller;
import com.github.sjones4.youcan.youare.model.transform.GetAccountPolicyResultStaxUnmarshaller;
import com.github.sjones4.youcan.youare.model.transform.ListAccountPoliciesRequestMarshaller;
import com.github.sjones4.youcan.youare.model.transform.ListAccountPoliciesResultStaxUnmarshaller;
import com.github.sjones4.youcan.youare.model.transform.ListAccountsRequestMarshaller;
import com.github.sjones4.youcan.youare.model.transform.ListAccountsResultStaxUnmarshaller;
import com.github.sjones4.youcan.youare.model.transform.PutAccountPolicyRequestMarshaller;

/**
 *
 */
public class YouAreClient extends AmazonIdentityManagementClient implements YouAre {
  private final AWSCredentialsProvider awsCredentialsProvider;

  public YouAreClient( final AWSCredentialsProvider awsCredentialsProvider,
                       final ClientConfiguration clientConfiguration ) {
    super( awsCredentialsProvider, clientConfiguration );
    this.awsCredentialsProvider = awsCredentialsProvider;
  }

  public YouAreClient() {
    this( new DefaultAWSCredentialsProviderChain(), new ClientConfiguration() );
  }

  public YouAreClient( final AWSCredentials awsCredentials ) {
    this( new StaticCredentialsProvider( awsCredentials ), new ClientConfiguration()  );
  }

  public YouAreClient( final AWSCredentials awsCredentials,
                       final ClientConfiguration clientConfiguration ) {
    this( new StaticCredentialsProvider( awsCredentials ), clientConfiguration );
  }

  public YouAreClient( final ClientConfiguration clientConfiguration ) {
    this( new DefaultAWSCredentialsProviderChain(), clientConfiguration );
  }

  public YouAreClient( final AWSCredentialsProvider awsCredentialsProvider ) {
    this( awsCredentialsProvider, new ClientConfiguration());
  }

  @Override
  public CreateAccountResult createAccount(final CreateAccountRequest createAccountRequest) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(createAccountRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<CreateAccountRequest> request = null;
    Response<CreateAccountResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime );
    try {
      request = new CreateAccountRequestMarshaller().marshall(createAccountRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new CreateAccountResultStaxUnmarshaller(), executionContext);
      return response.getAwsResponse();
    } finally {
      endClientExecution( awsRequestMetrics, request, response );
    }
  }

  @Override
  public void deleteAccount( final DeleteAccountRequest deleteAccountRequest ) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(deleteAccountRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<DeleteAccountRequest> request = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime );
    try {
      request = new DeleteAccountRequestMarshaller().marshall(deleteAccountRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      invoke(request, null, executionContext);
    } finally {
      endClientExecution(awsRequestMetrics, request, null);
    }
  }

  @Override
  public ListAccountsResult listAccounts() throws AmazonServiceException, AmazonClientException {
    return listAccounts( new ListAccountsRequest( ) );
  }

  @Override
  public ListAccountsResult listAccounts( final ListAccountsRequest listAccountsRequest ) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(listAccountsRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<ListAccountsRequest> request = null;
    Response<ListAccountsResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime);
    try {
      request = new ListAccountsRequestMarshaller().marshall(listAccountsRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new ListAccountsResultStaxUnmarshaller(), executionContext);
      return response.getAwsResponse();
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }

  @Override
  public void putAccountPolicy( final PutAccountPolicyRequest putAccountPolicyRequest ) throws  AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(putAccountPolicyRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<PutAccountPolicyRequest> request = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime);
    try {
      request = new PutAccountPolicyRequestMarshaller().marshall(putAccountPolicyRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      invoke(request, null, executionContext);
    } finally {
      endClientExecution(awsRequestMetrics, request, null);
    }
  }

  @Override
  public void deleteAccountPolicy( final DeleteAccountPolicyRequest deleteAccountPolicyRequest ) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(deleteAccountPolicyRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<DeleteAccountPolicyRequest> request = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime);
    try {
      request = new DeleteAccountPolicyRequestMarshaller().marshall(deleteAccountPolicyRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      invoke(request, null, executionContext);
    } finally {
      endClientExecution(awsRequestMetrics, request, null);
    }
  }

  @Override
  public ListAccountPoliciesResult listAccountPolicies( final ListAccountPoliciesRequest listAccountPoliciesRequest ) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(listAccountPoliciesRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<ListAccountPoliciesRequest> request = null;
    Response<ListAccountPoliciesResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime);
    try {
      request = new ListAccountPoliciesRequestMarshaller().marshall(listAccountPoliciesRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new ListAccountPoliciesResultStaxUnmarshaller(), executionContext);
      return response.getAwsResponse();
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }

  @Override
  public GetAccountPolicyResult getAccountPolicy( final GetAccountPolicyRequest getAccountPolicyRequest ) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(getAccountPolicyRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<GetAccountPolicyRequest> request = null;
    Response<GetAccountPolicyResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime);
    try {
      request = new GetAccountPolicyRequestMarshaller().marshall(getAccountPolicyRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new GetAccountPolicyResultStaxUnmarshaller(), executionContext);
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
    AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
    for (Map.Entry<String, String> entry : originalRequest.copyPrivateRequestParameters().entrySet()) {
      request.addParameter(entry.getKey(), entry.getValue());
    }

    AWSCredentials credentials = awsCredentialsProvider.getCredentials();
    if (originalRequest.getRequestCredentials() != null) {
      credentials = originalRequest.getRequestCredentials();
    }

    executionContext.setSigner(getSigner());
    executionContext.setCredentials(credentials);

    StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
    DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
    return client.execute(request, responseHandler, errorResponseHandler, executionContext);
  }
}
