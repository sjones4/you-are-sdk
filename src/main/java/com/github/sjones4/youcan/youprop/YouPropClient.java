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
package com.github.sjones4.youcan.youprop;

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
import com.github.sjones4.youcan.youprop.model.DescribePropertiesRequest;
import com.github.sjones4.youcan.youprop.model.DescribePropertiesResult;
import com.github.sjones4.youcan.youprop.model.ModifyPropertyValueRequest;
import com.github.sjones4.youcan.youprop.model.ModifyPropertyValueResult;
import com.github.sjones4.youcan.youprop.model.transform.DescribePropertiesRequestMarshaller;
import com.github.sjones4.youcan.youprop.model.transform.DescribePropertiesResultStaxUnmarshaller;
import com.github.sjones4.youcan.youprop.model.transform.ModifyPropertyValueRequestMarshaller;
import com.github.sjones4.youcan.youprop.model.transform.ModifyPropertyValueResultStaxUnmarshaller;

/**
 *
 */
public class YouPropClient extends AmazonWebServiceClient implements YouProp {

  private AWSCredentialsProvider awsCredentialsProvider;

  protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<>();

  private QueryStringSigner signer;

  public YouPropClient( ) {
    this( new DefaultAWSCredentialsProviderChain( ), new ClientConfiguration( ) );
  }

  public YouPropClient( final ClientConfiguration clientConfiguration ) {
    this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
  }

  public YouPropClient( final AWSCredentials awsCredentials ) {
    this( new StaticCredentialsProvider( awsCredentials ), new ClientConfiguration( ) );
  }

  public YouPropClient( final AWSCredentialsProvider awsCredentialsProvider) {
    this( awsCredentialsProvider, new ClientConfiguration() );
  }

  public YouPropClient( final AWSCredentials awsCredentials,  final ClientConfiguration clientConfiguration) {
    this( new StaticCredentialsProvider( awsCredentials ), clientConfiguration );
  }

  public YouPropClient( final AWSCredentialsProvider awsCredentialsProvider,
                        final ClientConfiguration clientConfiguration) {
    super( clientConfiguration );
    this.awsCredentialsProvider = awsCredentialsProvider;
    init( );
  }

  private void init() {
    exceptionUnmarshallers.add(new LegacyErrorUnmarshaller());
    setEndpoint("http://localhost:8773/services/Properties/");
    signer = new QueryStringSigner();
  }

  @Override
  protected String getServiceAbbreviation() {
    return "euprop";
  }

  public ResponseMetadata getCachedResponseMetadata( final AmazonWebServiceRequest request ) {
    return client.getResponseMetadataForRequest(request);
  }

  private <X, Y extends AmazonWebServiceRequest> X invoke( final Request<Y> request,
                                                           final Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
                                                           final ExecutionContext executionContext ) {
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

    executionContext.setSigner(signer);
    executionContext.setCredentials(credentials);

    StaxResponseHandler<X> responseHandler = new StaxResponseHandler<>(unmarshaller);
    DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
    return client.execute(request, responseHandler, errorResponseHandler, executionContext);
  }

  @Override
  public DescribePropertiesResult describeProperties( ) throws AmazonClientException {
    return describeProperties( new DescribePropertiesRequest( ) );
  }

  @Override
  public DescribePropertiesResult describeProperties( final DescribePropertiesRequest describePropertiesRequest ) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(describePropertiesRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<DescribePropertiesRequest> request = null;
    DescribePropertiesResult response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime );
    try {
      request = new DescribePropertiesRequestMarshaller().marshall(describePropertiesRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      return response = invoke(request, new DescribePropertiesResultStaxUnmarshaller(), executionContext);
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }

  @Override
  public ModifyPropertyValueResult modifyPropertyValue( final ModifyPropertyValueRequest modifyPropertyRequest ) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(modifyPropertyRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<ModifyPropertyValueRequest> request = null;
    ModifyPropertyValueResult response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime );
    try {
      request = new ModifyPropertyValueRequestMarshaller().marshall(modifyPropertyRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      return response = invoke(request, new ModifyPropertyValueResultStaxUnmarshaller(), executionContext);
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }
}
