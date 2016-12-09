package com.github.sjones4.youcan.youbill.model.transform;

import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.fasterxml.jackson.core.JsonToken;
import com.github.sjones4.youcan.youbill.model.ViewInstanceUsageReportResult;

/*
 *
 */
public class ViewInstanceUsageReportResultJsonUnmarshaller implements Unmarshaller<ViewInstanceUsageReportResult, JsonUnmarshallerContext> {
  @Override
  public ViewInstanceUsageReportResult unmarshall(JsonUnmarshallerContext context) throws Exception {
    final ViewInstanceUsageReportResult viewInstanceUsageReportResult = new ViewInstanceUsageReportResult();
    int originalDepth = context.getCurrentDepth();
    String currentParentElement = context.getCurrentParentElement();
    int targetDepth = originalDepth + 1;

    while ( true ) {
      JsonToken token = context.getCurrentToken( );
      if ( token == null )
        token = context.nextToken( );

      if ( token == JsonToken.VALUE_NULL )
        return null;

      while ( true ) {
        if ( token == null )
          break;

        if (token == JsonToken.FIELD_NAME || token == JsonToken.START_OBJECT) {
          if (context.testExpression("usageReport", targetDepth)) {
            context.nextToken();
            viewInstanceUsageReportResult.setUsageReport(context.getUnmarshaller(String.class).unmarshall(context));
          }
        } else if (token == JsonToken.END_ARRAY || token == JsonToken.END_OBJECT) {
          if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
            if (context.getCurrentDepth() <= originalDepth)
              break;
          }
        }
        token = context.nextToken();
      }

      return viewInstanceUsageReportResult;
    }
  }
}
