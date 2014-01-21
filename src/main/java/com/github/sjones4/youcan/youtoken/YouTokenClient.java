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
package com.github.sjones4.youcan.youtoken;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
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
import com.amazonaws.auth.Signer;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.BinaryUtils;
import com.github.sjones4.youcan.youtoken.model.GetAccessTokenRequest;
import com.github.sjones4.youcan.youtoken.model.GetAccessTokenResult;
import com.github.sjones4.youcan.youtoken.model.GetImpersonationTokenRequest;
import com.github.sjones4.youcan.youtoken.model.GetImpersonationTokenResult;
import com.github.sjones4.youcan.youtoken.model.transform.GetAccessTokenRequestMarshaller;
import com.github.sjones4.youcan.youtoken.model.transform.GetAccessTokenResultStaxUnmarshaller;
import com.github.sjones4.youcan.youtoken.model.transform.GetImpersonationTokenRequestMarshaller;
import com.github.sjones4.youcan.youtoken.model.transform.GetImpersonationTokenResultStaxUnmarshaller;

/**
 *
 */
public class YouTokenClient extends AWSSecurityTokenServiceClient implements YouToken {
  private final AWSCredentialsProvider awsCredentialsProvider;

  public YouTokenClient( final AWSCredentialsProvider awsCredentialsProvider,
                         final ClientConfiguration clientConfiguration ) {
    super( awsCredentialsProvider, clientConfiguration );
    this.awsCredentialsProvider = awsCredentialsProvider;
  }

  public YouTokenClient( ) {
    this( new DefaultAWSCredentialsProviderChain(), new ClientConfiguration() );
  }

  public YouTokenClient( final AWSCredentials awsCredentials ) {
    this( new StaticCredentialsProvider( awsCredentials ), new ClientConfiguration()  );
  }

  public YouTokenClient( final AWSCredentials awsCredentials,
                         final ClientConfiguration clientConfiguration ) {
    this( new StaticCredentialsProvider( awsCredentials ), clientConfiguration );
  }

  public YouTokenClient( final ClientConfiguration clientConfiguration ) {
    this( new DefaultAWSCredentialsProviderChain(), clientConfiguration );
  }

  public YouTokenClient( final AWSCredentialsProvider awsCredentialsProvider ) {
    this( awsCredentialsProvider, new ClientConfiguration());
  }

  @Override
  public GetAccessTokenResult getAccessToken() throws AmazonServiceException, AmazonClientException {
    return getAccessToken( new GetAccessTokenRequest( ) );
  }

  @Override
  public GetAccessTokenResult getAccessToken( final GetAccessTokenRequest getAccessTokenRequest ) throws AmazonServiceException, AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(getAccessTokenRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<GetAccessTokenRequest> request = null;
    Response<GetAccessTokenResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime);
    try {
      request = new GetAccessTokenRequestMarshaller().marshall(getAccessTokenRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new PasswordSigner(), new GetAccessTokenResultStaxUnmarshaller(), executionContext);
      return response.getAwsResponse();
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }

  @Override
  public GetImpersonationTokenResult getImpersonationToken( final GetImpersonationTokenRequest getImpersonationTokenRequest ) throws AmazonServiceException, AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(getImpersonationTokenRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<GetImpersonationTokenRequest> request = null;
    Response<GetImpersonationTokenResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime);
    try {
      request = new GetImpersonationTokenRequestMarshaller().marshall(getImpersonationTokenRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new GetImpersonationTokenResultStaxUnmarshaller(), executionContext);
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
    return invoke( request, getSigner( ), unmarshaller, executionContext );
  }

  private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
      final Request<Y> request,
      final Signer signer,
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

    executionContext.setSigner(signer);
    executionContext.setCredentials(credentials);

    StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
    DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
    return client.execute(request, responseHandler, errorResponseHandler, executionContext);
  }

  private static final class PasswordSigner implements Signer {
    protected static final String PREFIX = "Basic ";

    @Override
    public void sign( final Request<?> request, final AWSCredentials credentials ) {
      if ( credentials instanceof PasswordCredentials ) {
        final PasswordCredentials passwordCredentials = (PasswordCredentials) credentials;
        final Charset utf8 = StandardCharsets.UTF_8;
        final ByteArrayOutputStream headerPassword = new ByteArrayOutputStream( );
        final OutputStreamWriter headerWriter = new OutputStreamWriter( headerPassword, utf8 );
        try {
          headerWriter.append( BinaryUtils.toBase64( passwordCredentials.getUserName().getBytes( utf8 ) ) );
          headerWriter.append( '@' );
          headerWriter.append( BinaryUtils.toBase64( passwordCredentials.getAccountName().getBytes( utf8 ) ) );
          headerWriter.append( ':' );
          for ( int i=0; i<passwordCredentials.getPassword().length; i++ ) {
            headerWriter.append( passwordCredentials.getPassword()[i] );
          }
          headerWriter.flush();
          headerWriter.close();
        } catch ( IOException e ) {
          throw new AmazonClientException("Unable to construct header for password credentials", e);
        }
        final String authorizationHeader = PREFIX +
            BinaryUtils.toBase64( headerPassword.toByteArray( ) );
        request.addHeader( "Authorization", authorizationHeader );
      }
    }
  }
}
