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
package com.github.sjones4.youcan.youserv.model.transform;

import javax.xml.stream.events.XMLEvent;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.github.sjones4.youcan.youserv.model.DescribeServicesResult;

/**
 *
 */
public class DescribeServicesResultStaxUnmarshaller implements Unmarshaller<DescribeServicesResult, StaxUnmarshallerContext> {

  public DescribeServicesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
    DescribeServicesResult describeServicesResult = new DescribeServicesResult();
    int originalDepth = context.getCurrentDepth();
    int targetDepth = originalDepth + 1;


    if (context.isStartOfDocument()) targetDepth += 1;

    while (true) {
      XMLEvent xmlEvent = context.nextEvent();
      if (xmlEvent.isEndDocument()) return describeServicesResult;

      if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
        if (context.testExpression("serviceStatuses/item", targetDepth)) {
          describeServicesResult.getServiceStatuses().add(ServiceStatusStaxUnmarshaller.getInstance().unmarshall(context));
          continue;
        }
      } else if (xmlEvent.isEndElement()) {
        if (context.getCurrentDepth() < originalDepth) {
          return describeServicesResult;
        }
      }
    }
  }

  private static DescribeServicesResultStaxUnmarshaller instance = new DescribeServicesResultStaxUnmarshaller();
  public static DescribeServicesResultStaxUnmarshaller getInstance() {
    return instance;
  }
}
