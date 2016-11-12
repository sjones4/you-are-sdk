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
package com.github.sjones4.youcan.youtag;

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
import com.github.sjones4.youcan.youtag.model.GetTagKeysRequest;
import com.github.sjones4.youcan.youtag.model.GetTagKeysResult;
import com.github.sjones4.youcan.youtag.model.transform.GetTagKeysRequestMarshaller;
import com.github.sjones4.youcan.youtag.model.transform.GetTagKeysResultJsonUnmarshaller;

/**
 *
 */
public class YouTagClient extends AmazonWebServiceClient implements YouTag {

  private AWSCredentialsProvider awsCredentialsProvider;

  private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
      .withProtocolVersion("1.0")
      .withSupportsCbor(false)
      .withSupportsIon(false));

  public YouTagClient( ) {
    this( new DefaultAWSCredentialsProviderChain( ), new ClientConfiguration( ) );
  }

  public YouTagClient( final ClientConfiguration clientConfiguration ) {
    this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
  }

  public YouTagClient( final AWSCredentials awsCredentials ) {
    this( new AWSStaticCredentialsProvider( awsCredentials ), new ClientConfiguration( ) );
  }

  public YouTagClient( final AWSCredentialsProvider awsCredentialsProvider) {
    this( awsCredentialsProvider, new ClientConfiguration() );
  }

  public YouTagClient( final AWSCredentials awsCredentials,  final ClientConfiguration clientConfiguration) {
    this( new AWSStaticCredentialsProvider( awsCredentials ), clientConfiguration );
  }

  public YouTagClient( final AWSCredentialsProvider awsCredentialsProvider,
                       final ClientConfiguration clientConfiguration) {
    super( clientConfiguration );
    this.awsCredentialsProvider = awsCredentialsProvider;
    init( );
  }

  private void init() {
    setEndpoint("http://localhost:8773/services/Tag");
  }

  private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
      final Request<Y> request,
      final Unmarshaller<X, JsonUnmarshallerContext> unmarshaller,
      final ExecutionContext executionContext
  ) {
    request.setEndpoint(endpoint);
    request.setTimeOffset(timeOffset);

    executionContext.setCredentialsProvider(
        CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

    HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler = protocolFactory.createResponseHandler(
        new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), unmarshaller);
    HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(
        new JsonErrorResponseMetadata( ) );
    return client.execute(request, responseHandler, errorResponseHandler, executionContext);
  }

  @Override
  public GetTagKeysResult getTagKeys() throws AmazonServiceException, AmazonClientException {
    return getTagKeys( new GetTagKeysRequest( ) );
  }

  @Override
  public GetTagKeysResult getTagKeys( final GetTagKeysRequest getTagKeysRequest ) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(getTagKeysRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<GetTagKeysRequest> request = null;
    Response<GetTagKeysResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime );
    try {
      request = new GetTagKeysRequestMarshaller().marshall(getTagKeysRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new GetTagKeysResultJsonUnmarshaller(), executionContext);
      return response.getAwsResponse();
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }

}
