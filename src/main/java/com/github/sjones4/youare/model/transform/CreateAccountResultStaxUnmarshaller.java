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
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.github.sjones4.youare.model.CreateAccountResult;

/**
 *
 */
public class CreateAccountResultStaxUnmarshaller implements Unmarshaller<CreateAccountResult, StaxUnmarshallerContext> {

  public CreateAccountResult unmarshall(StaxUnmarshallerContext context) throws Exception {
    CreateAccountResult createAccountResult = new CreateAccountResult();
    int originalDepth = context.getCurrentDepth();
    int targetDepth = originalDepth + 1;

    if (context.isStartOfDocument()) targetDepth += 2;

    while (true) {
      XMLEvent xmlEvent = context.nextEvent();
      if (xmlEvent.isEndDocument()) return createAccountResult;

      if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
        if (context.testExpression("Account", targetDepth)) {
          createAccountResult.setAccount(AccountStaxUnmarshaller.getInstance().unmarshall(context));
          continue;
        }
      } else if (xmlEvent.isEndElement()) {
        if (context.getCurrentDepth() < originalDepth) {
          return createAccountResult;
        }
      }
    }
  }

  private static CreateAccountResultStaxUnmarshaller instance = new CreateAccountResultStaxUnmarshaller();
  public static CreateAccountResultStaxUnmarshaller getInstance() {
    return instance;
  }
}
