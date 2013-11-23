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
package com.github.sjones4.youare.model.transform;

import javax.xml.stream.events.XMLEvent;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.github.sjones4.youare.model.GetAccountPolicyResult;

/**
 *
 */
public class GetAccountPolicyResultStaxUnmarshaller implements Unmarshaller<GetAccountPolicyResult, StaxUnmarshallerContext> {

  public GetAccountPolicyResult unmarshall(StaxUnmarshallerContext context) throws Exception {
    GetAccountPolicyResult getAccountPolicyResult = new GetAccountPolicyResult();
    int originalDepth = context.getCurrentDepth();
    int targetDepth = originalDepth + 1;

    if (context.isStartOfDocument()) targetDepth += 2;

    while (true) {
      XMLEvent xmlEvent = context.nextEvent();
      if (xmlEvent.isEndDocument()) return getAccountPolicyResult;

      if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
        if (context.testExpression("AccountName", targetDepth)) {
          getAccountPolicyResult.setAccountName( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("PolicyName", targetDepth)) {
          getAccountPolicyResult.setPolicyName( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("PolicyDocument", targetDepth)) {
          getAccountPolicyResult.setPolicyDocument( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
      } else if (xmlEvent.isEndElement()) {
        if (context.getCurrentDepth() < originalDepth) {
          return getAccountPolicyResult;
        }
      }
    }
  }

  private static GetAccountPolicyResultStaxUnmarshaller instance = new GetAccountPolicyResultStaxUnmarshaller();
  public static GetAccountPolicyResultStaxUnmarshaller getInstance() {
    return instance;
  }
}
