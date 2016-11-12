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
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.fasterxml.jackson.core.JsonToken;
import com.github.sjones4.youcan.youbill.model.BillingMetadata;

/**
 *
 */
public class BillingMetadataJsonUnmarshaller implements Unmarshaller<BillingMetadata, JsonUnmarshallerContext> {

  public BillingMetadata unmarshall( final JsonUnmarshallerContext context ) throws Exception {
    BillingMetadata billingMetadata = new BillingMetadata();

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
          if (context.testExpression("inactiveCostAllocationTags", targetDepth)) {
            context.nextToken();
            billingMetadata.setInactiveCostAllocationTags(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
          }
        } else if (token == JsonToken.END_ARRAY || token == JsonToken.END_OBJECT) {
          if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
            if (context.getCurrentDepth() <= originalDepth)
              break;
          }
        }
        token = context.nextToken();
      }

      return billingMetadata;
    }
  }

  private static BillingMetadataJsonUnmarshaller instance = new BillingMetadataJsonUnmarshaller( );
  public static BillingMetadataJsonUnmarshaller getInstance() {
    return instance;
  }
}