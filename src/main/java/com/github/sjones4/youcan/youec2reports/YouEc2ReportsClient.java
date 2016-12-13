package com.github.sjones4.youcan.youec2reports;

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
import com.github.sjones4.youcan.youec2reports.model.ViewInstanceUsageReportRequest;
import com.github.sjones4.youcan.youec2reports.model.ViewInstanceUsageReportResult;
import com.github.sjones4.youcan.youec2reports.model.ViewReservedInstanceUtilizationReportRequest;
import com.github.sjones4.youcan.youec2reports.model.ViewReservedInstanceUtilizationReportResult;
import com.github.sjones4.youcan.youec2reports.model.transform.ViewInstanceUsageReportRequestMarshaller;
import com.github.sjones4.youcan.youec2reports.model.transform.ViewInstanceUsageReportResultJsonUnmarshaller;
import com.github.sjones4.youcan.youec2reports.model.transform.ViewReservedInstanceUtilizationReportRequestMarshaller;
import com.github.sjones4.youcan.youec2reports.model.transform.ViewReservedInstanceUtilizationReportResultJsonUnmarshaller;

/*
 *
 */
public class YouEc2ReportsClient extends AmazonWebServiceClient implements YouEc2Reports {

  private AWSCredentialsProvider awsCredentialsProvider;

  private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
          .withProtocolVersion("1.0")
          .withSupportsCbor(false)
          .withSupportsIon(false));

  public YouEc2ReportsClient( ) {
    this( new DefaultAWSCredentialsProviderChain( ), new ClientConfiguration( ) );
  }

  public YouEc2ReportsClient( final ClientConfiguration clientConfiguration ) {
    this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
  }

  public YouEc2ReportsClient( final AWSCredentials awsCredentials ) {
    this( new AWSStaticCredentialsProvider( awsCredentials ), new ClientConfiguration( ) );
  }

  public YouEc2ReportsClient( final AWSCredentialsProvider awsCredentialsProvider) {
    this( awsCredentialsProvider, new ClientConfiguration() );
  }

  public YouEc2ReportsClient( final AWSCredentials awsCredentials,  final ClientConfiguration clientConfiguration) {
    this( new AWSStaticCredentialsProvider( awsCredentials ), clientConfiguration );
  }

  public YouEc2ReportsClient( final AWSCredentialsProvider awsCredentialsProvider,
                        final ClientConfiguration clientConfiguration) {
    super( clientConfiguration );
    this.awsCredentialsProvider = awsCredentialsProvider;
    init( );
  }

  private void init() {
    setEndpoint("http://localhost:8773/services/Ec2Reports");
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
  public ViewInstanceUsageReportResult viewInstanceUsageReport(ViewInstanceUsageReportRequest viewInstanceUsageReportRequest) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(viewInstanceUsageReportRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<ViewInstanceUsageReportRequest> request = null;
    Response<ViewInstanceUsageReportResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime );
    try {
      request = new ViewInstanceUsageReportRequestMarshaller().marshall(viewInstanceUsageReportRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new ViewInstanceUsageReportResultJsonUnmarshaller(), executionContext);
      return response.getAwsResponse();
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }

  @Override
  public ViewReservedInstanceUtilizationReportResult viewReservedInstanceUtilizationReport(ViewReservedInstanceUtilizationReportRequest viewReservedInstanceUtilizationReportRequest) throws AmazonClientException {
    ExecutionContext executionContext = createExecutionContext(viewReservedInstanceUtilizationReportRequest);
    AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
    Request<ViewReservedInstanceUtilizationReportRequest> request = null;
    Response<ViewReservedInstanceUtilizationReportResult> response = null;
    awsRequestMetrics.startEvent( AWSRequestMetrics.Field.ClientExecuteTime );
    try {
      request = new ViewReservedInstanceUtilizationReportRequestMarshaller().marshall(viewReservedInstanceUtilizationReportRequest);
      // Binds the request metrics to the current request.
      request.setAWSRequestMetrics(awsRequestMetrics);
      response = invoke(request, new ViewReservedInstanceUtilizationReportResultJsonUnmarshaller(), executionContext);
      return response.getAwsResponse();
    } finally {
      endClientExecution(awsRequestMetrics, request, response);
    }
  }
}
