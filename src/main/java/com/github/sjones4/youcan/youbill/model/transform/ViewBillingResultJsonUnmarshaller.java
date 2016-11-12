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
package com.github.sjones4.youcan.youbill.model.transform;

import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.fasterxml.jackson.core.JsonToken;
import com.github.sjones4.youcan.youbill.model.ViewBillingResult;

/**
 *
 */
public class ViewBillingResultJsonUnmarshaller implements Unmarshaller<ViewBillingResult, JsonUnmarshallerContext> {

  public ViewBillingResult unmarshall( JsonUnmarshallerContext context ) throws Exception {
    ViewBillingResult viewBillingResult = new ViewBillingResult( );

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
          if (context.testExpression("billingSettings", targetDepth)) {
            context.nextToken();
            viewBillingResult.setBillingSettings(BillingSettingsJsonUnmarshaller.getInstance().unmarshall(context));
          } else if (context.testExpression("billingMetadata", targetDepth)) {
            context.nextToken();
            viewBillingResult.setBillingMetadata(BillingMetadataJsonUnmarshaller.getInstance().unmarshall(context));
          }
        } else if (token == JsonToken.END_ARRAY || token == JsonToken.END_OBJECT) {
          if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
            if (context.getCurrentDepth() <= originalDepth)
              break;
          }
        }
        token = context.nextToken();
      }

      return viewBillingResult;
    }
  }

  private static ViewBillingResultJsonUnmarshaller instance = new ViewBillingResultJsonUnmarshaller( );

  public static ViewBillingResultJsonUnmarshaller getInstance() {
    return instance;
  }
}