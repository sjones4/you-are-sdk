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
package com.github.sjones4.youare;

import java.util.Map;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.services.identitymanagement.AmazonIdentityManagementClient;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import com.github.sjones4.youare.model.CreateAccountRequest;
import com.github.sjones4.youare.model.CreateAccountResult;
import com.github.sjones4.youare.model.DeleteAccountRequest;
import com.github.sjones4.youare.model.ListAccountsRequest;
import com.github.sjones4.youare.model.ListAccountsResult;
import com.github.sjones4.youare.model.transform.CreateAccountRequestMarshaller;
import com.github.sjones4.youare.model.transform.CreateAccountResultStaxUnmarshaller;
import com.github.sjones4.youare.model.transform.DeleteAccountRequestMarshaller;
import com.github.sjones4.youare.model.transform.ListAccountsRequestMarshaller;
import com.github.sjones4.youare.model.transform.ListAccountsResultStaxUnmarshaller;

/**
 *
 */
public class YouAreClient extends AmazonIdentityManagementClient implements YouAre {
  private final AWSCredentialsProvider awsCredentialsProvider;
  private final AWS4Signer signer;

  public YouAreClient( final AWSCredentialsProvider awsCredentialsProvider ) {
    super(awsCredentialsProvider);
    this.awsCredentialsProvider = awsCredentialsProvider;
    this.signer = new AWS4Signer();
    this.signer.setServiceName("iam");
  }

  @Override
  public CreateAccountResult createAccount(final CreateAccountRequest createAccountRequest) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(createAccountRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<CreateAccountRequest> request = null;
    CreateAccountResult response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime );
    try {
      request = new CreateAccountRequestMarshaller().marshall(createAccountRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      return response = invoke(request, new CreateAccountResultStaxUnmarshaller(), executionContext);
    } finally {
      endClientExecution( awsRequestMetrics, request, response );
    }
  }

  @Override
  public void deleteAccount( final DeleteAccountRequest deleteAccountRequest ) throws AmazonServiceException, AmazonClientException {
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
  public ListAccountsResult listAccounts( final ListAccountsRequest listAccountsRequest ) throws AmazonServiceException, AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(listAccountsRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<ListAccountsRequest> request = null;
    ListAccountsResult response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime);
    try {
      request = new ListAccountsRequestMarshaller().marshall(listAccountsRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      return response = invoke(request, new ListAccountsResultStaxUnmarshaller(), executionContext);
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }

  protected <X, Y extends AmazonWebServiceRequest> X invoke(
      final Request<Y> request,
      final Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
      final ExecutionContext executionContext
  ) {
    request.setEndpoint( endpoint );
    request.setTimeOffset( timeOffset );
    AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
    for (Map.Entry<String, String> entry : originalRequest.copyPrivateRequestParameters().entrySet()) {
      request.addParameter(entry.getKey(), entry.getValue());
    }

    AWSCredentials credentials = awsCredentialsProvider.getCredentials();
    if (originalRequest.getRequestCredentials() != null) {
      credentials = originalRequest.getRequestCredentials();
    }

    executionContext.setSigner(signer);
    executionContext.setCredentials(credentials);

    StaxResponseHandler<X> responseHandler = new StaxResponseHandler<>(unmarshaller);
    DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
    return client.execute(request, responseHandler, errorResponseHandler, executionContext);
  }
}
