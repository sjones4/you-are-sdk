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
package com.github.sjones4.youcan.youconfig.model.transform;

import javax.xml.stream.events.XMLEvent;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.github.sjones4.youcan.youconfig.model.DescribeComponentsResult;

/**
 *
 */
public class DescribeComponentsResultStaxUnmarshaller implements Unmarshaller<DescribeComponentsResult, StaxUnmarshallerContext> {

  public DescribeComponentsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
    DescribeComponentsResult describeComponentsResult = new DescribeComponentsResult();
    int originalDepth = context.getCurrentDepth();
    int targetDepth = originalDepth + 1;


    if (context.isStartOfDocument()) targetDepth += 1;

    while (true) {
      XMLEvent xmlEvent = context.nextEvent();
      if (xmlEvent.isEndDocument()) return describeComponentsResult;

      if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
        if (context.testExpression("registered/item", targetDepth)) {
          describeComponentsResult.getComponentInfos().add(ComponentInfoStaxUnmarshaller.getInstance().unmarshall(context));
          continue;
        }
      } else if (xmlEvent.isEndElement()) {
        if (context.getCurrentDepth() < originalDepth) {
          return describeComponentsResult;
        }
      }
    }
  }

  private static DescribeComponentsResultStaxUnmarshaller instance = new DescribeComponentsResultStaxUnmarshaller();
  public static DescribeComponentsResultStaxUnmarshaller getInstance() {
    return instance;
  }
}
