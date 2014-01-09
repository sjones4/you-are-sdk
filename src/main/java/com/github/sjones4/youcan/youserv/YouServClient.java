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
package com.github.sjones4.youcan.youserv;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Node;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.auth.QueryStringSigner;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.transform.LegacyErrorUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import com.github.sjones4.youcan.youserv.model.DescribeServicesRequest;
import com.github.sjones4.youcan.youserv.model.DescribeServicesResult;
import com.github.sjones4.youcan.youserv.model.transform.DescribeServicesRequestMarshaller;
import com.github.sjones4.youcan.youserv.model.transform.DescribeServicesResultStaxUnmarshaller;

/**
 *
 */
public class YouServClient extends AmazonWebServiceClient implements YouServ {

  private AWSCredentialsProvider awsCredentialsProvider;

  protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<>();

  private QueryStringSigner signer;

  public YouServClient( ) {
    this( new DefaultAWSCredentialsProviderChain( ), new ClientConfiguration( ) );
  }

  public YouServClient( final ClientConfiguration clientConfiguration ) {
    this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
  }

  public YouServClient( final AWSCredentials awsCredentials ) {
    this( new StaticCredentialsProvider( awsCredentials ), new ClientConfiguration( ) );
  }

  public YouServClient( final AWSCredentialsProvider awsCredentialsProvider) {
    this( awsCredentialsProvider, new ClientConfiguration() );
  }

  public YouServClient( final AWSCredentials awsCredentials,  final ClientConfiguration clientConfiguration) {
    this( new StaticCredentialsProvider( awsCredentials ), clientConfiguration );
  }

  public YouServClient( final AWSCredentialsProvider awsCredentialsProvider,
                        final ClientConfiguration clientConfiguration) {
    super( clientConfiguration );
    this.awsCredentialsProvider = awsCredentialsProvider;
    init( );
  }

  private void init() {
    exceptionUnmarshallers.add(new LegacyErrorUnmarshaller());
    setEndpoint("http://localhost:8773/services/Empyrean/");
  }

  private <X, Y extends AmazonWebServiceRequest> Response<X> invoke( final Request<Y> request,
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

  @Override
  public DescribeServicesResult describeServices() throws AmazonClientException {
    return describeServices( new DescribeServicesRequest( ) );
  }

  @Override
  public DescribeServicesResult describeServices( final DescribeServicesRequest describeServicesRequest ) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(describeServicesRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<DescribeServicesRequest> request = null;
    Response<DescribeServicesResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime );
    try {
      request = new DescribeServicesRequestMarshaller().marshall(describeServicesRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new DescribeServicesResultStaxUnmarshaller(), executionContext);
      return response.getAwsResponse();
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }

  }
}
