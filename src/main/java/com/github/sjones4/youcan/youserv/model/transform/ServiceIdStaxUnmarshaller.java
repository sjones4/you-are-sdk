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
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.github.sjones4.youcan.youserv.model.ServiceId;

/**
 *
 */
public class ServiceIdStaxUnmarshaller implements Unmarshaller<ServiceId, StaxUnmarshallerContext> {

  public ServiceId unmarshall( final StaxUnmarshallerContext context ) throws Exception {
    ServiceId serviceId = new ServiceId();
    int originalDepth = context.getCurrentDepth();
    int targetDepth = originalDepth + 1;

    if (context.isStartOfDocument()) targetDepth += 1;

    while (true) {
      XMLEvent xmlEvent = context.nextEvent();
      if (xmlEvent.isEndDocument()) return serviceId;

      if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
        if (context.testExpression("partition", targetDepth)) {
          serviceId.setPartition( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("name", targetDepth)) {
          serviceId.setName( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("type", targetDepth)) {
          serviceId.setType( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("fullName", targetDepth)) {
          serviceId.setFullName( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("uri", targetDepth)) {
          serviceId.setUri( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
      } else if (xmlEvent.isEndElement()) {
        if (context.getCurrentDepth() < originalDepth) {
          return serviceId;
        }
      }
    }
  }

  private static ServiceIdStaxUnmarshaller instance = new ServiceIdStaxUnmarshaller( );
  public static ServiceIdStaxUnmarshaller getInstance() {
    return instance;
  }
}
