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

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceClient;
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
import com.amazonaws.transform.LegacyErrorUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.CredentialUtils;
import com.github.sjones4.youcan.youconfig.model.DescribeComponentsRequest;
import com.github.sjones4.youcan.youconfig.model.DescribeComponentsResult;
import com.github.sjones4.youcan.youconfig.model.transform.DescribeComponentsRequestMarshaller;
import com.github.sjones4.youcan.youconfig.model.transform.DescribeComponentsResultStaxUnmarshaller;

/**
 *
 */
public class YouConfigClient extends AmazonWebServiceClient implements YouConfig {

  private AWSCredentialsProvider awsCredentialsProvider;

  protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<>();

  public YouConfigClient( ) {
    this( new DefaultAWSCredentialsProviderChain( ), new ClientConfiguration( ) );
  }

  public YouConfigClient( final ClientConfiguration clientConfiguration ) {
    this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
  }

  public YouConfigClient( final AWSCredentials awsCredentials ) {
    this( new StaticCredentialsProvider( awsCredentials ), new ClientConfiguration( ) );
  }

  public YouConfigClient( final AWSCredentialsProvider awsCredentialsProvider) {
    this( awsCredentialsProvider, new ClientConfiguration() );
  }

  public YouConfigClient( final AWSCredentials awsCredentials,  final ClientConfiguration clientConfiguration) {
    this( new StaticCredentialsProvider( awsCredentials ), clientConfiguration );
  }

  public YouConfigClient( final AWSCredentialsProvider awsCredentialsProvider,
                        final ClientConfiguration clientConfiguration) {
    super( clientConfiguration );
    this.awsCredentialsProvider = awsCredentialsProvider;
    init();
  }

  private void init() {
    exceptionUnmarshallers.add( new LegacyErrorUnmarshaller() );
    setEndpoint("http://localhost:8773/services/Configuration/");
  }

  private <X, Y extends AmazonWebServiceRequest> Response<X> invoke( final Request<Y> request,
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

  @Override
  public DescribeComponentsResult describeComponents( ) throws AmazonClientException {
    return describeComponents( new DescribeComponentsRequest() );
  }

  @Override
  public DescribeComponentsResult describeComponents( final DescribeComponentsRequest describeComponentsRequest ) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(describeComponentsRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<DescribeComponentsRequest> request = null;
    Response<DescribeComponentsResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime );
    try {
      request = new DescribeComponentsRequestMarshaller().marshall(describeComponentsRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new DescribeComponentsResultStaxUnmarshaller(), executionContext);
      return response.getAwsResponse();
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }
}
